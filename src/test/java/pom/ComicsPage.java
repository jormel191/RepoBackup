package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ComicsPage extends BasePage{


    @FindBy(xpath = "//h1[@class='page-title']")
    private WebElement pageTitle;

    private String TitlePage ="Category: comics";


    public ComicsPage(WebDriver driver){
        super(driver);

    }

    public boolean isTitleComicsDisplayed() throws Exception {
        return this.isDisplayed(pageTitle) && this.getText(pageTitle).equals(TitlePage);
    }
}
