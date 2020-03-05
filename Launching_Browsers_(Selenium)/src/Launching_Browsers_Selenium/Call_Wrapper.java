package Launching_Browsers_Selenium;

import java.io.IOException;

public class Call_Wrapper {
public static void main(String args[]) throws IOException {
{
	
	Wrapper_Method wm=new Wrapper_Method();
	wm.LaunchApp("https://opensource-demo.orangehrmlive.com/");
	wm.enterById("txtUsername", "Admin");
	wm.enterById("txtPassword", "admin123");
	wm.clickByXpath("//*[@id=\"btnLogin\"]");
	wm.clickByLinkText("Leave");
	wm.screenShot("C:\\Users\\BLTuser.BLT0199\\eclipse-workspace\\Launching_Browsers_(Selenium)\\Screenshot\\screenshot.png");
	wm.closeApp();
}

}
}
