package com.marg.qa.tests;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.marg.qa.TestBase.TestBase;
import com.marg.qa.pages.company;

public class Company_Test extends TestBase{
	company cmp;
	
	public Company_Test() {
		// TODO Auto-generated constructor stub
		super();
	}
	@BeforeSuite
	public void startup_test(){
		initialization();
		
	}
	@BeforeTest
	public void loginc_Test() throws InterruptedException{
		login_Credentials();
		
	}
	@Test(priority=1)
	public void Create_Test() {
		cmp.Creating_Company();
	}
	@Test(priority=2)
	public void Country_Test() throws InterruptedException{
		cmp.Country();
	}
	@Test(priority=3)
	public void state_test() throws InterruptedException{
		cmp.state();
	}
	@Test(priority=4)
	public void Pincode_test() {
		cmp.Pincode();
	}
	@Test(priority=5)
	public void branchcode(){
		cmp.branchcode();
	}
	@Test(priority=6)
	public void fyn_test(){
		cmp.fyn();
	}
	@Test(priority=7)
	public void contactinfo_test() throws InterruptedException{
		cmp.contactinfo();
	}
	@Test(priority=8)
	public void uploadImage_Test() throws AWTException, InterruptedException{
		cmp.uploadImage();
	}
	@Test(priority=9)
	public void Regtype_Test() throws InterruptedException{
		cmp.Regtype();
	}
	@Test(priority=10)
	public void Gst_Test(){
		cmp.Gst();
	}
	@Test(priority=11)
	public void TaxStructure_Test(){
		cmp.TaxStructure();
	}
	@Test(priority=12)
	public void TradeLIC_test(){
		cmp.TradeLIC();
	}
	@Test(priority=13)
	public void other() throws InterruptedException{
		cmp.other();
	}
	@Test(priority=14)
	public void valution() throws InterruptedException{
		cmp.valution();
	}
	@Test(priority=15)
	public void workingstl() throws InterruptedException{
		cmp.workingstl();
	}
	
	@Test(priority=16)
	public void Save() throws InterruptedException{
		cmp.Save();
	}
	@AfterTest
	public void tearDown(){
		driver.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	