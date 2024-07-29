package Test_Runner2;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//We Need Cucumber Options   // what is  Cucumber Options? Cucumber Options need some option to run our test
@CucumberOptions(features = {"src/test/resourcess/OurFeature_File"},
plugin = {"json:target/cucumber.json"}, // this plugin given by cucumber we cant change it
glue = "Step_definition")//tags = {"@Sanity"}) //tag in framework
public class Our_Test2 extends AbstractTestNGCucumberTests {//cucumber giving us AbstractTestNGCucumberTests class //extends for child cls



}
