package easytox.apptest.stepdefinitions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easytox.apptest.pages.AbstractPage;
import easytox.apptest.pages.InsuranceCompanyPage;
import easytox.apptest.pages.LabClientPage;
import easytox.apptest.pages.LablistPage;
import easytox.apptest.pages.LoginPage;
import easytox.apptest.utils.WebConnector;
import junit.framework.Assert;

public class LabClientStepDefinition {
	
	WebDriver driver = null;	
	LoginPage loginpage;
	WebConnector connector = new WebConnector();
	LabClientPage labclient = null;
	InsuranceCompanyPage insurancecompany = null;
	
@Given("^enter easytox url for Lab Client$")
public void enter_easytox_url_for_Lab_Client() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "src//test//java//easytox//apptest//driver//chromedriver.exe");
	driver = new ChromeDriver();
	loginpage = new LoginPage(driver);
	loginpage.navigatetowebApp();
	labclient = new LabClientPage(driver);
	insurancecompany = new InsuranceCompanyPage(driver);

//	Assert.assertEquals(forgotpwd, "Click here");
	//System.out.println(forgotpwd);
}

@Given("^enter username as \"([^\"]*)\" for Lab Client$")
public void enter_username_as_for_Lab_Client(String arg1) throws Throwable {
	String forgotpwd= driver.findElement(By.linkText("Click here")).getText();
	Assert.assertEquals("Click here", forgotpwd);
	System.out.println(forgotpwd);
	loginpage.EnterUserName(connector.getstring(WebConnector.myUrl.URL_SIT,"User_Username"));
}

@Given("^enter password as \"([^\"]*)\" for Lab Client$")
public void enter_password_as_for_Lab_Client(String arg1) throws Throwable {
	loginpage.EnterPassword(connector.getstring(WebConnector.myUrl.URL_SIT,"User_Password"));
}

@Then("^user click on \"([^\"]*)\" button for Lab Client$")
public void user_click_on_button_for_Lab_Client(String arg1) throws Throwable {
	loginpage.Loginbuttonclick();
}

@Then("^Close the browser for Lab Client$")
public void close_the_browser_for_Lab_Client() throws Throwable {
	 loginpage.closeDriver();
}

@When("^Select 'Settings' ->'Lab Client'$")
public void select_Settings_Lab_Client() throws Throwable {
	insurancecompany.ClickOnSettingsIcon();
	labclient.SelectLabClientOption();
}

@Then("^'Lab Client List' screen with list of Clients is displayed$")
public void lab_Client_List_screen_with_list_of_Clients_is_displayed() throws Throwable {
	Thread.sleep(2000);
	String LabClientListInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
			     connector.getstring(WebConnector.myUrl.URL_OR,"LabClientList_xpath")).getText();
	Assert.assertEquals("Lab Client List", LabClientListInfo);
}

@When("^Click Add Lab Client '\\+' icon$")
public void click_Add_Lab_Client_icon() throws Throwable {
	insurancecompany.ClickOnPlusIcon();
}

@Then("^'Add Lab Client screen' is displayed$")
public void add_Lab_Client_screen_is_displayed() throws Throwable {
	Thread.sleep(2000);
	String AddLabClientInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"AddLabClientPage_xpath")).getText();
Assert.assertEquals("Add Lab Client", AddLabClientInfo);
}

@When("^Enter Business Name as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_Business_Name_as_in_Add_Lab_Client_screen(String businessname) throws Throwable {
	driver.findElement(By.xpath("//*[@id='form']/div[1]/div/input")).sendKeys(businessname);
}

@When("^Enter Address(\\d+) as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_Address_as_in_Add_Lab_Client_screen(int arg1, String address1) throws Throwable {
	driver.findElement(By.xpath("//*[@id='form']/div[2]/div/input")).sendKeys(address1);
}

