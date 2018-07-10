/**
 * 提供控件绑定和form校验<br>
 * 
 */

var bind = {
	bindSelect2 : function(parentCss) {
		// 样式select2绑定为select2控件
		$(parentCss + ".select2").select2({}).each(function(i, element) {
			var control = $(element);
			control.select2("val", control.attr("value"));
		});
	},

	bindDataTable : function(parentCss) {
		// 样式dataTable绑定为dataTable 客户端分页表格控件
		$(parentCss + ".dataTable").each(function(index, tableItem) {
			if (!$.fn.DataTable.isDataTable(tableItem)) {
				$(tableItem).dataTable({
					responsive : true,
					language : {
						url : "/assets/js/dataTable/zh_CN.txt"
					}
				}).removeClass("hide");
			}
		});
	},

	bindDatePicker : function(parentCss) {
		$(parentCss + '.date-picker').datepicker({
			todayHighlight : true
		}).next().on("click", function() {
			$(this).prev().focus();
		});
	},

	bindTimePicker : function(parentCss) {
		// 时间控件
		$(parentCss + '.time-picker').timepicker().next().on("click",
				function() {
					$(this).prev().focus();
				});
	},

	bindDateTimePicker : function(parentCss) {
		// 日期/时间控件
		$(parentCss + '.datetime-picker').datetimepicker({
			todayHighlight : true
		}).next().on("click", function() {
			$(this).prev().focus();
		});
	},

	bindFormValidate : function(parentCss) {
		// 表单校验
		$(parentCss + ".form-edit").validate({
			errorClass : "text-danger"
		});
	},

	bindSelectEntity : function(parentCss) {
		// 实体选择控件,data-entity="stenant" data-idField="name"
		// data-textField="name"
		// data-value="flyme.com" data-text="flyme.com"
		$(parentCss + ".select2-entity").each(
				function(i, element) {
					var control = $(element);
					control.select2({});
					var entity = control.attr("data-entity");
					if (entity) {
						$.getJSON("/query/select/" + entity, function(data) {
							var items = data.data;
							control.empty();
							$.each(items, function(i, item) {
								control.append("<option value=\"" + item[0]
										+ "\"> " + item[1] + "</option>");
							});
							// 选中当前值
							control.select2("val", control.attr("data-value"));
						});
					} else {
						console.warn("data-entity属性不能为空.");
					}
				});
	},

	bindServerSideDataTable : function(parentCss) {
		$(parentCss + ".dataTable-ServerSide").each(function(i, element) {
			var control = $(element);
			if ($.fn.DataTable.isDataTable(control)) {
				return;
			}
			var entityName = control.attr("entityName");
			var uid = control.attr("uid");
			var subTableAttr = control.attr("subTableAttr");
			var view = control.attr("view");
			var url = "/query/list/" + entityName;
			if (subTableAttr) {
				url = "/query/" + entityName + "/" + uid + "/" + subTableAttr;
			}
			url += "/" + view;
			control.DataTable({
				"processing" : true,
				"serverSide" : true,
				responsive : true,
				// "scrollX": true,
				"ajax" : url,
				language : {
					url : "/assets/js/dataTable/zh_CN.txt"
				}
			});
			// control.removeClass("hide");
		});
	},

	bindInputFiles : function(parentCss) {
		// 绑定文件上传组件
		$(parentCss + ".inputFiles").each(function(i, element) {
			var control = $(element);
			control.fileinput({
				showCaption : false,
				uploadAsync : false,
				language : "zh",
				minFileCount : 1,
				maxFileCount : 10,
				textEncoding : "GB2312",
				maxFileSize : 10240,
				uploadUrl : control.attr("uploadUrl")
			}).on('filebatchpreupload', function(event, data, id, index) {
				console.info("filebatchpreupload");
			}).on("filebatchuploadsuccess", function(event, data) {
				console.info("filebatchuploadsuccess");
				autoback();
			});
		});
	},

	bindPager : function(parentCss) {
		// 绑定分页控件
		$(parentCss + ".pager").each(
				function(i, element) {
					var control = $(element);
					var startPage = 1;
					if (control.attr("page")) {
						startPage = parseInt(control.attr("page")) + 1;
					}
					var total = parseInt(control.attr("total") + 0);
					if (total == 0) {
						return;
					}
					var entityName = control.attr("entityName");
					if (!entityName) {
						window.alert("获取entityName属性失败，分页控件无法呈现.");
						return;
					}
					var url = "#/vp/outline/" + entityName;
					control.twbsPagination({
						visiblePages : 5,
						first : "首页",
						prev : "上页",
						next : "下页",
						last : "尾页",
						totalPages : control.attr("totalPages"),
						startPage : startPage,
						href : url + "?page={{number}}&size="
								+ control.attr("size") + "&q="
								+ $("#entitySearchText").val(),
					});
				});
		$(parentCss + ".pager a").on("click", function(event) {
			var url = event.target.hash.substring(1);
			var container = getParent($(event.target), "widget-box");
			if (container) {
				container = $(container).parent();
				$.get(url, function(responseTxt, statusTxt, xhr) {
					if (statusTxt == "success") {
						// 加载成功
						$(container).html(responseTxt);
						bind.bindPager("");
						// bindAll(".page-content");
					} else if (statusTxt == "error") {
						// 加载失败，显示错误信息
						$(".page-content").html(xhr.responseText);
					}
				});
			}
			return false;
		});
	}
};

function bindAll(parentCss) {
	if (parentCss) {
		parentCss += " ";
	} else {
		parentCss = "";
	}
	bind.bindSelect2(parentCss);
	bind.bindDataTable(parentCss);
	bind.bindDatePicker(parentCss);
	bind.bindTimePicker(parentCss);
	bind.bindDateTimePicker(parentCss);
	bind.bindFormValidate(parentCss);
	bind.bindSelectEntity(parentCss);
	bind.bindServerSideDataTable(parentCss);
	bind.bindInputFiles(parentCss);
	bind.bindPager(parentCss);
};
