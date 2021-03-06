package io.testproject.generated.tests.xattaxgrouptestcases;

import io.testproject.addon.VisibleElementsOperations;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * This class was automatically generated by TestProject
 * Project: Xattax-Group Test Cases
 * Test: TC-04-Xattax-Generate E-Way Bill
 * Generated by: Suganya Jothiprakash (suganya.sugan@sailotech.net)
 * Generated on Fri Dec 17 18:43:13 GMT 2021.
 */
public class Tc04xattaxgenerateEwayBill implements Test, ExceptionsReporter {
  public static WebDriver driver;

  /**
   * ApplicationURL test parameter
   */
  public String ApplicationURL = "http://175.101.240.71:9791/XATTAXEInvoice1.5/login";

  /**
   * Username test parameter
   */
  public String Username = "einvuser1";

  /**
   * Password test parameter
   */
  public String Password = "1234";

  /**
   * GeneratedInvoiceSearcField test parameter
   */
  public String GeneratedInvoiceSearcField = "1224";

  /**
   * Path test parameter
   */
  public String Path = "C:\\Users\\sukki\\Dropbox\\My PC (DESKTOP-A4GJKOM)\\Desktop\\Xattax Excel Files\\E_Invoice_XLSX_SampleData.xlsx";

  /**
   * ImportSearchInvoice test parameter
   */
  public String ImportSearchInvoice = "E_Invoice_SampleTemplate (9).xlsx";

  /**
   * SendEmail test parameter
   */
  public String SendEmail = "suganya.sugan@sailotech.net";

  /**
   * TransID test parameter
   */
  public String TransID = "01AMBPG7773M002";

  /**
   * TransName test parameter
   */
  public String TransName = "AFS";

  /**
   * Distance test parameter
   */
  public String Distance = "0";

  /**
   * VehicleNumber test parameter
   */
  public String VehicleNumber = "AP20AG1234";

  /**
   * TransDocNumber test parameter
   */
  public String TransDocNumber = "324";

  /**
   * TransDocDate test parameter
   */
  public String TransDocDate = "14/12/2021";

  /**
   * ShippingToLocation test parameter
   */
  public String ShippingToLocation = "Other country";

  /**
   * ShippingToAddress2 test parameter
   */
  public String ShippingToAddress2 = "Chandigargh";

  /**
   * ShippingPincode test parameter
   */
  public String ShippingPincode = "160001";

