package com.bptn.CucumberAutomation.provider;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import com.bptn.CucumberAutomation.factory.YamlPropertySourceFactory;

import org.springframework.beans.factory.annotation.Value;

@Component
@PropertySource(value = "classpath:config.yml", factory = YamlPropertySourceFactory.class)
public class ResourceProvider {
	
    @Value("${test.url}")
    private String url;
    
    @Value("${test.browser}")
    private String browser;

    @Value("${test.default.timeout}")
    private String timeout;

    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	
    
}