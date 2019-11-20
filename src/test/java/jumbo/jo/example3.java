package jumbo.jo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class example3 {
	@Given("^User must be in the login page$")
	public void user_must_be_in_the_login_page() throws Throwable {
	 System.out.println("USER IS IN THE LOGIN PAGE!!");
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		 System.out.println("LOGIN USING "+arg1+" and"+arg2);
	}

	@When("^performs login$")
	public void performs_login() throws Throwable {
		 System.out.println("click on the login button"); 
	}

	@Then("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		 System.out.println("user is in the home page");
		 System.out.println("****************************");
	}
}
