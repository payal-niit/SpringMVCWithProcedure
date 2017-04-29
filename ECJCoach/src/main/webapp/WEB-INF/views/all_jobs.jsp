<%@include file="header.jsp" %>


<div class="container">
<div class="jumbotron">
<input type="text" class="form-control" id="tokenfield-typeahead" value="red,green,blue" />
    <p>View all the openings below</p> 
  </div>
</div>

<div class="container" ng-app="Caller" ng-controller="JobController" style="margin-top:20px;" ng-cloak>
<div class="row">
<div class="container" style="background-color:#E0E0E0; padding:10px;">
            <div ng-repeat="j in jobs" class="items col-xs-12 col-sm-6 col-md-6 col-lg-6 clearfix" style=" margin-top:2px;  ">
               <div class="info-block block-info clearfix" style="background-color:#F5F5F5; box-shadow: 5px 5px 5px #888888;">
                    
                    <h5 style="background-color:white; padding:5px; color:#002247; font-style: oblique; text-align:center; font-weight: bold">{{j.job_industry_prffl}}</h5>
                    <ul class="list-group" style="font-size:12px">
  <li class="list-group-item"><span style="font-style: oblique; padding-right:5px;" >Name : </span> <span style="font-weight: bold;">{{j.cmpny_nm}}</span></li>
  <li class="list-group-item"><span style="font-style: oblique; padding-right:5px;">Title : </span> <span style="font-weight: bold;">{{j.job_industry}}</span></li>
  <li class="list-group-item"><span style="font-style: oblique; padding-right:5px;">Phone : </span> <span style="font-weight: bold;">{{j.cntct_nmbr}}</span></li>
  <li class="list-group-item"><span style="font-style: oblique; padding-right:5px;">Email : </span> <span style="font-weight: bold;">{{j.cntct_eml_addrss}}</span></li>
 
</ul>
                  
                </div>
            </div>
            
</div> 
</div>
</div>

<script type="text/javascript">
		var job = ${listJob};
		var app = angular.module('Caller', []);
		app.controller('JobController', function($scope) {
			  $scope.jobs = job;
			  
			  
			  
			 
		}); 
		
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