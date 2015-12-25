package com.chautha.webside.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rewati Raman
 */
@Controller
@RequestMapping("")
public interface FrontendController {

	@RequestMapping("")
	String getHome();

	@RequestMapping("category/.../{category}")
	String getCategory(String category);

	@RequestMapping("article/{url}/{uuid}")
	String getArticle(String uuid,String url);
}
