

<body style="background: #f5f5f5">

	<div class="col-xs-12 col-md-6 col-md-offset-3" style="margin-top:10px;">
        <form:form  modelAttribute="mst_cmpny_dtls" method="POST" action="createCompany" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Fill New Company Profile</blockquote>
            
             <c:if test="${not empty error}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${error}"/>.
        <c:remove var = "error" scope = "session" />
      </div>
</c:if>
            
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cmpn_nm" >Company Name</label>
              <div class="controls col-sm-8">
                <form:input id="cmpny_nm" path="cmpny_nm"  name="cmpny_nm" placeholder="Company Name" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cmp_addrss" >Company Address</label>
              <div class="controls col-sm-8">
               <form:textarea rows="4" cols="15" id="cmp_addrss" path="cmp_addrss"  name="cmp_addrss" placeholder="Company Address" cssClass="form-control" required="true" title=""/>
               </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cmp_eml_addrss" >Company Email</label>
              <div class="controls col-sm-8">
                <form:input type="email" id="cmp_eml_addrss" path="cmp_eml_addrss"  name="cmp_eml_addrss" placeholder="Company Email" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
             <div class="form-group">              
              <label class="control-label  col-sm-4" for="cmp_cntct_nmbr" >Company Contact Number</label>
              <div class="controls col-sm-8">
                <form:input type="number" id="cmp_cntct_nmbr" path="cmp_cntct_nmbr"  name="cmp_cntct_nmbr" placeholder="Contact Number" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cmp_desc" >Company Description</label>
              <div class="controls col-sm-8">
               <form:textarea rows="4" cols="15" id="cmp_desc" path="cmp_desc"  name="cmp_desc" placeholder="Company Details" cssClass="form-control" required="true" title=""/>
               </div>
            </div>
            
           
          
            <div class="form-group" style="margin-top:10px">
              <!-- Button -->
              <div class="controls text-center">
                <button type="submit"  class="btn btn-lg" style="background-color:#002247; color:white;">Submit</button>
              </div>  
            </div>
          </fieldset>
        </form:form>
      </div> 
   
	
	
</body>
</html>