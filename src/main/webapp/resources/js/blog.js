(function () {
	
	var app = angular.module("blogViewer", []);
	
	var BlogController = function($scope) {
			
		$scope.blogentries = [{
			title: "Blog Entry Title1",
			date: "11/30/2015",
			path: "resources/html/buildmesomegrails.html"
		}]
		
	};
	
	app.controller("BlogController", ["$scope", BlogController]);
	
}());