package io.testproject.generated.tests.xattaxgrouptestcases;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class was automatically generated by TestProject
 * Project: Xattax-Group Test Cases
 * Test: User Flow-Group Test Cases
 * Generated by: Suganya Jothiprakash (suganya.sugan@sailotech.net)
 * Generated on Fri Dec 17 18:43:13 GMT 2021.
 */
@DisplayName("User Flow-Group Test Cases")
public class UserFlowgroupTestCases implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("f336MHaFrVSUv_MSB8djUnXoYt7dMAn1xY9WNdLY5lc", new ChromeOptions(), "Xattax-Group Test Cases","Xattax-Group Test Cases for User Flows");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("User Flow-Group Test Cases")
  @ParameterizedTest
  //@CsvFileSource(resources="/Xattax-User Test Data.csv");
  @CsvFileSource(resources= "/Xattax-Cancelled E-InvoiceParameters (Double-Recent) (1) (2).csv")
  //@MethodSource("provideParameters")
  void execute(String ApplicationURL, String Username, String Password, String Path,
      String ImportSearchInvoice,
      String GeneratedInvoiceSearcField, String SendEmail,
     String Distance,String ShippingPincode,String ShippingToAddress2,
      String ShippingToAddress1,String ShippingToLocation,  String TransDocDate,
      String TransDocNumber, String TransID,  String TransName, String VehicleNumber,
      String ToBeGeneratedSearchField,
      String CancelSearchField,String ReasonForCancel, String FailedSearchField
      ) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    Tc07xattaxcancelledEinvoice tc07xattaxcancelledeinvoice;
    Tc06xattaxfailedEinvoice tc06xattaxfailedeinvoice;
    Tc03xattaxgeneratedInvoices tc03xattaxgeneratedinvoices;
    Tc05xattaxtoBeGeneratedInvoice tc05xattaxtobegeneratedinvoice;
    Tc02xattaximportingTheInvoices tc02xattaximportingtheinvoices;
    Tc01xattaxuserLoginWithValidCredentials tc01xattaxuserloginwithvalidcredentials;
    Tc04xattaxgenerateEwayBill tc04xattaxgenerateewaybill;

    // 1. User Login with the Valid Credential's
    GeneratedUtils.sleep(500);
    tc01xattaxuserloginwithvalidcredentials = new Tc01xattaxuserLoginWithValidCredentials();
    tc01xattaxuserloginwithvalidcredentials.ApplicationURL = ApplicationURL;
    tc01xattaxuserloginwithvalidcredentials.Username = Username;
    tc01xattaxuserloginwithvalidcredentials.Password = Password;
    tc01xattaxuserloginwithvalidcredentials.execute(driver);

    // 2. Importing  Invoices and getting the Records
    GeneratedUtils.sleep(500);
    tc02xattaximportingtheinvoices = new Tc02xattaximportingTheInvoices();
    tc02xattaximportingtheinvoices.ApplicationURL = ApplicationURL;
    tc02xattaximportingtheinvoices.Username = Username;
    tc02xattaximportingtheinvoices.Password = Password;
    tc02xattaximportingtheinvoices.Path = Path;
    tc02xattaximportingtheinvoices.ImportSearchInvoice = ImportSearchInvoice;
   // tc02xattaximportingtheinvoices.TransactionSummary = TransactionSummary;
    //tc02xattaximportingtheinvoices.RecordDetails = RecordDetails;
    tc02xattaximportingtheinvoices.execute(driver);

    // 3. Check the Invoices in Generated Tab\nSend the Invoices to the User Email Id\nDownload the Invoices
    GeneratedUtils.sleep(500);
    tc03xattaxgeneratedinvoices = new Tc03xattaxgeneratedInvoices();
    tc03xattaxgeneratedinvoices.ApplicationURL = ApplicationURL;
    tc03xattaxgeneratedinvoices.Username = Username;
    tc03xattaxgeneratedinvoices.Password = Password;
    tc03xattaxgeneratedinvoices.GeneratedInvoiceSearcField = GeneratedInvoiceSearcField;
    tc03xattaxgeneratedinvoices.Path = Path;
    tc03xattaxgeneratedinvoices.ImportSearchInvoice = ImportSearchInvoice;
  //  tc03xattaxgeneratedinvoices.TransactionSummary = TransactionSummary;
  //  tc03xattaxgeneratedinvoices.RecordDetails = RecordDetails;
   // tc03xattaxgeneratedinvoices.SendToEmail = SendToEmail;
    //tc03xattaxgeneratedinvoices.SendCCMail = SendCCMail;
    tc03xattaxgeneratedinvoices.execute(driver);

    // 4. Generate the E-Way Bill For the Invoices
    GeneratedUtils.sleep(500);
    tc04xattaxgenerateewaybill = new Tc04xattaxgenerateEwayBill();
    tc04xattaxgenerateewaybill.ApplicationURL = ApplicationURL;
    tc04xattaxgenerateewaybill.Username = Username;
    tc04xattaxgenerateewaybill.Password = Password;
    tc04xattaxgenerateewaybill.GeneratedInvoiceSearcField = GeneratedInvoiceSearcField;
    tc04xattaxgenerateewaybill.Path = Path;
    tc04xattaxgenerateewaybill.ImportSearchInvoice = ImportSearchInvoice;
    tc04xattaxgenerateewaybill.SendEmail = SendEmail;
    tc04xattaxgenerateewaybill.TransID = TransID;
    tc04xattaxgenerateewaybill.TransName = TransName;
    tc04xattaxgenerateewaybill.Distance = Distance;
    tc04xattaxgenerateewaybill.VehicleNumber = VehicleNumber;
    tc04xattaxgenerateewaybill.TransDocNumber = TransDocNumber;
    tc04xattaxgenerateewaybill.TransDocDate = TransDocDate;
    tc04xattaxgenerateewaybill.ShippingToLocation = ShippingToLocation;
    tc04xattaxgenerateewaybill.ShippingToAddress2 = ShippingToAddress2;
    tc04xattaxgenerateewaybill.ShippingPincode = ShippingPincode;
    tc04xattaxgenerateewaybill.ShippingToAddress1 = ShippingToAddress1;
    tc04xattaxgenerateewaybill.execute(driver);

    // 5. Check the Invoices in To Be Generated Tab
    GeneratedUtils.sleep(500);
    tc05xattaxtobegeneratedinvoice = new Tc05xattaxtoBeGeneratedInvoice();
    tc05xattaxtobegeneratedinvoice.ApplicationURL = ApplicationURL;
    tc05xattaxtobegeneratedinvoice.Username = Username;
    tc05xattaxtobegeneratedinvoice.Password = Password;
    tc05xattaxtobegeneratedinvoice.GeneratedInvoiceSearcField = GeneratedInvoiceSearcField;
    tc05xattaxtobegeneratedinvoice.Path = Path;
    tc05xattaxtobegeneratedinvoice.ImportSearchInvoice = ImportSearchInvoice;
    //tc05xattaxtobegeneratedinvoice.TransactionSummary = TransactionSummary;
   // tc05xattaxtobegeneratedinvoice.RecordDetails = RecordDetails;
    tc05xattaxtobegeneratedinvoice.SendEmail = SendEmail;
    tc05xattaxtobegeneratedinvoice.TransID = TransID;
    tc05xattaxtobegeneratedinvoice.TransName = TransName;
    tc05xattaxtobegeneratedinvoice.Distance = Distance;
    tc05xattaxtobegeneratedinvoice.VehicleNumber = VehicleNumber;
    tc05xattaxtobegeneratedinvoice.TransDocNumber = TransDocNumber;
    tc05xattaxtobegeneratedinvoice.TransDocDate = TransDocDate;
    tc05xattaxtobegeneratedinvoice.ShippingToLocation = ShippingToLocation;
    tc05xattaxtobegeneratedinvoice.ShippingToAddress2 = ShippingToAddress2;
    tc05xattaxtobegeneratedinvoice.ShippingPincode = ShippingPincode;
    tc05xattaxtobegeneratedinvoice.ShippingToAddress1 = ShippingToAddress1;
    tc05xattaxtobegeneratedinvoice.ToBeGeneratedSearchField = ToBeGeneratedSearchField;
    tc05xattaxtobegeneratedinvoice.execute(driver);

    // 6. Check the Invoices in Failed Tab
    GeneratedUtils.sleep(500);
    tc06xattaxfailedeinvoice = new Tc06xattaxfailedEinvoice();
    tc06xattaxfailedeinvoice.ApplicationURL = ApplicationURL;
    tc06xattaxfailedeinvoice.Username = Username;
    tc06xattaxfailedeinvoice.Password = Password;
    tc06xattaxfailedeinvoice.GeneratedInvoiceSearcField = GeneratedInvoiceSearcField;
    tc06xattaxfailedeinvoice.Path = Path;
    tc06xattaxfailedeinvoice.ImportSearchInvoice = ImportSearchInvoice;
    //tc06xattaxfailedeinvoice.TransactionSummary = TransactionSummary;
   // tc06xattaxfailedeinvoice.RecordDetails = RecordDetails;
    tc06xattaxfailedeinvoice.SendEmail = SendEmail;
    tc06xattaxfailedeinvoice.TransID = TransID;
    tc06xattaxfailedeinvoice.TransName = TransName;
    tc06xattaxfailedeinvoice.Distance = Distance;
    tc06xattaxfailedeinvoice.VehicleNumber = VehicleNumber;
    tc06xattaxfailedeinvoice.TransDocNumber = TransDocNumber;
    tc06xattaxfailedeinvoice.TransDocDate = TransDocDate;
    tc06xattaxfailedeinvoice.ShippingToLocation = ShippingToLocation;
    tc06xattaxfailedeinvoice.ShippingToAddress2 = ShippingToAddress2;
    tc06xattaxfailedeinvoice.ShippingPincode = ShippingPincode;
    tc06xattaxfailedeinvoice.ShippingToAddress1 = ShippingToAddress1;
    tc06xattaxfailedeinvoice.ToBeGeneratedSearchField = ToBeGeneratedSearchField;
    tc06xattaxfailedeinvoice.FailedSearchField = FailedSearchField;
    tc06xattaxfailedeinvoice.execute(driver);

    // 7. Cancel The Invoice from the Generated Tab\nCheck the Cancelled Invoices in Cancelled Tab
    GeneratedUtils.sleep(500);
    tc07xattaxcancelledeinvoice = new Tc07xattaxcancelledEinvoice();
    tc07xattaxcancelledeinvoice.ApplicationURL = ApplicationURL;
    tc07xattaxcancelledeinvoice.Username = Username;
    tc07xattaxcancelledeinvoice.Password = Password;
    tc07xattaxcancelledeinvoice.GeneratedInvoiceSearcField = GeneratedInvoiceSearcField;
    tc07xattaxcancelledeinvoice.Path = Path;
    tc07xattaxcancelledeinvoice.ImportSearchInvoice = ImportSearchInvoice;
    //tc07xattaxcancelledeinvoice.TransactionSummary = TransactionSummary;
    //tc07xattaxcancelledeinvoice.RecordDetails = RecordDetails;
    tc07xattaxcancelledeinvoice.SendEmail = SendEmail;
    tc07xattaxcancelledeinvoice.TransID = TransID;
    tc07xattaxcancelledeinvoice.TransName = TransName;
    tc07xattaxcancelledeinvoice.Distance = Distance;
    tc07xattaxcancelledeinvoice.VehicleNumber = VehicleNumber;
    tc07xattaxcancelledeinvoice.TransDocNumber = TransDocNumber;
    tc07xattaxcancelledeinvoice.TransDocDate = TransDocDate;
    tc07xattaxcancelledeinvoice.ShippingToLocation = ShippingToLocation;
    tc07xattaxcancelledeinvoice.ShippingToAddress2 = ShippingToAddress2;
    tc07xattaxcancelledeinvoice.ShippingPincode = ShippingPincode;
    tc07xattaxcancelledeinvoice.ShippingToAddress1 = ShippingToAddress1;
    tc07xattaxcancelledeinvoice.ToBeGeneratedSearchField = ToBeGeneratedSearchField;
    tc07xattaxcancelledeinvoice.ReasonForCancel = ReasonForCancel;
    tc07xattaxcancelledeinvoice.CancelSearchField = CancelSearchField;
    tc07xattaxcancelledeinvoice.FailedSearchField = FailedSearchField;
    tc07xattaxcancelledeinvoice.execute(driver);
    //driver.quit();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

	/*
	 * private static Stream provideParameters() throws Exception { return
	 * Stream.of(Arguments.of("http://175.101.240.71:9791/XATTAXEInvoice1.5/login",
	 * "einvuser1",
	 * "1234","C:\\Users\\sukki\\Downloads\\E Invoice Latest file (A4).xlsx"
	 * ,"E_Invoice_XLSX_SampleData.xlsx","","","ABC88","suganya.sugan@sailotech.net"
	 * ,"","suganya.sugan@sailotech.net","01AMBPG7773M002","AFS","0","AP20AG1234",
	 * "324","14/12/2021","Other country","Chandigargh","160001","Punjab","ABC91",
	 * "03AMBPG7773M002","Duplicate","SS04")); }
	 */
}
