
package reuseablePackage.reuseFunction;
import pom.releaseToTesting;
import reuseablePackage.feature.AllActions;
import org.openqa.selenium.WebDriver;
public class yashwanthKumarKCClass{
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public yashwanthKumarKCClass(ThreadLocal<WebDriver> driver) {

		this.driver=driver;
	}
	AllActions actions = new AllActions();
String user;
String password;
public void yashwanthKumarKC(String user,String password) throws Exception
{
actions.EnterApplicationURL("http://web.meehappy.com:9090/login");
actions.EnterData(new releaseToTesting(driver).userName,user);
actions.EnterData(new releaseToTesting(driver).userPassword,password);
actions.Click(new releaseToTesting(driver).userLogin);







}
}



































// package reuseablePackage.feature;

// import java.util.concurrent.TimeUnit;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import java.net.MalformedURLException;

// public class yashwanthKumarKCClass extends  AllActions {
// 	public static WebDriver driver;
	
// 	AllActions actionObject = new AllActions();
	
// 	}  
// }