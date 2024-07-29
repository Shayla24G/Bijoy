package Step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OUR_Step {


	@Given("^Open fisrt application$")
	public void open_fisrt_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Chrome_Driver\\chromedriver.exe");
		
		ChromeOptions eb = new ChromeOptions();
		eb.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		
}

	@Then("^Enter to the monitor feild$")
	public void enter_to_the_monitor_feild() throws Throwable {
    
}
}
