
       <div class="col-xs-12 col-md-6 col-md-offset-3" style="margin-top:10px;">
        <form:form  modelAttribute="cust_prsnl_dtls" method="POST" action="registerupdate" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Fill Your Personal Details</blockquote>
            
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_state" >First Name</label>
              <div class="controls col-sm-8">
                <form:input id="cust_fname" path="cust_fname" ng-model="getUser.cust_fname"  name="cust_fname" placeholder="First Name" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_state" >Last Name</label>
              <div class="controls col-sm-8">
                <form:input id="cust_lname" path="cust_lname" ng-model="getUser.cust_lname"  name="cust_lname" placeholder="Last Name" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_state" >Date of Birth</label>
              <div class="controls col-sm-8">
                <form:input  id="cust_dob" path="cust_dob" ng-model="getUser.cust_dob"  name="cust_dob" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <form:input type="text" path="cust_id" ng-model="getUser.cust_id" hidden="true"/>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_addrss" >Address</label>
              <div class="controls col-sm-8">
                <form:textarea rows="5" cols="30" ng-model="getUser.cust_addrss" id="cust_addrss" path="cust_addrss"  name="cust_addrss" placeholder="Your Current Address" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_state" >State</label>
              <div class="controls col-sm-8">
                <form:input id="cust_state" path="cust_state" ng-model="getUser.cust_state"  name="cust_state" placeholder="State" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_city" >City</label>
              <div class="controls col-sm-8">
                <form:input id="cust_city" path="cust_city" ng-model="getUser.cust_city" name="cust_city" placeholder="City" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_pincd" >Pincode</label>
              <div class="controls col-sm-8">
                <form:input id="cust_pincd" path="cust_pincd" ng-model="getUser.cust_pincd"  name="cust_pincd" placeholder="Pincode" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" >Marital Status</label>
              <div class="controls col-sm-8">
                <form:select cssClass="form-control" ng-model="getUser.cust_mrtl_stts" path="cust_mrtl_stts">
                <form:option  value="S" label="Single" />
    			<form:option value="M" label="Married" />
    			<form:option value="D" label="Divorced" />
				</form:select>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="" >Alternate Contact No.</label>
              <div class="controls col-sm-8">
                <form:input id="cust_cntct_phn" path="cust_cntct_phn"  name="cust_cntct_phn" ng-model="getUser.cust_cntct_phn" placeholder="Alternate Contact Number" cssClass="form-control" title=""/>
              </div>
            </div>
           
            
            
            
            
            <div class="form-group">              
              <label class="control-label  col-sm-4">Gender</label>
              <div class="controls col-sm-8">
                <div class="container">
  
			    <label class="radio-inline">
			      <form:radiobutton ng-model="getUser.cust_gnd" path="cust_gnd" value="M" checked="true"/>Male
			    </label>
			    <label class="radio-inline">
			      <form:radiobutton ng-model="getUser.cust_gnd" path="cust_gnd" value="F"/>Female
			    </label>
			    <label class="radio-inline">
			      <form:radiobutton ng-model="getUser.cust_gnd" path="cust_gnd" value="T"/>Other
			    </label>
  
				</div>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4">Physically Challenged</label>
              <div class="controls col-sm-8">
                <div class="container">
  
			    <label class="radio-inline">
			      <form:radiobutton ng-model="getUser.phys_chllg" id="phys_chllg_yes" name="phys_chllg" path="phys_chllg" value="Y" />Yes
			    </label>
			    <label class="radio-inline">
			      <form:radiobutton ng-model="getUser.phys_chllg" name="phys_chllg" path="phys_chllg" value="N" checked="true"/>No
			    </label>
			    
				</div>
              </div>
            </div>
            <div id="phys_chllg_rmk_extradiv" class="form-group" hidden>              
              <label class="control-label  col-sm-4" for="phys_chllg_rmk" >Please Specify</label>
              <div class="controls col-sm-8">
                <form:textarea rows="5"  cols="30" ng-model="getUser.phys_chllg_rmk" id="phys_chllg_rmk" path="phys_chllg_rmk"  name="phys_chllg_rmk" placeholder="Describe the disability" cssClass="form-control" title=""/>
              </div>
            </div>
          
            <div class="form-group" style="margin-top:10px">
              <!-- Button -->
              <div class="controls text-center">
                <button type="submit"  class="btn btn-lg" style="background-color:#002247; color:white;">Update Profile</button>
              </div>  
            </div>
          </fieldset>
        </form:form>
      </div>
      <Script>
      
      
      
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
</Script>
   