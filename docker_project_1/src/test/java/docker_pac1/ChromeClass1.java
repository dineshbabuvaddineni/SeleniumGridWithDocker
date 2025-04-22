package docker_pac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeClass1 {
	@Test
	public void test1() throws Throwable {
		ChromeOptions ch = new ChromeOptions();
		//EdgeOptions options = new EdgeOptions();
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,ch);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.quit();
		
	}

}

