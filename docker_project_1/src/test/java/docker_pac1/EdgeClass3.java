package docker_pac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EdgeClass3 {
	
	@Test
	public void test3() throws Throwable{
		//ChromeOptions ch = new ChromeOptions();
		EdgeOptions ed = new EdgeOptions();
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,ed);
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.quit();
		
	}

}

