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

WebUI.click(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/button_Transfer Packet'))

WebUI.setText(findTestObject('Transfer Packets/Page_MTR Web/Title'), 'test')

WebUI.click(findTestObject('Transfer Packets/Page_MTR Web/Dropdown'))

//Scroll
WebUI.click(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/Dropdown'))
WebUI.sendKeys(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/Dropdown'), Keys.chord(Keys.DOWN))

//dropdown
WebUI.sendKeys(findTestObject('M T R/Transfer Packets/Page_MTR Web/Dropdown'), Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('M T R/Transfer Packets/Page_MTR Web/Dropdown'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/Dropdown'))
//WebUI.click(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/li_334117-00'))
WebUI.setText(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/input_COMPLETED_react-aria3179135722-r5f'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/input_COMPLETED_react-aria3179135722-r5p'), 
    '0')

//
WebUI.sendKeys(findTestObject('M T R/Transfer Packets/Page_MTR Web/svg_COMPLETED_lucide lucide-chevron-down'), Keys.chord(
        Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('M T R/Transfer Packets/Page_MTR Web/svg_COMPLETED_lucide lucide-chevron-down'), Keys.chord(
        Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/svg_COMPLETED_lucide lucide-chevron-down'))
WebUI.click(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/span_Completed'))

WebUI.click(findTestObject('Object Repository/Transfer Packets/Page_MTR Web/li_Successfully added transfer packet 334117'))

