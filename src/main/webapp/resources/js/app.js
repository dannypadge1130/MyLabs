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
	
	var BlogController = function($scope, $http) {
		
		$scope.init = function(id) {
			
			$http.get('/mylabs/api/blog/'+id+'.json').
			success(function(data) {
				$scope.entry = data;
			}).
			error(function(data) {
				//TODO
			});
			
		};
		
	};
	
	var TutorialController = function($scope, $http) {
		
		$scope.init = function(id) {
			
			$http.get('/mylabs/api/tutorial/'+id+'.json').
			success(function(data) {
				$scope.entry = data;
			}).
			error(function(data) {
				//TODO
			});
			
		};
		
	};
	
	var LabController = function($scope, $http) {
		
		$scope.init = function(id) {
			
			$http.get('/mylabs/api/lab/'+id+'.json').
			success(function(data) {
				$scope.entry = data;
			}).
			error(function(data) {
				//TODO
			});
			
		};
		
	};
	
	app.controller("EntryController", ["$scope", "$http", EntryController]);
	app.controller("BlogController", ["$scope", "$http", BlogController]);
	app.controller("TutorialController", ["$scope", "$http", TutorialController]);
	app.controller("LabController", ["$scope", "$http", LabController]);
}());