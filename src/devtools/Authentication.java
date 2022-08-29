package devtools;

import java.net.URI;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.function.Predicate;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//predicate, consumer
		Predicate<URI> uriPredicate =uri ->  uri.getHost().contains("httpbin.org");
		
		((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("qfo", "bar"));
		driver.get("http://httpbin.org/basic-auth/foo/bar");
		
	}

}
