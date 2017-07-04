package easytox.apptest.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;






























import com.sun.tools.javac.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easytox.apptest.utils.WebConnector;

public class LabClientPage extends AbstractPage {
	//WebDriver driver;
	
	public LabClientPage(WebDriver driver) {
		super(driver);
	}
	
	public void SelectLabClientOption()throws Throwable {
		Thread.sleep(2000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath,
				connector.getstring(WebConnector.myUrl.URL_OR,"LabClient_xpath")).click();
		}
	
	public void ClickOnUpdateLabClientAddLocationIcon()throws Throwable {
		Thread.sleep(2000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath,
				connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabClientAddLocationIcon_xpath")).click();
		}
	
	public void AddLocationNameAndOtherDetails(String lname)throws Throwable {
		Thread.sleep(2000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath,
				connector.getstring(WebConnector.myUrl.URL_OR,"AddLabLocationName_xpath")).sendKeys(lname);
		
		Thread.sleep(1000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "AddLabLocationDepartment_xpath")).sendKeys("Radiology");
		
		Thread.sleep(1000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "AddLabLocationAddress_xpath")).sendKeys("Riverside Hospital Westerville, 507 West Board ST, Westerville OH-43071");
		
		Thread.sleep(1000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "AddLabLocationFaxNumber_xpath")).sendKeys("6142345676");
		
		Thread.sleep(1000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath,
				connector.getstring(WebConnector.myUrl.URL_OR,"AddLabLocationSubmitButton_xpath")).click();
		Thread.sleep(1000);
		}
	
	public void ValidateLocationNameInLocationList(String lname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String LabLocationInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[1]")).getText();
			if(lname.equals(LabLocationInfo)){
				System.out.println(lname + " is Present in the List");
				break;
			}
		}
	}
	
	public void ClickOnLocationListIcon(String lcname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String LabClientNameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			 if(lcname.equals(LabClientNameInfo)){
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[9]/div/div[2]/form/a/i")).click();
				break;
				}
		}
	}
	
	public void ClickOnLocationEditIcon(String lname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String LabLocationInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[1]")).getText();
			if(lname.equals(LabLocationInfo)){
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//td/form/a[@id='editlink']/i) ["+i+"]")).click();
				break;
			}
		}
	}
	
	public void UpdateLabLocationDetails()throws Throwable {
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "UpdateLabLocationAddress_xpath")).clear();
		
		Thread.sleep(2000);
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "UpdateLabLocationAddress_xpath")).sendKeys("Riverside Hospital Dublin, 357 East Board ST, Dublin OH-43091");
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "UpdateLabLocationAddress_xpath")).sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "UpdateLabLocationUpdateButton_xpath")).click();
	}
	
	public void ClickOnUpdateLabClientAddUserIcon()throws Throwable {
		Thread.sleep(2000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath,
				connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabClientAddUserIcon_xpath")).click();
		}
	
	public void ClickAddLabClientUserSubmitButton()throws Throwable {
		Thread.sleep(2000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath,
				connector.getstring(WebConnector.myUrl.URL_OR,"AddLabClientUserSubmitButton_xpath")).click();
		}
	
	public void ValidateUserInUserList(String uname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String UsernameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			if(uname.equals(UsernameInfo)){
				System.out.println(uname + " is present in the List");
				break;
			}
		}
	}
	
	public void ClickOnUserListIcon(String lcname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String LabClientNameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			 if(lcname.equals(LabClientNameInfo)){
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[9]/div/div[3]/form/a/i")).click();
				break;
				}
		}
	}
	
	public void ClickOnUserEditIcon(String uname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String UsernameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			if(uname.equals(UsernameInfo)){
				driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[8]/div/div[1]/form/a/i")).click(); 
				break;
			}
		}
	}
	
	public void UpdateLabUserPersonalDetails()throws Throwable {
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "UpdateLabUserEmailAddress_xpath")).clear();
		
		Thread.sleep(2000);
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "UpdateLabUserEmailAddress_xpath")).sendKeys("kthompson@yahoo.com");
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "UpdateLabUserEmailAddress_xpath")).sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "UpdateLabUserUpdateButton_xpath")).click();
	}
	
	public void ClickPlusIconAgainstNewlyUpdatedUser(String uname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String UsernameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			if(uname.equals(UsernameInfo)){
				driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[1]")).click(); 
				
				int j = i+1;
				String ValidateModifiedBy = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+j+"]/td/table/tbody/tr[3]/td[2]")).getText();
				Assert.assertEquals("HelloAdmin", ValidateModifiedBy);   
				
				
				DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd mm");
				Date date = new Date();
				String ExpectedDate= dateFormat.format(date);
				System.out.println(ExpectedDate);
				String ValidateModifiedDate = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+j+"]/td/table/tbody/tr[4]/td[2]")).getText();
				System.out.println(ValidateModifiedDate);
