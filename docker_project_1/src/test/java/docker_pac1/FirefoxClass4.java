package docker_pac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxClass4 {
	@Test
	public void test4() throws Throwable {
		//EdgeOptions options = new EdgeOptions();
		FirefoxOptions fi = new FirefoxOptions();
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,fi);
		driver.get("https://blazedemo.com/ ");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.quit();
	}

}

