(function () {
	
	var app = angular.module("app", ['ngSanitize', 'ngAnimate']);
	
	var EntryController = function($scope, $http) {
			
		$scope.type = "*";
		
		$http.get('/mylabs/api/entries.json').
		  success(function(data) {
			  $scope.entries = data;
		  }).
		  error(function(data) {
			  //TODO
		 });
		
		$scope.setType = function(type) {
			$scope.type = type;
		};
	};
	
	app.controller("EntryController", ["$scope", "$http", EntryController]);
}());