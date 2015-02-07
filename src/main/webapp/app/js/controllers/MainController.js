/**
 * Created by pooya on 2/7/15.
 */


var module = angular.module("application", ['ngResource']);

module.controller("MainController", ['$scope', 'PersonRestService', function ($scope, PersonRestService) {
    $scope.Model = {};
    $scope.Action = {};

    $scope.Action.sendHello = function () {
        PersonRestService.hello($scope.Model).$promise.then(function(success){
            console.log(success);
        });
    };
}]);