package com.marg.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.marg.qa.TestBase.TestBase;

public class company extends TestBase {

	// Locators
	@FindBy(xpath = "//button[@id='btn-New']")
	WebElement CButton;

	@FindBy(xpath = "//input[@id='txtcompname']")
	WebElement CName;

	@FindBy(id = "txtaddress1")
	WebElement Add1;

	@FindBy(id = "txtaddress2")
	WebElement Add2;

	@FindBy(id = "txtaddress3")
	WebElement Add3;

	@FindBy(xpath = "//*[@id='ddlcountry']")
	WebElement CountryDropdown;

	@FindBy(xpath = "//*[@id='ddlcountry']")
	WebElement CountryNameIs;

	@FindBy(xpath = "//*[@class='dropdown-menu show']")
	List<WebElement> ListOfCountryDropDown;

	@FindBy(xpath = "//input[@id='ddlstate']")
	WebElement StateDropDown;

	@FindBy(xpath = "//*[@class='dropdown-menu show']")
	List<WebElement> ListOfStateName;

	@FindBy(xpath = "//*[@id='txtpincode']")
	WebElement PincodeIs;

	@FindBy(xpath = "//input[@id='txtbranchcode']")
	WebElement BranchCodeIS;

	@FindBy(xpath = "//select[@id='ddlbusinesstype']")
	List<WebElement> BussinessTypeIS;

	@FindBy(id = "ddlbusinesstype")
	WebElement BussinessTypeIS2;

	@FindBy(xpath = "//input[@id='txtfromfinancialyr']")
	WebElement FinancialYearIS;

	@FindBy(xpath = "//input[@id='txtphone']")
	WebElement phoneIs;

	@FindBy(xpath = "//input[@id='txtUrl']")
	WebElement WebSiteIS;

	@FindBy(xpath = "//input[@id='txtuserEmailid']")
	WebElement EmilIdIs;

	@FindBy(xpath = "//button[@id='addButtonEmail']")
	WebElement AddEmailBtn;

	@FindBy(xpath = "//input[@id='extraEmail']")
	WebElement EmailId2;

	@FindBy(xpath = "//button[@id='btnEdit']")
	WebElement photoBtn;

	@FindBy(xpath = "//select[@id='comptype']")
	WebElement RegisterType;

	@FindBy(id = "comptype")
	List<WebElement> CompType;

	@FindBy(xpath = "//select[@id='comptype']")
	WebElement CompTypeX;

	@FindBy(xpath = "//*[@id='comptype']/option[1]")
	WebElement Composition;

	@FindBy(xpath = "//*[@id='comptype']/option[2]")
	WebElement Registered;

	@FindBy(xpath = "//*[@id='comptype']/option[3]")
	WebElement UnRegistered;

	@FindBy(xpath = "//input[@id='gstnumber']")
	WebElement GstField;

	@FindBy(xpath = "//input[@id='txtregdate']")
	WebElement GstDate;

	@FindBy(id = "ddltaxstruc")
	WebElement TaxStructure;

	@FindBy(id = "btn-Switch Tab")
	WebElement switchTab;

	@FindBy(xpath = "//*[@id='ddlbusinesstype']/option[2]")
	WebElement BillingGeneral;

	@FindBy(xpath = "//*[@id='ddlbusinesstype']/option[3]")
	WebElement Chemist;

	@FindBy(xpath = "//*[@id='ddlbusinesstype']/option[4]")
	WebElement Distribution;

	@FindBy(xpath = "//input[@id='txtdlno']")
	WebElement LIC;

	@FindBy(xpath = "//input[@id='dlexpdate']")
	WebElement ExpireDate;

	@FindBy(xpath = "//*[@id='ddldatatype']")
	WebElement OtherDateType;

	@FindBy(xpath = "//*[@id='txtvaluation']")
	List<WebElement> ValuationList;

	@FindBy(id = "txtvaluation")
	WebElement ValuationList2;

	@FindBy(xpath = "//select[@id='ddlworkinstyle']")
	List<WebElement> WorkingStyle;
	
