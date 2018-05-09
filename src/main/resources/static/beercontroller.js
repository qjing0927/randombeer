angular.module('beerapp', [])
.controller('BeerController', function($scope, $http) {
	
	$http.get('/beer/1').
     then(function(response) {
         $scope.beer = response.data;
     });
	
	
	$scope.randomBeer = function(){
    $http.get(
    		'/beer/'+$scope.beer.id, 
    		).
        then(function(response) {
            $scope.beer = response.data;
        });
	}
});