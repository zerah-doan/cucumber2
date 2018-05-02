package stepdefs;

import config.Config;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.Formatter;
import gherkin.formatter.model.*;
import webdriver.WebDriverFactory;
import webdriver.WebDriverManager;

import java.util.List;

public class Hooks implements Formatter {
    @Before
    public void before() {
        WebDriverManager.setWebDriver(WebDriverFactory.createInstance(Config.getProperty("browser")));
    }

    @After
    public void after() {
        WebDriverManager.dismissWebDriver();
    }

    @Override
    public void syntaxError(String s, String s1, List<String> list, String s2, Integer integer) {
        System.out.println("syntaxError");
    }

    @Override
    public void uri(String s) {
        System.out.println("uri");
    }

    @Override
    public void feature(Feature feature) {
        System.out.println("feature");
    }

    @Override
    public void scenarioOutline(ScenarioOutline scenarioOutline) {
        System.out.println("scenarioOutline");
    }

    @Override
    public void examples(Examples examples) {
        System.out.println("examples");
    }

    @Override
    public void startOfScenarioLifeCycle(Scenario scenario) {
        System.out.println("startOfScenarioLifeCycle");
    }

    @Override
    public void background(Background background) {
        System.out.println("background");
    }

    @Override
    public void scenario(Scenario scenario) {
        System.out.println("scenario");
    }

    @Override
    public void step(Step step) {
        System.out.println("step");
    }

    @Override
    public void endOfScenarioLifeCycle(Scenario scenario) {
        System.out.println("endOfScenarioLifeCycle");
    }

    @Override
    public void done() {
        System.out.println("done");
    }

    @Override
    public void close() {
        System.out.println("close");
    }

    @Override
    public void eof() {
        System.out.println("eof");
    }
}
