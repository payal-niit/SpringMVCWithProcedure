
       <div class="col-xs-12 col-md-6 col-md-offset-3" style="margin-top:10px;">
        <form:form modelAttribute="cust_rsm_dtls" method="POST" action="userresume" cssClass="form-horizontal" name="form" enctype="multipart/form-data">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Fill Your Resume Details</blockquote>
            
            
            <div class="form-group">              
              <label class="control-label  col-sm-5" for="rsm_hdline" >Your Resume Headline</label>
              <div class="controls col-sm-7">
                <form:textarea row="5" column="30" id="rsm_hdline" ng-model="getResume.rsm_hdline"  path="rsm_hdline"  name="rsm_hdline " placeholder="Your Resume Headline" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-5" for="crrnt_loc" >Current Location</label>
              <div class="controls col-sm-7">
                <form:input id="crrnt_loc" path="crrnt_loc" ng-model="getResume.crrnt_loc"  name="crrnt_loc" placeholder="Your Current Location" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-5" for="prf_loc" >Preferred Location</label>
              <div class="controls col-sm-7">
                <form:input id="prf_loc" path="prf_loc" ng-model="getResume.prf_loc" name="prf_loc" placeholder="Your Preferred Location" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-6" for="ov_exp" >Overall Experience In Years</label>
              <div class="controls col-sm-6">
                <form:input  id="ov_exp" path="ov_exp" ng-model="getResume.ov_exp" name="ov_exp" placeholder="Enter 0 for Fresher" cssClass="form-control" required="true" title=""/>
              </div>
            </div>

            <div class="form-group">              
              <label class="control-label  col-sm-6" for="crrnt_ann_sal" >Current Annual Salary In Lakhs</label>
              <div class="controls col-sm-6">
                <form:input  id="crrnt_ann_sal" path="crrnt_ann_sal" ng-model="getResume.crrnt_ann_sal" name="crrnt_ann_sal" placeholder="Your Annual Salary. E.g. 3.5" step="0.01" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-6" for="exp_ctc" >Your Expected CTC In Lakhs</label>
              <div class="controls col-sm-6">
                <form:input  id="exp_ctc" path="exp_ctc" ng-model="getResume.exp_ctc" name="exp_ctc" placeholder="Your Expected Salary. E.g. 3.5" step="0.01" cssClass="form-control" required="true" title="CTC Means Cost To Company / Your Expected Salary"/>
              </div>
            </div>
             <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_key_skll" >Your Key Skills</label>
              <div class="controls col-sm-8">
                <form:textarea row="5" column="30" id="cust_key_skll" ng-model="getResume.cust_key_skll" path="cust_key_skll"  name="cust_key_skll " placeholder="Use a , to seperate multiple skills. E.g. Java, Communication, ... " cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_lng_knw" >Languages Known</label>
              <div class="controls col-sm-8">
                <form:textarea row="6" column="30" id="cust_lng_knw" ng-model="getResume.cust_lng_knw" path="cust_lng_knw"  name="cust_lng_knw " placeholder="Use a , to seperate multiple languages. E.g. English, Hindi, ... " cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="rsm_doc" >Upload Resume File</label>
              <div class="controls col-sm-8">
                <form:input path="rsm_doc" type="file" cssClass="form-control" id="rsm_doc" accept="application/pdf,application/msword,
  application/vnd.openxmlformats-officedocument.wordprocessingml.document" title=".doc  or .pdf files only"/>
              </div>
            </div>

			
            <div class="form-group" style="margin-top:10px">
              <!-- Button -->
              <div class="controls text-center">
                <button type="submit" onclick="return validate()"  class="btn btn-lg" style="background-color:#002247; color:white;">Update Resume Details</button>
              </div>  
            </div>
          </fieldset>
        </form:form>
      </div>
      <script>
      function validate()
      {
    	  var ctc = document.getElementById("exp_ctc");
    	  var crrntSal = document.getElementById("crrnt_ann_sal");
    	  var exp = document.getElementById("ov_exp");
    	  var chk = 0;
    	  if(isNaN(ctc.value))
    		  {
    		  chk = 1;
    		  ctc.setAttribute('style','border: 2px solid red');
    		  }  
    	  if(isNaN(crrntSal.value))
			  {
			  chk = 1;
			  crrntSal.setAttribute('style','border: 2px solid red');
			  }
    	  if(isNaN(exp.value))
    		  {
    		  chk = 1;
    		  exp.setAttribute('style','border: 2px solid red');
    		  }
    	  if(chk == 1)
    		  {
    		  return false;
    		  }
    	  else
    		  {
    		  return true;
    		  }
      }
      </script>
