package frame.page.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By campoUsuario = By.id("user-name");
	private By campoSenha = By.id("password");
	private By botaoLogin = By.id("login-button");
	private By mensagemErro = By.xpath("//h3[@data-test='error']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void escreverUsuario(String usuario) {
		driver.findElement(campoUsuario).sendKeys(usuario);
	}
	
	public void escreverSenha(String senha) {
		driver.findElement(campoSenha).sendKeys(senha);
	}
	
	public void clicarLogin() {
		driver.findElement(botaoLogin).click();
	}
	
	public void realizarLogin(String usuario, String senha) {
		escreverUsuario(usuario);
		escreverSenha(senha);
		clicarLogin();
	}
	
	public String obterMensagemErro() {
		return driver.findElement(mensagemErro).getText();
	}
}