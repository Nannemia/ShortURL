package com.test.shortURL;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class URLShortenerTest {

	URLShortener shortner = new URLShortener();

	@Test
	public void getShortUrl() throws Exception {
		String url = "http://test.com";
		String shortUrl = shortner.getShortUrl(url);
		assertEquals(url, shortner.getUrl(shortUrl));
	}

	@Test
	public void getShortUrlTest2() throws Exception {
		assertNull(shortner.getUrl(App.HOST_NAME + "0"));
	}
}