@When("^Address(\\d+) Entered as \"([^\"]*)\" in Add Lab Client screen$")
public void address_Entered_as_in_Add_Lab_Client_screen(int arg1, String address2) throws Throwable {
	driver.findElement(By.xpath("//*[@id='form']/div[3]/div/input")).sendKeys(address2);
}

@When("^Enter Zipcode as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_Zipcode_as_in_Add_Lab_Client_screen(String zip) throws Throwable {
	driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zip);
}

@When("^Enter City as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_City_as_in_Add_Lab_Client_screen(String city) throws Throwable {
	driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);
}

@When("^Enter State as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_State_as_in_Add_Lab_Client_screen(String state) throws Throwable {
	driver.findElement(By.xpath("//*[@id='state']")).sendKeys(state);
}

@When("^Enter ContactPerson as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_ContactPerson_as_in_Add_Lab_Client_screen(String contactperson) throws Throwable {
	driver.findElement(By.xpath("//*[@id='form']/div[7]/div/input")).sendKeys(contactperson);
}

@When("^Enter ContactNumber as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_ContactNumber_as_in_Add_Lab_Client_screen(String contactnumber) throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='form']/div[8]/div/input")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='form']/div[8]/div/input")).sendKeys(contactnumber);
}

@When("^Enter FaxNumber as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_FaxNumber_as_in_Add_Lab_Client_screen(String faxnumber) throws Throwable {
	driver.findElement(By.xpath("//*[@id='form']/div[9]/div/input")).sendKeys(faxnumber);
}

@When("^Enter Email as \"([^\"]*)\" in Add Lab Client screen$")
public void enter_Email_as_in_Add_Lab_Client_screen(String email) throws Throwable {
	driver.findElement(By.xpath("//*[@id='form']/div[10]/div/input")).sendKeys(email);
}

@When("^Click 'Submit' button in Add Lab Client screen$")
public void click_Submit_button_in_Add_Lab_Client_screen() throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
			connector.getstring(WebConnector.myUrl.URL_OR,"AddLabClientSubmitButton_xpath")).click();
}

@Then("^New lab client \"([^\"]*)\" is added successfully and newly added lab client is listed in the Lab Client List screen$")
public void new_lab_client_is_added_successfully_and_newly_added_lab_client_is_listed_in_the_Lab_Client_List_screen(String businessname) throws Throwable {
	Thread.sleep(2000);
	String AddLabClientSuccessMessage = connector.getWebElement(driver, WebConnector.Identifier.xpath,
			     connector.getstring(WebConnector.myUrl.URL_OR,"AddLabClientSuccessMessage_xpath")).getText();
	System.out.println(AddLabClientSuccessMessage);
//	Assert.assertTrue(" Success LabClient " + businessname + " created",AddLabClientSuccessMessage.contains("Success LabClient" + businessname + "created"));
}

@When("^Click '\\+' icon against newly created lab client \"([^\"]*)\"-> Validate \"([^\"]*)\", \"([^\"]*)\" and 'Lab' values are correctly populated$")
public void click_icon_against_newly_created_lab_client_Validate_and_Lab_values_are_correctly_populated(String arg1, String address1, String address2) throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
			connector.getstring(WebConnector.myUrl.URL_OR,"PageDisplayOption_xpath")).click();
	
	Thread.sleep(2000);
	new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
	
	int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size();
	driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+rowCount+"]/td[1]")).click();
	
	String ValidateAddress = driver.findElement(By.xpath("//*[@id='example']/tbody/tr[9]/td/table/tbody/tr[1]/td[2]")).getText();
	Assert.assertEquals((address1+","+" "+address2) , ValidateAddress);
	
	String ValidateLab = driver.findElement(By.xpath("//*[@id='example']/tbody/tr[9]/td/table/tbody/tr[2]/td[2]")).getText();
	Assert.assertEquals("Hello Lab", ValidateLab);
}

