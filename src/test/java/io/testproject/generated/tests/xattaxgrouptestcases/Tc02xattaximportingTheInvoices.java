package io.testproject.generated.tests.xattaxgrouptestcases;

import io.testproject.addon.FileUpload;
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

/**
 * This class was automatically generated by TestProject
 * Project: Xattax-Group Test Cases
 * Test: TC-02-Xattax-Importing the Invoices
 * Generated by: Suganya Jothiprakash (suganya.sugan@sailotech.net)
 * Generated on Fri Dec 17 18:43:13 GMT 2021.
 */
public class Tc02xattaximportingTheInvoices implements Test, ExceptionsReporter {
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
   * Path test parameter
   */
  public String Path = "C:\\Users\\sukki\\Downloads\\E_Invoice_XLSX_SampleData.xlsx";

  /**
   * ImportSearchInvoice test parameter
   */
  public String ImportSearchInvoice = "E_Invoice_Nag.xlsx";

  /**
   * TransactionSummary test parameter
   */
  public String TransactionSummary = "";

  /**
   * RecordDetails test parameter
   */
  public String RecordDetails = "";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    VisibleElementsOperations.GetTextIfVisibleWeb getTextIfVisibleWeb;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;
    FileUpload.UploadFileElementAction uploadFileElementAction;

    // 1. Click 'Import e-Invoice'
    //    Click on Import Invoice in Menu Bar
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = ' Import e-Invoice ']");
    driver.findElement(by).click();

    // 2. Click 'isAutomaticIrnGen'
    //    Click on Automatic IRN Generation
    /* Step is disabled
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='isAutomaticIrnGen']");
    driver.findElement(by).click();
    */
    // 3. Uploads a file to a given element with the 'file' type
    //    Upload the Excel File in Importing E-Invoice 
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction(Path);
    by = By.cssSelector("#fileUpload");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 4. Click 'Import'
    //    Click on Import Button
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Import']");
    driver.findElement(by).click();

    // 5. Click 'Yes'
    //    Click on Yes Button to Import the Invoice
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Yes']");
    driver.findElement(by).click();

    // 6. Click 'DIV'
    //    Click on Pop Up Message
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/div[4]");
    driver.findElement(by).click();

    // 7. Get text from 'DIV' if it's visible
    //    Get the Text From Pop Up Message
    GeneratedUtils.sleep(500);
    getTextIfVisibleWeb = VisibleElementsOperations.getTextIfVisibleWeb("");
    by = By.xpath("//body/div[4]");
    getTextIfVisibleWeb = (VisibleElementsOperations.GetTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(getTextIfVisibleWeb, by, -1);

    // 8. Click 'INPUT'
    //    Click on Search Field
    GeneratedUtils.sleep(1000);
    by = By.xpath("//label/input");
    driver.findElement(by).click();

    // 9. Type '{{ImportSearchInvoice}}' in 'INPUT'
    //    Enter the Value in Import E-Invoice Search Field
    GeneratedUtils.sleep(1000);
    by = By.xpath("//label/input");
    driver.findElement(by).sendKeys(ImportSearchInvoice);

    // 10. Send 'ENTER' key(s)
    //    Press the Enter Button
    GeneratedUtils.sleep(500);
    by = By.xpath("//label/input");
    (new Actions(driver)).sendKeys(GeneratedUtils.getKeys("ENTER")).build().perform();

    // 11. Click 'Details'
    //    Click on Details
    GeneratedUtils.sleep(500);
    //by = By.cssSelector("#id3432");
    by = By.xpath("//tr[1]//button[. = ' Details']");
    driver.findElement(by).click();

    // 12. Get text from 'Transaction Summary' if it's visible
    //    Get the Transaction Summary Text
    GeneratedUtils.sleep(500);
    getTextIfVisibleWeb = VisibleElementsOperations.getTextIfVisibleWeb("");
    by = By.xpath("//tr[1]//h3[. = 'Transaction Summary']");
    getTextIfVisibleWeb = (VisibleElementsOperations.GetTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(getTextIfVisibleWeb, by, -1);
    TransactionSummary = String.valueOf(getTextIfVisibleWeb.text);

    // 13. Get text from 'Total Imported Records: 6 ~ Total IRN...' if it's visible
    //    Get the Record Details Text
    GeneratedUtils.sleep(500);
    getTextIfVisibleWeb = VisibleElementsOperations.getTextIfVisibleWeb("");
    by = By.xpath("//div[. = 'Total Imported Records: 6 ~ Total IRN Generated Records: 0 ~ Total Failed Records: 6 ~ Deleted Unregister GSTIN Records:0 ~ B2C Generated Records: 0 ~ Duplicate Records: 0']");
    getTextIfVisibleWeb = (VisibleElementsOperations.GetTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(getTextIfVisibleWeb, by, -1);
    RecordDetails = String.valueOf(getTextIfVisibleWeb.text);

    // 14. Click 'I'
    //    Click on Delete Icon
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]/td[6]//i");
    driver.findElement(by).click();

    // 15. Get text from 'Do you want to Delete Transaction? Th...' if it's visible
    //    Get the Text from Pop Up Window
    GeneratedUtils.sleep(500);
    getTextIfVisibleWeb = VisibleElementsOperations.getTextIfVisibleWeb("");
    by = By.xpath("//p[. = 'Do you want to Delete Transaction? This Process can not be undone..!!']");
    getTextIfVisibleWeb = (VisibleElementsOperations.GetTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(getTextIfVisibleWeb, by, -1);

    // 16. Click 'Yes' if it's visible
    //    Click on Yes Button to delete the Record 
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//button[. = 'Yes']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}
