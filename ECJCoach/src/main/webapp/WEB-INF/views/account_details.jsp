<div class="container" style="margin-top:10px;">
  


  <ul class="nav nav-tabs">
	<li class="active"><a data-toggle="tab" href="#personaldt">Personal Details</a></li>  
    
    <li><a data-toggle="tab" href="#academicdt">Academic Details</a></li>
    <li><a data-toggle="tab" href="#workdt">Work Details</a></li>
    <li><a data-toggle="tab" href="#resumedt">Resume Details</a></li>
  </ul>

  <div class="tab-content">
  <div id="personaldt" class="tab-pane fade in active">
 <div class="container" style="margin-top:10px;" >
  <div class="row">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
    
      <div class="panel panel-info" style="border-color: #002247;">
        <div class="panel-heading" style="background-color:#002247;">
          <h3 class="panel-title" style="color:white">User Information<span class="pull-right"><a id="edit" href="#personal" data-toggle="tab">Edit</a></span></h3>
        </div>
        <div class="panel-body">
          <div class="row">
            <div class="col-md-3 col-lg-3 " align="center"> 
            <div ng-if="getUser.cust_gnd == 'M' && getUser.img_file_dest == 'N'" >
            <img alt="User Pic" src="resources/images/man.png" class="img-circle img-responsive" >
            </div>
            <div ng-if="getUser.cust_gnd == 'F' && getUser.img_file_dest == 'N'">
            <img alt="User Pic" src="resources/images/woman.png" alt="" class="img-circle img-responsive" >
            </div>
            <div ng-if="getUser.cust_gnd == 'U' && getUser.img_file_dest == 'N'">
            <img alt="User Pic" src="resources/images/man.png" class="img-circle img-responsive" >
            </div>
            <div ng-if="getUser.img_file_dest == 'Y' && getUser.cust_gnd == 'M'">
            <img onerror="this.onerror=null;this.src='resources/images/man.png';" src="resources/images/profileImages/${pageContext.request.userPrincipal.name}.jpg" class="img-circle img-responsive" style="max-width:100px; min-height:90px; max-height:100px;">
            </div>
             <div ng-if="getUser.img_file_dest == 'Y' && getUser.cust_gnd == 'F'">
            <img onerror="this.onerror=null;this.src='resources/images/woman.png';" src="resources/images/profileImages/${pageContext.request.userPrincipal.name}.jpg" class="img-circle img-responsive" style="max-width:100px; min-height:90px; max-height:100px;">
            </div>
            <button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#profileModal" style="border:1px solid #002247; margin-top:5px; margin-bottom:5px;" >Upload Image</button>
            <button type="button" class="btn btn-default btn-xs" onclick="downloadResume()" style="border:1px solid #002247; margin-top:5px; margin-bottom:5px;">Download Resume</button>
            </div>
            <div class=" col-md-9 col-lg-9 ">
              <table class="table table-user-information" style="text-transform: capitalize;">
                <tbody>
                  <tr>
                    <td>First Name</td>
                    <td>:</td>
                    <td>{{getUser.cust_fname}}</td>
                  </tr>
                  <tr>
                    <td>Last Name</td>
                    <td>:</td>
                    <td>{{getUser.cust_lname}}</td>
                  </tr>
                  <tr>
                    <td>Date of Birth</td>
                    <td>:</td>
                    <td>{{getUser.cust_dob}}</td>
                  </tr>
                  <tr>
                    <tr>
                      <td>Gender</td>
                      <td>:</td>                   
                      <td><div ng-if="getUser.cust_gnd == 'U'">Not Specified</div><div ng-if="getUser.cust_gnd == 'F'">Female</div><div ng-if="getUser.cust_gnd == 'M'">Male</div></td>
                    </tr>
                    
                    <tr>
                      <td>Email</td>
                      <td>:</td>
                      <td><a href="mailto:{{getUser.emailId}}">${pageContext.request.userPrincipal.name}</a></td>
                    </tr>
                    <tr>
                      <td>Phone Number</td>
                      <td>:</td>
                      <td>{{getUser.cust_cntct_mbl}}</td>
                    </tr>
                    <tr>
                      <td>Alternate Number</td>
                      <td>:</td>
                      <td>{{getUser.cust_cntct_phn}}</td>
                    </tr>
                    <tr>
                      <td>Account Created on</td>
                      <td>:</td>
                      <td>{{getUser.created_dt}}</td>
                    </tr>
                    <tr>
                      <td>Marital Status</td>
                      <td>:</td>
                      <td><div ng-if="getUser.cust_mrtl_stts == 'U'">N/A</div><div ng-if="getUser.cust_mrtl_stts == 'S'">Single</div><div ng-if="getUser.cust_mrtl_stts == 'M'">Married</div><div ng-if="getUser.cust_mrtl_stts == 'D'">Divorced</div></td>
                    </tr>
                    <tr>
                      <td>Physically Challenged</td>
                      <td>:</td>
                      <td><div ng-if="getUser.phys_chllg == 'Y'">Yes</div><div ng-if="getUser.phys_chllg == 'N'">No</div></td>
                    </tr>
                    <tr>
                      <td>Physically Challenged Remark</td>
                      <td>:</td>
                      <td><div ng-if="getUser.phys_chllg_rmk == ' '">N/A</div><div ng-if="getUser.phys_chllg_rmk != ''">{{getUser.phys_chllg_rmk}}</div></td>
                    </tr>
                </tbody>
              </table>
             
            </div>
          </div>
        </div>
        <div class="panel-footer">
          
        </div>

      </div>
    </div>
 </div>
 </div>
 
 <div class="container" style="margin-top:10px;" >
  <div class="row">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
    
      <div class="panel panel-info" style="border-color: #002247;">
        <div class="panel-heading" style="background-color:#002247;">
          <h3 class="panel-title" style="color:white">Address Information<span class="pull-right"><a id="edit" href="#personal" data-toggle="tab">Edit</a></span></h3>
        </div>
        <div class="panel-body">
          <div class="row">
            
            <div class=" col-md-12 col-lg-12 ">
              <table class="table table-user-information" style="text-transform: capitalize;">
                <tbody>
                  <tr>
                    <td>State</td>
                    <td>:</td>
                    <td>{{getUser.cust_state}}</td>
                  </tr>
                  <tr>
                    <td>City</td>
                    <td>:</td>
                    <td>{{getUser.cust_city}}</td>
                  </tr>
                  <tr>
                    <td>Address</td>
                    <td>:</td>
                    <td>{{getUser.cust_addrss}}</td>
                  </tr>
                  <tr>
                    <td>Pincode</td>
                    <td>:</td>
                    <td>{{getUser.cust_pincd}}</td>
                  </tr>
                  
                </tbody>
              </table>
             
            </div>
          </div>
        </div>
        <div class="panel-footer">
          
        </div>

      </div>
    </div>
 </div>
 </div>

  </div>

    
