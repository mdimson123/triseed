import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://marketing-app.dev.porterpipe.com/dashboard')

WebUI.setText(findTestObject('Object Repository/Adding Announcement/Page_Sign in to your account/input_Sign in_loginfmt'), 
    'lpangan@porterpipe.com')

WebUI.click(findTestObject('Object Repository/Adding Announcement/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Adding Announcement/Page_Sign in to your account/input_Enter password_passwd'), 
    'NZzDLtg5iKQPWnifuqC+Cw==')

WebUI.click(findTestObject('Object Repository/Adding Announcement/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Adding Announcement/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Adding Announcement/Page_Pipeline Marketing/a_Announcement'))

WebUI.waitForElementPresent(findTestObject('Adding Announcement/Page_Pipeline Marketing/h1_Announcements'), 5)

WebUI.click(findTestObject('Object Repository/Adding Announcement/Page_Pipeline Marketing/button_Show_inline-flex items-center justif_e91906'))

WebUI.setText(findTestObject('Object Repository/Adding Announcement/Page_Pipeline Marketing/input_Title_title'), 'Test Automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Adding Announcement/Page_Pipeline Marketing/select_GlobalHomepageSettings'), 
    'Global', true)

WebUI.setText(findTestObject('Object Repository/Adding Announcement/Page_Pipeline Marketing/textarea_Announcement Description_description'), 
    'Test Announcement ')

WebUI.setText(findTestObject('Object Repository/Adding Announcement/Page_Pipeline Marketing/input_Contact Number_contactNumber'), 
    '09958217332')

WebUI.setText(findTestObject('Object Repository/Adding Announcement/Page_Pipeline Marketing/input_URL Link_urlLink'), 'facebook.com')

WebUI.setText(findTestObject('Adding Announcement/Page_Pipeline Marketing/input_Start Date_startDate'), '25122024')

WebUI.setText(findTestObject('Adding Announcement/Page_Pipeline Marketing/input_Start Time_startTime'), '12122')

WebUI.setText(findTestObject('Object Repository/Adding Announcement/Page_Pipeline Marketing/textarea_Notes_note'), 'Test Note')

WebUI.waitForElementClickable(findTestObject('Adding Announcement/Page_Pipeline Marketing/button_Save'), 5)

WebUI.click(findTestObject('Adding Announcement/Page_Pipeline Marketing/button_Save'))

WebUI.click(findTestObject('Adding Announcement/Page_Pipeline Marketing/Page_Pipeline Marketing/button_Close'))

WebUI.closeBrowser()

