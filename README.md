# Cucumber Selenium Java Starter
This repository contains a sample starting point for using Cucumber with Selenium and installed via Maven.

Follow the instructions below to get setup...

## Technologies
 - Java
 - Cucumber JVM
 - Selenium
 - Maven
 - Chrome

## Dependency Jars
 - cucumber-java
 - cucumber-junit
 - junit
 - selenium-api
 - selenium-chrome-driver

## Prerequisities
I suggest using Maven 3.6.3 and Java 1.8 for testing this, as these were the versions it was built with. Newer or older versions might work.

## Installation and Execution

1. Right now, the repository expects a local chromedriver to be utilized. The chromedriver can be downlaoded here: https://chromedriver.chromium.org/downloads
2. Make sure that Maven is installed, and run `mvn test`. Maven should download all the appropriate dependencies and run the tests


## Creation steps
The steps to create this repository were primarily around following the quick setup guide provided by Cucumber here: https://cucumber.io/docs/guides/10-minute-tutorial/#verify-cucumber-installation

### Folder Structure

Afterward, best practice suggests having three primary folders to collect all of the BDD code and feature files:
 - step_definitions - A folder where all the Givens, Whens, and Thens are written as step definitions, along with the World hooks
 - support - A folder for all utility-esque code to help DRY up the step definitions and help create adapters
  - features - A resource folder for all of the feature files to be referenced

### World Hooks
The world hooks are started to be implemented in World.java. There is currently a Before and After hook that setup and destroy Selenium between each scenario. (This can be changed to be BeforeAll and AfterAll if it makes sense based on the size of the codebase and number of tests that exist for performance).


### Common Steps
There is a finite list of steps that we use for our BDD tests. We call them our "common steps," since they should be very commonly used across all of our scenarios. 

### Imperative vs Declarative
Imperative and Declarative are two different styles of writing BDDs. Read the difference between them here: https://cucumber.io/docs/bdd/better-gherkin/#consider-a-more-declarative-style

Yes, they suggest using the declarative style. But, We use the imperative style (as opposed to the declaritive style) of writing Gherkin for the following reasons:
 - A finite list of consistently used stable steps are created and maintained. 
 - With the declartive style, a new step definition will need to be written for every new scenario of a feature, which is a significant amount of additional work. There is significantly less automation code to write and maintain with imperative.
 - The team understands what the expectation of each step is. There is 0 confusion on what a BDD is validating.

## Suggested Cucumber Common Steps to implement
Below is a list of common steps to be utilized in feature files, where possible:

### Given
 - the user navigates to {path}
   - Start the test case at the path
 - the user signs in with {username} and {password}
   - Switch to the specified user for logging in
 - the user is unauthenticated
   - Verifies the user is logged out
 
### When
 - the user goes to {path}
   - Navigate to a specific path
 - the user clicks on {field}
   - Click on a specific field or element
 - the user sets {field} to {value}
   - Set an input field to the specified value
 - the user enters the following data
   - Set multiple input fields to the specified values
 - the user leaves {field}
   - Mouse click away from a field (blur event)
 - the user reloads the page
   - Reload the current page

##3 Then
 - the route {path} loads
   - Validate the route finishes loading
 - the modal {modal} loads
   - Verify a modal by name appears
 - the user sees {element}
   - Verify an element has appeared on the screen
 - the user does not see {element}
   - Verify an element does not appear on the screen
 - the user sees the following elements
   - Verify multiple elements appear on the screen
 - the user does not see the following elements
   - Verify multiple elements do not appear on the screen
 - the user sees the text {text}
   - Verify text is visible on the screen
 - the user sees the following text
   - Verify multiple text items are visible on the screen
 - the user sees the anchor {element} which links to {url}
   - Verify an anchor tag is defined correctly with an URL
 - the user sees a screen that looks like {image id}
   - Verify a pdiff image looks correct of the entire screen
 - the user verifies the image of {image id}
   - Verify a pdiff image looks correct of an element
 - the user verifies the image of {image id} from element {element id}
   - Verify a pdiff image with a different image id for an element
 - the user sees {field} disabled
   - Check to see if the field is disabled (has a disabled attribute)
 - the user sees {field} enabled
   - Check to see if the field is enabled (has no disabled attribute)
 - the user sees the following fields disabled
   - Check to see if the field is disabled (has a disabled attribute)
 - the user sees the following fields enabled
   - Check to see if the field is enabled (has no disabled attribute)

## Suggested Backlog Items
 - Finish writing common steps
 - Generate cucumber report and take screenshots after failed tests
 - Figure out tagging strategy
   - Each feature scenario can get a unique tag, useful for identification
   - Have some type of tag to denote a test is not working and disable it (i.e. @broken is what I generally use)
   - Enable retry of given, when, and then actions that commonly fail or are flaky
 - Implement rerunning of scenarios to prune false negatives
 - Implement Perceptual Differences (Optional, Advanced)
 - Optimize world hooks for maximizing Selenium
 - Enable parallel tests to run at the same time
 - Any additional code quality tools to verify test code quality