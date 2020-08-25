package starter.step_definitions;

import static org.junit.Assert.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import starter.support.SeleniumUtil;

public class World {
    @Before
    public void before(Scenario scenario) {
        SeleniumUtil.openBrowser();
    }

    @After
    public void after(Scenario scenario) {
        SeleniumUtil.closeBrowser();
    }
}
