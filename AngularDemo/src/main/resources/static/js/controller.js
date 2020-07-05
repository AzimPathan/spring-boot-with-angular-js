var app = angular.module('app', []);
console.log("controller js called..")
app.controller('getcontroller', function($scope, $http, $location) {
  $scope.getfunction = function(){
    var url = $location.absUrl() + "person";
    $http.get(url).then(function (response) {
      $scope.response = response.data
    }, function error(response) {
      $scope.postResultMessage = "Error with status: " +  response.statusText;
    });
  }
});