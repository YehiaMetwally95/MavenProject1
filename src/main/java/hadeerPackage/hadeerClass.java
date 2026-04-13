package hadeerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class hadeerClass {

    public static void main(String[] args) {
        // Install the Latest Version of Browser Driver
        // Install the Latest Version of Browser
        // Open the Browser Window
        WebDriver driver = new ChromeDriver ();

        // Go to Google URL
        driver.get("https://www.google.com");



        // Find the Search Field Locator by name attribute and then store it in "By variable"
        By searchFieldLocator = By.name("q");

        // Give the Search field locator to Selenium Driver to Find the Search Field WebElement
        WebElement searchField = driver.findElement(searchFieldLocator);

        // Take the Type Action on Search Field WebElement
        searchField.sendKeys("Yehia Metwally");



        // Find the Search Button Locator by xPath attribute and then store it in "By variable"
        By searchButtonLocator = By.xpath("(//input[@name =\"btnK\"])[2]");

        // Give the Search Button locator to Selenium Driver to Find the Search Button WebElement
        WebElement searchButton = driver.findElement(searchButtonLocator);

        // Take the Click Action on Search Button WebElement
        searchButton.click();



        // Wait Until the Search Result Page is Loaded
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        // Find the Result Locator by xPath attribute and then store it in "By variable"
        By searchResultLocator1 = By.xpath("(//h3)[1]");
        By searchResultLocator2 = By.xpath("(//h3)[2]");
        By searchResultLocator3 = By.xpath("(//h3)[3]");
        By searchResultLocator4 = By.xpath("(//h3)[4]");

        // Give the Search Result locator to Selenium Driver to Find the Search Result WebElement
        WebElement searchResult1 = driver.findElement(searchResultLocator1);
        WebElement searchResult2 = driver.findElement(searchResultLocator2);
        WebElement searchResult3 = driver.findElement(searchResultLocator3);
        WebElement searchResult4 = driver.findElement(searchResultLocator4);

        // Take the Read Text Action on Search Button WebElement
        String searchResult1Text = searchResult1.getText();
        String searchResult2Text = searchResult2.getText();
        String searchResult3Text = searchResult3.getText();
        String searchResult4Text = searchResult4.getText();
        System.out.println(searchResult1Text);
        System.out.println(searchResult2Text);
        System.out.println(searchResult3Text);
        System.out.println(searchResult4Text);

        // Compare between Actual and Expected, Where the Actual Text "searchResult1Text" contains the Expected Text "Yehia Metwally"
        Assert.assertTrue(searchResult1Text.contains("Yehia Metwally"));
        Assert.assertTrue(searchResult2Text.contains("Yehia Metwally"));
        Assert.assertTrue(searchResult3Text.contains("Yehia Metwally"));
        Assert.assertTrue(searchResult4Text.contains("Yehia Metwally"));
    }
}
