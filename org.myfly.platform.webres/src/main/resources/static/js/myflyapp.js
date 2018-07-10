$(function() {
	/**
	 * 当location.hash变更时，在框架内容子页面中打开hash对应的页面
	 */
	var hashChangeEvent = function() {
		var subpage = location.hash;
		if (subpage && subpage.length>1) {
			subpage = subpage.substring(1);
			$(".page-content").load(subpage, function(responseTxt,statusTxt,xhr){
				if(statusTxt=="success"){
					// 加载成功
					bindAll(".page-content");
				}else if(statusTxt=="error"){
					// 加载失败，显示错误信息
					$(".page-content").html(xhr.responseText);
				}
			});
		} else {
		}
	};

	$(window).on('hashchange', hashChangeEvent);
	/**
	 * 拦截超链接点击事件，直接打开强制更改为设置location的hash，控制只刷新框架内容子页面
	 */
	$(document).on('click', 'a', function(event) {
		return;
		var href = event.currentTarget.href;
		if (href && href.endsWith("nohash")){
			return false;
		}
		var pathname = event.currentTarget.pathname;
		if (pathname && (pathname != "/")) {
			var query = (href.indexOf("?")==-1) ? "" : href.substring(href.indexOf("?"));
			var url = pathname + query;
			if (query.indexOf("_time=")==-1){
				url = addTimestamp(url);
			}
			console.info("myflyapp.js fire hash changed. url: " + url);
			location.hash = url;
			return false;
		}
	})
	hashChangeEvent();
});

/**
 * 自动返回 规则：分析上一个页面和页面url特点推测要回到的页面
 */
function autoback(){
	console.info("autoback, current history length " + history.length + "; last url: " + document.referrer);
	if (history.length == 0){
		// 表示没有任何历史，可能是新窗口打开，则关闭窗口
		console.info("close window.");
		window.close();
	}else{
		console.info("go -1");
		history.go(-1);
	}
}

/**
 * 增加时间戳
 * 
 * @param url
 * @returns
 */
function addTimestamp(url){
	if (url.indexOf("?") == -1){
		url += "?";
	}else{
		url += "&";
	}
	url += "_time=" + (new Date()).getTime();
	return url;
}

/**
 * 弹出窗口
 * 
 * @param url
 * @param modalMode
 */
function openModal(url, modalMode){
	if (modalMode == true){
		// 模态窗口方式打开
		if (url.indexOf("?") == -1){
			url += "?";
		}else{
			url += "&";
		}
		url += "viewmode=MODALPAGE";
		var modalDiv = $("<div id='divModal" + Math.random() + "'/>");
		$("body").append(modalDiv);
		modalDiv.load(url, function(){
			modalDiv.children().modal({
			});
			$(modalDiv).on("hide.bs.modal", function(e){
				$(".modal-backdrop").remove();
			});
		});
	}else{
		if (url.startsWith("/vp/excel/") || url.startsWith("/vp/pdf/") || url.startsWith("/vp/print/")){
			// 打印模式
			window.open(url);
		}else{
			//location.hash = addTimestamp(url);
			location.href = addTimestamp(url);
		}
	}
}

/**
 * 获取元素的Form
 * 
 * @param $element
 */
function getParentForm($element){
	return getParent($element, "form-edit");
}

/**
 * 获取元素指定的父元素
 * 
 * @param $element
 * @param parentClass
 * @returns {___anonymous_$parent}
 */
function getParent($element, parentClass){
	var parentElement = $element.parent();
	parentElement && ($parent = $(parentElement));
	while ($parent && (($parent.attr("class") && $parent.attr("class").indexOf(parentClass) == -1) || !$parent.attr("class"))){
		parentElement = $parent.parent();
		if (parentElement){
			$parent = $(parentElement);
		}else{
			$parent = null;
		}
	}
	return $parent;
}

/**
 * 表单提交
 */
function formSubmit(event, callback){
	event.preventDefault();
	// 先获取当前所在form
	var $button = $(event.target);
	var $form = getParentForm($button);
	if (!$form.validate().form()){
		return false;
	};
	if ($form){
		// 取出method，如果按钮没有配置，则取form的method属性
		var method = $button.attr("name") + "=" + $button.val();
		if (!method){
			method = "_method=" + $form.attr("method");
		}
		var hash = location.hash.substring(1);
		var url = hash;
		if (!$button.attr("action")){
			url = $form.attr("action");
		}
		if (url.indexOf("?") == -1){
			url +=  "?" + method;
		}else{
			url += "&" + method;
		}
		var data = $form.serialize();
		$.post(url, data, function(data,status){
			if (!callback){
				$(".page-content").html(data);
			}else{
				callback();
			}
		});
	}else{
		window.alert("页面异常，没有找到提交的表单.");
	}
}

