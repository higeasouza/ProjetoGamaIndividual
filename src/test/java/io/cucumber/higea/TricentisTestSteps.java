package io.cucumber.higea;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.hopper.Servicos.Config;
import org.openqa.selenium.WebElement;
import io.cucumber.java.pt.*;

public class TricentisTestSteps {
	
	@Dado("que eu estou no site da tricentis")
	public void abrindoPagina() {
		Config.abrirPagina("http://sampleapp.tricentis.com/101/app.php");
    }

	@Dado("clico_na_aba_automobile")
	public void clico_na_aba_automobile(){
		WebElement input = browser.findElement( Config.cssSelector("#nav_automobile"));
        input.click();
	}
		
	@Dado("seleciono a opcao make{string}")
	public void seleciono_a_opcao_make(String string) {
		Config.cssSelector("#make").click();
		WebElement marca = Config.cssSelector("[value='Nissan']");		
		assertEquals(string, marca.getText());
		marca.click();
	}

	@Dado("preencho o campo Engine Performance {string}")
	public void preencho_o_campo_Engine_Performance(String string) {
		WebElement input = browser.findElement( Config.cssSelector("#engineperformance") );
	   input.sendKeys(string);
	}

	@Dado("preencho o campo Date of Manufacture {string}")
	public void preencho_o_campo_Date_of_Manufacture(String string) {
		WebElement dateBox = browser.findElement(Config.cssSelector("#dateofmanufacture"));
		dateBox.sendKeys("01012019");		
	}

	@Dado("preencho o campo Number of Seats {string}")
	public void preencho_o_campo_Number_of_Seats(String string) {
		Config.cssSelector("#numberofseats").click();
		WebElement number = Config.cssSelector("[value='1']");
		assertEquals(string,number.getText());
		number.click();	
	}

	@Dado("marco o campo Fuel Tupe {string}")
	public void marco_o_campo_Fuel_Tupe(String string) {
		Config.cssSelector("#fuel").click();
		WebElement combustivel = Config.cssSelector("[value='Petrol']");
		assertEquals(string,combustivel.getText());
		combustivel.click();
	}

	@Dado("preencho o campo List Price {string}")
	public void preencho_o_campo_List_Price(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#listprice"));
        input.sendKeys(string);
	}

	@Dado("preencho o campo License Plate Number {string}")
	public void preencho_o_campo_License_Plate_Number(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#licenseplatenumber"));
        input.sendKeys(string);
	}

	@Dado("preencho o campo Annual Mileage {string}")
	public void preencho_o_campo_Annual_Mileage(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#annualmileage"));
        input.sendKeys(string);		
	}

	@Dado("clico no botao next enter insurant data")
	public void clico_no_botao_next_enter_insurant_data() {
		WebElement input = browser.findElement(Config.cssSelector("#nextenterinsurantdata"));
		input.click();
	}

	@Entao("preencho o campo First Name {string}")
	public void preencho_o_campo_First_Name(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#firstname"));
        input.sendKeys(string);
	}

	@Entao("preencho o campo Last Name {string}")
	public void preencho_o_campo_Last_Name(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#lastname"));
        input.sendKeys(string);
	}

	@Entao("preencho o campo Date of Birth {string}")
	public void preencho_o_campo_Date_of_Birth(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#birthdate"));
        input.sendKeys(string);
	}

	@Entao("marco o campo  Gender {string}")
	public void marco_o_campo_Gender(String string) {
		WebElement input = browser.findElement(By.cssSelector("#genderfemale"));
        input.click();
	}

	@Entao("preencho o campo Street Address {string}")
	public void preencho_o_campo_Street_Address(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#streetaddress"));
        input.sendKeys(string);
	}

	@Entao("seleciono o campo Country {string}")
	public void seleciono_o_campo_Country(String string) {
		Config.cssSelector("#Country").click();
		WebElement pais = Config.cssSelector("value=['Brasil']");
		assertEquals(string, pais.getText());
		pais.click();
	}

	@Entao("preencho o campo Zip Code {string}")
	public void preencho_o_campo_Zip_Code(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#zipcode"));
        input.sendKeys(string);
	}

	@Entao("preencho o campo City {string}")
	public void preencho_o_campo_City(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#city"));
        input.sendKeys(string);
	}