  /**
   * ShippingToAddress1 test parameter
   */
  public String ShippingToAddress1 = "Punjab";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    VisibleElementsOperations.TypeTextIfVisibleWeb typeTextIfVisibleWeb;
    VisibleElementsOperations.ClearContentsIfVisibleWeb clearContentsIfVisibleWeb;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Click 'Generate E-waybill'
    //    Click on Generate E-Way Bill in Menu Bar
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(1000);
    by = By.xpath("//button[. = 'Generate E-waybill']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 2. Click 'transId'
    //    Click on Trans ID Text Box
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transId");
    driver.findElement(by).click();

    // 3. Clear 'transId' contents
    //    Clear the Contents
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transId");
    driver.findElement(by).clear();

    // 4. Type '{{TransID}}' in 'transId'
    //    Enter the values for Trans ID
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transId");
    driver.findElement(by).sendKeys(TransID);

    // 5. Click 'transName'
    //    Click on Trans Name
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transName");
    driver.findElement(by).click();

    // 6. Clear 'transName' contents
    //    Clear the contents
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transName");
    driver.findElement(by).clear();

    // 7. Type '{{TransName}}' in 'transName'
    //    Enter the values for Trans Name
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transName");
    driver.findElement(by).sendKeys(TransName);

    // 8. Click 'INPUT2'
    //    Click on Distance Field
    GeneratedUtils.sleep(1000);
    by = By.xpath("//div[3]/div[3]/div/div/input");
    driver.findElement(by).click();

    // 9. Clear 'INPUT2' contents
    //    Clear the contents
    GeneratedUtils.sleep(1000);
    by = By.xpath("//div[3]/div[3]/div/div/input");
    driver.findElement(by).clear();

    // 10. Type '{{Distance}}' in 'INPUT2'
    //    Enter the value for the Distance
    GeneratedUtils.sleep(1000);
    by = By.xpath("//div[3]/div[3]/div/div/input");
    driver.findElement(by).sendKeys(Distance);

    // 11. Click 'transMode'
    //    Click on Trans Mode
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transMode");
    driver.findElement(by).click();

    // 12. Select the '1' option in 'transMode'
    //    Select the first option from Drop Down Menu
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transMode");
    (new Select(driver.findElement(by))).selectByValue("1");

    // 13. Click 'vehNo'
    //    Click on Vehicle Number
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#vehNo");
    driver.findElement(by).click();

    // 14. Clear the contents of 'vehNo' if it's visible
    //    Clear the contents
    GeneratedUtils.sleep(1000);
    clearContentsIfVisibleWeb = VisibleElementsOperations.clearContentsIfVisibleWeb("");
    by = By.cssSelector("#vehNo");
    clearContentsIfVisibleWeb = (VisibleElementsOperations.ClearContentsIfVisibleWeb)((ReportingDriver)driver).addons().execute(clearContentsIfVisibleWeb, by, -1);

    // 15. Type '{{VehicleNumber}}' in 'vehNo'
    //    Enter the value for Vehicle Number
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#vehNo");
    driver.findElement(by).sendKeys(VehicleNumber);

    // 16. Click 'transDocNo'
    //    Click on Trans Doc Number
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transDocNo");
    driver.findElement(by).click();

    // 17. Clear 'transDocNo' contents
    //    Clear the contents
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transDocNo");
    driver.findElement(by).clear();

    // 18. Type '{{TransDocNumber}}' in 'transDocNo'
    //    Enter the value for Trans Doc Number
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#transDocNo");
    driver.findElement(by).sendKeys(TransDocNumber);

    // 19. Click 'vehicle_Type'
    //    Click on Vehicle Type
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#vehicle_Type");
    driver.findElement(by).click();

    // 20. Select the 'R' option in 'vehicle_Type'
    //    Select the First option
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#vehicle_Type");
    (new Select(driver.findElement(by))).selectByValue("R");

    // 21. Click 'transDocDt'
    //    Click on Trans Doc Date
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transDocDt");
    driver.findElement(by).click();

    // 22. Clear 'transDocDt' contents
    //    Clear the contents
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transDocDt");
    driver.findElement(by).clear();

    // 23. Type '{{TransDocDate}}' in 'transDocDt'
    //    Enter the values for Trans Doc Date
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transDocDt");
    driver.findElement(by).sendKeys(TransDocDate);

    // 24. Send 'ENTER' key(s)
    //    Press the enter key
    GeneratedUtils.sleep(1000);
    by = By.cssSelector("#transDocDt");
    (new Actions(driver)).sendKeys(GeneratedUtils.getKeys("ENTER")).build().perform();

    // 25. Click 'shippingLoc' if it's visible
    //    Click on shipping Location
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("#shippingLoc");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 26. Clear the contents of 'shippingLoc' if it's visible
    //    Clear the contents
    GeneratedUtils.sleep(500);
    clearContentsIfVisibleWeb = VisibleElementsOperations.clearContentsIfVisibleWeb("");
    by = By.cssSelector("#shippingLoc");
    clearContentsIfVisibleWeb = (VisibleElementsOperations.ClearContentsIfVisibleWeb)((ReportingDriver)driver).addons().execute(clearContentsIfVisibleWeb, by, -1);

    // 27. Type '{{ShippingToLocation}}' in 'shippingLoc' if visible
    //    Enter the value for shipping Location
    GeneratedUtils.sleep(500);
    typeTextIfVisibleWeb = VisibleElementsOperations.typeTextIfVisibleWeb(ShippingToLocation,"");
    by = By.cssSelector("#shippingLoc");
    typeTextIfVisibleWeb = (VisibleElementsOperations.TypeTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(typeTextIfVisibleWeb, by, -1);

    // 28. Click 'shippingStcd' if it's visible
    //    Click on shipping State code
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("#shippingStcd");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 29. Select the '4' option in 'shippingStcd'
    //    Select the shipping To State Code
    /* Step is disabled
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#shippingStcd");
    (new Select(driver.findElement(by))).selectByValue("4");
    */
    // 30. Click 'shippingAddress2' if it's visible
    //    Click on Shipping Address
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("#shippingAddress2");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 31. Type '{{ShippingToAddress2}}' in 'shippingAddress2' if visible
    //    Enter the value for shipping To Address
    GeneratedUtils.sleep(500);
    typeTextIfVisibleWeb = VisibleElementsOperations.typeTextIfVisibleWeb(ShippingToAddress2,"");
    by = By.cssSelector("#shippingAddress2");
    typeTextIfVisibleWeb = (VisibleElementsOperations.TypeTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(typeTextIfVisibleWeb, by, -1);

    // 32. Click 'shippingPin' if it's visible
    //    Click on Shipping Pin code
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("#shippingPin");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 33. Type '{{ShippingPincode}}' in 'shippingPin' if visible
    //    Enter the values for shipping PinCode
    GeneratedUtils.sleep(500);
    typeTextIfVisibleWeb = VisibleElementsOperations.typeTextIfVisibleWeb(ShippingPincode,"");
    by = By.cssSelector("#shippingPin");
    typeTextIfVisibleWeb = (VisibleElementsOperations.TypeTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(typeTextIfVisibleWeb, by, -1);

    // 34. Click 'shippingAddress' if it's visible
    //    Click on Shipping To Address
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("#shippingAddress");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 35. Clear the contents of 'shippingAddress' if it's visible
    //    Clear the contents
    GeneratedUtils.sleep(500);
    clearContentsIfVisibleWeb = VisibleElementsOperations.clearContentsIfVisibleWeb("");
    by = By.cssSelector("#shippingAddress");
    clearContentsIfVisibleWeb = (VisibleElementsOperations.ClearContentsIfVisibleWeb)((ReportingDriver)driver).addons().execute(clearContentsIfVisibleWeb, by, -1);

    // 36. Type '{{ShippingToAddress1}}' in 'shippingAddress' if visible
    //    Enter the value of  ShippingAddress 
    GeneratedUtils.sleep(500);
    typeTextIfVisibleWeb = VisibleElementsOperations.typeTextIfVisibleWeb(ShippingToAddress1,"");
    by = By.cssSelector("#shippingAddress");
    typeTextIfVisibleWeb = (VisibleElementsOperations.TypeTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(typeTextIfVisibleWeb, by, -1);

    // 37. Click 'Generate E-waybill1'
    //    Click on Generate E-Way Bill Button
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(2000);
    by = By.xpath("//button[. = '\n										Generate\n										E-waybill\n									']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 38. Click '5002 - The field Name of the transpor...' if it's visible
    //    Click on The pop up Message 
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//div[. = ' 5002 - The field Name of the transporter must be a string with a minimum length of 3 and a maximum length of 100.  ']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 39. Click 'Get IRN Data' if it's visible
    //    Click on Get IRN Data Button
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(2000);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3000");
    by = By.xpath("//button[. = '\n						 Get IRN Data\n					']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 40. Click '??' if it's visible
    //    Click on Close Icon Button
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//div[2]/div/div/button[. = '??']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 41. Click 'Back' if it's visible
    //    Click on Back Button
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3000");
    by = By.xpath("//a[. = ' Back']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}