<!-- Academic Details     -->
    <div id="academicdt" class="tab-pane fade in ">
    
    </div>
    
<!-- WORK DETAILS     -->
    <div id="workdt" class="tab-pane fade in ">
    
    </div>
    
    
<!-- RESUME DETAILS     -->
    <div id="resumedt" class="tab-pane fade in ">
    <div class="container" style="margin-top:10px;" >
  <div class="row">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
    
      <div class="panel panel-info" style="border-color: #002247;">
        <div class="panel-heading" style="background-color:#002247;">
          <h3 class="panel-title" style="color:white">Resume Information<span class="pull-right"><a id="editrs" href="#resume" data-toggle="tab">Edit</a></span></h3>
        </div>
        <div class="panel-body">
          <div class="row">
            
            <div class=" col-md-12 col-lg-12 ">
              <table class="table table-user-information" style="text-transform: capitalize;">
                <tbody>
                  <tr>
                    <td>Resume Headline</td>
                    <td>:</td>
                    <td>{{getResume.rsm_hdline}}</td>
                  </tr>
                  <tr>
                    <td>Current Location</td>
                    <td>:</td>
                    <td>{{getResume.crrnt_loc}}</td>
                  </tr>
                  <tr>
                    <td>Preferred</td>
                    <td>:</td>
                    <td>{{getResume.prf_loc}}</td>
                  </tr>
                  <tr>
                    <td>Overall Experience Years</td>
                    <td>:</td>
                    <td>{{getResume.ov_exp}}</td>
                  </tr>
                  <tr>
                    <td>Current Annual Salary</td>
                    <td>:</td>
                    <td>{{getResume.crrnt_ann_sal}}</td>
                  </tr>
                  <tr>
                    <td>Expected CTC</td>
                    <td>:</td>
                    <td>{{getResume.exp_ctc}}</td>
                  </tr>
                  <tr style="border-top: 2px solid #002247">
                    <td>Key Skills</td>
                    <td>:</td>
                    <td></td>
                  </tr>
                  <tr style="border-bottom: 2px solid #002247">
                  <td colspan="3">{{getResume.cust_key_skll}}</td>
                  </tr>
                  <tr style="border-top: 2px solid #002247">
                    <td>Languages Known</td>
                    <td>:</td>
                    <td></td>
                  </tr>
                  <tr style="border-bottom: 2px solid #002247">
                  <td colspan="3">{{getResume.cust_lng_knw}}</td>
                  </tr>
                  <tr>
                  <td><button type="button" class="btn btn-default btn-xs" onclick="downloadResume()" style="border:1px solid #002247; margin-top:5px; margin-bottom:5px;">Download Resume</button></td>
                  </tr>
                </tbody>
              </table>
             
            </div>
          </div>
        </div>
        <div class="panel-footer">
          
        </div>

      </div>
    </div>
 </div>
 </div>
    </div>
   
  </div>
</div>


 
 <%@include file="profile_image_modal.jsp" %>
 <script>
 function downloadResume()
 {
	 $.post("rsdllink", function(data){
		 
		 if(data == "error")
			 {
			 location.reload();
			 }
		 else
			 {
			 window.open(data); 
			 }
		  
		});
 }
 
 $("#edit").click(function (e) {
	 
	 e.preventDefault();
	 document.getElementById("acd").setAttribute('class','');
	 document.getElementById("prsn").setAttribute('class','active'); 
	

	});
 $("#editrs").click(function (e) {
	 
	 e.preventDefault();
	 document.getElementById("acd").setAttribute('class','');
	 document.getElementById("rsm").setAttribute('class','active'); 
	

	});
 </script>