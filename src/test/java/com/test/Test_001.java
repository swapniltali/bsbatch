package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.loginpom;
import com.utility.baseclass;

public class Test_001 extends baseclass {
	@Test
	public void testverify_login ()
	{
		loginpom ln=PageFactory.initElements(driver, loginpom.class);
		ln.getTxt_email().sendKeys("neeltali83@gmail.com");
		ln.getTxt_pass().sendKeys("1234566");
		ln.getLgnbttn().click();
	}
	
	

}
