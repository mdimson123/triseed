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

WebUI.callTestCase(findTestCase('Login/Login porterpipe/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Show 10,20,50,100 Announcement/Page_Pipeline Marketing/a_Announcement'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Show 10,20,50,100 Announcement/Page_Pipeline Marketing/h1_Announcements'), 
    5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Show 10,20,50,100 Announcement/Page_Pipeline Marketing/select_102050100'), 
    '10', true)

WebUI.delay(2)

WebUI.executeJavaScript('window.scrollBy(0, 500 );', null)

WebUI.selectOptionByValue(findTestObject('Object Repository/Show 10,20,50,100 Announcement/Page_Pipeline Marketing/select_102050100'), 
    '20', true)

WebUI.delay(2)

WebUI.executeJavaScript('window.scrollBy(0, 1000 );', null)

WebUI.selectOptionByValue(findTestObject('Object Repository/Show 10,20,50,100 Announcement/Page_Pipeline Marketing/select_102050100'), 
    '50', true)

WebUI.delay(2)

WebUI.executeJavaScript('window.scrollBy(0, 3500 );', null)

WebUI.selectOptionByValue(findTestObject('Object Repository/Show 10,20,50,100 Announcement/Page_Pipeline Marketing/select_102050100'), 
    '100', true)

WebUI.delay(2)

WebUI.executeJavaScript('window.scrollBy(0, 8000 );', null)

WebUI.delay(2)

WebUI.closeBrowser()

