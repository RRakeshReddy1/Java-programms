package ConditionStatements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowHandle_Example {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");

		String ParentWindow = driver.getWindowHandle();

		driver.findElement(By.linkText("Privacy Policy")).click();

		Thread.sleep(2000);
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		// loop through all windows

		for (String handle : allWindows) {
			if (!handle.equals(ParentWindow)) {

				// Switch to the new window
				driver.switchTo().window(handle);

				// Print the title of the child window
				System.out.println("Child window Title : " + driver.getTitle());

				// Verify page title contains "Privacy"

				if (driver.getTitle().contains("privacy")) {
					System.out.println(" Privacy Policy page opened successfully!");
				} else
					System.out.println("Failed to open Privacy Policy page!");

				// close the child window
				driver.close();
			}
		}
		driver.switchTo().window(ParentWindow);
		System.out.println("Back to parent window" + driver.getTitle());
		driver.quit();
	}

}
