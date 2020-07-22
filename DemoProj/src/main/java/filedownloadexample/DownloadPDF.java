package filedownloadexample;

import java.util.HashMap;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


public class DownloadPDF {


static WebDriver driver;


public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\seleni\\drivers\\chromedriver_win32\\chromedriver.exe");

String downloadFilePath = "C:\\PDFDownloads";

HashMap<String, Object> chromePref = new HashMap<String, Object>();

chromePref.put("profile.default_content_settings.popups", 0);


chromePref.put("download.prompt_for_download", "True");
chromePref.put("download.directory_upgrade","True");
chromePref.put("download.safebrowsing.enabled","True");

chromePref.put("download.default_directory", downloadFilePath);

ChromeOptions options = new ChromeOptions();

options.setExperimentalOption("prefs", chromePref);

driver = new ChromeDriver(options);

driver.get("https://www.seleniumhq.org/download/");

driver.findElement(By.xpath("/html/body/div[2]/div[2]/p/a[1]")).click();


Thread.sleep(3000);

driver.close();

}
}