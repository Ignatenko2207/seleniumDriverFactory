package org.itstep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import ru.stqa.selenium.factory.WebDriverFactory;

public class ThreadSel2 extends Thread {

	private static String webURL;

	public ThreadSel2(String webURL) {
		this.webURL = webURL;
	}

	public static WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		chrome.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new WebDriverFactory().getDriver(chrome);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		Timer.waitSeconds(3);
		driver.get(webURL);
		return driver;
	}
	
	@Override
	public void run() {
		WebDriver driver = getWebDriver();
		Timer.waitSeconds(20);
		driver.quit();
	}
}
