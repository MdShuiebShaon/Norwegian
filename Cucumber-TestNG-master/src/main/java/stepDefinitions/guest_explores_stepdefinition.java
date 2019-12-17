package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

import Properties.guest_explores_propertise;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class guest_explores_stepdefinition implements guest_explores_propertise{

	WebDriver driver;


	@Given("^User is navigated to home Page$")
	public void User_is_navigated_to_home_page(){
		System.setProperty("webdriver.chrome.driver","src//test//resoure//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ncl.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}


	@And("^User navigated to Shore Excursion page$")
	public void User_navigated_to_Shore_Excursion_page() throws InterruptedException{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@class='linkNav' and @title='Explore']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Shore Excursions']")).click();

	}


	@When("^User search for destination Alaska Cruises$")
	public void User_search_for_destination_Alaska_Cruises() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='search_destinations_chosen']//a[@class='chosen-single']")).click();
		driver.findElement(By.xpath("//div[@id='search_destinations_chosen']//input[@class='chosen-search-input']")).sendKeys("Alaska Cruises");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn-cta btn-primary btn-large search-submit']")).click();
	}

	@Then("^Shore Excursions page is present$")
	public void Shore_Excursions_page_is_present() {

		String getTitel = driver.getTitle();
		System.out.println("Get titel is" + getTitel);
		String ActuaTitel = "Shore Excursions | Norwegian Cruise Line";
		Assert.assertEquals(getTitel, ActuaTitel);
	}


	@And("^Results are filtered by Alaska Cruises$")
	public void Results_are_filtered_by_Alaska_Cruises() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Destination')]")).click();

		driver.findElement(By.xpath("//label[contains(text(),'Alaska Cruises')]")).click();

		WebElement AlaskaCruises= driver.findElement(By.xpath("//span[@class='items-text']"));
		Assert.assertEquals("Alaska Cruises", AlaskaCruises.getText());
	}

	@Then("^Filter By Ports are only belong to Alaska, British Columbia$")
	public void Filter_By_Ports_are_only_belong_to_Alaska_British_Columbia() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Port')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Port')]")).click();

		WebElement VicBrishColumbia = driver.findElement(By.xpath(VicBrishColumbia_Name));
		Assert.assertEquals("Victoria, British Columbia", VicBrishColumbia.getText());


	}



	@Then("^Close the browser$")
	public void close_the_browser(){
		driver.quit();
	}




}
