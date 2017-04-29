
<div class="container text-center" style="margin-top:10px;">
<blockquote style="position:relative;background-color:#002247; color:white;">Fill Your Work Experience Details</blockquote>
 
 <form:form modelAttribute="workForm" method="post" action="addWorkDetails" >
 <div class="table-responsive">
  <table style="border-collapse: collapse;border-spacing: 0;" class="table table-bordered" >
    <thead >
      <tr >
        <th class="text-center"><button type="button" class="btn btn-primary btn-sm" style="border:1px solid #002247" onclick="addOther()">Add Other</button></th>
        <th class="text-center">Organization Name</th>
        <th class="text-center">Designation</th>
        <th class="text-center">Work From</th>
        <th class="text-center">Work To</th>
        <th class="text-center">Salary</th>
        <th class="text-center">Role</th>
        <th class="text-center">Industry</th>
        <th class="text-center">Functional Area</th>
      </tr>
    </thead>
    <tbody id="otherTr1">
    <c:if test="${empty WorkDetailById}">
         <c:forEach var="wrkDetail" varStatus="a" begin="0" end="0">
    
     <tr cellspacing="0" cellpadding="0">
     <td><form:input class="form-control input-sm" type="hidden" path="expls[${a.index}].tx_id" value="${a.index}" /></td>
   <td><form:input class="form-control input-sm" type="text" path="expls[${a.index}].org_name" placeholder="Name" /></td>
     <td> <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_desg" placeholder="Designation"/></td>
   
    <td >
    <div class="input-group date" id="datetimepicker10">
                <input name="expls[${a.index}].wrk_frm" type='text' class="form-control input-sm" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar">
                    </span>
                </span>
            </div>
    
    </td> 
    <td >
    <div class="input-group date" id="datetimepicker9">
                <input name="expls[${a.index}].wrk_to" type='text' class="form-control input-sm" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar">
                    </span>
                </span>
            </div>
    
    </td> 
    <%-- <td> <form:input class="form-control input-sm" type="date" path="expls[${a.index}].wrk_frm" placeholder="Starting Year" /></td> --%>
      <%-- <td> <form:input class="form-control input-sm" type="date" path="expls[${a.index}].wrk_to" placeholder="Ending Year or Current" /></td>  --%>
     <td> <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_sal" placeholder="Salary" /></td>
     <td> <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_role" placeholder="Current Role" /></td>
     <td> <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_industry" placeholder="Industry" /></td>
    <td>  <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_fun_area" placeholder="Functional Area" /></td>
        
    </c:forEach> 
    </c:if>
    <c:if test="${not empty WorkDetailById}">
     <c:forEach items="${WorkDetailById}" var="wrkDetail" varStatus="a" begin="0" end="10">
    
     <tr>
     <td><form:input class="form-control input-sm" type="hidden" path="expls[${a.index}].tx_id" value="${wrkDetail.tx_id}" /></td>
   <td><form:input class="form-control input-sm" type="text" path="expls[${a.index}].org_name" placeholder="Name" value="${wrkDetail.org_name}" /></td>
     <td> <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_desg" placeholder="Designation" value="${wrkDetail.cust_desg}" /></td>
      <td >
    <div class="input-group date" id="datetimepicker10">
                <input size="27" name="expls[${a.index}].wrk_frm" type='text' value="${wrkDetail.wrk_frm}" class="form-control input-sm" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar">
                    </span>
                </span>
            </div>
    
    </td> 
    <td >
    <div class="input-group date" id="datetimepicker9">
                <input size="27" name="expls[${a.index}].wrk_to" type='text' value="${wrkDetail.wrk_to}" class="form-control input-sm" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar">
                    </span>
                </span>
            </div>
    
    </td> 
     
     <%-- <td> <form:input class="form-control" type="date" path="expls[${a.index}].wrk_frm" placeholder="Starting Year" value="${wrkDetail.wrk_frm}" /></td>
     <td> <form:input class="form-control" type="date" path="expls[${a.index}].wrk_to" placeholder="Ending Year or Current" value="${wrkDetail.wrk_to}" /></td> --%>
     <td> <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_sal" placeholder="Salary" value="${wrkDetail.cust_sal}" /></td>
     <td> <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_role" placeholder="Your Role" value="${wrkDetail.cust_role}" /></td>
     <td> <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_industry" placeholder="Industry" value="${wrkDetail.cust_industry}" /></td>
    <td>  <form:input class="form-control input-sm" type="text" path="expls[${a.index}].cust_fun_area" placeholder="Functional Area" value="${wrkDetail.cust_fun_area}" /></td>
   </tr></c:forEach>
    </c:if>
    </table>
    <input type="submit" class="btn btn-primary">
      </div>
    </form:form>

