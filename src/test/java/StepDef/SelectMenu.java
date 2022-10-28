package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {
    WebDriver driver;

    @Given("User go to “https:\\/\\/demoqa.com\\/select-menu”")
    public void user_go_to_https_demoqa_com_select_menu() {
        System.setProperty("webdriver.chrome.drive","C://Users//Calvin Nurcahya/IdeaProjects/ui Automation/driver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        throw new io.cucumber.java.PendingException();
    }

    @When("User in “select menu” page")
    public void user_in_select_menu_page() {
        driver.findElement(By.xpath("//div/div[text()='Select Option']")).isDisplayed();
        driver.findElement(By.xpath("//div/div[text()='Select Option']")).click();
        throw new io.cucumber.java.PendingException();
    }

    @When("User choose select value “Another root option”")
    public void user_choose_select_value_another_root_option() {
        Select dropVal = new Select( driver.findElement(By.xpath("//div/div[text()='Select Option']")));
        dropVal.selectByVisibleText("Another root option");
        throw new io.cucumber.java.PendingException();
    }

    @When("User choose select one “Other”")
    public void user_choose_select_one_other() {
        driver.findElement(By.xpath("//div/div[text()='Select Title']")).isDisplayed();
        driver.findElement(By.xpath("//div/div[text()='Select Title']")).click();
        Select dropVal = new Select(driver.findElement(By.xpath("//div/div[text()='Select Title']")));
        dropVal.selectByVisibleText("Other");
        throw new io.cucumber.java.PendingException();
    }

    @When("User choose old style select menu “Aqua”")
    public void user_choose_old_style_select_menu_aqua() {
        driver.findElement(By.xpath("//select[@id='oldSelectMenu']")).isDisplayed();
        driver.findElement(By.xpath("//select[@id='oldSelectMenu']")).click();
        Select dropVal = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
        dropVal.selectByVisibleText("Aqua");
        throw new io.cucumber.java.PendingException();
    }

    @When("User choose multi select drop down “all color”")
    public void user_choose_multi_select_drop_down_all_color() {
        driver.findElement(By.xpath("//div/div[text()='Select...']")).isDisplayed();
        driver.findElement(By.xpath("//div/div[text()='Select...']")).click();
        Select dropVal = new Select(driver.findElement(By.xpath("//div/div[text()='Select...']")));
        dropVal.selectByVisibleText("Green");
        dropVal.selectByVisibleText("Blue");
        dropVal.selectByVisibleText("Black");
        dropVal.selectByVisibleText("Red");
        throw new io.cucumber.java.PendingException();
    }

    @Then("User success input all select menu")
    public void user_success_input_all_select_menu() {
        driver.quit();
        driver.close();
        throw new io.cucumber.java.PendingException();
    }
}
