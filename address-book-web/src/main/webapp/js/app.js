var app = angular.module('addressBookWeb', ['ngRoute']);

app.config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider){

    $routeProvider
        .when("/", {
            templateUrl: "views/home.html"
        })
        .when("/contacts", {
            templateUrl: "views/contacts.html",
            controller: 'getCtrl'
        })
        .when("/new-contacts", {
            templateUrl: "views/newContacts.html",
            controller: 'postCtrl'
        })
        .otherwise("/");
}]);
