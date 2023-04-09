package MainPackage.SeleniumChromeDriver.locators.sslcirtificatehandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariOptions;

public class SSLCertification {//SSL CERTIFICATION HANDLING
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.setAcceptInsecureCerts(true);
       /* AnotherWay To handle Certificate level issues
        co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);*/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver(co);
        wd.get("https://expired.badssl.com/");
        System.out.println(wd.getTitle());




        /**ChromeOptions co = new ChromeOptions();
        co.setAcceptInsecureCerts(true);

        EdgeOptions eo = new EdgeOptions();
        eo.setAcceptInsecureCerts(true);

        SafariOptions so = new SafariOptions();
        so.setAcceptInsecureCerts(true);

        InternetExplorerOptions io = new InternetExplorerOptions();
        io.setAcceptInsecureCerts(true);

         FirefoxOptions fo = new FirefoxOptions();
         fo.setAcceptInsecureCerts(True);

         all webdriver extends abstractDriverOption so all have same method

         **/



        Thread.sleep(3000);
        wd.close();
    }
}

