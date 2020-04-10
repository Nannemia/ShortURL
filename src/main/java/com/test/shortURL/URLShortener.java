package com.test.shortURL;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.test.shortURL.App;

@Component
public class URLShortener {
	Map<Integer, String> map = new HashMap<>();
	int i = 1;	

	public String getShortUrl(String url) {
		map.put(i, url);
		return App.HOST_NAME + i++;
	}

	public String getUrl(String shortUrl) {
		return map.get(Integer.valueOf(shortUrl.replace(App.HOST_NAME, "")));
	}

	public String getUrl(Integer id) {
		return map.get(id);
	}
}
