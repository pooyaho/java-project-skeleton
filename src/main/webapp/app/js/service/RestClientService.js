(function (module) {
    module.service("PersonRestService", ['$resource', function ($resource) {
        return $resource('/person/hello/', {}, {
            hello: {method: "POST"}
        });
    }]);
})(angular.module("application"));