	@FindBy(id="dlworkinstyle")
	WebElement WorkingStyle2;

	@FindBy(xpath = "//input[@id='txtJurisdiction']")
	WebElement Jurisdiction;

	@FindBy(xpath = "//button[@id='btn-Save']")
	WebElement Save;

	public company() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	// Excel Code
	String user = reader.getCellData("Sheet1", "user", 2);
	String pass = reader.getCellData("Sheet1", "password", 2);
	String Company_name = reader.getCellData("Sheet1", "company name", 2);
	String Address1 = reader.getCellData("Sheet1", "Address1", 2);
	String Address2 = reader.getCellData("Sheet1", "Addrees2", 2);
	String Address3 = reader.getCellData("Sheet1", "Addree3", 2);
	String state = reader.getCellData("Sheet1", "state", 2);
	String pincode = reader.getCellData("Sheet1", "pincode", 2);
	String branchCode = reader.getCellData("Sheet1", "branch code", 2);
	String FynYear = reader.getCellData("Sheet1", "FinancialYear", 2);
	String phone = reader.getCellData("Sheet1", "phone", 2);
	String gst1 = reader.getCellData("Sheet1", "GST", 2);
	String gst2 = reader.getCellData("Sheet1", "GST", 3);
	String trade01 = reader.getCellData("Sheet1", "Trade LIC", 2);
	String trade02 = reader.getCellData("Sheet1", "Trade LIC", 3);
	String workingstyle = reader.getCellData("Sheet1", "working style", 2);

	// WebDriver Code

	public void Creating_Company() {
		CButton.click();
		CName.sendKeys(Company_name);
		Add1.sendKeys(Address1);
		Add2.sendKeys(Address2);
		Add3.sendKeys(Address3);
	}

