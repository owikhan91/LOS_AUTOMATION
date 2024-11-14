package com.example;

import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set the path for your WebDriver executable
        //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // Change to your login URL
    }

    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        // Find username and password fields and login button
        driver.get("http://cistg.systemsltd.local/#/login");
        Thread.sleep(2000);
        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']")); // Update selector
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']")); // Update selector
        WebElement loginButton = driver.findElement(By.xpath("//button[text()=\"Login\"]")); // Update selector

        // Input credentials
        usernameField.sendKeys("abluser4"); // Replace with your username
        passwordField.sendKeys("abc"); // Replace with your password
        loginButton.click();
        Thread.sleep(5000);

        // Validate login success (update selector as needed)
        String dashboard = driver.findElement(By.xpath("//h1[text()='Inbox']")).getText(); // Update selector
        assertEquals(dashboard, "Inbox");

    }


    @Test(priority = 2)
    public void NewApplication_BasicInfo() throws InterruptedException {
        Thread.sleep(10000);
        WebElement newApplication_Button_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/ng-component/div[3]/div[2]/button"));
        newApplication_Button_xpath.click();
        Thread.sleep(10000);

//        WebElement basic_info_page_title = driver.findElement(By.xpath("//h1[@class=\"page-heading\"]"));
//        String BasicInfo_Title = basic_info_page_title.getText();
//        Thread.sleep(2000);
//        assertEquals(BasicInfo_Title, "Basic Information");
//        Thread.sleep(2000);
        WebElement BasicInfo_CNIC_CustomerID_Dropdown_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/fieldset/div[38]/div/div/div[1]/meezan-input/div/select"));
        BasicInfo_CNIC_CustomerID_Dropdown_xpath.click();
        Thread.sleep(1000);
        WebElement CNIC_Option_xpath = driver.findElement(By.xpath("//option[text()='CNIC']"));
        CNIC_Option_xpath.click();
        Thread.sleep(1000);
        WebElement CNIC_InputField_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/fieldset/div[38]/div/div/div[5]/meezan-input/div/input"));
        CNIC_InputField_xpath.sendKeys("1234567890123");
        Thread.sleep(1000);
        WebElement BasicInfo_FirstName_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[1]/meezan-input/div/input"));
        BasicInfo_FirstName_xpath.sendKeys("First name");
        WebElement BasicInfo_MiddleName_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[2]/meezan-input/div/input"));
        BasicInfo_MiddleName_xpath.sendKeys("Middle name");
        WebElement BasicInfo_LastName_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[3]/meezan-input/div/input"));
        BasicInfo_LastName_xpath.sendKeys("Last name");
        WebElement BasicInfo_Father_Husband_Name_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[4]/meezan-input/div/input"));
        BasicInfo_Father_Husband_Name_xpath.sendKeys("Testing Father OR Husband Name");
        WebElement BasicInfo_Mother_Name_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[5]/meezan-input/div/input"));
        BasicInfo_Mother_Name_xpath.sendKeys("Testing Mother Name");
        WebElement BasicInfo_Educatoinal_Qualification_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[6]/meezan-input/div/select"));
        BasicInfo_Educatoinal_Qualification_xpath.click();
        WebElement BasicInfo_Educatoinal_Qualification_Other_Option_xpath = driver.findElement(By.xpath("//option[text()='Graduate']"));
        BasicInfo_Educatoinal_Qualification_Other_Option_xpath.click();
        WebElement BasicInfo_Institute_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[8]/meezan-input/div/input"));
        BasicInfo_Institute_xpath.sendKeys("Testing Institute");
        Thread.sleep(1000);
        // DOB Dropdown
        WebElement BasicInfo_DOB_Field = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[9]/meezan-input/div/div[2]/input"));
        BasicInfo_DOB_Field.sendKeys("11/07/2000");


        WebElement BasicInfo_Gender_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[10]/meezan-input/div/select"));
        BasicInfo_Gender_xpath.click();
        WebElement BasicInfo_Gender_Male_Option_xpath = driver.findElement(By.xpath("//option[text()='Male']"));
        BasicInfo_Gender_Male_Option_xpath.click();
        WebElement BasicInfo_MartialStatus_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[11]/meezan-input/div/select"));
        BasicInfo_MartialStatus_xpath.click();
        WebElement BasicInfo_MartialStatus_Single_Option_xpath = driver.findElement(By.xpath("//option[text()='Single']"));
        BasicInfo_MartialStatus_Single_Option_xpath.click();
        WebElement BasicInfo_OtherDependents_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[14]/meezan-input/div/input"));
        BasicInfo_OtherDependents_xpath.sendKeys("0");
        WebElement BasicInfo_OldCNIC_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[16]/meezan-input/div/input"));
        BasicInfo_OldCNIC_xpath.sendKeys("11111111111");
        WebElement BasicInfo_FamilySize_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[17]/meezan-input/div/input"));
        BasicInfo_FamilySize_xpath.sendKeys("1");
//        WebElement BasicInfo_DoesApplicantHaveDrivingLicense_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[18]/meezan-input/div/select"));
//        BasicInfo_DoesApplicantHaveDrivingLicense_xpath.click();
//        Thread.sleep(2000);
//        WebElement BasicInfo_DoesApplicantHaveDrivingLicense_Yes_Option_xpath = driver.findElement(By.xpath("//option[text()='Yes']"));
//        BasicInfo_DoesApplicantHaveDrivingLicense_Yes_Option_xpath.click();
//        WebElement BasicInfo_DrivingLicenseNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[19]/meezan-input/div/input"));
//        BasicInfo_DrivingLicenseNo_xpath.sendKeys("1234567890");
        WebElement BasicInfo_CustomerTaxStatus_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[20]/meezan-input/div/select"));
        BasicInfo_CustomerTaxStatus_xpath.click();
        WebElement BasicInfo_CustomerTaxStatus_Filer_Option_xpath = driver.findElement(By.xpath("//option[text()='Filer']"));
        BasicInfo_CustomerTaxStatus_Filer_Option_xpath.click();
        WebElement BasicInfo_NTN_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[21]/meezan-input/div/input"));
        BasicInfo_NTN_xpath.sendKeys("12345678");
        WebElement BasicInfo_OtherAssetOwnedByYou_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[23]/meezan-input/div/select"));
        BasicInfo_OtherAssetOwnedByYou_xpath.click();
        WebElement BasicInfo_OtherAssetOwnedByYou_Movable_Option_xpath = driver.findElement(By.xpath("//option[text()='Movable']"));
        BasicInfo_OtherAssetOwnedByYou_Movable_Option_xpath.click();
        WebElement BasicInfo_AreaOfWork_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[24]/meezan-input/div/select"));
        BasicInfo_AreaOfWork_xpath.click();
        WebElement BasicInfo_AreaOfWork_All_Option_xpath = driver.findElement(By.xpath("//option[text()='DHA KHI AREA ']"));
        BasicInfo_AreaOfWork_All_Option_xpath.click();
        Thread.sleep(2000);
        WebElement BasicInfo_Branch_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[26]/meezan-input/div/select"));
        BasicInfo_Branch_xpath.click();
        Thread.sleep(1000);
        WebElement BasicInfo_Branch_All_Option_xpath = driver.findElement(By.xpath("//option[text()='SHABAZ COMMERCIAL BRANCH']"));
        BasicInfo_Branch_All_Option_xpath.click();
        WebElement BasicInfo_ExistingMBLConsumerClient_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[27]/meezan-input/div/select"));
        BasicInfo_ExistingMBLConsumerClient_xpath.click();
        WebElement BasicInfo_ExistingMBLConsumerClient_No_Option_xpath = driver.findElement(By.xpath("//option[text()='No']"));
        BasicInfo_ExistingMBLConsumerClient_No_Option_xpath.click();


        WebElement BasicInfo_CNICIssuanceDate_Field = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[29]/meezan-input/div/div[2]/input"));
        BasicInfo_CNICIssuanceDate_Field.sendKeys("11/07/2020");

        WebElement BasicInfo_CNICExpiry_Field = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab/basic-info/div/div[1]/form/div/div/fieldset[30]/meezan-input/div/div[2]/input"));
        BasicInfo_CNICExpiry_Field.sendKeys("11/07/2030");


        WebElement BasicInfo_ExemptResidenceEV_checkbox_xpath = driver.findElement(By.xpath("//label[text()='Exempt Residence EV ']"));
        BasicInfo_ExemptResidenceEV_checkbox_xpath.click();
        WebElement BasicInfo_ExemptOfficeEV_checkbox_xpath = driver.findElement(By.xpath("//label[text()='Exempt Office EV ']"));
        BasicInfo_ExemptOfficeEV_checkbox_xpath.click();

        WebElement BasicInfo_Save_btn_xpath = driver.findElement(By.xpath("//button[@class=\"btn btn-success mr-1 btn-ladda ladda-button\"]"));
        BasicInfo_Save_btn_xpath.click();

        Thread.sleep(2000);

        WebElement BasicInfo_Confirmation_Popup_xpath = driver.findElement(By.xpath("//button[text()='Continue']"));
        BasicInfo_Confirmation_Popup_xpath.click();

    }

    @Test(priority = 3)
    public void NewApplication_BasicCalculator() throws InterruptedException {
        Thread.sleep(5000);
        WebElement newApplication_BasicCalculator_Button_xpath = driver.findElement(By.xpath("//button[text()=' Calculator ']"));
        newApplication_BasicCalculator_Button_xpath.click();
        Thread.sleep(1000);


        WebElement BasicCalculator_VehicleType_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/div[2]/meezan-input/div/select"));
        BasicCalculator_VehicleType_xpath.click();
        Thread.sleep(1000);
        WebElement BasicCalculator_VehicleType_Option_xpath = driver.findElement(By.xpath("//option[text()='New Imported/Un Registered']"));
        BasicCalculator_VehicleType_Option_xpath.click();

        WebElement BasicCalculator_ManufacturerName_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/div[3]/meezan-input/div/select"));
        BasicCalculator_ManufacturerName_xpath.click();
        Thread.sleep(1000);
        WebElement BasicCalculator_ManufacturerName_Option_xpath = driver.findElement(By.xpath("//option[text()='Honda Atlas Cars Pak Ltd']"));
        BasicCalculator_ManufacturerName_Option_xpath.click();

        WebElement BasicCalculator_VariantName_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/div[4]/meezan-input/div/select"));
        BasicCalculator_VariantName_xpath.click();
        Thread.sleep(1000);
        WebElement BasicCalculator_VariantName_Option_xpath = driver.findElement(By.xpath("//option[text()='Honda Vezel']"));
        BasicCalculator_VariantName_Option_xpath.click();

        WebElement BasicCalculator_ModelYear_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/div[5]/meezan-input/div/input"));
        BasicCalculator_ModelYear_xpath.sendKeys("2023");
        Thread.sleep(1000);

        WebElement BasicCalculator_CostOfVehicle_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/div[6]/div/meezan-input/div/input"));
        BasicCalculator_CostOfVehicle_xpath.sendKeys("3,500,000.00");
        Thread.sleep(1000);

        WebElement BasicCalculator_LeasingTenure_Years_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/div[7]/meezan-input/div/select"));
        BasicCalculator_LeasingTenure_Years_xpath.click();
        Thread.sleep(1000);
        WebElement BasicCalculator_LeasingTenure_Years_Option_xpath = driver.findElement(By.xpath("//option[text()='2']"));
        BasicCalculator_LeasingTenure_Years_Option_xpath.click();

        WebElement BasicCalculator_SecurityDeposit_Percent_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/div[8]/meezan-input/div/input"));
        BasicCalculator_SecurityDeposit_Percent_xpath.clear();
        BasicCalculator_SecurityDeposit_Percent_xpath.sendKeys("30");
        Thread.sleep(1000);

        WebElement BasicCalculator_RV_Percent_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/meezan-input[3]/div/input"));
        BasicCalculator_RV_Percent_xpath.clear();
        BasicCalculator_RV_Percent_xpath.sendKeys("2");
        Thread.sleep(1000);

        WebElement BasicCalculator_DeliveryType_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/meezan-input[4]/div/select"));
        BasicCalculator_DeliveryType_xpath.click();
        Thread.sleep(1000);
        WebElement BasicCalculator_DeliveryType_Option_xpath = driver.findElement(By.xpath("//option[text()='Ready Delivery']"));
        BasicCalculator_DeliveryType_Option_xpath.click();
        Thread.sleep(2000);
        // It is closed because delivery type is Ready Delivery
//        WebElement BasicCalculator_BookingPeriodInMonths_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[2]/mat-dialog-content/div/div[1]/div/div[2]/app-calculator/form/fieldset/div[9]/meezan-input/div/select"));
//        BasicCalculator_BookingPeriodInMonths_xpath.click();
//        Thread.sleep(1000);
//        WebElement BasicCalculator_BookingPeriodInMonths_Option_xpath = driver.findElement(By.xpath("//option[text()='1']"));
//        BasicCalculator_BookingPeriodInMonths_Option_xpath.click();
//        Thread.sleep(2000);
//
        WebElement BasicCalculator_Calculate_btn_xpath = driver.findElement(By.xpath("//button[text()='CALCULATE']"));
        BasicCalculator_Calculate_btn_xpath.click();

        Thread.sleep(2000);

        WebElement BasicCalculator_Save_btn_xpath = driver.findElement(By.xpath("//button[text()='Save']"));
        BasicCalculator_Save_btn_xpath.click();

        Thread.sleep(2000);

        WebElement newApplication_BasicCalculator_Close_Button_xpath = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-basic-calculator/div[3]/button[2]"));
        newApplication_BasicCalculator_Close_Button_xpath.click();
        Thread.sleep(5000);


    }

    @Test(priority = 3)
    public void NewApplication_EmploymentDetails() throws InterruptedException {
        Thread.sleep(5000);
        String NewApplication_open_tabs_window_xpath = "/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/a/img";
        driver.findElement(By.xpath(NewApplication_open_tabs_window_xpath)).click();
        Thread.sleep(2000);
        String NewApplication_EmploymentDetails_tab_xpath = "//span[text()='Employment Details']";
        driver.findElement(By.xpath(NewApplication_EmploymentDetails_tab_xpath)).click();
        Thread.sleep(2000);
        WebElement NewApplication_EmploymentDetails_EmploymentType_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[1]/div/div[1]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_EmploymentType_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_EmploymentType_Option_xpath = driver.findElement(By.xpath("//option[text()='Current']"));
        NewApplication_EmploymentDetails_EmploymentType_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_EmploymentCategory_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[1]/div/div[2]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_EmploymentCategory_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_EmploymentCategory_Option_xpath = driver.findElement(By.xpath("//option[text()='Salaried']"));
        NewApplication_EmploymentDetails_EmploymentCategory_Option_xpath.click();
        Thread.sleep(2000);
        WebElement NewApplication_EmploymentDetails_EmployerCategory_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[1]/div/div[3]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_EmployerCategory_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_EmployerCategory_Option_xpath = driver.findElement(By.xpath("//option[text()='A']"));
        NewApplication_EmploymentDetails_EmployerCategory_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_EmployerName_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[1]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_EmployerName_xpath.sendKeys("Test employer");
        WebElement NewApplication_EmploymentDetails_OfficeOrPlotNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[3]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_OfficeOrPlotNo_xpath.sendKeys("abc");
        WebElement NewApplication_EmploymentDetails_ApartmentOrSociety_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[4]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_ApartmentOrSociety_xpath.sendKeys("abc");
        WebElement NewApplication_EmploymentDetails_Area_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[5]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_Area_xpath.sendKeys("abc");
        WebElement NewApplication_EmploymentDetails_District_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[6]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_District_xpath.sendKeys("abc");
        WebElement NewApplication_EmploymentDetails_NearestLocation_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[7]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_NearestLocation_xpath.sendKeys("abc");
        WebElement NewApplication_EmploymentDetails_Province_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[9]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_Province_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_Province_Option_xpath = driver.findElement(By.xpath("//option[text()='Sindh']"));
        NewApplication_EmploymentDetails_Province_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_City_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[10]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_City_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_City_Option_xpath = driver.findElement(By.xpath("//option[text()='Karachi']"));
        NewApplication_EmploymentDetails_City_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_Phone_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[11]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_Phone_xpath.sendKeys("021111111");
        WebElement NewApplication_EmploymentDetails_MobileNo1_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[12]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_MobileNo1_xpath.sendKeys("03450000000");
        WebElement NewApplication_EmploymentDetails_mobileNo2_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[13]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_mobileNo2_xpath.sendKeys("03450000000");
        WebElement NewApplication_EmploymentDetails_FaxNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[14]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_FaxNo_xpath.sendKeys("1234");
        WebElement NewApplication_EmploymentDetails_EmployerHREmail_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[15]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_EmployerHREmail_xpath.sendKeys("test@abc.com");
        WebElement NewApplication_EmploymentDetails_GradeOrRank_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[16]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_GradeOrRank_xpath.sendKeys("test");
        WebElement NewApplication_EmploymentDetails_Designation_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[17]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_Designation_xpath.sendKeys("QA test");
        WebElement NewApplication_EmploymentDetails_EmploymentStatus_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[18]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_EmploymentStatus_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_EmploymentStatus_Option_xpath = driver.findElement(By.xpath("//option[text()='Contract']"));
        NewApplication_EmploymentDetails_EmploymentStatus_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_EmployedSince_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[19]/meezan-input/div/div[2]/input"));
        NewApplication_EmploymentDetails_EmployedSince_xpath.sendKeys("05/05/2000");
        WebElement NewApplication_EmploymentDetails_TotalCareerYears_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[20]/meezan-input/div/div[2]/input"));
        NewApplication_EmploymentDetails_TotalCareerYears_xpath.sendKeys("11/05/2024");
        WebElement NewApplication_EmploymentDetails_LegalEntity_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[21]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_LegalEntity_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_LegalEntity_Option_xpath = driver.findElement(By.xpath("//option[text()='Private Limited']"));
        NewApplication_EmploymentDetails_LegalEntity_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_NatureOfBusiness_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[22]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_NatureOfBusiness_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_NatureOfBusiness_Option_xpath = driver.findElement(By.xpath("//option[text()='Manufacturing']"));
        NewApplication_EmploymentDetails_NatureOfBusiness_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_SalaryReceivedThrough_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[24]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_SalaryReceivedThrough_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_SalaryReceivedThrough_Option_xpath = driver.findElement(By.xpath("//option[text()='Bank']"));
        NewApplication_EmploymentDetails_SalaryReceivedThrough_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_SalaryCreditedInBankStatement_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[25]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_SalaryCreditedInBankStatement_xpath.click();
        Thread.sleep(2000);
        WebElement NewApplication_EmploymentDetails_SalaryCreditedInBankStatement_Option_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[25]/meezan-input/div/select/option[3]"));
        NewApplication_EmploymentDetails_SalaryCreditedInBankStatement_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_SalaryCreditedInBankName_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[27]/meezan-input/div/select"));
        NewApplication_EmploymentDetails_SalaryCreditedInBankName_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_SalaryCreditedInBankName_Option_xpath = driver.findElement(By.xpath("//option[text()='Meezan Bank Limited.']"));
        NewApplication_EmploymentDetails_SalaryCreditedInBankName_Option_xpath.click();
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_SalaryCreditedInAccountNumber_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[28]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_SalaryCreditedInAccountNumber_xpath.sendKeys("1234567890");
        Thread.sleep(1000);

        WebElement NewApplication_EmploymentDetails_GrossSalary_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[29]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_GrossSalary_xpath.sendKeys("50000");
        WebElement NewApplication_EmploymentDetails_Deductions_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[30]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_Deductions_xpath.sendKeys("5000");
        WebElement NewApplication_EmploymentDetails_CommissionIncentive_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[32]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_CommissionIncentive_xpath.sendKeys("5000");
        WebElement NewApplication_EmploymentDetails_IncomeAsPerLAF_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[4]/employment-details/div/form/fieldset/section[2]/div[1]/div[34]/meezan-input/div/input"));
        NewApplication_EmploymentDetails_IncomeAsPerLAF_xpath.sendKeys("50000");
        Thread.sleep(1000);
        WebElement NewApplication_EmploymentDetails_Add_btn_xpath = driver.findElement(By.xpath("//button[text()='Add']"));
        NewApplication_EmploymentDetails_Add_btn_xpath.click();

        Thread.sleep(2000);

        WebElement NewApplication_EmploymentDetails_Submit_btn_xpath = driver.findElement(By.xpath("//button[text()='Submit']"));
        NewApplication_EmploymentDetails_Submit_btn_xpath.click();

        Thread.sleep(2000);

        WebElement NewApplication_EmploymentDetails_SubmitConfirmation_OK_btn_xpath = driver.findElement(By.xpath("(//button[text()='OK'])[2]"));
        NewApplication_EmploymentDetails_SubmitConfirmation_OK_btn_xpath.click();

        Thread.sleep(2000);


    }

