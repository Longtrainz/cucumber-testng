package impl;

import static context.RunContext.RUN_CONTEXT;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import api.Article;
import config.TestConfig;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import service.ArticleService;


@Log4j2
public class ArticleServiceImpl implements ArticleService {
	TestConfig testConfig = new TestConfig();

	@Override
	public List<Article> getArticles(String url) {
		String URL = testConfig.getURL() + url;

		List<Article> articles = new ArrayList<>();

		Response r = given()
				.get(URL);

		RUN_CONTEXT.put("response", r);

		try {
			articles = r.jsonPath().getList("articles.", Article.class);
		} catch (Exception e) {
			log.error("Articles request exception: "/* + Arrays.toString(e.getStackTrace())*/);
		}

		return articles;
	}
}