</div>
  <script>
      $(function () {
          $('#datetimepicker10').datetimepicker({
        	  useCurrent: false,
        	   sideBySide: true,
              viewMode: 'years',
              format: 'MM/YYYY',
            	  widgetPositioning: {
                      horizontal: 'right',
                      vertical: 'bottom'
                  }
          });
      });
      
      $(function () {
          $('#datetimepicker9').datetimepicker({
        	  useCurrent: false,
        	   sideBySide: true,
              viewMode: 'years',
              format: 'MM/YYYY',
            	  widgetPositioning: {
                      horizontal: 'right',
                      vertical: 'bottom'
                  }
          });
      });
      
      $(function () {
          $('.datetimepicker11').datetimepicker({
        	  
        	   sideBySide: true,
              viewMode: 'years',
              format: 'MM/YYYY',
            	  widgetPositioning: {
                      horizontal: 'right',
                      vertical: 'bottom'
                  }
          });
      });
      </script>
     

      <script>
          var c=parseInt(${countWork});
          
          console.log("work detail no"+c)
          var countTd = 9;
          var limit = ${countWork}; 
          console.log(limit+"limit")
          var countTr = $("#otherTr1 tr").length;
          function addOther()
          {
        	  
              if(limit < 10)
                {
              limit++;
              
             
              var tr =  document.getElementById('otherTr1').appendChild(document.createElement('tr'));
              for(i = 1 ; i<=countTd; i++)
                  {
            	  if(i == 1)
                  {
            		  var a = tr.appendChild(document.createElement('td'));
                      
                      var b = a.appendChild(document.createElement('input'));
                      var temp2=parseInt(c)
                  	 console.log(temp2+"temp2")
                      b.setAttribute('name','expls['+temp2+'].tx_id');
                      b.setAttribute('type','hidden');
                      b.setAttribute('value','NA');
                      b.setAttribute('class','form-control input-sm');
                      b.setAttribute('placeholder','Education Institute');
                  }
            	  
                      else if(i==2)
                      {
                          var a = tr.appendChild(document.createElement('td'));
                         
                          var b = a.appendChild(document.createElement('input'));
                          var temp2=parseInt(c)
                      	 console.log(temp2+"temp2")
                          b.setAttribute('name','expls['+temp2+'].org_name');
                          b.setAttribute('type','text');
                          
                          b.setAttribute('class','form-control input-sm');
                          b.setAttribute('placeholder','Name');
                          
                      }
                      else if(i==3)
                          {
                              var a = tr.appendChild(document.createElement('td'));
                              a.setAttribute('style', 'vertical-align:middle');
                              var temp2=parseInt(c)
                          	 console.log(temp2+"temp2")
                              var b = a.appendChild(document.createElement('input'));
                              b.setAttribute('name','expls['+temp2+'].cust_desg');
                              b.setAttribute('type','text');
                              b.setAttribute('class','form-control input-sm');
                              b.setAttribute('placeholder','Designation');
                              
                          }
                      else if(i==4)
                    	  {
                    	 	 var a = tr.appendChild(document.createElement('td'));
                    	 	 var b = a.appendChild(document.createElement('div'));
                    	 	b.setAttribute('class','input-group date datetimepicker11');
                    	 	
                    	 	
                         	 var c1 = b.appendChild(document.createElement('input'));
                         	var temp2=parseInt(c)
                        	 console.log(temp2+"temp2")
                         	c1.setAttribute('name','expls['+temp2+'].wrk_frm');
                            
                            c1.setAttribute('class','form-control input-sm');
                            
                            var c2 = b.appendChild(document.createElement('span'));
                            c2.setAttribute('class','input-group-addon');
                            var c3 = c2.appendChild(document.createElement('span'));
                            c3.setAttribute('class','glyphicon glyphicon-calendar');
                            
                            $(function () {
                                $('.datetimepicker11').datetimepicker({
                              	  
                              	   sideBySide: true,
                                    viewMode: 'years',
                                    format: 'MM/YYYY',
                                  	  widgetPositioning: {
                                            horizontal: 'right',
                                            vertical: 'bottom'
                                        }
                                });
                            });
                    	  }
                      else if(i==5)
                    	  {
                    	  var a = tr.appendChild(document.createElement('td'));
                 	 	 var b = a.appendChild(document.createElement('div'));
                 	 	b.setAttribute('class','input-group date datetimepicker11');
                 	 	
                 	 	
                      	 var c1 = b.appendChild(document.createElement('input'));
                      	var temp2=parseInt(c)
                     	 console.log(temp2+"temp2")
                      	c1.setAttribute('name','expls['+temp2+'].wrk_to');
                         
                         c1.setAttribute('class','form-control input-sm');
                         
                         var c2 = b.appendChild(document.createElement('span'));
                         c2.setAttribute('class','input-group-addon');
                         var c3 = c2.appendChild(document.createElement('span'));
                         c3.setAttribute('class','glyphicon glyphicon-calendar');
                         
                         $(function () {
                             $('.datetimepicker11').datetimepicker({
                           	  
                           	   sideBySide: true,
                                 viewMode: 'years',
                                 format: 'MM/YYYY',
                               	  widgetPositioning: {
                                         horizontal: 'right',
                                         vertical: 'bottom'
                                     }
                             });
                         });
                            
                    	  }
                      else if(i==6)
                	  {
                	 	 var a = tr.appendChild(document.createElement('td'));
                     	 var b = a.appendChild(document.createElement('input'));
                     	 var temp2=parseInt(c)
                     	 console.log(temp2+"temp2")
                     	b.setAttribute('name','expls['+temp2+'].cust_sal');
                        	b.setAttribute('type','text');
                        	b.setAttribute('class','form-control input-sm');
                        	b.setAttribute('placeholder','Salary');
                	  }
                      else if(i==7)
                	  {
                	 	 var a = tr.appendChild(document.createElement('td'));
                     	 var b = a.appendChild(document.createElement('input'));
                     	 var temp2=parseInt(c)
                     	 console.log(temp2+"temp2")
                     	b.setAttribute('name','expls['+temp2+'].cust_role');
                        	b.setAttribute('type','text');
                        	b.setAttribute('class','form-control input-sm');
                        	b.setAttribute('placeholder','Current Role');
                	  }
                      else if(i==8)
                	  {
                	 	 var a = tr.appendChild(document.createElement('td'));
                     	 var b = a.appendChild(document.createElement('input'));
                     	 var temp2=parseInt(c)
                     	 console.log(temp2+"temp2")
                     	b.setAttribute('name','expls['+temp2+'].cust_industry');
                        	b.setAttribute('type','text');
                        	b.setAttribute('class','form-control input-sm');
                        	b.setAttribute('placeholder','Industry');
                	  }
                      else
                          {   
                              var a = tr.appendChild(document.createElement('td'));
                              var b = a.appendChild(document.createElement('input'));
                              var temp2=parseInt(c)
                          	 console.log(temp2+"temp2")
                              b.setAttribute('name','expls['+temp2+'].cust_fun_area');
                                b.setAttribute('type','text');
                                b.setAttribute('class','form-control input-sm');
                                b.setAttribute('placeholder','Functional area');
                          }
                  }
              c++;
                }
              else
                {
                  alert('Maximum limit Reached');
                }
          }
          
      </script>
      
     