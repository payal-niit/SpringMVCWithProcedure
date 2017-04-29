<%@include file="header.jsp" %>
    
    <div class="container" ng-app="Caller" ng-controller="CallerController" ng-cloak>
  <h2>Customer Profile Page</h2>
  <p>Complete Your Profile Via The Forms Below</p>
<c:if test="${not empty error}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${error}"/>.
        <c:remove var = "error" scope = "session" />
      </div>
</c:if>
  <ul class="nav nav-tabs">
	<li id="acd" class="active"><a data-toggle="tab" href="#account">Account Details</a></li>  
    <li id="prsn"><a data-toggle="tab" href="#personal">Personal Details Form</a></li>
    <li><a data-toggle="tab" href="#academic">Academic Details Form</a></li>
    <li><a data-toggle="tab" href="#work">Work Details Form</a></li>
    <li id="rsm"><a data-toggle="tab" href="#resume">Resume Upload Form</a></li>
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

	  
	  $scope.getResume = ${userResumeDetailsListViaJson};
	  
	 
}); 


</script>
</body>
</html>