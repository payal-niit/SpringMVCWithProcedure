<%@include file="header.jsp" %>

<body style="color:#607D8B; background-color:#F5F5F5;">
    <div class="container" style="margin-top:10px;" >
      <div class="col-xs-12 col-md-6 col-md-offset-3" style="border:2px solid grey" >
        <form method="POST" action="perform_login_otpcheck" class="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Login</blockquote>
            
            
    <c:if test="${not empty error}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${error}"/>.
        <c:remove var = "error" scope = "session" />
      </div>
</c:if>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="email" >Email ID</label>
              <div class="controls col-sm-8">
                <input type="text" id="email"   name="cust_eml_addrss" placeholder="" class="form-control" required="true" title="Enter a valid Email Address"/>
              </div>
              
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="Password" >Password</label>
              <div class="controls col-sm-8">
                <input type="password" id="Password"   name="password" placeholder="" class="form-control" required="true" title="Enter a valid Email Address"/>
              </div>
            </div>
           
            <div class="form-group" style="margin-top:10px">
              <!-- Button -->
              <div class="controls text-center">
                <button type="submit"  class="btn btn-lg" style="background-color:#002247; color:white;">Login</button>
              </div>  
            </div>
          </fieldset>
        </form>
      </div>
    </div>
  </body>
</html>