//    @Test(priority = 5)
//    public void NewApplication_DepositSlip() throws InterruptedException {
//        Thread.sleep(2000);
//        String NewApplication_DepositSlip_tab_xpath = "//span[text()='Deposit Slip']";
//        driver.findElement(By.xpath(NewApplication_DepositSlip_tab_xpath)).click();
//        Thread.sleep(2000);
//        WebElement NewApplication_DepositSlip_PaymentType_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[8]/app-deposit-slips/div/section[1]/form/fieldset/div[1]/div[3]/meezan-input/div/select"));
//        NewApplication_DepositSlip_PaymentType_xpath.click();
//        Thread.sleep(1000);
//        WebElement NewApplication_DepositSlip_PaymentType_Option_xpath = driver.findElement(By.xpath("//option[text()='Security Deposit']"));
//        NewApplication_DepositSlip_PaymentType_Option_xpath.click();
//        Thread.sleep(2000);
//        WebElement NewApplication_DepositSlip_Save_btn_xpath = driver.findElement(By.xpath("//button[text()='Save']"));
//        NewApplication_DepositSlip_Save_btn_xpath.click();
//    }

//    @Test(priority = 6)
//    public void NewApplication_References() throws InterruptedException {
//        Thread.sleep(5000);
////        String NewApplication_open_tabs_window_xpath = "/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/a/img";
////        driver.findElement(By.xpath(NewApplication_open_tabs_window_xpath)).click();
//
//        String NewApplication_EmploymentDetails_tab_xpath = "//span[text()='References']";
//        driver.findElement(By.xpath(NewApplication_EmploymentDetails_tab_xpath)).click();
//        Thread.sleep(1000);
//        WebElement NewApplication_References_Name_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[1]/meezan-input/div/input"));
//        NewApplication_References_Name_xpath.sendKeys("Test Reference");
//
//        WebElement NewApplication_References_CNIC_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[2]/meezan-input/div/input"));
//        NewApplication_References_CNIC_xpath.sendKeys("1234567891234");
//
//        WebElement NewApplication_References_ResidentialAddress_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[3]/meezan-input/div/textarea"));
//        NewApplication_References_ResidentialAddress_xpath.sendKeys("test address");
//
//        WebElement NewApplication_References_Relationship_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[4]/meezan-input/div/input"));
//        NewApplication_References_Relationship_xpath.sendKeys("test Relationship");
//
//        WebElement NewApplication_References_CellNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[5]/meezan-input/div/input"));
//        NewApplication_References_CellNo_xpath.sendKeys("03450000000");
//
//        WebElement NewApplication_References_ResidentialPhoneNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[6]/meezan-input/div/input"));
//        NewApplication_References_ResidentialPhoneNo_xpath.sendKeys("021345679");
//
//        WebElement NewApplication_References_OfficeAddress_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[7]/meezan-input/div/textarea"));
//        NewApplication_References_OfficeAddress_xpath.sendKeys("test address");
//
//        WebElement NewApplication_References_OfficePhoneNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[8]/meezan-input/div/input"));
//        NewApplication_References_OfficePhoneNo_xpath.sendKeys("0213456789");
//
//        WebElement NewApplication_References_Comments_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[12]/app-references/div/section[1]/form/fieldset/div[1]/div[10]/meezan-input/div/textarea"));
//        NewApplication_References_Comments_xpath.sendKeys("Please Enter Comments Here...");
//
//        WebElement NewApplication_References_Add_btn_xpath = driver.findElement(By.xpath("//button[text()='Add']"));
//        NewApplication_References_Add_btn_xpath.click();
//        Thread.sleep(2000);
//    }

