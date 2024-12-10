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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/M T R/MTR/Page_MTR Web/button_Add HEAT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/M T R/MTR/Page_MTR Web/button_From computer'), 10)

///Upload Files
TestObject fileInput = findTestObject('Object Repository/M T R/MTR/Page_Sign in to your account/upload from computer')

WebUI.sendKeys(fileInput, 'C:\\Users\\Triseed\\Downloads\\09162024.pdf')

WebUI.click(findTestObject('M T R/MTR/Page_MTR Web/button_Next'))

WebUI.delay(25)

WebUI.sendKeys(findTestObject('M T R/MTR/Page_MTR Web/dropdown_textbox'), Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('M T R/MTR/Page_MTR Web/dropdown_textbox'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('M T R/MTR/Page_MTR Web/button_Save'))

WebUI.verifyElementVisible(findTestObject('M T R/Page_MTR Web/td_TEST'))

