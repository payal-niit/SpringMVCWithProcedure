<%@include file="header.jsp" %>
<div class="container-fluid">
 <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Wrapper for slides -->
        <div class="carousel-inner">
            <div class="c_img item active">
                <img style="max-height: 350px;min-height: 350px;" class="c_img" src="http://picovico.com/wp-content/uploads/2015/11/yourstory-education.jpg">
                <!-- <div class="carousel-caption">
                     <h3>
                        Education</h3>
                    <p>
                        Education is not preparation for life; education is life itself. 
                        Intellectual growth should commence at birth and cease only at death.</p>
                </div> -->
            </div>
            <!-- End Item -->
            <div class="c_img item">
                <img style="max-height: 350px;min-height: 350px;" class="c_img img-responsive" src="http://www.catalystidaho.com/wp-content/uploads/2016/12/lon-main3-job-1920x800_c.jpg">
               <!--  <div class="carousel-caption">
                    <h3>
                        Career</h3>
                    <p>
                        Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
                        tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. Lorem
                        ipsum dolor sit amet, consetetur sadipscing elitr.</p> 
                </div> -->
            </div>
            <!-- End Item -->
            <div class="c_img item">
                <img style="max-height: 350px;min-height: 350px;" class="c_img" src="http://egaala.com/Files/09012017471248.jpg">
                <!-- <div class="carousel-caption">
                   <h3>
                        Job</h3>
                    <p>
                        Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
                        tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. Lorem
                        ipsum dolor sit amet, consetetur sadipscing elitr.</p>
                </div> -->
            </div>
            <!-- End Item -->
            <div class="c_img item">
                <img style="max-height: 350px;min-height: 350px;" class="c_img" src="http://2.bp.blogspot.com/-xfFDeEhiHFM/UUw_ISgef4I/AAAAAAAAAFc/b8wrGZC2HS8/s1600/p1%2B-%2BCopy.jpg">
                <!-- <div class="carousel-caption">
                     <h3>
                        ECJ</h3>
                    <p>
                        Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
                        tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. Lorem
                        ipsum dolor sit amet, consetetur sadipscing elitr.</p> 
                </div> -->
            </div>
            <!-- End Item -->
        </div>
        <!-- End Carousel Inner -->
        <ul class="nav nav-pills nav-justified">
            <li data-target="#myCarousel" data-slide-to="0" class="active"><a href="#">Education<small>Education is not preparation for life... Education is life itself !!!</small></a></li>
            <li data-target="#myCarousel" data-slide-to="1"><a href="#">Career<small>I am not a product of my circumstances. I am a product of my decisions.</small></a></li>
            <li data-target="#myCarousel" data-slide-to="2"><a href="#">Job<small>Choose a job you love, and you will never have to work a day in your life</small></a></li>
            <li data-target="#myCarousel" data-slide-to="3"><a href="#">ECJ<small>Education - Career - Job !!! All together at one plateform</small></a></li>
        </ul>
    </div>
    </div>
    <!-- End Carousel -->
    <script>
    $(document).ready( function() {
        $('#myCarousel').carousel({
    		interval:   1000
    	});
    	
    	var clickEvent = false;
    	$('#myCarousel').on('click', '.nav a', function() {
    			clickEvent = true;
    			$('.nav li').removeClass('active');
    			$(this).parent().addClass('active');		
    	}).on('slid.bs.carousel', function(e) {
    		if(!clickEvent) {
    			var count = $('.nav').children().length -1;
    			var current = $('.nav li.active');
    			current.removeClass('active').next().addClass('active');
    			var id = parseInt(current.data('slide-to'));
    			if(count == id) {
    				$('.nav li').first().addClass('active');	
    			}
    		}
    		clickEvent = false;
    	});
    });
    </script>