@When("^Click on a lab client name as \"([^\"]*)\"$")
public void click_on_a_lab_client_name_as(String labclientname) throws Throwable {
	Thread.sleep(2000);
	new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
	
	int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
	for(int i=1;i<=rowCount;i++){
		String LabClientNameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
		 if(labclientname.equals(LabClientNameInfo)){
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).click();
			break;
			}
	}
}

@Then("^Update Lab Client screen is displayed$")
public void update_Lab_Client_screen_is_displayed() throws Throwable {
	Thread.sleep(2000);
	String UpdateLabClientPageInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabClientPageInfo_xpath")).getText();
Assert.assertEquals("Update Lab Client", UpdateLabClientPageInfo);
}

@When("^Make changes as needed and click update$")
public void make_changes_as_needed_and_click_update() throws Throwable {
	connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "UpdateAddress1_xpath")).clear();
	
	Thread.sleep(2000);
	
	connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "UpdateAddress1_xpath")).sendKeys("250");
	
	connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "UpdateAddress2_xpath")).clear();
	
	Thread.sleep(2000);
	
	connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "UpdateAddress2_xpath")).sendKeys("East Main ST");
	
	connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "UpdateContactPerson_xpath")).clear();
	
	Thread.sleep(2000);
	
	connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "UpdateContactPerson_xpath")).sendKeys("Goldie");
	
	connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "UpdateContactPerson_xpath")).sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "LabClientUpdateButton_xpath")).click();
}

@Then("^Lab Client \"([^\"]*)\" should be updated successfully$")
public void lab_Client_should_be_updated_successfully(String labclientname) throws Throwable {
	Thread.sleep(2000);
	String UpdateLabClientSuccessMessage = connector.getWebElement(driver, WebConnector.Identifier.xpath,
			     connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabClientSuccessMessage_xpath")).getText();
	System.out.println(UpdateLabClientSuccessMessage);
	//Assert.assertTrue("Success LabClient updated",UpdateLabClientSuccessMessage.contains("Success LabClient" + labclientname + "updated"));
}

@When("^Click '\\+' icon against updated lab client \"([^\"]*)\" -> Validate updated values are correctly populated in Lab Client List screen$")
public void click_icon_against_updated_lab_client_Validate_updated_values_are_correctly_populated_in_Lab_Client_List_screen(String labclientname) throws Throwable {
	Thread.sleep(2000);
	new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
	
	int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size();
	for(int i=1;i<=rowCount;i++){
		String LabClientNameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
		 if(labclientname.equals(LabClientNameInfo)){
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[1]")).click();
			
			int j = i+1;
			String ValidateAddress = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+j+"]/td/table/tbody/tr[1]/td[2]")).getText();
			Assert.assertEquals(("250"+","+" "+"East Main ST") , ValidateAddress);
			
			String ValidateContactPerson = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[6]")).getText();
			Assert.assertEquals("Goldie", ValidateContactPerson);
			Thread.sleep(2000);
			break;
			}
	}
}

@When("^Click on the 'Add Location' Icon$")
public void click_on_the_Add_Location_Icon() throws Throwable {
	labclient.ClickOnUpdateLabClientAddLocationIcon();
}

@Then("^'Add Lab Location' page should be displayed$")
public void add_Lab_Location_page_should_be_displayed() throws Throwable {
	Thread.sleep(2000);
	String LabClientAddLocationInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"LabClientAddLocationInfo_xpath")).getText();
Assert.assertEquals("Add Lab Location", LabClientAddLocationInfo);
}

@When("^Enter Location Name as \"([^\"]*)\" and the remaining details -> click 'Submit'$")
public void enter_Location_Name_as_and_the_remaining_details_click_Submit(String locationname) throws Throwable {
	labclient.AddLocationNameAndOtherDetails(locationname);
}

@When("^Added location \"([^\"]*)\" should be added to the Location list$")
public void added_location_should_be_added_to_the_Location_list(String locationname) throws Throwable {
	labclient.ValidateLocationNameInLocationList(locationname);
}

