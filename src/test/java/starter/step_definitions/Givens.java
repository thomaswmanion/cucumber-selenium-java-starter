package starter.step_definitions;

import io.cucumber.java.en.Given;
import static org.junit.Assert.*;
import starter.support.SeleniumUtil;

public class Givens {

    @Given("the user navigates to {string}")
    public void theUserNavigatesTo(String url) {
        SeleniumUtil.navigateTo(url);
    }
}
