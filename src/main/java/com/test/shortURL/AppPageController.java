package com.test.shortURL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppPageController {
	URLShortener urlShortner = new URLShortener();

	/**
	 * Index page
	 * 
	 * @param url
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String index(@RequestParam(name = "url", required = false) String url, Model model) {
		if (url != null) {
			model.addAttribute("url", url);
			model.addAttribute("shortURL", urlShortner.getShortUrl(url));
		}
		return "index";
	}

	/**
	 * Short URL - redirects to the original URL
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/{id}")
	public String redirect(@PathVariable Integer id, Model model) {

		String url = urlShortner.getUrl(id);
		if (url == null) {
			model.addAttribute("errorMsg", "No mapping exists for URL: " + App.HOST_NAME + id);
			return "index";
		} else
			return "redirect:" + url;
	}

}
