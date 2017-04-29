
       <div class="col-xs-12 col-md-6 col-md-offset-3" style="margin-top:10px;">
        <form:form modelAttribute="cust_prsnl_dtls" method="POST" action="registersubmit" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Fill Your Personal Details</blockquote>
            
            
            
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_addrss" >Address</label>
              <div class="controls col-sm-8">
                <form:textarea rows="5" cols="30" id="cust_addrss" path="cust_addrss"  name="cust_addrss" placeholder="Your Current Address" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_city" >City</label>
              <div class="controls col-sm-8">
                <form:input id="cust_city" path="cust_city"  name="cust_city" placeholder="City" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_state" >State</label>
              <div class="controls col-sm-8">
                <form:input id="cust_state" path="cust_state"  name="cust_state" placeholder="State" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_pincd" >Pincode</label>
              <div class="controls col-sm-8">
                <form:input id="cust_pincd" path="cust_pincd"  name="cust_pincd" placeholder="Pincode" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" >Marital Status</label>
              <div class="controls col-sm-8">
                <form:select cssClass="form-control" path="cust_mrtl_stts">
                <form:option  value="S" label="Single" />
    			<form:option value="M" label="Married" />
    			<form:option value="D" label="Divorced" />
				</form:select>
              </div>
            </div>
            
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="" >Alternate Contact No.</label>
              <div class="controls col-sm-8">
                <form:input id="" path=""  name="" placeholder="" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="" ></label>
              <div class="controls col-sm-8">
                <form:input id="" path=""  name="" placeholder="" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="" ></label>
              <div class="controls col-sm-8">
                <form:input id="" path=""  name="" placeholder="" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            
            
            
            
            <div class="form-group">              
              <label class="control-label  col-sm-4">Gender</label>
              <div class="controls col-sm-8">
                <div class="container">
  
			    <label class="radio-inline">
			      <form:radiobutton path="cust_gnd" value="M" checked="true"/>Male
			    </label>
			    <label class="radio-inline">
			      <form:radiobutton path="cust_gnd" value="F"/>Female
			    </label>
			    <label class="radio-inline">
			      <form:radiobutton path="cust_gnd" value="T"/>Other
			    </label>
  
				</div>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4">Physically Challenged</label>
              <div class="controls col-sm-8">
                <div class="container">
  
			    <label class="radio-inline">
			      <form:radiobutton id="phys_chllg_yes" name="phys_chllg" path="phys_chllg" value="Y" checked="true"/>Yes
			    </label>
			    <label class="radio-inline">
			      <form:radiobutton name="phys_chllg" path="phys_chllg" value="N" checked="true"/>No
			    </label>
			    
				</div>
              </div>
            </div>
            <div id="phys_chllg_rmk_extradiv" class="form-group" hidden>              
              <label class="control-label  col-sm-4" for="phys_chllg_rmk" >Please Specify</label>
              <div class="controls col-sm-8">
                <form:textarea rows="5" cols="30" id="phys_chllg_rmk" path="phys_chllg_rmk"  name="phys_chllg_rmk" placeholder="Describe the disability" cssClass="form-control" required="true" title=""/>
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
