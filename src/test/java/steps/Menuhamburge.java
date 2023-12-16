package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.pt.Então;


public class Menuhamburge {

    WebDriver driver;

    String url = "https://www.saucedemo.com/";

    @Before 
public void setup(){

    WebDriverManager.chromedriver().setup(); 
    driver = new ChromeDriver(); 
}

    @After
public void exit(){

    driver.quit(); 

}

    @Dado("que usuário esteja em sistema")
public void que_usuário_esteja_em_sistema() {

    driver.get(url);
     
    driver.findElement(By.id("user-name")).click();
    driver.findElement(By.id("user-name")).sendKeys(usuario);

    
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys(senha);
}
    @Quando("for acessar todos os  produtos e opções de entrada\\/saída do sistema")
public void for_acessar_todos_os_produtos_e_opções_de_entrada_saída_do_sistema() {
       
}
    @E("clica no botão “Menu Hambúrguer”")
public void clica_no_botão_menu_hambúrguer() {
    
}
    @Então("tenha acesso ao Menu com opções de entrada\\/saída e de acesso a produtos")
public void tenha_acesso_ao_menu_com_opções_de_entrada_saída_e_de_acesso_a_produtos() { 
    
}
    
}
