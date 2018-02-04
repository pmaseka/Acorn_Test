package selenium_id_check;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_check {
	
	private WebDriver driver;
	public static final String path="C:\\Users\\Pmaseka\\Desktop\\QA Resume\\Acorn_User.xlsx";
	
	@Test(priority=1)
	public void login() throws IOException, InterruptedException {
		
	 
	 //Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void Add_User() throws IOException, InterruptedException {
		
	 	for(int i=1;i<=1;i++) {
    	 
	   	 FileInputStream fis=new FileInputStream(path);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 Sheet sh=wb.getSheet("Sheet1");
		 Row row=sh.getRow(i);
		 
		 String uname=row.getCell(0).getStringCellValue();
		 String pass=row.getCell(1).getStringCellValue();
		 driver.findElement(By.xpath(".//*[@id='loginTxtUserId']")).sendKeys(uname);
		 driver.findElement(By.xpath(".//*[@id='password-with-microcopy']")).sendKeys(pass);
		 driver.findElement(By.xpath(".//*[@id='loginBtnSignIn']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath(".//*[@id='navbarAncUser Management']")).click();
		 driver.findElement(By.id("userapplicationAccessApplicationList")).click();
		
		 Select dropdown = new Select(driver.findElement(By.id("userapplicationAccessApplicationList")));
		 
		 //---Select Corporate Communication----
		 
		 dropdown.selectByVisibleText("Corporate Communication");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(".//*[@id='userProcessTxtSearch']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessTxtSearch']")).sendKeys("rbharil");
		 driver.findElement(By.xpath(".//*[@id='userProcessBtnAddUser']")).click();
		 Thread.sleep(2000);
		 
		 //-----Add User------------
		 
		 driver.findElement(By.xpath(".//*[@id='userProcessWiseAddChkrbharil']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessWiseAddChkrbharil1']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessWiseAddBtnDone']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(".//*[@id='sharedConfirmDialog']/div/div[3]/button[1]")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath(".//*[@id='userProcessBtnRefresh']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath(".//*[@id='userProcessChk151']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessChk1512']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessChk1513']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessBtnSave']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessBtnUpdateUsers']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("userapplicationAccessApplicationList")).click();
			
		 Select dropdown3 = new Select(driver.findElement(By.id("userapplicationAccessApplicationList")));
		 dropdown3.selectByVisibleText("All Application");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id='usermanagementBtnRefresh']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='usermanagementTxtUserFilter']")).sendKeys("rbharil");
		 Thread.sleep(2000);
		 
		 WebElement hover = driver.findElement(By.xpath(".//*[@id='usermanagementTooltiprbharil2']"));
         Actions action = new Actions(driver);
		 action.moveToElement(hover).perform();
		 
		 Thread.sleep(3000);
		 /* WebElement clear1=driver.findElement(By.xpath(".//*[@id='tooltip5']/div/li[1]"));
		 clear1.sendKeys(Keys.chord(Keys.CONTROL + "a"));
		 String get_text=driver.findElement(By.xpath(".//div[@id='tooltip5']/div")).getText();
		 System.out.println("tooltip" +get_text);*/
     }
	}
		 
	     @Test(priority=3)
		 public void Update_User() throws InterruptedException {
			 
		driver.findElement(By.id("userapplicationAccessApplicationList")).click();
		
		 Select dropdown1 = new Select(driver.findElement(By.id("userapplicationAccessApplicationList")));
		 dropdown1.selectByVisibleText("Executive Insight");
		 Thread.sleep(2000);
		 //Search user from Executive Insight & Update Roles
		 driver.findElement(By.xpath(".//*[@id='userProcessTxtSearch']")).sendKeys("sross");
		 driver.findElement(By.xpath(".//*[@id='userProcessTxtSearch']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessChk58']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessChk581']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessChk582']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessChk584']")).click();
		 driver.findElement(By.xpath(".//*[@id='userProcessBtnSave']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='userProcessBtnUpdateUsers']")).click();
		 
		 }

		 @Test(priority=4)
		 public void Task_Allocation() throws InterruptedException {
		 
		 driver.findElement(By.xpath(".//*[@id='entitlAncTaskAllocations']")).click();
		 driver.findElement(By.xpath(".//*[@id='taskmanagementDropDownApplicationList']")).click();
		 
		 driver.findElement(By.id("taskmanagementDropDownApplicationList")).click();
		 Select dropdown2 = new Select(driver.findElement(By.id("taskmanagementDropDownApplicationList")));
		 dropdown2.selectByVisibleText("Executive Insight");
		 Thread.sleep(3000);
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,200)", "");
	
		 driver.findElement(By.xpath(".//*[@id='taskManagementSpn6-K']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='sharedConfirmDialog']/div/div[3]/button[1]")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath(".//*[@id='taskAllocationSearchInputId']")).sendKeys("Prashant Masekar");
		 String count=driver.findElement(By.xpath(".//*[@id='taskManagementDivUserCount1']")).getText();
		 System.out.println("Prashant Masekar bucket count is: "+count);
		 WebElement clear=driver.findElement(By.xpath(".//*[@id='taskAllocationSearchInputId']"));
		 clear.sendKeys(Keys.chord(Keys.CONTROL + "a"));
		 Thread.sleep(1000);
		 clear.sendKeys(Keys.BACK_SPACE);
		 
		 //---delete user
         Thread.sleep(3000);
         //Aniket Thandel
         String count1 =driver.findElement(By.xpath(".//*[@id='taskManagementDivUserCount135']")).getText();
		 System.out.println("Aniket Tandel bucket count is:" +count1);
		 driver.findElement(By.xpath(".//*[@id='taskmanagementCompUser135']/div/div/div[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//*[@id='sharedConfirmDialog']/div/div[3]/button[1]")).click();
		 Thread.sleep(3000);
		 String count2 =driver.findElement(By.xpath(".//*[@id='taskManagementDivUserCount135']")).getText();
		 System.out.println("Aniket Tandel curent bucket count is:" +count2);
		 
		 driver.findElement(By.xpath(".//*[@id='navbarAncLogout']")).click();
		 Thread.sleep(3000);
		
		 /*WebElement fromElement= driver.findElement(By.xpath(".//*[@id='taskmanagementCompActiveUser[object Object]']/div/div"));
		 WebElement toElement=driver.findElement(By.xpath(".//*[@id='taskManagementComtaskAllocation3']/div/div/div[2]/div[4]/div[5]"));
		 Thread.sleep(3000);
		 Actions action = new Actions(driver);
		 Action dragDrop = action.dragAndDrop(fromElement, toElement).build();
		 dragDrop.perform(); 
		 Thread.sleep(3000);*/
		
		 }
		 
	    @Test(priority=5)
	    public void Request_Access() throws InterruptedException, IOException {
		
	    driver.findElement(By.xpath(".//*[@id='loginBtnRequestAccess']")).click();
	    Thread.sleep(2000);
	    for(int i=1;i<=1;i++) {
	    FileInputStream fis1=new FileInputStream(path);
	    XSSFWorkbook wb1=new XSSFWorkbook(fis1);
	    Sheet sh=wb1.getSheet("Sheet1");
	    Row row1=sh.getRow(i);
	 
	    String uname1=row1.getCell(0).getStringCellValue();
	    String pass1=row1.getCell(1).getStringCellValue();
	
	    driver.findElement(By.xpath(".//*[@id='requestTxtUserId']")).sendKeys(uname1);
	    driver.findElement(By.xpath(".//*[@id='requestTxtPassword']")).sendKeys(pass1);
	    driver.findElement(By.xpath(".//*[@id='request-Company Operations-Collection']/div/div[2]")).click();
	    driver.findElement(By.xpath(".//*[@id='request-Company Operations-User Management']/div/div[2]")).click();
	    driver.findElement(By.xpath(".//*[@id='request-Corporate Communication-Collection']/div/div[2]")).click();
	    driver.findElement(By.xpath(".//*[@id='request-Corporate Communication-User Management']/div/div[2]")).click();
	    driver.findElement(By.xpath(".//*[@id='requestBtnSubmit']")).click();
	    Thread.sleep(5000);	
	   
	 }
	}

}
