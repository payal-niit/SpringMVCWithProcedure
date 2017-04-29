

<div class="container">
  <h2>Basic Table</h2>
  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>            
  <table class="table">
    <thead>
      <tr>
      <span ng-repeat="x in getMst">
        <th>{{x.acad_nm}}</th>
        </span>
        <th>Academic Year</th>
        <th>Academic Marks</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      
    </tbody>
  </table>
</div>




<!--        <div class="col-xs-12 col-md-6 col-md-offset-3" style="margin-top:10px;">
        <form:form modelAttribute="cust_acad_dtls" method="POST" action="registersubmit" cssClass="form-horizontal" name="form">
          <fieldset>
            <blockquote style="background-color:#002247; color:white;">Academic Details</blockquote>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="acad_inst" >Institute</label>
              <div class="controls col-sm-8">
                <form:input id="acad_inst" path="acad_inst"  name="acad_inst" placeholder="Institute Name" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_city" >Year</label>
              <div class="controls col-sm-8">
                <form:input type="date" id="acad_yr" path="acad_yr"  name="acad_yr" placeholder="Year of Passing" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="cust_state" >Marks</label>
              <div class="controls col-sm-8">
                <form:input id="acad_mrk_per" path="acad_mrk_per"  name="acad_mrk_per" placeholder="Marks Obtained" cssClass="form-control" required="true" title=""/>
              </div>
            </div>
            <div class="form-group">              
              <label class="control-label  col-sm-4" for="acad_spz" >Specialization</label>
              <div class="controls col-sm-8">
                <form:textarea rows="5" cols="30" id="acad_spz" path="acad_spz"  name="acad_spz" placeholder="Specialization" cssClass="form-control" title=""/>
              </div>
            </div>
            <div class="form-group" style="margin-top:10px">
              Button
              <div class="controls text-center">
                <button type="submit"  class="btn btn-lg" style="background-color:#002247; color:white;">Update Details</button>
              </div>  
            </div>
          </fieldset>
        </form:form>
      </div> -->
