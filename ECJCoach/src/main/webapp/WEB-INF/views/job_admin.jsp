<%@include file="header.jsp" %>
    
    <div class="container">
  <h2>Admin HOME</h2>
  <p>Complete Your Profile Via The Forms Below</p>
<c:if test="${not empty error}">
      <div class="alert alert-warning"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        
        <c:out value="${error}"/>.
        <c:remove var = "error" scope = "session" />
      </div>
</c:if>
  <ul class="nav nav-tabs">
	<li id="acd" class="active"><a data-toggle="tab" href="#job_profile">Job Profiles</a></li>  
    <li id="prsn"><a data-toggle="tab" href="#company">Fill Company</a></li>
    <li><a data-toggle="tab" href="#job_postings">Job Postings</a></li>
    <!-- <li><a data-toggle="tab" href="#work">Work Details Form</a></li> -->
    
  </ul>

  <div class="tab-content">
  <div id="job_profile" class="tab-pane fade in active">
  <%@include file="job_profiles.jsp" %>
  </div>
  <div id="company" class="tab-pane fade in">
    <%@include file="job_home.jsp" %>
    </div>
    <div id="job_postings" class="tab-pane fade in ">
    <%@include file="job_posting.jsp" %>
    </div>
   <%--  <div id="work" class="tab-pane fade in ">
    <%@include file="work_details_form.jsp" %>
    </div>
    <div id="resume" class="tab-pane fade in ">
    <%@include file="resume_details_form.jsp" %>
    </div> --%>
   
  </div>
</div>