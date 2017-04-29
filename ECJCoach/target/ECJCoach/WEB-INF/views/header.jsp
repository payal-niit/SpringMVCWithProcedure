<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
	<%@ page isELIgnored="false" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
	<title>ECJ - Education Career Job</title>
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/style.css">
	<script type="text/javascript" src="resources/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/angular.min.js"></script>
	
</head>
<body>
<div class="container-fluid">
<nav class="navbar navbar-default navbar-static-top">
  
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">HOME <span class="sr-only">(current)</span></a></li>
        <li><a href="#">ABOUT US</a></li>
         <c:if test="${pageContext.request.userPrincipal.name != null}"> 
					<li><a href="#" style="space-top: 10px; color: #fff;">Welcome,
							<sec:authorize access="isAuthenticated()">
								<strong><sec:authentication
										property="principal.username" /></strong>
							</sec:authorize>
					
					</a></li>
				 </c:if>
        <!-- <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="false" aria-expanded="true">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li> -->
        
      </ul>
      <div class="collapse nav navbar-nav nav-collapse" id="nav-collapse3">
            <form class="navbar-form navbar-right" role="search">
              <div class="form-group">
                <input type="text" class="form-control" placeholder="Search" />
              </div>
              <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
            </form>
          </div>
      <ul class="nav navbar-nav navbar-right">
         <li>
              <a class="btn btn-default btn-outline btn-circle"  data-toggle="collapse" href="#nav-collapse3" aria-expanded="false" aria-controls="nav-collapse3">SEARCH</a>
            </li>
         <li><a href="#">EDUCATION</a></li>
          <li><a href="#">CAREER</a></li>
          <li><a href="#">JOB</a></li>
          <c:if test="${pageContext.request.userPrincipal.name == null}">
          
          <li><a href="login">LOGIN</a></li>
          <li style="margin-right: 15px;"><a href="register">REGISTER</a></li>
          </c:if>
          <c:if test="${pageContext.request.userPrincipal.name != null}">	
          <li style="margin-right: 15px;"><a href="perform_logout">LOGOUT</a></li></c:if>
           
           
           
        <!-- <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li> -->
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
	
</nav>
</div>

