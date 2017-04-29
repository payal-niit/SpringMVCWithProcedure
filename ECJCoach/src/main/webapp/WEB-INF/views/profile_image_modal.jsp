 <form:form  modelAttribute="cust_prsnl_dtls" method="POST" action="userprofileimage" cssClass="form-horizontal" name="form" enctype="multipart/form-data">
<div class="modal fade" id="profileModal" role="dialog">
    <div class="modal-dialog">
   
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color:#002247">
          <button type="button" class="close" style="color:white; opacity: 1;" data-dismiss="modal">&times;</button>
          <h4 class="modal-title" style="text-align:center; color:white">Upload Image</h4>
        </div>
        
        
          
      <div class="col-xs-12 text-center">
      <center>
      <div class="thumbnail" style="width:300px; margin-top:10px;">
      <div class="imgholder">
      <img id="Tempimg" class="img-responsive center-block" src="resources/images/altimg.png" alt="your image" alt="Error" />
      </div>
      </div>
      </center>
      </div>
      
      <div class="col-xs-12">
      <label class="labelspace" for="Image">Choose Image</label>
	  <form:input path="prf_image" type="file" onchange="readURL(this);" cssClass="form-control" id="Image" accept="image/x-png, image/jpeg" required="true"/>
	  </div>
      

 
      
      
    <div class="col-xs-12 text-center" style="margin-top:5px;">
    <button type="submit" class="btn btn-default" style="border:2px solid #002247; margin-top:2px; margin-bottom:2px;" >Save</button>
    <button id="del" type="button" class="btn btn-default" style="border:2px solid #002247">Clear Image</button>
    </div>
    
    
       
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  </form:form>
  
  <script>
  function readURL(input) {
	  if (input.files && input.files[0]) {
	    var reader = new FileReader();
	    reader.onload = function(e) {
	      $('#Tempimg')
	        .attr('src', e.target.result)
	    };
	    reader.readAsDataURL(input.files[0]);
	  }
	};

	// REMOVE IMAGE ON X BUTTON 
	document.getElementById('del').onclick = function() {
	  var file = document.getElementById("Image");
	  file.value = file.defaultValue;
	  var img = document.getElementById("Tempimg");
	  img.src = "resources/images/altimg.png";
	 
	};
  </script>