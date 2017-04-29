

<body style="background: #f5f5f5">

	<div class="col-xs-12 col-md-6 col-md-offset-3" style="margin-top:10px;">
        <form:form  modelAttribute="mst_job_cat_dtls" method="POST" action="createIndustry" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Fill New Job Industry</blockquote>
            
            <%-- <form:input hidden="true" id="job_cat_id" path="job_cat_id"  name="job_cat_id" cssClass="form-control"/> --%>
            
            <c:if test="${not empty error1}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${error1}"/>.
        <c:remove var = "error1" scope = "session" />
      </div>
</c:if>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="job_industry" >Industry Type</label>
              <div class="controls col-sm-8">
                <form:input id="job_industry" path="job_industry"  name="job_industry" placeholder="Fill Industry Type" cssClass="form-control" required="true" title=""/>
                
              </div>
            </div>
           
            <div class="form-group" style="margin-top:10px">
              <!-- Button -->
              <div class="controls text-center">
                <button type="submit"  class="btn" style="background-color:#002247; color:white;">CREATE</button>
              </div>  
            </div>
          </fieldset>
        </form:form>
      </div> 
      
      <div class="col-xs-12 col-md-6 col-md-offset-3" style="margin-top:10px;">
        <form:form  modelAttribute="mst_job_prffl_dtls" method="POST" action="createJobProfile" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Fill New Job Profile</blockquote>
            
           <%--  <form:input hidden="true" path="job_prffl_id"  cssClass="form-control"/> --%>
            
            <c:if test="${not empty error2}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${error2}"/>.
        <c:remove var = "error2" scope = "session" />
      </div>
</c:if>
           
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="job_industry" >Job Industry</label>
              <div class="controls col-sm-8">
                 <form:select cssClass="form-control" path="mst_job_cat_dtls.job_industry" items="${listIndustry}" itemValue="job_industry" itemLabel="job_industry"/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="job_industry" >Job Profile Type</label>
              <div class="controls col-sm-8">
                <form:input id="job_industry_prffl" path="job_industry_prffl"  name="job_industry_prffl" placeholder="Fill Job Profile" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
           
            <div class="form-group" style="margin-top:10px">
              <!-- Button -->
              <div class="controls text-center">
                <button type="submit"  class="btn" style="background-color:#002247; color:white;">CREATE</button>
              </div>  
            </div>
          </fieldset>
        </form:form>
      </div>
   
   
   		
	
	
</body>
</html>