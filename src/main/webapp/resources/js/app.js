(function () {
	
	var app = angular.module("app", []);
	
	var BlogController = function($scope, $http) {
			
		$http.get('/mylabs/api/blog-entries.json').
		  success(function(data) {
			  $scope.blogentries = data;
		  }).
		  error(function(data) {
		    // called asynchronously if an error occurs
		    // or server returns response with an error status.
		 });
	};
	
	var LabController = function($scope, $http) {
		
		$http.get('/mylabs/api/labs.json').
		  success(function(data) {
			  $scope.labs = data;
		  }).
		  error(function(data) {
		    // called asynchronously if an error occurs
		    // or server returns response with an error status.
		 });
	};
	
	var TutorialController = function($scope, $http) {
		
		$http.get('/mylabs/api/tutorials.json').
		  success(function(data) {
			  $scope.tutorials = data;
		  }).
		  error(function(data) {
		    // called asynchronously if an error occurs
		    // or server returns response with an error status.
		 });
	};
	
	app.controller("BlogController", ["$scope", "$http", BlogController]);

	app.controller("LabController", ["$scope", "$http", LabController]);

	app.controller("TutorialController", ["$scope", "$http", TutorialController]);

}());