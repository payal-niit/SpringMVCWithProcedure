<div class="container text-center" style="margin-top:10px;">
<blockquote style="background-color:#002247; color:white;">Fill Your Academic Details</blockquote>
 <div class="table-responsive">
 <form:form modelAttribute="academicForm" method="post" action="addAcademicDetails">
  <table class="table table-bordered" >
    <thead >
      <tr >
        <th class="text-center"><button type="button" class="btn btn-default" style="border:1px solid #002247" onclick="addOtherAcad()">Add Other</button></th>
       <th class="text-center">Education Type</th>
        <th class="text-center">Education Institute</th>
        <th class="text-center">Year of Passing</th>
        <th class="text-center">Marks Obtained</th>
        <th class="text-center">Any Specialization?</th>
      </tr>
    </thead>
    <tbody id="otherTr">
       
         <!-- <tr ng-repeat="x in getMst | filter: {acad_id : '!' + 'AC005'}">
        <td><form:input path="dtls[0].tx_id" type="text" class="form-control" id="usr" placeholder="Education Institue" value="{{$index+1}}" />{{$index+1}}</td>
        <td><form:input path="dtls[0].acad_id" type="text" class="form-control" id="usr" placeholder="Education Institue" value="{{x.acad_nm}}" />{{x.acad_nm}}</td>
     <td><form:input path="dtls[0].acad_inst" type="text" class="form-control" id="usr" placeholder="Education Institue" /></td>
        <td><form:input path="dtls[0].acad_yr" type="date" class="form-control" id="usr" placeholder="Year of Passing" /></td>
        <td><form:input path="dtls[0].acad_mrk_per" type="text" class="form-control" id="usr" placeholder="Marks Obtained" /></td>
        <td><form:input path="dtls[0].acad_spz" type="text" class="form-control" id="usr" placeholder="Specialization" /></td>
      </tr>       -->
      <c:forEach items="${mstAcadDtlsViaJstl}" var="mst" varStatus="i" end="3">
      
      <tr>
       <td>
       <c:if test="${empty academicList[i.index].tx_id}">
       <form:input type="hidden" path="dtls[${i.index}].tx_id" value="NA" />
          </c:if>
       <c:if test="${not empty academicList[i.index].tx_id}">
       <form:input type="hidden" path="dtls[${i.index}].tx_id" value="${academicList[i.index].tx_id}" />
          </c:if></td> 
          <%-- <td><form:input path="dtls[${i.index}].tx_id" value="${i.index+1}" disabled="true" /></td>  --%>
        <td style="display:none;"><form:input type="hidden" path="dtls[${i.index}].acad_id" value="${mst.acad_id}"/></td> 
        <td><form:input path="dtls[${i.index}].cust_acad_othr_desc" value="${mst.acad_nm}" class="form-control" readonly="true"/></td> 
        <td><form:input path="dtls[${i.index}].acad_inst" type="text" value="${academicList[i.index].acad_inst}" class="form-control" id="usr" placeholder="Education Institue" /></td>
        <c:if test="${not empty academicList[i.index].acad_yr}">
         <td>
         
         <form:select path="dtls[${i.index}].acad_yr" class="form-control" value="${academicList[i.index].acad_yr}" id="usr" name="year">
  <script>
  
  var myDate = new Date();
  var year = myDate.getFullYear();
  var selectedYr=${academicList[i.index].acad_yr};
  var a;
  for(var i = 1950; i < year+1; i++){
	  if (selectedYr ==i) {
		  a='selected';
	  
	  document.write('<option name="dtls[${i.index}].acad_yr" value="'+i+'"'+a+'>'+i+'</option>');
	  
	  }
	  else {
		  document.write('<option name="dtls[${i.index}].acad_yr" value="'+i+'">'+i+'</option>');
	  }
  }
  </script>
</form:select> 
</td>
</c:if>
 <c:if test="${empty academicList[i.index].acad_yr}">
