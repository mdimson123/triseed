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

WebUI.click(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/button_Sales Packets'))

WebUI.setText(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/input_Sales Packets_react-aria3153444259-r4f'), 
    'test packet')

WebUI.click(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/button_Sales Packets'))

WebUI.click(findTestObject('Search Sales Packets/Page_MTR Web/path'))

///
WebUI.sendKeys(findTestObject('Search Sales Packets/Page_MTR Web/path'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Search Sales Packets/Page_MTR Web/path'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Search Sales Packets/Page_MTR Web/path'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Search Sales Packets/Page_MTR Web/path'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Search Sales Packets/Page_MTR Web/path'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Search Sales Packets/Page_MTR Web/path'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Search Sales Packets/Page_MTR Web/path'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Search Sales Packets/Page_MTR Web/path'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/button_Sales Packets'))

WebUI.setText(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/input_Sales Packets_react-aria9457435418-r55'), 
    '123')

WebUI.click(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/button_Sales Packets'))

WebUI.setText(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/input_Sales Packets_react-aria3617671302-r5f'), 
    '24-417T-001')

WebUI.click(findTestObject('Object Repository/Search Sales Packets/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

