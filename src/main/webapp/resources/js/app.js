(function () {
	
	var app = angular.module("app", ['ngSanitize', 'ngAnimate']);
	
	var EntryController = function($scope, $http) {
			
		$scope.type = "*";
		
		$http.get(apiUrl+'/entries.json').
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
		
		$scope.blogForm = {};
		
		$scope.init = function(id) {
			
			$http.get(apiUrl+'/blog/'+id+'.json').
			success(function(data) {
				$scope.entry = data;
				$scope.blogForm = data;
				
				CKEDITOR.replace('body');
			}).
			error(function(data) {
				//TODO
			});
			
		};
		
	    $scope.blogForm.submitBlogForm = function(item, event) {
	    	
	    	var dataObject = {
	    		title : $scope.blogForm.title,
	    		description  : $scope.blogForm.description,
	    		body : $scope.blogForm.body,
	    		bannerImageUrl : $scope.blogForm.bannerImageUrl
	        };

	        var responsePromise = $http.post(apiUrl+"/admin/blog", dataObject, {});
	        responsePromise.success(function(dataFromServer, status, headers, config) {
	        	console.log(dataFromServer.title);
	        });
	        responsePromise.error(function(data, status, headers, config) {
	        	alert("Submitting form failed!");
	        });
	    };
		
	};
	
	var TutorialController = function($scope, $http) {
		
		$scope.tutorialForm = {};
		
		$scope.init = function(id) {
			
			$http.get(apiUrl+'/tutorial/'+id+'.json').
			success(function(data) {
				$scope.entry = data;
				$scope.tutorialForm = data;
			}).
			error(function(data) {
				//TODO
			});
			
		};
		
	    $scope.tutorialForm.submitTutorialForm = function(item, event) {
	    	
	    	var dataObject = {
	    		title : $scope.tutorialForm.title,
	    		description  : $scope.tutorialForm.description,
	    		body : $scope.tutorialForm.body,
	    		bannerImageUrl : $scope.blogForm.bannerImageUrl
	    	};

	        var responsePromise = $http.post(apiUrl+"/admin/tutorial", dataObject, {});
	        responsePromise.success(function(dataFromServer, status, headers, config) {
	        	console.log(dataFromServer.title);
	        });
	        responsePromise.error(function(data, status, headers, config) {
	        	alert("Submitting form failed!");
	        });
	    };
		
	};
	
	var LabController = function($scope, $http) {
		
		$scope.labForm = {};
		
		$scope.init = function(id) {
			
			$http.get(apiUrl+'/lab/'+id+'.json').
			success(function(data) {
				$scope.entry = data;
				$scope.labForm = data;
				
			}).
			error(function(data) {
				//TODO
			});
			
		};
		
	    $scope.labForm.submitLabForm = function(item, event) {
	    	
	    	var dataObject = {
	    		title : $scope.labForm.title,
	    		description  : $scope.labForm.description,
	    		liveURL : $scope.labForm.liveURL,
	    		repoURL : $scope.labForm.repoURL,
	    		body : $scope.labForm.body,
	    		bannerImageUrl : $scope.blogForm.bannerImageUrl
	        };

	        var responsePromise = $http.post(apiUrl+"/admin/lab", dataObject, {});
	        responsePromise.success(function(dataFromServer, status, headers, config) {
	        	console.log(dataFromServer.title);
	        });
	        responsePromise.error(function(data, status, headers, config) {
	        	alert("Submitting form failed!");
	        });
	    };
		
	};
	
	app.controller("EntryController", ["$scope", "$http", EntryController]);
	app.controller("BlogController", ["$scope", "$http", BlogController]);
	app.controller("TutorialController", ["$scope", "$http", TutorialController]);
	app.controller("LabController", ["$scope", "$http", LabController]);
}());