@When("^Click on the Location icon for a lab client \"([^\"]*)\"$")
public void click_on_the_Location_icon_for_a_lab_client(String labclientname) throws Throwable {
	labclient.ClickOnLocationListIcon(labclientname);
}

@Then("^'Lab Location List' page should be displayed$")
public void lab_Location_List_page_should_be_displayed() throws Throwable {
	Thread.sleep(2000);
	String LabLocationListInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"LabLocationListInfo_xpath")).getText();
Assert.assertEquals("Lab Location List", LabLocationListInfo);
}

@When("^Click on the Edit icon for a lab location \"([^\"]*)\"$")
public void click_on_the_Edit_icon_for_a_lab_location(String locationname) throws Throwable {
	labclient.ClickOnLocationEditIcon(locationname);
}

@Then("^'Updated Lab Location' page should be displayed$")
public void updated_Lab_Location_page_should_be_displayed() throws Throwable {
	Thread.sleep(2000);
	String UpdateLabLocationInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabLocationInfoInfo_xpath")).getText();
Assert.assertEquals("Update Lab Location", UpdateLabLocationInfo);
}

@When("^Make required changes for a lab location -> click Update$")
public void make_required_changes_for_a_lab_location_click_Update() throws Throwable {
    labclient.UpdateLabLocationDetails();
}

@When("^Lab Location \"([^\"]*)\" should be updated successfully$")
public void lab_Location_should_be_updated_successfully(String locationname) throws Throwable {
	Thread.sleep(2000);
	String UpdateLabLocationSuccessMessage = connector.getWebElement(driver, WebConnector.Identifier.xpath,
			     connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabLocationSuccessMessage_xpath")).getText();
	System.out.println(UpdateLabLocationSuccessMessage);
	//Assert.assertTrue("Success LabLocation updated",UpdateLabLocationSuccessMessage.contains("Success LabLocation" + locationname + "updated"));
}

@When("^Click on the 'Add User' Icon$")
public void click_on_the_Add_User_Icon() throws Throwable {
	labclient.ClickOnUpdateLabClientAddUserIcon();
}

@Then("^'Add Lab Client User' page should be displayed$")
public void add_Lab_Client_User_page_should_be_displayed() throws Throwable {
	Thread.sleep(2000);
	String AddLabClientUserInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"AddLabClientUserInfo_xpath")).getText();
Assert.assertEquals("Add Lab Client User", AddLabClientUserInfo);
}

@When("^Enter User information as \"([^\"]*)\" and \"([^\"]*)\" in Add Lab Client User page$")
public void enter_User_information_as_and_in_Add_Lab_Client_User_page(String username, String password) throws Throwable {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='form']/div[2]/span/input")).sendKeys(username);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='form']/div[3]/span/input")).sendKeys(password);
}

@When("^Enter Personal information as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" in Add Lab Client User page$")
public void enter_Personal_information_as_and_in_Add_Lab_Client_User_page(String fname, String lname, String email, String phoneno) throws Throwable {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='form']/div[5]/div[1]/div/span/input")).sendKeys(fname);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='form']/div[5]/div[2]/div/span/input")).sendKeys(lname);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='form']/div[6]/div[1]/div/span/input")).sendKeys(email);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='form']/div[6]/div[2]/div/span/input")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='form']/div[6]/div[2]/div/span/input")).sendKeys(phoneno);
}

@When("^Select Lab information as \"([^\"]*)\" and \"([^\"]*)\" in Add Lab Client User page$")
public void select_Lab_information_as_and_in_Add_Lab_Client_User_page(String selectrole, String selectlocation) throws Throwable {
	Thread.sleep(2000);
	new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "SelectRoleOption_xpath"))).selectByVisibleText(selectrole);
	
	Thread.sleep(2000);
	new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
			connector.getstring(WebConnector.myUrl.URL_OR, "SelectLocationOption_xpath"))).selectByVisibleText(selectlocation);
}

