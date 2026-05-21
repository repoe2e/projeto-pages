package frame.page.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.page.core.BaseTest;
import frame.page.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	private LoginPage loginPage; // objeto variável 
	
	@BeforeEach
	public void iniciarPages() {
		loginPage = new LoginPage(driver);
	}
	
	
	@Test
	public void testAbrirSite() {
		loginPage.realizarLogin("standard_user", "secret_sauce");
	}

}
