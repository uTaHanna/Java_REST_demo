var app = angular.module('addressBookWeb', ['ngRoute']);

app.config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider){

    $routeProvider
        .when("/", {
            templateUrl: "views/home.html"
        })
        .when("/address/contact", {
            templateUrl: "views/contact.html",
            controller: 'getCtrl'
        })
        .when("/address/new-contact", {
            templateUrl: "views/newContact.html",
            controller: 'postCtrl'
        })
        .otherwise("/");
}]);
