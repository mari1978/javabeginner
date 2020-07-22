package filedownloadexample;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFiles_FireFoxProfile {
	static FirefoxDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		try {
		//System.setProperty("webdriver.gecko.driver","C:\\seleni\\drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver","/Users/murugesan.balusamy/seleni/ffdriver/geckodriver");
	    //Create FireFox Profile object
		FirefoxProfile profile = new FirefoxProfile();

		//Set Location to store files after downloading.
		//profile.setPreference( "browser.download.manager.showWhenStarting", false );
		//profile.setPreference("browser.download.folderList",2);
		//profile.setPreference("browser.download.dir","C:\\seleni\\");
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		//Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"); 
		 

		//profile.setPreference( "browser.download.manager.showWhenStarting", false );
		//profile.setPreference( "pdfjs.disabled", true );

		//Pass FProfile parameter In webdriver to use preferences to download file.
		//FirefoxDriver driver = new FirefoxDriver(profile);  
		
		//FirefoxOptions firefoxOptions = new FirefoxOptions();
        //firefoxOptions.setProfile(profile);
		
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("browser.download.folderList", 2);
		options.addPreference("browser.download.dir", "/Users/murugesan.balusamy/seleni/filedwnld");
		//options.addPreference("browser.download.useDownloadDir", true);
		//options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		//options.setPreference("pdfjs.disabled", true);  // disable the built-in PDF viewer
		
		
        driver = new FirefoxDriver(options);  
        
		// Open APP to download application
		//driver.get("https://toolsqa.com/automation-practice-form/"); 
        //driver.get("http://demoqa.com/upload-download");
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");
		// Click to download 
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/p/a[1]")).click(); 

		//Halting the execution for 5 secs to donwload the file completely
		Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		driver.quit();

	}

}