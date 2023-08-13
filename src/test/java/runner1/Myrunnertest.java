package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resource/features1",
                  glue="stepdefinition1",
                  plugin="pretty"
                  )
public class Myrunnertest extends AbstractTestNGCucumberTests {

}
