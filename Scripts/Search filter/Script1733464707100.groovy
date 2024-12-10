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

WebUI.setText(findTestObject('Search filter/Page_MTR Web/Heat'), '3')

WebUI.click(findTestObject('Object Repository/Search filter/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.setText(findTestObject('Search filter/Page_MTR Web/Product'), '123')

WebUI.click(findTestObject('Object Repository/Search filter/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.setText(findTestObject('Search filter/Page_MTR Web/vendor'), '3')

WebUI.click(findTestObject('Object Repository/Search filter/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.setText(findTestObject('Search filter/Page_MTR Web/Description'), '3')

WebUI.click(findTestObject('Object Repository/Search filter/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.setText(findTestObject('Search filter/Page_MTR Web/PO'), '3-00')

WebUI.click(findTestObject('Object Repository/Search filter/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.setText(findTestObject('Search filter/Page_MTR Web/Size'), '3')

WebUI.click(findTestObject('Object Repository/Search filter/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.setText(findTestObject('Search filter/Page_MTR Web/Grade'), '3')

WebUI.click(findTestObject('Object Repository/Search filter/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Search filter/Page_MTR Web/SO'))

//WebUI.setText(findTestObject('Search filter/Page_MTR Web/SO'), '1291524')

WebUI.selectOptionByLabel(findTestObject('Search filter/Page_MTR Web/SO'), '1291524', true)

WebUI.sendKeys(findTestObject('M T R/Search filter/Page_MTR Web/SO'), Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('M T R/Search filter/Page_MTR Web/SO'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.refresh()

WebUI.setText(findTestObject('Search filter/Page_MTR Web/Customer PO'), '234-2647')

WebUI.click(findTestObject('Object Repository/Search filter/Page_MTR Web/button_Go'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('M T R/Search filter/Page_MTR Web/SO'), Keys.chord(Keys.ARROW_UP))

