<%@include file="header.jsp" %>

<body style="color:#607D8B; background-color:#F5F5F5; margin-top:20px; " ng-app="Caller" ng-controller="myController" ng-cloak>
    <div class="container" >
      <div class="col-xs-12 col-md-6 col-md-offset-3" style="border:2px solid grey" >
        <form:form modelAttribute="tx" method="POST" action="save" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Registration</blockquote>
    
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="email" >Email ID</label>
              <div class="controls col-sm-8">
                <form:input type="text" id="email" path="fname" ng-model="reg.emailId" name="emailId" placeholder="" cssClass="form-control" required="true" title="Enter a valid Email Address"/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="email" >Email ID</label>
              <div class="controls col-sm-8">
                <form:input type="text" id="email" path="lname" ng-model="reg.emailId" name="emailId" placeholder="" cssClass="form-control" required="true" title="Enter a valid Email Address"/>
              </div>
            </div>
           
            <div class="form-group" style="margin-top:10px">
              <!-- Button -->
              <div class="controls text-center">
                <button type="submit"  class="btn btn-lg" style="background-color:#002247; color:white;">Register Now</button>
              </div>  
            </div>
          </fieldset>
        </form:form>
      </div>
    </div>
  </body>
</html>