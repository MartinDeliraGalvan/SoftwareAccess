<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!--/*This will change to fit the JSP/MVC implementation*/-->

<html>

    <head>
        <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Michroma" />
        <link rel='stylesheet' href='<c:url value="/resources/css/styles.css" />' type='text/css' media='all' />
        <link rel='stylesheet' href='<c:url value="/resources/css/resourcesDetailedViewStyles.css" />' type='text/css' media='all' />
		<link rel="stylesheet" href='<c:url  value="/resouces/css/jquery.datepick.css" />'  type="text/css"/>
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script type="text/javascript" href='<c:url value="resources/js/jquery.plugin.js" />'></script>
        
	         
      
		
		<link rel='stylesheet' href='<c:url value="/resources/css/paginationBlock.css" />' type='text/css' media='all' />
		
        

        <script>
            $(function () {
                $(StartDateText).datepick({dateFormat: 'yyyy-mm-dd'});
            });

            $(function () {
                $(EndDateText).datepick({dateFormat: 'yyyy-mm-dd'});
            });
        </script> 

    </head>
    <body>
        <div id="mainWrapper">

            <!------------HEADER------------->
            <div id="HeaderWrapper">
                <div id="HeaderInner">
                    <div id="HeaderTextWrapper"><p id="HeaderText">Accelerating, Connecting and Evaluating Student Success</p></div>

                  <img id="AccessImage" src="<c:url value='/resources/images/uteplogo.png'/>" alt="Utep Logo" style="width: 85px; height: 65px;">

                    <div id="UserAndButtonWrapper">
                        <p id="UserName"> User: John Smith</p>
                        
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
                        if (currentLocation == "/projectdetailedview.htm") {
                            $('#resources').css({background - color:black});
                        }
                    </script>

                    <div id="sidenav">
                        <h2>Menu</h2>
                        <ul>
                            <!--Runs a JavaScript function to set the sidenav state
                            depending on the current URL-->
                            <li id="resources"><a href="/resources.htm">My Resources</a></li>
                            <ul id="subNav" style="margin-left: 80px;">
                                <li id="fundedProjectsView"><a href=/fundedProjectsView.htm">Funded Projects</a></li>
                            </ul>

                            <li id="directory"><a href="/directory.htm">Directory</a></li>
                            <li id="analysis"><a href="/analysis.htm">Analysis</a></li>
                        </ul>
                    </div>

                    
                    
                    <div id="MainContentWrapper">
                        <div id="MainContentWrapperInner">

                            <div id="DetailedResourcesContainer">

                                <p id="DetailedReportHeader">
                                    Project Detailed View
                                </p>

                                <p id="fundedQuestion">*Funded Project?</p>
                                <p id="fundedQuestion" style="margin-left: 190px" >Yes</p>
                                <p id="fundedQuestion" style="margin-left: 265px" >No</p>

                                <input id="YesRadio" type="radio" value="yes" name="funded">
                                <input id="NoRadio" type="radio" value="no" name="funded">

                                <div id="ProjectInformation" class="box">
                                    <div id="boxheaderP" class="boxheader">
                                        <p>Project Information</p>
                                    </div>

                                    <p id="PITitleLabel" class="PIlabels">*Tittle</p>
                                    <p id="PIDescription" class="PIlabels">Description</p>
                                    <p id="PIGoals" class="PIlabels">Goal(s)</p>
                                    <p id="PIDocType" class="PIlabels">Document Type</p>
                                    <p id="PIWebsite" class="PIlabels">Website</p>
                                    <p id="PIStartDate" class="PIlabels">*Start Date</p>
                                    <p id="PIEndDate" class="PIlabels">End Date</p>
                                    <p id="PIKeywords" class="PIlabels">Keywords</p>
                                    <p id="PIObjective" class="PIlabels">Objective(s)</p>

                                    <input type="text" id="PITitleText" placeholder="Title" value="Fungal Loop Investigation Project" class="PDVText">
                                    <input type="text" id="StartDateText" placeholder= "Start Date" value="2015-25-11" class="PDVText">
                                    <input type="text" id="EndDateText" placeholder= "End Date" value="2018-xx-xx" class="PDVText">
                                    <input type="text" id="PIDescText" placeholder="Description" class="PDVText" value="Investiagation about the reproduction and relation of fungus in desertic locations">
                                    <input type="text" id="PIGoalsText" placeholder="Goals" class="PDVText" value="Find Research about fungal symbiotic relations">
                                    <input type="text" id="PIKeywordsText" placeholder="Keywords" class="PDVText">
                                    <select id="documentTypeSelector" >
                                        <option>Type</option>
                                        <option>Data</option>
                                        <option>Evaluation Report</option>
                                        <option>Anual Report</option>
                                        <option>Other</option>
                                    </select>
                                    <input type="text" id="documentTypeAttachment" placeholder="Attachment/Link" class="PDVText" value="Abstract.pdf" href="https://www.dropbox.com/s/4i4f56po5zzmh2l/dummypdf.pdf?dl=0">
                                    <input type="text" id="ObjectiveText" placeholder= "Objective" class="PDVText">
                                    <input type="text" id="WebsiteText" placeholder= "Website" class="PDVText" value="www.science.utep.edu/investiations/fungal_loop">
                                    <img src="../images/plusIcon.png" class="plusIcon" id="PlusIcon1" onclick="alert('Choose a Keyword');" style="width:20px;height:20px;">
                                    <img src="../images/plusIcon.png" class="plusIcon" id="PlusIcon2" onclick="alert('Choose an Objective');"style="width:20px;height:20px;">
                                    <img src="../images/plusIcon.png" class="plusIcon" id="PlusIcon3" onclick="alert('Choose an Attachment');"style="width:20px;height:20px;">
                                    <img src="../images/plusIcon.png" class="plusIcon" id="PlusIcon4" onclick="alert('Choose a Website');"style="width:20px;height:20px;">
                                    <img src="../images/plusIcon.png" class="plusIcon" id="PlusIcon5" onclick="alert('Choose a Goals');"style="width:20px;height:20px;">

                                </div>


                                <div id="detailedviewButtonWrapper">
                                    <button>Save</button>
                                    <button>Save and Return</button>
                                    <button>Delete</button>
                                    <button>Cancel</button>

                                </div>


                                <div id="ProjectMembershipBox" class="box">
                                    <div id="boxheaderP" class="boxheader">
                                        <p>Project Membership</p>
                                    </div>

                                    <table id="membershipTable">
                                        <tbody>
                                            <tr>
                                                <th>Name</th>
                                                <th>Email</th>
                                                <th>Role</th>
                                                <th>Action</th>
                                            </tr>
                                            
                                            
                                            <tr>
                                                <td><input type="text" placeholder="Name" value="Mighel Herrera"></td>
                                                <td><input type="text" placeholder="Email" value="mherrera@miners.utep.edu"></td>
                                                <td id="cellSelector" >
                                                    <select id="roleSelector">
                                                        <option value="role">Role</option>
                                                        <option value="role">Owner</option>
                                                        <option value="role">PA</option>
                                                        <option value="role" selected="true">IA</option>
                                                    </select>
                                                </td>
                                                <td>
                                                    <img href='<c:url  value="resources/images/xIcon.png" />  class="xIcon" id="xIcon" onclick="alert('Delete?');"style="width:20px;height:20px;"/>
                                                </td>
                                            </tr>
                                            
                                             <tr>
                                                <td><input type="text" placeholder="Name" value="Michael Ellis"></td>
                                                <td><input type="text" placeholder="Email" value="mellisa@miners.utep.edu"></td>
                                                <td id="cellSelector" >
                                                    <select id="roleSelector">
                                                        <option value="role">Role</option>
                                                        <option value="role">Owner</option>
                                                        <option value="role" selected="true" >PA</option>
                                                        <option value="role">IA</option>
                                                    </select>
                                                </td>
                                             </tr>
                                                 
                                              <tr>
                                                <td><input type="text" placeholder="Name" value="Josette Johnson"></td>
                                                <td><input type="text" placeholder="Email" value="jjsona@miners.utep.edu"></td>
                                                <td id="cellSelector" >
                                                    <select id="roleSelector">
                                                        <option value="role">Role</option>
                                                        <option value="role">Owner</option>
                                                        <option value="role">PA</option>
                                                        <option value="role" selected="true">IA</option>
                                                    </select>
                                                </td>
                                                <td>
                                              </tr>
                                              
                                              <tr>
                                                <td><input type="text" placeholder="Name" value="Josette Johnson"></td>
                                                <td><input type="text" placeholder="Email" value="jjsona@miners.utep.edu"></td>
                                                <td id="cellSelector" >
                                                    <select id="roleSelector">
                                                        <option value="role">Role</option>
                                                        <option value="role" >Owner</option>
                                                        <option value="role">PA</option>
                                                        <option value="role" selected="true">IA</option>
                                                    </select>
                                                </td>
                                                <td>
                                              </tr>
                                              
                                              
                                              <tr>
                                                <td><input type="text" placeholder="Name" value="James Collins"></td>
                                                <td><input type="text" placeholder="Email" value="jcollinsa@miners.utep.edu"></td>
                                                <td id="cellSelector" >
                                                    <select id="roleSelector">
                                                        <option value="role">Role</option>
                                                        <option value="role" selected="true">Owner</option>
                                                        <option value="role" >PA</option>
                                                        <option value="role">IA</option>
                                                    </select>
                                                </td>
                                             </tr>
                                             
                                             
                                             <tr>
                                                <td><input type="text" placeholder="Name" value="Sarah Khalik"></td>
                                                <td><input type="text" placeholder="Email" value="shkhal@miners.utep.edu"></td>
                                                <td id="cellSelector" >
                                                    <select id="roleSelector">
                                                        <option value="role">Role</option>
                                                        <option value="role">Owner</option>
                                                        <option value="role" >PA</option>
                                                        <option value="role"selected="true">IA</option>
                                                    </select>
                                                </td>
                                             </tr>
                                                
                                                    <img href='<c:url  value="resources/images/xIcon.png" />  class="xIcon" id="xIcon" onclick="alert('Delete?');"style="width:20px;height:20px;"/>
                                                </td>
                                            </tr>
                                                <td>
                                                    <img href='<c:url  value="resources/images/xIcon.png" />  class="xIcon" id="xIcon" onclick="alert('Delete?');"style="width:20px;height:20px;"/>
                                                </td>
                                            </tr>
                                            
                                    </table>

                                    <button id="membershipButton" style="margin-top:270px; margin-left: 15px; ">Add Membership</button>

                                </div>




                                <div id="InitiativesAssociatedWithProjectBox" class="box">
                                    <div id="boxheaderP" class="boxheader">
                                        <p>Initiatives Associated with Project</p>
                                    </div>

                                    <table id="InitiativesTable" class="detailedViewTable">
                                        <tbody>
                                            <tr>
                                                <th>Title</th>
                                                <th>Description</th>
                                                <th>Creation Date</th>
                                                <th>Linked Initiative</th>
                                                <th>Owner</th>
                                            </tr>
                                            <tr>
                                                <td><a href="initiativeDetailedView.php">Jornada Experimental Range Site</a> </td>
                                                <td>Research project at Las Cruces</td>
                                                <td>05-08-2015</td>
                                                <td>No</td>
                                                <td><a href="/somelink">Owner A</a></td>
                                            </tr>

                                            <tr>
                                                <td><a href="initiativeDetailedView.php">Jornada Experimental Range Rain Simulator</a> </td>
                                                <td>Simulation of Rain in the desert </td>
                                                <td>05-08-2016</td>
                                                <td>Yes</td>
                                                <td><a href="/somelink">John Smith</a></td>
                                            </tr>

                                           
                                        </tbody>
                                    </table>

                                    <button id="InitiativeButton" style="margin-top: 480px; margin-left: 15px;">Add Initiative</button>
                                    <button id="LinkInitiativeButton" style="margin-top: 480px; margin-left: 200px;" onclick="document.location = 'linkExistingInitiative.php'">Link Existing Initiative</button>

                                </div>
                                <p id="requiredlabel">*Required Fields</p>

                            </div>

                        </div>

                    </div>

                </div>




            </div>


            <!---------CONTENT------------->

            <!---------FOOTER------------->
            <div id="FooterWrapper">
                <div id="footer">
                    <p><?php echo $collaborations ?><br></p>
                </div>
            </div>
            <!---------FOOTER------------->
        </div>


    </body>


</html>