<td>
         
         <form:select path="dtls[${i.index}].acad_yr" class="form-control" value="${academicList[i.index].acad_yr}" id="usr" name="year">
  <script>
  
  var myDate = new Date();
  var year = myDate.getFullYear();
  
  var a;
  for(var i = 1950; i < year+1; i++){
	  
	  
	  document.write('<option name="dtls[${i.index}].acad_yr" value="'+i+'"'+a+'>'+i+'</option>');
	  
	  
  }
  </script>
</form:select> </td>
</c:if>


         
        <td><form:input path="dtls[${i.index}].acad_mrk_per" type="text" class="form-control" id="usr" value="${academicList[i.index].acad_mrk_per}" placeholder="Marks Obtained" /></td>
        
        <td><form:input path="dtls[${i.index}].acad_spz" type="text" class="form-control" id="usr" value="${academicList[i.index].acad_spz}" placeholder="Specialization" /></td>
        
        </tr>
        
    </c:forEach> 
    
    <c:if test="${not empty academicList[4].cust_acad_othr_desc}">
    
     <c:forEach items="${academicList}" var="mst" varStatus="i" begin="4" end="6">
      
      <tr id="otherDetails">
      <td><form:input type="hidden" path="dtls[${i.index}].tx_id" value="${mst.tx_id}" /></td> 
       
        <td style="display:none;"><form:input type="hidden" path="dtls[${i.index}].acad_id" value="${mstAcadDtlsViaJstl[i.index].acad_id}"/></td> 
        <td><form:input path="dtls[${i.index}].cust_acad_othr_desc" cssClass="form-control" value="${mst.cust_acad_othr_desc}"/></td> 
        <td><form:input path="dtls[${i.index}].acad_inst" type="text" value="${mst.acad_inst}" class="form-control" id="usr" placeholder="Education Institue" /></td>
        <%--  <td><form:input path="dtls[${i.index}].acad_yr" class="form-control" value="${mst.acad_yr}" placeholder="Year of Passing" /></td>  --%>
         <td><form:select path="dtls[${i.index}].acad_yr" class="form-control" value="${mst.acad_yr}" id="usr" name="year">
  <script>
  
  var myDate = new Date();
  var year = myDate.getFullYear();
  var selectedYr=${mst.acad_yr};
  var a;
  for(var i = 1950; i < year+1; i++){
	  if (selectedYr ==i) {
		  a='selected';
	  
	  document.write('<option name="dtls[${i.index}].acad_yr" value="'+i+'"'+a+'>'+i+'</option>');
	  
	  }
	  else {
		  document.write('<option name="dtls[${i.index}].acad_yr" value="'+i+'">'+i+'</option>');
	  }
  }
  </script>
</form:select> </td>
        <td><form:input path="dtls[${i.index}].acad_mrk_per" type="text" class="form-control" id="usr" value="${mst.acad_mrk_per}" placeholder="Marks Obtained" /></td>
        
        <td><form:input path="dtls[${i.index}].acad_spz" type="text" class="form-control" id="usr" value="${mst.acad_spz}" placeholder="Specialization" /></td>
        
        </tr>
        
    </c:forEach> 
    </c:if>
    </tbody>     
  </table>
  <button type="submit" class="btn btn-default" style="background-color:#002247; color:white;" >Submit</button> 
  </form:form>
  </div>