@When("^Click 'Submit\" in Add Lab Client User page$")
public void click_Submit_in_Add_Lab_Client_User_page() throws Throwable {
   labclient.ClickAddLabClientUserSubmitButton();
}

@When("^Added user \"([^\"]*)\" should be added to the Lab Client 'User list'$")
public void added_user_should_be_added_to_the_Lab_Client_User_list(String username) throws Throwable {
	labclient.ValidateUserInUserList(username);
}

@When("^Click on the 'User List' icon for a lab client \"([^\"]*)\"$")
public void click_on_the_User_List_icon_for_a_lab_client(String labclientname) throws Throwable {
    labclient.ClickOnUserListIcon(labclientname);
}

@Then("^'User List' page should be displayed$")
public void user_List_page_should_be_displayed() throws Throwable {
	Thread.sleep(2000);
	String UserListInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"UserListInfo_xpath")).getText();
Assert.assertEquals("User List", UserListInfo);
}

@When("^Click on 'Edit Icon' for user \"([^\"]*)\"$")
public void click_on_Edit_Icon_for_user(String username) throws Throwable {
    labclient.ClickOnUserEditIcon(username);
}

@Then("^'Update Lab User' page should be displayed$")
public void update_Lab_User_page_should_be_displayed() throws Throwable {
	Thread.sleep(2000);
	String UpdateLabUserInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabUserInfoInfo_xpath")).getText();
Assert.assertEquals("Update Lab User", UpdateLabUserInfo);
}

@When("^Verify User Information section should be locked for editing in 'Update Lab User' page$")
public void verify_User_Information_section_should_be_locked_for_editing_in_Update_Lab_User_page() throws Throwable {
	boolean LabUserUsername = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"LabUserUsername_xpath")).isEnabled();
		Assert.assertEquals(LabUserUsername, false);
		
		boolean LabUserPassword = connector.getWebElement(driver, WebConnector.Identifier.xpath,
			     connector.getstring(WebConnector.myUrl.URL_OR,"LabUserPassword_xpath")).isEnabled();
		Assert.assertEquals(LabUserPassword, false);
}

@Then("^Make changes to Personal Information -> click update$")
public void make_changes_to_Personal_Information_click_update() throws Throwable {
    labclient.UpdateLabUserPersonalDetails();
}

@Then("^User \"([^\"]*)\" should be updated successfully$")
public void user_should_be_updated_successfully(String username) throws Throwable {
	Thread.sleep(2000);
	String UpdateLabUserSuccessMessage = connector.getWebElement(driver, WebConnector.Identifier.xpath,
			     connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabUserSuccessMessage_xpath")).getText();
	System.out.println(UpdateLabUserSuccessMessage);
	//Assert.assertTrue("Success User updated",UpdateLabUserSuccessMessage.contains("Success User" + username + "updated"));
}

@When("^Click '\\+' icon against newly updated user \"([^\"]*)\" -> 'Modified By' and 'Modified Date' values should be populated with updated information$")
public void click_icon_against_newly_updated_user_Modified_By_and_Modified_Date_values_should_be_populated_with_updated_information(String username) throws Throwable {
	labclient.ClickPlusIconAgainstNewlyUpdatedUser(username); 
}

@When("^Click 'Lock' icon for existing user \"([^\"]*)\"$")
public void click_Lock_icon_for_existing_user(String username) throws Throwable {
	labclient.ClickOnUserLockIcon(username);
}

@Then("^User should be locked and 'User \"([^\"]*)\" locked successfully' message should be populated$")
public void user_should_be_locked_and_User_locked_successfully_message_should_be_populated(String username) throws Throwable {
	Thread.sleep(2000);
	String UserLockedSuccessMessage = connector.getWebElement(driver, WebConnector.Identifier.xpath,
			     connector.getstring(WebConnector.myUrl.URL_OR,"UserLockedSuccessMessage_xpath")).getText();
	System.out.println(UserLockedSuccessMessage);
	//Assert.assertTrue("Success User locked successfully",UserLockedSuccessMessage.contains("Success User" + username + "locked successfully"));
}

@When("^Logout and attempt logging in with the above lab user \"([^\"]*)\" and  \"([^\"]*)\" credentials$")
public void logout_and_attempt_logging_in_with_the_above_lab_user_and_credentials(String username, String password) throws Throwable {
	labclient.LogoutFromEasytox();
    labclient.LoginEasytoxWithLabUserCredentials(username,password);
}

@When("^Account locked message should be populated and user should not be able to login to application$")
public void account_locked_message_should_be_populated_and_user_should_not_be_able_to_login_to_application() throws Throwable {
	Thread.sleep(2000);
	String AccountLockedInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"AccountLockedInfo_xpath")).getText();