	public void Country() throws InterruptedException {
		WebElement textbox = CountryDropdown;
		textbox.clear();
		textbox.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> allOptions = ListOfCountryDropDown;
		int count = allOptions.size();
		System.out.println("No.of Autosuggesion " + count);
		System.out.println("List of Autosuggesion");
		for (int i = 0; i < count; i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
		}
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ENTER);
	}

	public void state() throws InterruptedException {
		WebElement textboxS = StateDropDown;
		textboxS.clear();
		textboxS.sendKeys(state);
		Thread.sleep(2000);
		List<WebElement> allOptionsSt = ListOfStateName;
		int countSt = allOptionsSt.size();
		System.out.println("No.of Autosuggesion " + countSt);
		System.out.println("List of Autosuggesion");
		for (int i = 0; i < countSt; i++) {
			String textSt = allOptionsSt.get(i).getText();
			System.out.println(textSt);
		}
		Thread.sleep(2000);
		textboxS.sendKeys(Keys.ARROW_DOWN);
		textboxS.sendKeys(Keys.ENTER);

	}

	public void Pincode() {
		PincodeIs.sendKeys(pincode);

	}

	public void branchcode() {
		WebElement textboxbr = BranchCodeIS;
		textboxbr.clear();
		textboxbr.sendKeys(branchCode);

		/*
		 * String typedValue = textboxbr.getAttribute("value"); int size =
		 * typedValue.length(); if (size < 12) {
		 * System.out.println("lenght is less "); //Scanner myObj = new
		 * Scanner(System.in); // Create a Scanner object
		 * System.out.println("Enter Branch code"); }
		 */

		List<WebElement> eBusType = BussinessTypeIS;
		int countBt = eBusType.size();
		System.out.println("list of Business type" + countBt);
		System.out.println("list of Bt");
		for (int i = 0; i < countBt; i++) {
			String testBt = eBusType.get(i).getText();
			System.out.println(testBt);
		}
		Select bt = new Select(BussinessTypeIS2);
		bt.selectByVisibleText("Chemist [Pharmacy]");
	}

	public void fyn() {
		WebElement dateFy = FinancialYearIS;
		dateFy.sendKeys(FynYear);
		dateFy.sendKeys(Keys.ENTER);
	}

	public void contactinfo() throws InterruptedException {

		WebElement phn = phoneIs;
		phn.sendKeys(phone);

		// Get the typed value
		String typedValue = phn.getAttribute("value");
		int size = typedValue.length();

		// Assert with expected
		if (size == 12) {
			WebSiteIS.sendKeys("w.com");// phoneNo
		}

		else {
			System.out.println("No limit is set.");
			phn.clear();
			Thread.sleep(3000);
			phn.sendKeys(phone);
		}

		WebSiteIS.sendKeys("w.com");
		EmilIdIs.sendKeys("32q33342dsdadgdgssssgssgsssdfsdgsds@gamil.com");
		AddEmailBtn.click();
		EmailId2.sendKeys("32q33342dsdadgdgssssgssgsssdfsdgsds@gamil.com");
		AddEmailBtn.click();
	}

	public void uploadImage() throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		photoBtn.click();
		Thread.sleep(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\Admin.DESKTOP-P28CFV6\\Desktop\\dek\\123.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
		Robot robot = new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		// Delete image
		// Thread.sleep(2000);
		// driver.findElement(By.id("btnDelete")).click();
	}

	public void Regtype() throws InterruptedException {
		List<WebElement> listregt = CompType;
		int countregt = listregt.size();
		System.out.println("List of reg type");
		for (int i = 0; i < countregt; i++) {
			String textregt = listregt.get(i).getText();
			System.out.println(textregt);
		}
		Thread.sleep(2000);
		Select regt = new Select(CompTypeX);
		regt.selectByVisibleText("Composition");
	}

	public void Gst() {
		if (Composition.isSelected()) {
			GstField.sendKeys(gst1);
			WebElement datgst = GstDate;
			datgst.sendKeys(gst2);
		} else if (Registered.isSelected()) {
			GstField.sendKeys(gst1);
			WebElement datgst = GstDate;
			datgst.sendKeys(gst2);
		} else if (UnRegistered.isSelected()) {
			TaxStructure.click();
		}
	}

	public void TaxStructure() {
		Select TXTST = new Select(TaxStructure);
		TXTST.selectByVisibleText("Product wise");
		switchTab.click();
	}

	public void TradeLIC() {
		if (BillingGeneral.isSelected()) {
			WebElement trade = LIC;
			trade.sendKeys(trade01);
			WebElement datst = ExpireDate;
			datst.sendKeys(trade02);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			switchTab.click();
		} else if (Chemist.isSelected()) {
			WebElement trade1 = LIC;
			trade1.sendKeys(trade01);
			WebElement datst = ExpireDate;
			datst.sendKeys(trade02);
			driver.findElement(By.id("btn-Switch Tab")).click();
		} else if (Distribution.isSelected()) {
			WebElement trade2 = LIC;
			trade2.sendKeys(trade01);
			WebElement datst = ExpireDate;
			datst.sendKeys(trade02);
			switchTab.click();
		}

	}

	public void other() throws InterruptedException {
		// Date Type
		Thread.sleep(2000);
		Select dt = new Select(OtherDateType);
		dt.selectByVisibleText("English");

	}

	public void valution() throws InterruptedException {
		List<WebElement> listvl = ValuationList;
		int countvl = listvl.size();
		System.out.println("List of valuetion Type");
		for (int i = 0; i < countvl; i++) {
			String textvl = listvl.get(i).getText();
			System.out.println(textvl);
		}
		Thread.sleep(2000);
		Select vl = new Select(ValuationList2);
		vl.selectByIndex(2);

	}



public void workingstl() throws InterruptedException{
	 List<WebElement> listws= WorkingStyle;
      int countws = listws.size();
      System.out.println("List of work style");
     for(int i=0;i<countws;i++)
     {
  	   String textws= listws.get(i).getText();
  	   System.out.println(textws);
     }
     Thread.sleep(2000);
     Select ws= new Select(WorkingStyle2);
     ws.selectByVisibleText("Secondary (Batch/Mrp/Size)");
      //juridction  
    Jurisdiction.sendKeys(workingstyle);
}



public void Save() throws InterruptedException{
	
	       
	   Save.click();
}
}
