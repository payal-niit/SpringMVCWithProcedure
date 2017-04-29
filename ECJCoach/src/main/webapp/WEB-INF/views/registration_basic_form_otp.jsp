<%@include file="header.jsp" %>

<body style="color:#607D8B; background-color:#F5F5F5; margin-top:20px; " ng-app="Caller" ng-controller="myController" >
    <div class="container" >
      <div class="col-xs-12 col-md-6 col-md-offset-3" style="border:2px solid grey" >
        <form method="POST" action="registerotp" class="form-horizontal" name="form">
        <c:if test="${not empty otpMessage}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${otpMessage}"/>.
        <c:remove var = "otpMessage" scope = "session" />
      </div>
</c:if>
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">OTP Confirmation</blockquote>
            <%-- <form:hidden path="cust_id"/> --%>
           
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="OTP" >OTP</label>
              <div class="controls col-sm-8">
                <input type="text" id="OTP" name="OTP" placeholder="Enter OTP Code" class="form-control" required title="Enter the OTP Code"/>
              </div>
             
            </div>
            
            <div class="form-group" style="margin-top:10px">
              <!-- Button -->
              <div class="controls text-center">
                <button type="submit"  class="btn btn-lg" style="background-color:#002247; color:white;">Confirm OTP</button>
              </div>  
            </div>
          </fieldset>
        </form>
      </div>
    </div>
  </body>
</html>