</div>
      <script>
      
      var c1 = parseInt(${countAcad});
      console.log("c is" + c1)
      var countTd1 = 7;
      if (c1>0) {
    	  var limit1 = ${countAcad};
      }
      else {
    	  var limit1 = 4;
      }
      
      console.log("Limit for Academic" + limit1)
      var countTr = $("#otherTr tr").length;

      function addOtherAcad() {
        if (limit1 < 7) {
          limit1++;


          var tr =  document.getElementById('otherTr').appendChild(document.createElement('tr'));
          for (i = 1; i <= countTd1; i++) 
          {
            if (i == 1) {
              var a = tr.appendChild(document.createElement('td'));

              var b = a.appendChild(document.createElement('input'));
              var temp2 = parseInt(c1)
              console.log(temp2 + "temp2")
              b.setAttribute('name', 'dtls[' + temp2 + '].tx_id');
              b.setAttribute('type', 'hidden');
              b.setAttribute('value', 'NA');
              b.setAttribute('class', 'form-control');
              b.setAttribute('placeholder', 'Education Institute');
            } 
            else if (i == 2) {
              var a = tr.appendChild(document.createElement('td'));
              a.setAttribute('style', 'display:none;');
              var b = a.appendChild(document.createElement('input'));
              var temp2 = parseInt(c1)
              console.log(temp2 + "temp2")
              b.setAttribute('name', 'dtls[' + temp2 + '].acad_id');
              b.setAttribute('type', 'text');
              b.setAttribute('value', 'AC005');
              b.setAttribute('class', 'form-control');
              b.setAttribute('placeholder', 'Education Institute');

            } 
            else if (i == 3) {
              var a = tr.appendChild(document.createElement('td'));
              a.setAttribute('style', 'vertical-align:middle');
              var temp2 = parseInt(c1)
              console.log(temp2 + "temp2")
              var b = a.appendChild(document.createElement('input'));
              b.setAttribute('name', 'dtls[' + temp2 + '].cust_acad_othr_desc');
              b.setAttribute('type', 'text');
              b.setAttribute('class', 'form-control');
              b.setAttribute('placeholder', 'Education Type');

            } 
            else if (i == 4) {
              var a = tr.appendChild(document.createElement('td'));
              var b = a.appendChild(document.createElement('input'));
              var temp2 = parseInt(c1)
              console.log(temp2 + "temp2")
              b.setAttribute('name', 'dtls[' + temp2 + '].acad_inst');
              b.setAttribute('type', 'text');
              b.setAttribute('class', 'form-control');
              b.setAttribute('placeholder', 'Education Institute');
            } 
            else if (i == 5) {
              var a = tr.appendChild(document.createElement('td'));
              var b = a.appendChild(document.createElement('select'));
              
              var temp2 = parseInt(c1)
              console.log(temp2 + "temp2")
              var myDate = new Date();
              var year = myDate.getFullYear();
              for(var i1 = 1950; i1 < year+1; i1++){
            	  var c = b.appendChild(document.createElement('option'));
            	  c.setAttribute('class', 'form-control');
            	  c.setAttribute('name', 'dtls[' + temp2 + '].acad_yr');
            	  c.setAttribute('value', i1 )
            	  c.value=i1;
            	  c.text=i1;
            	  
              }
              /* b.setAttribute('name', 'dtls[' + temp2 + '].acad_yr');
              b.setAttribute('type', 'text');
              b.setAttribute('class', 'form-control');
              b.setAttribute('placeholder', 'Year of Passing'); */

            } 
            else if (i == 6) {
              var a = tr.appendChild(document.createElement('td'));
              var b = a.appendChild(document.createElement('input'));
              var temp2 = parseInt(c1)
              console.log(temp2 + "temp2")
              b.setAttribute('name', 'dtls[' + temp2 + '].acad_mrk_per');
              b.setAttribute('type', 'text');
              b.setAttribute('class', 'form-control');
              b.setAttribute('placeholder', 'Marks Obtained');
            } else {
              var a = tr.appendChild(document.createElement('td'));
              var b = a.appendChild(document.createElement('input'));
              var temp2 = parseInt(c1)
              console.log(temp2 + "temp2")
              b.setAttribute('name', 'dtls[' + temp2 + '].acad_spz');
              b.setAttribute('type', 'text');
              b.setAttribute('class', 'form-control');
              b.setAttribute('placeholder', 'Specialization');
            }
          }
          c1++;
        } 
        else {
          alert('Maximum limit Reached');
        }
      }

          
      </script>




