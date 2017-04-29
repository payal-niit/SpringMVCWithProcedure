<body style="background: #f5f5f5">

	
      
      <div class="col-xs-12 col-md-6 col-md-offset-3" style="margin-top:10px;">
        <form:form  modelAttribute="job_posting_dtls" method="POST" action="createJobOpening" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Fill New Job Openings</blockquote>
            
           <%--  <form:input hidden="true" path="job_prffl_id"  cssClass="form-control"/> --%>
            
            <c:if test="${not empty error}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${error}"/>.
        <c:remove var = "error" scope = "session" />
      </div>
</c:if>
           
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cmpny_nm" >Company Name</label>
              <div class="controls col-sm-8">
                 <form:select cssClass="form-control" path="cmpny_id" items="${listCompanies}" itemValue="cmpny_id" itemLabel="cmpny_nm"/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="job_industry" >Job Industry</label>
              <div class="controls col-sm-8">
                 <form:select cssClass="form-control" path="job_cat_id" items="${listIndustry}" itemValue="job_cat_id" itemLabel="job_industry"/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="job_industry_prffl" >Job Profile</label>
              <div class="controls col-sm-8">
                 <form:select cssClass="form-control" path="job_prffl_id" items="${listProfiles}" itemValue="job_prffl_id" itemLabel="job_industry_prffl"/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cmp_addrss" >Skills Required</label>
              <div class="controls col-sm-8">
               <form:textarea rows="4" cols="15" id="tokenfield-typeahead" path="skll_req"  data-role="tagsinput" name="skll_req" placeholder="Skills Required" cssClass="form-control" required="true" title=""/>
               </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="sal_rng_frm" >Salary Range From</label>
              <div class="controls col-sm-8">
                <form:input type="text"  path="sal_rng_frm" name="sal_rng_frm" placeholder="Salary Range From" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="sal_rng_to" >Salary Range To</label>
              <div class="controls col-sm-8">
                <form:input id="sal_rng_to" path="sal_rng_to"  name="sal_rng_to" placeholder="Salary Range To" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="acad_qual" >Qulification Required</label>
              <div class="controls col-sm-8">
                <form:input id="acad_qual" path="acad_qual"  name="acad_qual" placeholder="Qulification Required" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
           
           <div class="form-group">              
              <label class="control-label  col-sm-4" for="job_desc" >Job Description</label>
              <div class="controls col-sm-8">
               <form:textarea rows="4" cols="15" id="job_desc" path="job_desc"  name="job_desc" placeholder="Job Description" cssClass="form-control" required="true" title=""/>
               </div>
            </div>
           
           <div class="form-group">              
              <label class="control-label  col-sm-4" for="job_loc" >Job Location</label>
              <div class="controls col-sm-8">
                <form:input id="job_loc" path="job_loc"  name="job_loc" placeholder="Job Location" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
           
           <div class="form-group">              
              <label class="control-label  col-sm-4" for="exp_dtls" >Experience Required</label>
              <div class="controls col-sm-8">
                <form:input id="exp_dtls" path="exp_dtls"  name="exp_dtls" placeholder="Experience Required" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cntct_prsn_nm" >Contact Person</label>
              <div class="controls col-sm-8">
                <form:input id="cntct_prsn_nm" path="cntct_prsn_nm"  name="cntct_prsn_nm" placeholder="Contact Person" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
           
           <div class="form-group">              
              <label class="control-label  col-sm-4" for="cntct_nmbr" >contact Number</label>
              <div class="controls col-sm-8">
                <form:input id="cntct_nmbr" path="cntct_nmbr"  name="cntct_nmbr" placeholder="Contact Number" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
           
           <div class="form-group">              
              <label class="control-label  col-sm-4" for="cntct_eml_addrss" >Contact Email</label>
              <div class="controls col-sm-8">
                <form:input id="cntct_eml_addrss" path="cntct_eml_addrss"  name="cntct_eml_addrss" placeholder="Contact Email" cssClass="form-control" required="true" title=""/>
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
   
   
   		<script type="text/javascript">
   		
   		var engine = new Bloodhound({
   		  local: [{value: 'red'}, {value: 'blue'}, {value: 'green'} , {value: 'yellow'}, {value: 'violet'}, {value: 'brown'}, {value: 'purple'}, {value: 'black'}, {value: 'white'}],
   		  datumTokenizer: function(d) {
   		    return Bloodhound.tokenizers.whitespace(d.value);
   		  },
   		  queryTokenizer: Bloodhound.tokenizers.whitespace
   		});

   		engine.initialize();

   		$('#tokenfield-typeahead').tokenfield({
   		  typeahead: [null, { source: engine.ttAdapter() }]
   		});
   		
   		</script>
	
	
</body>