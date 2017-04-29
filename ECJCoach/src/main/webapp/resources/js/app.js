var valid = angular.module('validation', []);

valid.controller('validationController', function($scope) {

  
      
  $scope.validation = function(x)
  {
      try{
      if( (x.length == 10 || x.length == 12 ) && isNaN(x) == false)
          {              
              $scope.err = false;
          }
      else
          {              
              $scope.err = true;
          }
      }
      catch(e)
          {              
          }
  }  
});
