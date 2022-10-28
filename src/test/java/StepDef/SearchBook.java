package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBook {
    WebDriver driver;
    @Given("User go to “https:\\/\\/demoqa.com\\/books”")
    public void userGoToHttpsDemoqaComBooks() {
        System.setProperty("webdriver.chrome.drive","C://Users//Calvin Nurcahya/IdeaProjects/ui Automation/driver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();
        throw new io.cucumber.java.PendingException();
    }

    @When("User in “Book Store” page")
    public void userInBookStorePage() {
        driver.findElement(By.xpath("//div[@class='main-header']")).isDisplayed();
        String title =   driver.findElement(By.xpath("//div[@class='main-header']")).getText();
        if(title.equals("true") )
        {
           System.out.println("sukses");
        }else
        {
            System.out.println("gagal");
        }
    }

    @And("User search book “qa engineer”")
    public void userSearchBookQaEngineer() {
        driver.findElement(By.xpath("//input[@id='searchBox']")).isDisplayed();
        driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("qa engineer");
    }

    @Then("User see “No rows found”")
    public void userSeeNoRowsFound() {
        driver.findElement(By.xpath("//div[@class='rt-noData']")).isDisplayed();
        String text =  driver.findElement(By.xpath("//div[@class='rt-noData']")).getText();
        if(text.equals("true") )
        {
            System.out.println("sukses");
        }else
        {
            System.out.println("gagal");
        }
        driver.quit();
        driver.close();
    }
}
