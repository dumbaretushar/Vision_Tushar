package com.Test;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.LoginPom;
import com.utility.BaseClass;

public class LoginTest extends BaseClass {
	@Test
	public void Verifylogin() {
		
		LoginPom a =PageFactory.initElements(driver, LoginPom.class);
		  a.getUsername().sendKeys("8605143265");
		  a.getPass().sendKeys("9689302038");
		  a.getLogin().click();
		 

		
	}

}
