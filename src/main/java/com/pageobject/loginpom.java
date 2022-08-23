package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
@FindBy(how=How.XPATH,using="//input[@id='email']")
private WebElement txt_email;
@FindBy(how=How.XPATH,using="//input[@id='pass']")
private WebElement txt_pass;
@FindBy(how=How.XPATH,using="//button[@name='login']")
private WebElement lgnbttn;
public WebElement getTxt_email() {
	return txt_email;
}

public WebElement getTxt_pass() {
	return txt_pass;
}

public WebElement getLgnbttn() {
	return lgnbttn;
}

}
