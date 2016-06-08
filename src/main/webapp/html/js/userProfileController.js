/**
 * 
 */
 
var app = angular.module('myApp', []);
app.controller('userProfileController', function($scope, $timeout, $http, $interval) {
   
   $scope.selectionDiv = function(text){
	   
	  
	   $scope.selection = text;
   }
   
});
