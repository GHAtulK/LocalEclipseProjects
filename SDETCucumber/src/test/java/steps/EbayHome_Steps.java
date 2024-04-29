package steps;

import actions.Actions_eBayHomePage;
import actions.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {

	CommonActions commonActions;
	Actions_eBayHomePage ebayHomePageActions;

	public EbayHome_Steps(CommonActions commonActions, Actions_eBayHomePage ebayHomePageActions) {
		this.commonActions = commonActions;
		this.ebayHomePageActions = ebayHomePageActions;
	}

	@Given("I am on eBay Home Page")
	public void i_am_on_e_bay_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am on eBay Home Page");
		commonActions.goToUrl("https://www.ebay.com/");
		commonActions.maximizePage();
	}

	@When("I click on Advanced Link")
	public void i_click_on_advanced_link() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I clicked on Advanced Search Link");
		ebayHomePageActions.clickAdvancedLink();
	}

	@Then("I should navigate to Advanced Search Page")
	public void i_should_navigate_to_advanced_search_page() {
		// Write code here that turns the phrase above into concrete actions
		String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		String actUtl = commonActions.getCurrentPageUrl();
		if (!expUrl.equals(actUtl)) {
			System.out.println("Page does not navigate to expected page");
		}
	}
}
