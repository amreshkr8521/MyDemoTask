<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="UTF-8">
<title>Demo
	
</title>
</head>

<body>
<div data-role="header" id="header-1">
		<a href="#" class="ui-btn ui-mini ui-btn-inline ui-btn-left ui-corner-all ui-icon-delete ui-btn-icon-left">Cancel</a>
		<h1>Edit Contact</h1>
		<a href="#" class="ui-btn ui-mini ui-btn-inline ui-btn-right ui-corner-all ui-icon-check ui-btn-icon-left">Save</a>
	</div>
	<div data-role="panel" id="side">
		<ul data-role="listview" id="side">
			<li><a href="webapi/get/getMore">Item 1</a></li>
			<li><a href="item2.html">Item 2</a></li>
			<li><a href="item3.html">Item 3</a></li>
		</ul>
	</div>
<div data-role="footer" id="footer-1" class="ui-bar">
	<form name="form" id="form" action="webapi/get/getMore">
		<label for="name">Name:</label>
		<input id="name" placeholder="Text" type="text"/>
		<label for="input-1">password:</label>
		<input id="input-1" autofocus="true" required="true" type="password"/>
		<input type="submit" value="Submit" id="button-1"/>
	</form>
	<a href="webapi/get/getMore" class="ui-btn ui-mini ui-corner-all ui-icon-plus ui-btn-icon-left">Add</a>
	<a href="#" class="ui-btn ui-mini ui-corner-all ui-icon-arrow-u ui-btn-icon-left">Up</a>
	<a href="#" class="ui-btn ui-mini ui-corner-all ui-icon-arrow-d ui-btn-icon-left">Down</a>
</div>
</body>
</html>