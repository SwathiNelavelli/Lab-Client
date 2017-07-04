@Specific
Feature: Verify Lab Client

Background: 
 Given enter easytox url for Lab Client
  And enter username as "username" for Lab Client
	And enter password as "password" for Lab Client
	Then user click on "Login" button for Lab Client
  
  #Scenario 1
  #Scenario Outline: Verify creation of a new lab client
  #When Select 'Settings' ->'Lab Client'
  #Then 'Lab Client List' screen with list of Clients is displayed
  #
  #When Click Add Lab Client '+' icon 
  #Then 'Add Lab Client screen' is displayed
  #
  #When Enter Business Name as "<Business Name>" in Add Lab Client screen
  #And Enter Address1 as "<Address1>" in Add Lab Client screen
  #And Address2 Entered as "<Address2>" in Add Lab Client screen
  #And Enter Zipcode as "<Zipcode>" in Add Lab Client screen
  #And Enter City as "<City>" in Add Lab Client screen
  #And Enter State as "<State>" in Add Lab Client screen
  #And Enter ContactPerson as "<ContactPerson>" in Add Lab Client screen
  #And Enter ContactNumber as "<ContactNumber>" in Add Lab Client screen
  #And Enter FaxNumber as "<FaxNumber>" in Add Lab Client screen
  #And Enter Email as "<Email>" in Add Lab Client screen
  #And Click 'Submit' button in Add Lab Client screen
  #Then New lab client "<Business Name>" is added successfully and newly added lab client is listed in the Lab Client List screen
  
  #When Click '+' icon against newly created lab client "<Business Name>"-> Validate "<Address1>", "<Address2>" and 'Lab' values are correctly populated
  #Then Close the browser for Lab Client
  #Examples:
  #|Business Name|Address1|Address2|Zipcode|City|State|ContactPerson|ContactNumber|FaxNumber|Email|
  #|Riverside Hospital|1000|Main St|43285|Columbus|OH|Kristen|6145783555|6143438688|kristen@gmail.com|
  #|Little Clinic|350|West Bridge St|57635|Dublin|OH|Kareen|3545634444|4525644523|Kareen@yahoo.com|
  
  #Scenario 2
  #Scenario Outline: Verify updating data for an existing lab client
  #When Select 'Settings' ->'Lab Client'
  #Then 'Lab Client List' screen with list of Clients is displayed
  #
  #When Click on a lab client name as "<LabClientName>"
  #Then Update Lab Client screen is displayed
  #
  #When Make changes as needed and click update 
  #Then Lab Client "<LabClientName>" should be updated successfully
  #
  #When Click '+' icon against updated lab client "<LabClientName>" -> Validate updated values are correctly populated in Lab Client List screen
  #Then Close the browser for Lab Client
   #Examples:
   #|LabClientName|
   #|Riverside Hospital|
   
   #Scenario 3
   #Scenario Outline: Verify adding location to a lab client
    #When Select 'Settings' ->'Lab Client'
    #Then 'Lab Client List' screen with list of Clients is displayed
  #
    #When Click on a lab client name as "<LabClientName>"
    #Then Update Lab Client screen is displayed
    #
    #When Click on the 'Add Location' Icon
    #Then 'Add Lab Location' page should be displayed
    #
    #When Enter Location Name as "<LocationName>" and the remaining details -> click 'Submit'
    #And Added location "<LocationName>" should be added to the Location list
    #Then Close the browser for Lab Client
    #Examples:
   #|LabClientName|LocationName|
   #|Riverside Hospital|Riverside Hospital Westerville|
   
   #Scenario 4 
   #Scenario Outline: Verify editing location of a lab client
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Click on the Location icon for a lab client "<LabClientName>"
   #Then 'Lab Location List' page should be displayed
   #
   #When Click on the Edit icon for a lab location "<LocationName>"
   #Then 'Updated Lab Location' page should be displayed
   #
   #When Make required changes for a lab location -> click Update
   #And Lab Location "<LocationName>" should be updated successfully
   #Then Close the browser for Lab Client
   #Examples:
   #|LabClientName|LocationName|
   #|Riverside Hospital|Riverside Hospital Westerville|
   #
   #Scenario 5
   #Scenario Outline: Verify adding user to a lab client
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Click on a lab client name as "<LabClientName>"
   #Then Update Lab Client screen is displayed
   #
   #When Click on the 'Add User' Icon
   #Then 'Add Lab Client User' page should be displayed
   #
   #When Enter User information as "<UserName>" and "<Password>" in Add Lab Client User page
   #And Enter Personal information as "<FirstName>","<LastName>","<EmailAddress>" and "<PhoneNumber>" in Add Lab Client User page
   #And Select Lab information as "<SelectRole>" and "<SelectLocation>" in Add Lab Client User page
   #And Click 'Submit" in Add Lab Client User page
   #And Added user "<UserName>" should be added to the Lab Client 'User list'
   #Then Close the browser for Lab Client
   #Examples:
   #|LabClientName|UserName|Password|FirstName|LastName|EmailAddress|PhoneNumber|SelectRole|SelectLocation|
   #|Riverside Hospital|KristenThompson|Kt$12345|Kristen|Thompson|kt@gmail.com|6142345777|OFFICE_ADMIN|Riverside Hospital Westerville|
   #|Riverside Hospital|RondaGiaser|Rg$12345|Ronda|Giaser|rg@gmail.com|6147869999|DIRECTOR|Riverside Hospital Downtown|
   
   #Scenario 6
   #Scenario Outline: Verify editing user to a lab client
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Click on the 'User List' icon for a lab client "<LabClientName>"
   #Then 'User List' page should be displayed
   #
   #When Click on 'Edit Icon' for user "<UserName>" 
   #Then 'Update Lab User' page should be displayed
   #
   #When Verify User Information section should be locked for editing in 'Update Lab User' page
   #And Make changes to Personal Information -> click update
   #Then User "<UserName>" should be updated successfully
   #
   #When Click '+' icon against newly updated user "<UserName>" -> 'Modified By' and 'Modified Date' values should be populated with updated information
   #Then Close the browser for Lab Client
   #Examples:
   #|LabClientName|UserName|
   #|Riverside Hospital|KristenThompson|
   
   #Scenario 7 
   #Scenario Outline: Verify locking access for a lab client user
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Click on the 'User List' icon for a lab client "<LabClientName>"
   #Then 'User List' page should be displayed
   #
   #When Click 'Lock' icon for existing user "<UserName>" 
   #Then User should be locked and 'User "<UserName>" locked successfully' message should be populated
   #
   #When Logout and attempt logging in with the above lab user "<UserName>" and  "<Password>" credentials
   #And Account locked message should be populated and user should not be able to login to application
   #Then Close the browser for Lab Client
   #Examples:
   #|LabClientName|UserName|Password|
   #|Riverside Hospital|KristenThompson|Kt$12345|
   
   #Scenario 8 
   #Scenario Outline: Verify adding notes to a lab client
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Click on a lab client name as "<LabClientName>"
   #Then Update Lab Client screen is displayed
   #
   #When Click on the 'Add Notes' Icon  
   #Then 'Update Lab Client Notes' page should be displayed
   #
   #When Click '+' icon "<MultipleTimes>" and corresponding notes "<Note1>" and "<Note2>" should be added -> Click 'Update Notes'
   #And Notes "<Note1>" and "<Note2>" for lab client should be saved successfully along with date stamp
   #Then Close the browser for Lab Client
   #Examples:
   #|LabClientName|MultipleTimes|Note1|Note2|
   #|Riverside Hospital|2|Comment1 : Come Again after 2 weeks|Comment2 : Everything looks good|
   
   
   #Scenario 9
   #Scenario Outline: Verify adding Clinician to a lab client
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Click on the 'Clinician List' icon for a lab client "<LabClientName>"
   #Then 'Clinician List' page should be displayed
   #
   #When Click on '+' icon beside the Search Box in Clinician List page
   #Then 'Add Physician' screen should be displayed to enter details
  #
   #When Enter all the information in the screen and click Submit
   #And New Physician is created successfully
   #Then Close the browser for Lab Client
   #Examples:
   #|LabClientName|
   #|Riverside Hospital|
   
   #Scenario 10 
   #Scenario Outline: Verify the Search Results
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Enter any search criteria as "<SearchCriteria>" in the Lab Client List
   #And Matching records with "<SearchCriteria>" should be displayed in the Lab Client List
   #Then Close the browser for Lab Client
   #Examples:
   #|SearchCriteria|
   #|Riverside Hospital|
   
   #Scenario 11
   #Scenario Outline: Verify Number of records displayed per page
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Verify the default number of records displayed in Lab Client List
  #And Default number '10' should be displayed in Lab Client List
  #And Click on dropdown that shows no of records to be displayed on the Lab Client List
  #And Select the "<options>" and corresponding records to be displayed in Lab Client List 
  #Then Close the browser for Lab Client
  #Examples:
  #|options|
  #|25|
  
  #Scenario 12
   #Scenario:  Verify data sorting 
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Click on '^' Up arrow icon on Lab Client List 'City' column
   #Then Records should be displayed based on the ascending order in the Lab Client List 'City'
  #
   #When Click on "˅" Down arrow icon on Lab Client List 'City' column
   #Then Records should be displayed based on the desecending order in the Lab Client List 'City'
   #
   #When Click on '^' Up arrow icon on Lab Client List 'State' column
   #Then Records should be displayed based on the ascending order in the Lab Client List 'State'
  #
   #When Click on "˅" Down arrow icon on Lab Client List 'State' column
   #Then Records should be displayed based on the desecending order in the Lab Client List 'State'
   #
   #When Click on '^' Up arrow icon on Lab Client List 'Zip' column
   #Then Records should be displayed based on the ascending order in the Lab Client List 'Zip'
  #
   #When Click on "˅" Down arrow icon on Lab Client List 'Zip' column
   #Then Records should be displayed based on the desecending order in the Lab Client List 'Zip'
   #
   #When Click on '^' Up arrow icon on Lab Client List 'Contact Person' column
   #Then Records should be displayed based on the ascending order in the Lab Client List 'Contact Person'
  #
   #When Click on "˅" Down arrow icon on Lab Client List 'Contact Person' column
   #Then Records should be displayed based on the desecending order in the Lab Client List 'Contact Person'
   #
   #When Click on '^' Up arrow icon on Lab Client List 'Contact Number' column
   #Then Records should be displayed based on the ascending order in the Lab Client List 'Contact Number'
  #
   #When Click on "˅" Down arrow icon on Lab Client List 'Contact Number' column
   #Then Records should be displayed based on the desecending order in the Lab Client List 'Contact Number'
   #
   #When Click on '^' Up arrow icon on Lab Client List 'Email' column
   #Then Records should be displayed based on the ascending order in the Lab Client List 'Email'
  #
   #When Click on "˅" Down arrow icon on Lab Client List 'Email' column
   #And Records should be displayed based on the desecending order in the Lab Client List 'Email'
   #Then Close the browser for Lab Client
   
   #Scenario 13
   #Scenario: Verify the page navigation
   #When Select 'Settings' ->'Lab Client'
   #Then 'Lab Client List' screen with list of Clients is displayed
   #
   #When Navigate back and forth by selecting page numbers -> Should navigate to selected Lab Client List page
   #And A text message “Showing x to y of z entries” should be displayed on the bottom left corner of the Lab Client List
   #Then Close the browser for Lab Client
  
  
  
  
  
   
   
   
   
   


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   