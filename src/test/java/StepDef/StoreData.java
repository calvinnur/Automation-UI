package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class  store {
    String title;
    String author;
    String publisher;
}

public class storeData {
    WebDriver driver;

    @Given("User go to “https:\\/\\/demoqa.com\\/books”")
    public void userGoToHttpsDemoqaComBooks() {
        System.setProperty("webdriver.chrome.drive","C://Users//Calvin Nurcahya/IdeaProjects/ui Automation/driver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();
    }

    @When("User in “Book Store” page")
    public  void userInBookPage () {
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
    @And("User search book “Git Pocket Guide”")
    public void userSearchBookGitPocketGuide() {
        driver.findElement(By.xpath("//input[@id='searchBox']")).isDisplayed();
        driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("Git Pocket Guide");
    }

    @And("User click book “Git Pocket Guide”")
    public void userClickBookGitPocketGuide() {
        store data = new store();

        WebElement books = driver.findElement(By.xpath("//div/span[contains(@id,'see-book')]/a"));

        WebElement author = driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div/div[3])"));

        WebElement publisher = driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div/div[4])"));

        data.title = books.getText();

        data.author = author.getText();

        data.publisher = publisher.getText();

        if(data.title == "Git Pocket Guide")
        {
            driver.findElement(By.xpath("//div/span[contains(@id,'see-book')]/a")).click();
        }

    }

    @Then("User see “Git Pocket Guide”")
    public void userSeeGitPocketGuide() {
        store data = new store();
        String title = driver.findElement(By.xpath("//div[@id='title-wrapper']/div/label[@id='userName-value']")).getText();

        String author = driver.findElement(By.xpath("//div[@id='author-wrapper']/div/label[@id='userName-value']")).getText();

        String publisher = driver.findElement(By.xpath("//div[@id='publisher-wrapper']/div/label[@id='userName-value']")).getText();

        if(data.title  == title  && data.author == author &&  data.publisher  == publisher)
        {
            System.out.println("sukses");
        }else {
            System.out.println("gagal");
        }
    }
}