Assert.assertEquals("Sorry, your account is locked.", AccountLockedInfo);
}

@When("^Click on the 'Add Notes' Icon$")
public void click_on_the_Add_Notes_Icon() throws Throwable {
   labclient.ClickOnUpdateLabClientAddNotesIcon();
}

@Then("^'Update Lab Client Notes' page should be displayed$")
public void update_Lab_Client_Notes_page_should_be_displayed() throws Throwable {
	Thread.sleep(2000);
	String UpdateLabClientNotesInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabClientNotesInfo_xpath")).getText();
Assert.assertEquals("Update Lab Client Notes", UpdateLabClientNotesInfo);
}

@When("^Click '\\+' icon \"([^\"]*)\" and corresponding notes \"([^\"]*)\" and \"([^\"]*)\" should be added -> Click 'Update Notes'$")
public void click_icon_and_corresponding_notes_and_should_be_added_Click_Update_Notes(String multipletimes, String note1, String note2) throws Throwable {
    labclient.ClickOnPlusIconInLabClientNotes(multipletimes,note1,note2);
}

@When("^Notes \"([^\"]*)\" and \"([^\"]*)\" for lab client should be saved successfully along with date stamp$")
public void notes_and_for_lab_client_should_be_saved_successfully_along_with_date_stamp(String note1, String note2) throws Throwable {
	labclient.ValidateNotesAlongWithDate(note1,note2);
}

@When("^Click on the 'Clinician List' icon for a lab client \"([^\"]*)\"$")
public void click_on_the_Clinician_List_icon_for_a_lab_client(String labclientname) throws Throwable {
    labclient.ClickOnClinicianListIcon(labclientname);
}

@Then("^'Clinician List' page should be displayed$")
public void clinician_List_page_should_be_displayed() throws Throwable {
	Thread.sleep(2000);
	String ClinicianListInfo = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ClinicianListInfo_xpath")).getText();
Assert.assertEquals("Clinician List", ClinicianListInfo);
}

@When("^Click on '\\+' icon beside the Search Box in Clinician List page$")
public void click_on_icon_beside_the_Search_Box_in_Clinician_List_page() throws Throwable {
	insurancecompany.ClickOnPlusIcon();
}

@When("^Enter any search criteria as \"([^\"]*)\" in the Lab Client List$")
public void enter_any_search_criteria_as_in_the_Lab_Client_List(String search) throws Throwable {
	insurancecompany.EnterSearchCriteria(search);
}

@When("^Matching records with \"([^\"]*)\" should be displayed in the Lab Client List$")
public void matching_records_with_should_be_displayed_in_the_Lab_Client_List(String search) throws Throwable {
	labclient.ValidatingSearchCriteriaForLabClient(search);
}

@When("^Verify the default number of records displayed in Lab Client List$")
public void verify_the_default_number_of_records_displayed_in_Lab_Client_List() throws Throwable {
	insurancecompany.DefaultNumberOfRecordsDisplayedOnPage();
}

@When("^Default number '(\\d+)' should be displayed in Lab Client List$")
public void default_number_should_be_displayed_in_Lab_Client_List(int arg1) throws Throwable {
	insurancecompany.DefaultNumber10Displayed();
}

