package com.bptn.CucumberAutomation.cucumberRunners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//@SelectClasspathResource("com/bptn/CucumberAutomation/example.feature")
//@SelectClasspathResource("com/bptn/CucumberAutomation/calculator.feature")
//@SelectClasspathResource("com/bptn/CucumberAutomation/strongPassword.feature")
//@SelectClasspathResource("com/bptn/CucumberAutomation/signUp.feature")
//@SelectClasspathResource("com/bptn/CucumberAutomation/login.feature")
@SelectClasspathResource("com/bptn/CucumberAutomation/shoppingCart.feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.bptn.CucumberAutomation")
//@IncludeTags("ValidUserInformation")
public class RunCucumberTest {
}