//    @Test(priority = 7)
//    public void NewApplication_WaiverCriteria() throws InterruptedException {
//        Thread.sleep(3000);
//        // Cast the WebDriver instance to JavascriptExecutor
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        // Scroll to the top of the page
//        js.executeScript("window.scrollTo(0, 0);");  // Scroll to the top of the page
//        Thread.sleep(1000);
////        String NewApplication_open_tabs_window_xpath = "/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/a/img";
////        driver.findElement(By.xpath(NewApplication_open_tabs_window_xpath)).click();
////        Thread.sleep(2000);
//        String NewApplication_WaiverCriteria_tab_xpath = "//span[text()='Wavier Criteria']";
//        driver.findElement(By.xpath(NewApplication_WaiverCriteria_tab_xpath)).click();
//        Thread.sleep(2000);
//        WebElement NewApplication_WaiverCriteria_Save_btn_xpath = driver.findElement(By.xpath("//button[text()='SAVE ']"));
//        NewApplication_WaiverCriteria_Save_btn_xpath.click();
//    }

//    @Test(priority = 8)
//    public void NewApplication_ReferralTagging() throws InterruptedException {
//        Thread.sleep(5000);
////        String NewApplication_open_tabs_window_xpath = "/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/a/img";
////        driver.findElement(By.xpath(NewApplication_open_tabs_window_xpath)).click();
////        Thread.sleep(2000);
//        String NewApplication_ReferralTagging_tab_xpath = "//span[text()='Referral Tagging']";
//        driver.findElement(By.xpath(NewApplication_ReferralTagging_tab_xpath)).click();
//        Thread.sleep(1000);
//        WebElement NewApplication_ReferralTagging_LeadReferredBy_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[13]/other-internal-details/div/form/fieldset/section/div[1]/div[3]/meezan-input/div/select"));
//        NewApplication_ReferralTagging_LeadReferredBy_xpath.click();
//        Thread.sleep(1000);
//        WebElement NewApplication_ReferralTagging_LeadReferredBy_Option_xpath = driver.findElement(By.xpath("//option[text()='Call Center']"));
//        NewApplication_ReferralTagging_LeadReferredBy_Option_xpath.click();
//
//        WebElement NewApplication_ReferralTagging_BranchStaffName_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[13]/other-internal-details/div/form/fieldset/section/div[1]/div[11]/meezan-input/div/input"));
//        NewApplication_ReferralTagging_BranchStaffName_xpath.sendKeys("Test Name");
//
//        WebElement NewApplication_ReferralTagging_BranchStaffEmployeeID_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[13]/other-internal-details/div/form/fieldset/section/div[1]/div[12]/meezan-input/div/input"));
//        NewApplication_ReferralTagging_BranchStaffEmployeeID_xpath.sendKeys("Test ID");
//
//        WebElement NewApplication_ReferralTagging_Designation_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[13]/other-internal-details/div/form/fieldset/section/div[1]/div[13]/meezan-input/div/select"));
//        NewApplication_ReferralTagging_Designation_xpath.click();
//
//        WebElement NewApplication_ReferralTagging_Designation_Option_xpath = driver.findElement(By.xpath("//option[text()='BDO ']"));
//        NewApplication_ReferralTagging_Designation_Option_xpath.click();
//
//        WebElement NewApplication_ReferralTagging_BranchCoordinatorName_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[13]/other-internal-details/div/form/fieldset/section/div[1]/div[16]/meezan-input/div/input"));
//        NewApplication_ReferralTagging_BranchCoordinatorName_xpath.sendKeys("Test Name");
//
//        WebElement NewApplication_ReferralTagging_BranchCoordinatorEmpID_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[13]/other-internal-details/div/form/fieldset/section/div[1]/div[17]/meezan-input/div/input"));
//        NewApplication_ReferralTagging_BranchCoordinatorEmpID_xpath.sendKeys("Test ID");
//
//        WebElement NewApplication_ReferralTagging_ActiveCIApplicant_Checkbox_xpath = driver.findElement(By.id("ciApplicantIncomeVerified"));
//        NewApplication_ReferralTagging_ActiveCIApplicant_Checkbox_xpath.click();
//
//        WebElement NewApplication_ReferralTagging_Comment_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[13]/other-internal-details/div/form/fieldset/section/div[1]/div[19]/meezan-input/div/textarea"));
//        NewApplication_ReferralTagging_Comment_xpath.sendKeys("Test Comment");
//
//
//        WebElement NewApplication_WaiverCriteria_Save_btn_xpath = driver.findElement(By.xpath("//button[text()='SAVE']"));
//        NewApplication_WaiverCriteria_Save_btn_xpath.click();
//    }
//    @Test(priority = 4)
//    public void NewApplication_Residence() throws InterruptedException {
//        Thread.sleep(5000);
//        // Cast the WebDriver instance to JavascriptExecutor
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        // Scroll to the top of the page
//        js.executeScript("window.scrollTo(0, 0);");  // Scroll to the top of the page
//        Thread.sleep(1000);
//        String NewApplication_Residence_tab_xpath = "//span[text()='Residence']";
//        driver.findElement(By.xpath(NewApplication_Residence_tab_xpath)).click();
//        Thread.sleep(1000);
//        WebElement NewApplication_Residence_CurrentResidence_HouseNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[2]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_HouseNo_xpath.sendKeys("house No");
//
//        WebElement NewApplication_Residence_CurrentResidence_Apartment_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[3]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_Apartment_xpath.sendKeys("Apartment");
//
//        WebElement NewApplication_Residence_CurrentResidence_BlockNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[4]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_BlockNo_xpath.sendKeys("Test Reference");
//
//        WebElement NewApplication_Residence_CurrentResidence_Area_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[5]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_Area_xpath.sendKeys("Test Area ");
//
//        WebElement NewApplication_Residence_CurrentResidence_District_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[6]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_District_xpath.sendKeys("Test District");
//
//        WebElement NewApplication_Residence_CurrentResidence_NearestLocation_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[7]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_NearestLocation_xpath.sendKeys("Test NearestLocation");
//
//        WebElement NewApplication_Residence_CurrentResidence_Province_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[9]/meezan-input/div/select"));
//        NewApplication_Residence_CurrentResidence_Province_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_Province_Option_xpath = driver.findElement(By.xpath("//option[text()='Sindh']"));
//        NewApplication_Residence_CurrentResidence_Province_Option_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_City_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[10]/meezan-input/div/select"));
//        NewApplication_Residence_CurrentResidence_City_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_City_Option_xpath = driver.findElement(By.xpath("//option[text()='Karachi']"));
//        NewApplication_Residence_CurrentResidence_City_Option_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_DistanceFromNearestMBLBranch_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[11]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_DistanceFromNearestMBLBranch_xpath.sendKeys("12");
//
//        WebElement NewApplication_Residence_CurrentResidence_ResidencePhoneNo1_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[12]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_ResidencePhoneNo1_xpath.sendKeys("0213456789");
//
//        WebElement NewApplication_Residence_CurrentResidence_ResidencePhoneNo2_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[13]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_ResidencePhoneNo2_xpath.sendKeys("0213456789");
//
//        WebElement NewApplication_Residence_CurrentResidence_ResidenceMobileNo1_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[7]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_ResidenceMobileNo1_xpath.sendKeys("03450000000");
//
//        WebElement NewApplication_Residence_CurrentResidence_ResidenceMobileNo2_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[7]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_ResidenceMobileNo2_xpath.sendKeys("03450000000");
//
//        WebElement NewApplication_Residence_CurrentResidence_ResidentialStatus_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[16]/meezan-input/div/select"));
//        NewApplication_Residence_CurrentResidence_ResidentialStatus_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_ResidentialStatus_Option_xpath = driver.findElement(By.xpath("//option[text()='Parents']"));
//        NewApplication_Residence_CurrentResidence_ResidentialStatus_Option_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_GaugeOfElevation_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[19]/meezan-input/div/select"));
//        NewApplication_Residence_CurrentResidence_GaugeOfElevation_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_GaugeOfElevation_Option_xpath = driver.findElement(By.xpath("//option[text()='SQ Yard']"));
//        NewApplication_Residence_CurrentResidence_GaugeOfElevation_Option_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_AreaSizeOfAccommodation_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[20]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_AreaSizeOfAccommodation_xpath.sendKeys("1000");
//
//        WebElement NewApplication_Residence_CurrentResidence_ResidenceSince_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[21]/meezan-input/div/div[2]/input"));
//        NewApplication_Residence_CurrentResidence_ResidenceSince_xpath.sendKeys("01/01/2000");
//
//        WebElement NewApplication_Residence_CurrentResidence_ResidenceInThisCitySince_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[22]/meezan-input/div/div[2]/input"));
//        NewApplication_Residence_CurrentResidence_ResidenceInThisCitySince_xpath.sendKeys("01/01/2000");
//
//        WebElement NewApplication_Residence_CurrentResidence_FaxNo_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[23]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_FaxNo_xpath.sendKeys("1");
//
//        WebElement NewApplication_Residence_CurrentResidence_UtilityBillHistory_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[24]/meezan-input/div/select"));
//        NewApplication_Residence_CurrentResidence_UtilityBillHistory_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_UtilityBillHistory_Option_xpath = driver.findElement(By.xpath("//option[text()='Regular payment during last three months']"));
//        NewApplication_Residence_CurrentResidence_UtilityBillHistory_Option_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_ApplicantEmail_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[25]/meezan-input/div/input"));
//        NewApplication_Residence_CurrentResidence_ApplicantEmail_xpath.sendKeys("test@abc.com");
//
//        WebElement NewApplication_Residence_CurrentResidence_CorrespondenceVia_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[3]/residence/div/form/fieldset/section/div/div[26]/meezan-input/div/select"));
//        NewApplication_Residence_CurrentResidence_CorrespondenceVia_xpath.click();
//
//        WebElement NewApplication_Residence_CurrentResidence_CorrespondenceVia_Option_xpath = driver.findElement(By.xpath("//option[text()='Residence']"));
//        NewApplication_Residence_CurrentResidence_CorrespondenceVia_Option_xpath.click();
//
//        WebElement NewApplication_Residence_PermanentResidence_SameAsCurrentAddress_Checkbox_xpath = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
//        NewApplication_Residence_PermanentResidence_SameAsCurrentAddress_Checkbox_xpath.click();
//        Thread.sleep(2000);
//        WebElement NewApplication_Residence_PermanentResidence_Save_btn_xpath = driver.findElement(By.xpath("//button[text()='SAVE']"));
//        NewApplication_Residence_PermanentResidence_Save_btn_xpath.click();
//
//        Thread.sleep(2000);
//
//    }
    @Test(priority = 4)
    public void NewApplication_Decision() throws InterruptedException {
        Thread.sleep(5000);
        // Cast the WebDriver instance to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the top of the page
        js.executeScript("window.scrollTo(0, 0);");  // Scroll to the top of the page
        Thread.sleep(1000);

        String NewApplication_DepositSlip_tab_xpath = "//span[text()='Decision']";
        driver.findElement(By.xpath(NewApplication_DepositSlip_tab_xpath)).click();
        Thread.sleep(2000);

        WebElement NewApplication_DecisionTab_DecisionDropdown_xpath = driver.findElement(By.xpath("/html/body/app-dashboard/div/div[2]/main/div/app-car-ijara/div[1]/div/tabset/div/tab[7]/decision/div/form/fieldset/section/div[1]/div[1]/div/select"));
        NewApplication_DecisionTab_DecisionDropdown_xpath.click();

        WebElement NewApplication_DecisionTab_DecisionDropdown_Option_xpath = driver.findElement(By.xpath("//option[text()='Approved']"));
        NewApplication_DecisionTab_DecisionDropdown_Option_xpath.click();

        Thread.sleep(2000);

        // Scroll to the top of the page
        js.executeScript("window.scrollBy(0,1000)");  // Scroll to the top of the page
        Thread.sleep(1000);

        WebElement NewApplication_Residence_PermanentResidence_Save_btn_xpath = driver.findElement(By.xpath("//button[text()='SAVE']"));
        NewApplication_Residence_PermanentResidence_Save_btn_xpath.click();

        Thread.sleep(2000);
    }


//
//    @Test(priority = 9)
//    public void testLogout() throws InterruptedException {
//        Thread.sleep(10000);
//        String userSwitch_btn_xpath = "//div[@class='user-name']";
//        String signOut_linkButton_xpath = "//i[@class='fa fa-sign-out']";
//        driver.findElement(By.xpath(userSwitch_btn_xpath)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(signOut_linkButton_xpath)).click();
//        Thread.sleep(5000);
//        WebElement Login_Page_Title = driver.findElement(By.xpath("//h2[text()='Account Login']"));
//        String LoginPage_Title = Login_Page_Title.getText();
////        String LoginPage_Title = driver.findElement(By.xpath("//h2[text()='Account Login']")).getText();
//        Thread.sleep(2000);
//        Assert.assertEquals(LoginPage_Title, "ACCOUNT LOGIN");
//        Thread.sleep(2000);
//    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}