@When("^Click on dropdown that shows no of records to be displayed on the Lab Client List$")
public void click_on_dropdown_that_shows_no_of_records_to_be_displayed_on_the_Lab_Client_List() throws Throwable {
	insurancecompany.ClickOnDisplayPageDropdown();
}

@When("^Select the \"([^\"]*)\" and corresponding records to be displayed in Lab Client List$")
public void select_the_and_corresponding_records_to_be_displayed_in_Lab_Client_List(String option) throws Throwable {
	insurancecompany.SelectOptionInDisplayDropdown(option);
}

@When("^Click on '\\^' Up arrow icon on Lab Client List 'City' column$")
public void click_on_Up_arrow_icon_on_Lab_Client_List_City_column() throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"CityUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the ascending order in the Lab Client List 'City'$")
public void records_should_be_displayed_based_on_the_ascending_order_in_the_Lab_Client_List_City() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"CityUpDownArrow_xpath")).getAttribute("aria-sort");
    Assert.assertEquals("ascending", sort);
}

@When("^Click on \"([^\"]*)\" Down arrow icon on Lab Client List 'City' column$")
public void click_on_Down_arrow_icon_on_Lab_Client_List_City_column(String arg1) throws Throwable {
    Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"CityUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the desecending order in the Lab Client List 'City'$")
public void records_should_be_displayed_based_on_the_desecending_order_in_the_Lab_Client_List_City() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"CityUpDownArrow_xpath")).getAttribute("aria-sort");
   Assert.assertEquals("descending", sort);
}

@When("^Click on '\\^' Up arrow icon on Lab Client List 'State' column$")
public void click_on_Up_arrow_icon_on_Lab_Client_List_State_column() throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"StateUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the ascending order in the Lab Client List 'State'$")
public void records_should_be_displayed_based_on_the_ascending_order_in_the_Lab_Client_List_State() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"StateUpDownArrow_xpath")).getAttribute("aria-sort");
    Assert.assertEquals("ascending", sort);
}

@When("^Click on \"([^\"]*)\" Down arrow icon on Lab Client List 'State' column$")
public void click_on_Down_arrow_icon_on_Lab_Client_List_State_column(String arg1) throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"StateUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the desecending order in the Lab Client List 'State'$")
public void records_should_be_displayed_based_on_the_desecending_order_in_the_Lab_Client_List_State() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"StateUpDownArrow_xpath")).getAttribute("aria-sort");
   Assert.assertEquals("descending", sort);
}

@When("^Click on '\\^' Up arrow icon on Lab Client List 'Zip' column$")
public void click_on_Up_arrow_icon_on_Lab_Client_List_Zip_column() throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ZipUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the ascending order in the Lab Client List 'Zip'$")
public void records_should_be_displayed_based_on_the_ascending_order_in_the_Lab_Client_List_Zip() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ZipUpDownArrow_xpath")).getAttribute("aria-sort");
    Assert.assertEquals("ascending", sort);
}

@When("^Click on \"([^\"]*)\" Down arrow icon on Lab Client List 'Zip' column$")
public void click_on_Down_arrow_icon_on_Lab_Client_List_Zip_column(String arg1) throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ZipUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the desecending order in the Lab Client List 'Zip'$")
public void records_should_be_displayed_based_on_the_desecending_order_in_the_Lab_Client_List_Zip() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ZipUpDownArrow_xpath")).getAttribute("aria-sort");
   Assert.assertEquals("descending", sort);
}

@When("^Click on '\\^' Up arrow icon on Lab Client List 'Contact Person' column$")
public void click_on_Up_arrow_icon_on_Lab_Client_List_Contact_Person_column() throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ContactPersonUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the ascending order in the Lab Client List 'Contact Person'$")
public void records_should_be_displayed_based_on_the_ascending_order_in_the_Lab_Client_List_Contact_Person() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ContactPersonUpDownArrow_xpath")).getAttribute("aria-sort");
    Assert.assertEquals("ascending", sort);
}

