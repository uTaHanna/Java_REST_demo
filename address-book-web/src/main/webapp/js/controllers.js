app.controller('getCtrl', [ '$scope', '$http', function($scope, $http) {

    $scope.submit = function() {

        console.log("processing request")

        $http({
            method: 'GET',
            url: 'http://localhost:8080/address-book-web/address/contact/' + $scope.contactName,
            data:{},
            headers: {}
        }).then(function success(response){

            var responseData = response.data;

            console.log("success: " + response.status);

            if(responseData){  // non null return

                $scope.contactEmail = responseData.email;
            } else{

                $scope.contactEmail = "Contact not found";
            }
        }, function error(response){

            console.log("error: " + response.status)
        });
    };
}]);

/*
   This method for converting the form data for http post
   is directly attributable to allenhwkim at
   https://stackoverflow.com/questions/24710503/how-do-i-post-urlencoded-form-data-with-http-in-angularjs
*/
app.controller('postCtrl', [ '$scope', '$http', function($scope, $http) {

    $scope.submit = function() {

        console.log("processing request");

        $http({
            method: 'POST',
            url: 'http://localhost:8080/address-book-web/address/new-contact',
            headers: {'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'},
            transformRequest: function(params){

                var str = [];
                for(var key in params)
                    str.push(encodeURIComponent(key) + "=" + encodeURIComponent(params[key]));
                return str.join('&');
            },
            data: {
                name: $scope.newContactName,
                email: $scope.newContactEmail
            }
        }).then(function success(response){

            console.log("success: " + response.status);
            $scope.message = "Request processed";
        }, function error(response){

            console.log("error: " + response.status);
            $scope.message = "Failed to add the contact";
        });
    };
}]);