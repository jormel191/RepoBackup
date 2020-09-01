package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class test extends TestBase {



    @Given("The user is on the HOME page of imalittletester")
    public void userFindHomePage() throws Exception {

        Assert.assertTrue(homePage.homePageIsDisplayed());

    }

    @When("Click on the button The litter tester comics")
    public void clickbottonLitter() throws Exception {
        homePage.clickOnTitleComics();

    }

    @Then("It should be directed to the comics screen")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Exception {


        Assert.assertTrue(comicsPage.isTitleComicsDisplayed(), "No se redirecciono correctamente a la pagina");

    }
}
