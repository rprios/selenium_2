package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
          plugin = {},
        features = "src/test/resources/features",
            tags = {"~@ignore"},
            glue = {"steps"}
)

public class RunCucumberTeste {

    @BeforeClass
    public static void start() {
        System.out.println("Iniciou");
    }

    @AfterClass
    public static void stop() {
        System.out.println("Finalizou");
    }



}
