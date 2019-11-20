package jumbo.jo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class example4 {

@Given("^User is testing for the login funtionality$")
public void user_is_testing_for_the_login_funtionality() throws Throwable {
 System.out.println("login successfulll!!");  
}

@Then("^User able to login successfully$")
public void user_able_to_login_successfully() throws Throwable {
	 System.out.println("search for a product");  
}

@Given("^User is testing the search funtionality$")
public void user_is_testing_the_search_funtionality() throws Throwable {
	 System.out.println("search is successfulll!!");  
}

@Then("^search works successfully$")
public void search_works_successfully() throws Throwable {
	 System.out.println("search works successfully!!");  
}

@Then("^\"([^\"]*)\" is tester on testme app$")
public void is_tester_on_testme_app(String arg1) throws Throwable {
	 System.out.println(arg1+" is tester on testme app");  
}

}