//				Assert.assertTrue(ValidateModifiedDate,ValidateModifiedDate.contains(ExpectedDate));
				Thread.sleep(2000);
				break; 
			}
		}
	}
	
	public void ClickOnUserLockIcon(String uname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String UsernameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			if(uname.equals(UsernameInfo)){
				driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[8]/div/div[2]/form/a/i")).click(); 
				break;
			}
		}
	}
	
	public void LogoutFromEasytox()throws Throwable {
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "HelloLabAdmin_xpath")).click();
		
		Thread.sleep(2000);
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "Signout_xpath")).click();
	}
	
	public void LoginEasytoxWithLabUserCredentials(String uname,String pwd)throws Throwable {
		Thread.sleep(1000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "NewLoginUsername_xpath")).sendKeys(uname);
		
		Thread.sleep(1000);
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "NewLoginPassword_xpath")).sendKeys(pwd);
		
		Thread.sleep(1000);
		
		connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "LoginButton_xpath")).click();
		
	}
	
	public void ClickOnUpdateLabClientAddNotesIcon()throws Throwable {
		Thread.sleep(2000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath,
				connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabClientAddNotesIcon_xpath")).click();
		}
	
	public void ClickOnPlusIconInLabClientNotes(String numberoftimes, String msg1, String msg2)throws Throwable {
		for(int i=1;i<=Integer.parseInt(numberoftimes);i++){
			Thread.sleep(2000);
			connector.getWebElement(driver, WebConnector.Identifier.xpath,
					connector.getstring(WebConnector.myUrl.URL_OR,"LabClientNotesPlusIcon_xpath")).click();
			if(i == 1){
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='labClientNote'])["+i+"]")).sendKeys(msg1);
			}
			else{
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@id='labClientNote'])["+i+"]")).sendKeys(msg2);
			}
		  }
		Thread.sleep(2000);
		connector.getWebElement(driver, WebConnector.Identifier.xpath,
				connector.getstring(WebConnector.myUrl.URL_OR,"UpdateNotesButton_xpath")).click();
		}
	
	public void ValidateNotesAlongWithDate(String msg1, String msg2)throws Throwable {
//		String UpdateLabClientNote1Info = connector.getWebElement(driver, WebConnector.Identifier.xpath,
////			     connector.getstring(WebConnector.myUrl.URL_OR,"UpdateLabClientNote1Info_xpath")).getText();
//		System.out.println(UpdateLabClientNote1Info);
//	    Assert.assertEquals(msg1, UpdateLabClientNote1Info);
		
		
		String PresentDateInfo = driver.findElement(By.xpath("//*[@id='clientNoteDiv']/div/label")).getText();		 
		DateFormat dateFormat = new SimpleDateFormat("[MM/dd/yyyy]");
		Date date = new Date();
		String ExpectedDate= dateFormat.format(date);
		Assert.assertTrue("HelloAdmin [06/30/2017]",PresentDateInfo.contains(ExpectedDate));
	}
	
	public void ClickOnClinicianListIcon(String lcname)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		for(int i=1;i<=rowCount;i++){
			String LabClientNameInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			 if(lcname.equals(LabClientNameInfo)){
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[9]/div/div[1]/form/a/i")).click();
				break;
				}
		}
	}
	
	public void ValidatingSearchCriteriaForLabClient(String labclientsearch)throws Throwable {
		Thread.sleep(2000);
		new Select(connector.getWebElement(driver, WebConnector.Identifier.xpath, 
				connector.getstring(WebConnector.myUrl.URL_OR, "PageDisplayOption_xpath"))).selectByVisibleText("All");
		
		int rowCount=driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size(); 
		int columnCount=8;
		for(int i=1;i<=rowCount;i++){
			for(int j=1;j<=columnCount;j++){
				String LabClientSearchInfo = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td["+j+"]")).getText();
				if(labclientsearch.equals(LabClientSearchInfo)){
					System.out.println("Matching Records are Displayed");
				}
			}
			
		}
	}
	
}