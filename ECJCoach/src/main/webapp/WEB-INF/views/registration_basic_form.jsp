<%@include file="header.jsp" %>

<body style="color:#607D8B; background-color:#F5F5F5;">
    <div class="container" style="margin-top:10px;">
      <div class="col-xs-12 col-md-6 col-md-offset-3" style="border:2px solid grey" >
        <form:form modelAttribute="cust_prsnl_dtls" method="POST" action="registersubmit" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Registration</blockquote>
            <%-- <form:hidden path="cust_id"/> --%>
            <c:if test="${not empty error}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${error}"/>.
        <c:remove var = "otpMessage" scope = "session" />
      </div>
</c:if>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="name" >Name</label>
              <div class="controls col-sm-4">
                <form:input id="name" path="cust_fname"  name="cust_fname" placeholder="First Name" cssClass="form-control" required="true" title="Enter First Name"/>
              </div>
              <div class="controls col-sm-4">
                <form:input id="name" path="cust_lname"  name="cust_fname" placeholder="Last Name" cssClass="form-control" required="true" title="Enter Last Name"/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="emailId" >Email ID</label>
              <div class="controls col-sm-8">
                <form:input type="email" id="emailId" path="cust_eml_addrss" name="cust_eml_addrss" placeholder="Email Address" cssClass="form-control" required="true" title="Enter a valid Email Address"/>
              </div>
             
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="password">Password</label>
              <div class="controls col-sm-8">
                <form:password path="cust_psswd" id="password" name="cust_psswd" cssClass="form-control" placeholder="Password" required="true"/>
              </div>
            </div>
            <!-- <div class="form-group">             
              <label class="control-label  col-sm-4" for="confirmPassword">Confirm Password</label>
              <div class="controls col-sm-8">
                <input type="password" id="password" ng-model="reg.confirmPassword" name="confirmPassword" class="form-control" required title="Enter the same password as above">
              </div>
            </div> -->
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="mob" >Mobile</label>
              <div class="controls col-sm-8">
                <form:input id="mob" path="cust_cntct_mbl" name="cust_cntct_mbl" placeholder="Mobile Number" cssClass="form-control" required="true" title="Enter a valid mobile number"/>
              </div>
            </div>
            <div class="form-group">
              <label class="control-label  col-sm-4" for="dob">Date Of Birth</label>
              <div class="controls col-sm-8">
                <form:input type="date" path="cust_dob" id="dob"  title="Wrong pattren" name="cust_dob" cssClass="form-control" required="true" placeholder="Date of Birth" pattern="/^([0-9]{2})-([0-9]{2})-([0-9]{4})$/" />
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