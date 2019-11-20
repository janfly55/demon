package jumbo.jo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class jaan {

	String str;
@Given("^type hello word$")
public void type_hello_word() throws Throwable {
   str = "Hello World";
}

@When("^execute the code$")
public void execute_the_code() throws Throwable {
System.out.println(str);
}

@Then("^hello word must be displayed in console$")
public void hello_word_must_be_displayed_in_console() throws Throwable {
   System.out.println("success");
}

}
