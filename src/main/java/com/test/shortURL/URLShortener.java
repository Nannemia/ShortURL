package com.test.shortURL;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.test.shortURL.App;

@Component
public class URLShortener {
	Map<Integer, String> map = new HashMap<>();
	int i = 1;

	/**
	 * This method will return the shortURL
	 * If url already exists return the old mapping otherwise return new mapping
	 * 
	 * @param url
	 * @return
	 */
	public String getShortUrl(String url) {
		String retval = null;
		//check if the url already exists
		if (map.containsValue(url)) {
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				if (Objects.equals(entry.getValue(), url)) {
					retval = App.HOST_NAME + entry.getKey();
					break;
				}
			}
		} else {
			//add the url and return short url
			map.put(i, url);
			retval = App.HOST_NAME + i++;
		}
		return retval;
	}

	/**
	 * This method will return original URL
	 * 
	 * @param shortUrl
	 * @return
	 */
	public String getUrl(String shortUrl) {
		return map.get(Integer.valueOf(shortUrl.replace(App.HOST_NAME, "")));
	}

	/**
	 * This method will return the original URL
	 * 
	 * @param id
	 * @return
	 */
	public String getUrl(Integer id) {
		return map.get(id);
	}
}
