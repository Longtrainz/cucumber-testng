package steps;

import static context.RunContext.RUN_CONTEXT;

import org.testng.Assert;

import impl.ArticleServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import service.ArticleService;


public class ArticleSteps {
	ArticleService articleService = new ArticleServiceImpl();


	@Given("Get Articles {string} Request")
	public void getArticlesRequest(String url) {
		articleService.getArticles(url);
	}

	@Then("Response code is: {string}")
	public void responseCodeIs(String status) {
		Response response = RUN_CONTEXT.get("response", Response.class);
		int actualStatus = response.statusCode();
		int expectStatus = Integer.parseInt(status);
		Assert.assertEquals(actualStatus, expectStatus);
	}

}
