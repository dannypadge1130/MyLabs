(function () {
	
	var app = angular.module("blogViewer", []);
	
	var BlogController = function($scope, $http) {
			
		$http.get('http://localhost:8080/mylabs/api/blog-entries.json').
		  success(function(data) {
			  $scope.blogentries = data;
		  }).
		  error(function(data) {
		    // called asynchronously if an error occurs
		    // or server returns response with an error status.
		 });
	};
	
	app.controller("BlogController", ["$scope", "$http", BlogController]);
	
}());