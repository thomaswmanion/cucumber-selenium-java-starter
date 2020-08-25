package starter.step_definitions;

import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import starter.support.SeleniumUtil;

public class Thens {

    @Then("the user sees {string}")
    public void theUserSees(String elementLabel) throws Exception {
        SeleniumUtil.verifyUserSees(elementLabel);
    }
}
