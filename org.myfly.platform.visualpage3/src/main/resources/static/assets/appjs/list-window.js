function bindListWindow(elementID) {
	var vm = new Vue({
		el : "#" + elementID,
		data : {
			tableData : []
		}
	});
	var table = $("#" + elementID).attr("maintable");
	$.get("/flydata3/" + table, function(data) {
		vm.tableData = data;
	});
}