	@Entao("marco o campo Occupation {string}")
	public void marco_o_campo_Occupation(String string) {
		Config.cssSelector("#occupation").click();
		WebElement ocupacao = Config.cssSelector("[value='Employee']");
		assertEquals(string,ocupacao.getText());
		ocupacao.click();	
	}

	@Entao("marco o campo Hobbies {string}")
	public void marco_o_campo_Hobbies(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#speending"));
        input.click();
	}

	@Entao("preencho o campo Website {string}")
	public void preencho_o_campo_Website(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#website"));
        input.sendKeys(string);	
	}

	@Entao("clico no botao next enter product data")
	public void clico_no_botao_next_enter_product_data() {
		WebElement input = browser.findElement(Config.cssSelector("#nextenterproductdata")).click();		
	}

	@Entao("preencho o campo Start Date {string}")
	public void preencho_o_campo_Start_Date(String string) {
		WebElement dateBox = browser.findElement(Config.cssSelector("#startdate"));
		dateBox.sendKeys("05132021");	
	}

	@Entao("marco o campo Insurance Sum {string}")
	public void marco_o_campo_Insurance_Sum(String string) {
		Config.cssSelector("#insurancesum").click();
		WebElement insurance = Config.cssSelector("[value='10.000.000,00']");
		assertEquals(string,insurance.getText());
		insurance.click();		
	}

	@Entao("marco o campo Merit Rating {string}")
	public void marco_o_campo_Merit_Rating(String string) {
		Config.cssSelector("#meritrating").click();
		WebElement merit = Config.cssSelector("[value='Bonus 1']");
		assertEquals(string,merit.getText());
		merit.click();		
	}

	@Entao("marco o campo Damage Insurance {string}")
	public void marco_o_campo_Damage_Insurance(String string) {
		Config.cssSelector("#damageinsurance").click();
		WebElement damage = Config.cssSelector("[value='No Coverage']");
		assertEquals(string,damage.getText());
		damage.click();	
	}

	@Entao("seleciono o campo Optional Products {string}")
	public void seleciono_o_campo_Optional_Products(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#EuroProtection"));
        input.click();
	}

	@Entao("marco o campo {string}")
	public void marco_o_campo(String string) {
		Config.cssSelector("#courtesycar").click();
		WebElement cortesia = Config.cssSelector("[value='No']");
		assertEquals(string,cortesia.getText());
		cortesia.click();		
	}

	@Entao("clico no botao next select price option")
	public void clico_no_botao_next_select_price_option() {
		WebElement input = browser.findElement(Config.cssSelector("#nextselectpriceoption"));
		input.click();
	}

	@Entao("seleciono o campo Platinum")
	public void seleciono_o_campo_Platinum() {
		WebElement input = browser.findElement(Config.cssSelector("#selectgold"));
		input.click();
	}

	@Entao("clico no botao next send quote")
	public void clico_no_botao_next_send_quote() {
		WebElement input = browser.findElement(Config.cssSelector("#nextsendquote"));
		input.click();
	}

	@Entao("preencho o campo email {string}")
	public void preencho_o_campo_email(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#email"));
        input.sendKeys(string);
	}

	@Entao("preencho o campo phone {string}")
	public void preencho_o_campo_phone(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#phone"));
        input.sendKeys(string);
	}

	@Entao("preencho o campo username {string}")
	public void preencho_o_campo_username(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#username"));
        input.sendKeys(string);
	}

	@Entao("preencho o campo senha {string}")
	public void preencho_o_campo_senha(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#password"));
        input.sendKeys(string);
	}

	@Entao("confirmo a senha {string}")
	public void confirmo_a_senha(String string) {
		WebElement input = browser.findElement(Config.cssSelector("#confirmpassword"));
        input.sendKeys(string);
	}

	@Entao("clico no botao send")
	public void clico_no_botao_send() {
		WebElement input = browser.findElement( Config.cssSelector("#sendemail")).click();
	}

	@Entao("eu devo ver a popup de sucesso")
	public void eu_devo_ver_a_popup_de_sucesso() throws InterruptedException {
		Thread.sleep(8000);
        WebElement input = browser.findElement( By.cssSelector("") );
        assertEquals(true, Config.cssSelectors(".showSweetAlert").size()>0);
        browser.quit();
	}

	
}