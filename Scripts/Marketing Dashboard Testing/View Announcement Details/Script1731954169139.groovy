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

WebUI.setText(findTestObject('Object Repository/View Announcement Details/Page_Sign in to your account/input_Sign in_loginfmt'), 
    'lpangan@porterpipe.com')

WebUI.click(findTestObject('Object Repository/View Announcement Details/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/View Announcement Details/Page_Sign in to your account/input_Enter password_passwd'), 
    'NZzDLtg5iKQPWnifuqC+Cw==')

WebUI.click(findTestObject('Object Repository/View Announcement Details/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/View Announcement Details/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/View Announcement Details/Page_Pipeline Marketing/a_Announcement'))

WebUI.click(findTestObject('Object Repository/View Announcement Details/Page_Pipeline Marketing/button_View'))

WebUI.click(findTestObject('Object Repository/View Announcement Details/Page_Pipeline Marketing/button_Done'))

WebUI.closeBrowser()

