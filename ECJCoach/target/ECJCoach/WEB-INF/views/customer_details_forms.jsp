<%@include file="header.jsp" %>
    
    <div class="container" ng-app="Caller" ng-controller="CallerController">
  <h2>Customer Profile Page</h2>
  <p>Complete Your Profile Via The Forms Below</p>

  <ul class="nav nav-tabs">
	<li class="active"><a data-toggle="tab" href="#account">Account Details</a></li>  
    <li><a data-toggle="tab" href="#personal">Personal Details</a></li>
    <li><a data-toggle="tab" href="#academic">Academic Details</a></li>
    <li><a data-toggle="tab" href="#work">Work Details</a></li>
    <li><a data-toggle="tab" href="#resume">Resume Upload</a></li>
  </ul>

  <div class="tab-content">
  <div id="account" class="tab-pane fade in active">
  <%@include file="account_details.jsp" %>
  </div>
  <div id="personal" class="tab-pane fade in">
    <%@include file="personal_details_form.jsp" %>
    </div>
    <div id="academic" class="tab-pane fade in ">
    <%@include file="academic_details_form.jsp" %>
    </div>
    <div id="work" class="tab-pane fade in ">
    <%@include file="work_details_form.jsp" %>
    </div>
    <div id="resume" class="tab-pane fade in ">
    <%@include file="resume_details_form.jsp" %>
    </div>
   
  </div>
</div>


<script type="text/javascript">
var app = angular.module('Caller', []);
app.controller('CallerController', function($scope) {
	  $scope.getUser = ${userDetailsParticularListViaJson};
	  $scope.getMst = ${mstAcadDtls};
}); 

// Script to ask for physically challenged remark
$(function () {
    $("input[name='phys_chllg']").click(function () {
        if ($("#phys_chllg_yes").is(":checked")) {
            $("#phys_chllg_rmk_extradiv").show();
            $("#phys_chllg_rmk").prop('required',true);
        } else {
            $("#phys_chllg_rmk_extradiv").hide();
            $("#phys_chllg_rmk").prop('required',false);
        }
    });
});
</script>
</body>
</html>