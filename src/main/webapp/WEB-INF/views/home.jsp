<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="true" %>
<html>
<head>
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<link rel="stylesheet" href="<c:url value="/resources/style.css"/>" type="text/css"/>

	<script type="text/javascript" src="https://www.google.com/jsapi"></script>	
	
	<title>Homepage Stats </title>
</head>
<body >
<h1>
	Howdy!  
</h1>
<P> So, How does this work? </P>
<P> Simple, really: <br>
this chart shows who made the items on the Etsy homepage for the selected region </P>

<form:form method="POST" modelAttribute="searchRequest">
 	<form:select path="region">
	    <form:options items="${regionList}"/>
	</form:select>	
	<input type="submit" value="Show Items Chart"/>
</form:form>

<c:choose>
	<c:when test="${empty searchRequest.error}">
		
		<div id="pie_chart" style="width:100%; height:100%"></div>
		
		<script type="text/javascript">
		
			google.load("visualization", "1", {packages:["corechart"]});
			google.setOnLoadCallback(drawChart);
			
			function drawChart() {
		        var data = google.visualization.arrayToDataTable([
		          ["${searchRequest.selfLabel}", ${searchRequest.numSelf}],
		          ["${searchRequest.collectiveLabel}", ${searchRequest.numCollective}],
		          ["${searchRequest.otherLabel}", ${searchRequest.numOther}],
		        ], true);
		        var options = {
		          title: "${searchRequest.chartTitle}"
		        };
		        var chart = new google.visualization.PieChart(document.getElementById('pie_chart'));
		        chart.draw(data, options);
		      }
		    
		</script>
	</c:when>
	<c:otherwise>
		<p class="error"> ${searchRequest.error}</p>
	</c:otherwise>
</c:choose>

</body>
</html>