@When("^Click on \"([^\"]*)\" Down arrow icon on Lab Client List 'Contact Person' column$")
public void click_on_Down_arrow_icon_on_Lab_Client_List_Contact_Person_column(String arg1) throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ContactPersonUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the desecending order in the Lab Client List 'Contact Person'$")
public void records_should_be_displayed_based_on_the_desecending_order_in_the_Lab_Client_List_Contact_Person() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ContactPersonUpDownArrow_xpath")).getAttribute("aria-sort");
   Assert.assertEquals("descending", sort);
}

@When("^Click on '\\^' Up arrow icon on Lab Client List 'Contact Number' column$")
public void click_on_Up_arrow_icon_on_Lab_Client_List_Contact_Number_column() throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ContactNumberUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the ascending order in the Lab Client List 'Contact Number'$")
public void records_should_be_displayed_based_on_the_ascending_order_in_the_Lab_Client_List_Contact_Number() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ContactNumberUpDownArrow_xpath")).getAttribute("aria-sort");
    Assert.assertEquals("ascending", sort);
}

@When("^Click on \"([^\"]*)\" Down arrow icon on Lab Client List 'Contact Number' column$")
public void click_on_Down_arrow_icon_on_Lab_Client_List_Contact_Number_column(String arg1) throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ContactNumberUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the desecending order in the Lab Client List 'Contact Number'$")
public void records_should_be_displayed_based_on_the_desecending_order_in_the_Lab_Client_List_Contact_Number() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"ContactNumberUpDownArrow_xpath")).getAttribute("aria-sort");
   Assert.assertEquals("descending", sort);
}

@When("^Click on '\\^' Up arrow icon on Lab Client List 'Email' column$")
public void click_on_Up_arrow_icon_on_Lab_Client_List_Email_column() throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"EmailUpDownArrow_xpath")).click();
}

@Then("^Records should be displayed based on the ascending order in the Lab Client List 'Email'$")
public void records_should_be_displayed_based_on_the_ascending_order_in_the_Lab_Client_List_Email() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"EmailUpDownArrow_xpath")).getAttribute("aria-sort");
    Assert.assertEquals("ascending", sort);
}

@When("^Click on \"([^\"]*)\" Down arrow icon on Lab Client List 'Email' column$")
public void click_on_Down_arrow_icon_on_Lab_Client_List_Email_column(String arg1) throws Throwable {
	Thread.sleep(2000);
	connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"EmailUpDownArrow_xpath")).click();
}

@When("^Records should be displayed based on the desecending order in the Lab Client List 'Email'$")
public void records_should_be_displayed_based_on_the_desecending_order_in_the_Lab_Client_List_Email() throws Throwable {
	Thread.sleep(2000);
	String sort = connector.getWebElement(driver, WebConnector.Identifier.xpath,
		     connector.getstring(WebConnector.myUrl.URL_OR,"EmailUpDownArrow_xpath")).getAttribute("aria-sort");
   Assert.assertEquals("descending", sort);
}

@When("^Navigate back and forth by selecting page numbers -> Should navigate to selected Lab Client List page$")
public void navigate_back_and_forth_by_selecting_page_numbers_Should_navigate_to_selected_Lab_Client_List_page() throws Throwable {
	insurancecompany.ClickOnNext();
    insurancecompany.ClickOnPrev();
    insurancecompany.ClickOnAnySelectedNumber();
}

@When("^A text message “Showing x to y of z entries” should be displayed on the bottom left corner of the Lab Client List$")
public void a_text_message_Showing_x_to_y_of_z_entries_should_be_displayed_on_the_bottom_left_corner_of_the_Lab_Client_List() throws Throwable {
	insurancecompany.TextMessageOfPagesDisplayed();
}


}

