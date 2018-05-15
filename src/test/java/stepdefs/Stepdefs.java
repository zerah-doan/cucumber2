package stepdefs;

import config.Config;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import pages.GooglePage;
import webdriver.WebDriverManager;

public class Stepdefs implements En {
    GooglePage ggPage;

    public Stepdefs() {
        Given("^I open google search$", () -> {
            WebDriverManager.getDriver().get(Config.getProperty("url"));
            ggPage = new GooglePage();
            ggPage.searchFragment.search("aaaaaa");
        });
        When("^I enter keyword as following$", () -> {
            System.out.println("I enter keyword as following");
        });
        Then("^I see web results$", () -> {
            System.out.println("I see web results");
        });
        When("^I enter image name as following$", () -> {
            System.out.println("I enter image name as following");
        });
        Then("^I see image results$", () -> {
            System.out.println("I see image results");
        });
        When("^I test$", () -> {
            System.out.println("I test");
        });
        Given("^I open yahoo search$", () -> {
            WebDriverManager.getDriver().get(Config.getProperty("link"));
            System.out.println("TagB");
        });
        When("^I click result number $", () -> {


        });
        When("^I click result number ([^\"]*)$", (Object arg0) -> {
            System.out.println(arg0);
        });
    }
}
