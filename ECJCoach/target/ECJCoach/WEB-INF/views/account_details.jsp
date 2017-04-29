<div class="container">
  <div class="row">
    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
      <div class="panel panel-info" style="border-color: #f65819;">
        <div class="panel-heading" style="background-color:#f65819;">
          <h3 class="panel-title" style="color:#263238">User Information<span class="pull-right"><a href="useredit">Edit</a></span></h3>
        </div>
        <div class="panel-body">
          <div class="row">
            <div class="col-md-3 col-lg-3 " align="center"> 
            <div ng-if="getUser.cust_gnd == 'M'">
            <img alt="User Pic" src="resources/images/man.png" class="img-circle img-responsive">
            </div>
            <div ng-if="getUser.cust_gnd == 'F'">
            <img alt="User Pic" src="resources/images/woman.png" class="img-circle img-responsive">
            </div>
            
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