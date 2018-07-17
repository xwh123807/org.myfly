function bindListWindow(elementID, table) {
	var vm = new Vue({
		el : "#" + elementID,
		data : {
			tableData : []
		},
		methods: {
			rowClickHandler(row, event, column){
				console.info(row);
			},
			rowDoubleClickHandler(row, event){
				var window = $(this.$el).attr("window");
				var keyColumn = $(this.$el).attr("keyColumn");
				var formWindowUrl = "/vp3/window/" + window + "/" + row[keyColumn];
				console.info(formWindowUrl);
				location.href = formWindowUrl;
			}
		}
	});
	$.get("/flydata3/" + table, function(data) {
		vm.tableData = data;
	});
}