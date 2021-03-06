<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Michroma" />
<link rel='stylesheet' href='<c:url value="/resources/css/table.css"/>' type='text/css' media='all' />
<link rel='stylesheet' href='<c:url value="/resources/css/searchBox.css" />' type='text/css' media='all' />
<link rel='stylesheet' href='<c:url value="/resources/css/paginationBlock.css" />' type='text/css' media='all' />
<link rel='stylesheet' href='<c:url value="/resources/css/styles.css" />' type='text/css' media='all' />



</head>
<body>
	<div id="mainWrapper">

		<!------------HEADER------------->
		<div id="HeaderWrapper">
			<div id="HeaderInner">
				<div id="HeaderTextWrapper">
					<p id="HeaderText">Accelerating, Connecting and Evaluating
						Student Success</p>
				</div>

				
				<img id="AccessImage" src="<c:url value='/resources/images/uteplogo.png'/>" alt="Utep Logo" style="width: 85px; height: 65px;">
				<div id="UserAndButtonWrapper">
					<p id="UserName">User: John Smith</p>
					
					<form action="login.htm">
					<button id="SignOutButton">Logout</button>
					</form>
					
					
					
				</div>
			</div>
		</div>
		<!------------HEADER------------->

		<!---------CONTENT------------->
		<div id="ContentWrapper">
			<div id="ContentWrapperInner">


				<script>
                        var x = window.location.pathname;
                        document.write(x);
                        var currentLocation = window.location.pathname;
                        if (currentLocation == "/resources.jsp") {
                        	$('#resources').css({background - color:black});
                        }
                </script>

				<div id="sidenav">
					<h2>Menu</h2>
					<ul>
						<!--Runs a JavaScript function to set the sidenav state
                            depending on the current URL-->
						<li id="resources"><a href="../resources/resources.jsp">My
								Resources</a></li>
						<ul id="subNav" style="margin-left: 80px;">
							<li id="fundedProjectsView"><a
								href="../resources/fundedProjectsView.jsp">Funded Projects</a></li>
						</ul>

						<li id="directory"><a href="../directory/directory.jsp">Directory</a></li>
						<li id="analysis"><a href="../analysis/analysis.jsp">Analysis</a></li>
					</ul>
				</div>

				<div id="MainContentWrapper">
					<div id="MainContentWrapperInner">

						<div id="ResourcesContainer">

							<p id="resourcesWelcome" class="header14PBold">Welcome
								John Smith here is your Projects List</p>

							<a href="search.jsp"> <img id="searchIcon" src="<c:url value='/resources/images/magnifying.png'/>"	style="width: 30px; height: 35px;"></a>
							<div id="serachBoxWrapper">
								<input type="text" name="search" placeholder="Search..">
							</div>
							<div id="tableWrapper2">

								<table id="resourceTable">
									<tr>
										<th>Title</th>
										<th>Type</th>
										<th>Role</th>
										<th>Last Modified Date</th>
									</tr>
									<tr>
										<td><a href="projectdetailedview.htm">Fungal Loop Investigation Project
												<a>
												<ul>
													<a href="/initiative1.jsp">Jornada Experimental Range Site</a>
													<br>
													<a href="/initiative2.jsp">Jornada Experimental Range Rain Simulator</a>
												</ul>
										</td>
										<td>Project</td>
										<td>Owner</td>
										<td>2016-12-05</td>
									</tr>
									<tr>
										<td><a href="/initiative3.jsp">Rotifier Bioogy Project</a></td>
										<td>Project</td>
										<td>PA</td>
										<td>2016-11-28</td>
									</tr>
									<tr>
										<td><a href="/initiative4.jsp"> Research Initiative for Scientific Enhancement</a></td>
										<td>Initiative</td>
										<td>IA</td>
										<td>2016-11-26</td>
									</tr>

								</table>
							</div>

							<div id="buttonWrapper">
								<button>Add Project</button>
								<button>Add Initiative</button>
							</div>


							<div id="paginationBlockWrapper">
								<ul class="pagination">
									<li><a href="#">�</a></li>
									<li><a class="active" href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">5</a></li>
									<li><a href="#">6</a></li>
									<li><a href="#">7</a></li>
									<li><a href="#">�</a></li>
								</ul>
							</div>
						</div>

					</div>

				</div>




			</div>

		</div>
		<!---------CONTENT------------->

		<!---------FOOTER------------->
		<div id="FooterWrapper">
			<div id="footer">
				<p>
					&copyACCESS Developed by JJCOM Team 3 <br> Created as a
					capstone project for CS4310 and CS 4311<br> &copyACCESS
					Software is property of The University of Texas At El Paso
				</p>
			</div>
		</div>
		<!---------FOOTER------------->

	</div>

</body>


</html>

