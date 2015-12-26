package com.chautha.webside.webapp;

import com.chautha.dal.entities.Article;
import com.chautha.services.ArticleCategoryTagServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Rewati Raman
 */
@Service
public class FrontendControllerIml implements FrontendController {

	@Autowired
	private ArticleCategoryTagServices articleCategoryTagServices;

	public String getHome() {
		return "article";
	}

	public String getCategory(@PathVariable String category) {
		return null;
	}

	public String getArticle(@PathVariable String uuid, @PathVariable String url,ModelMap model) {
		Article article = articleCategoryTagServices.getArticleByUrlString(uuid,url);
		model.addAttribute(article);
		return "article";
	}
}
