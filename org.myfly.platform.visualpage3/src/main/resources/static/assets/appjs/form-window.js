function bindFormWindow(elementID, table, uid) {
	var vm = new Vue({
		el : "#" + elementID,
		data : {
			obj : {}
		},
		methods: {
			rowClickHandler(row, event, column){
				
			},
			rowDoubleClickHandler(row, event){
				
			}
		}
	});
	$.get("/flydata3/" + table + "/" + uid, function(data) {
		if (data){
			vm.obj = data;
		}else{
			vm.$message.error("错误，找不到记录.");
		}
	});
}