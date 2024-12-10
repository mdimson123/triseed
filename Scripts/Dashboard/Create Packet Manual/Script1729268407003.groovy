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

WebUI.click(findTestObject('Object Repository/Create Packet/Page_MTR Web/button_Create Packet'))

WebUI.setText(findTestObject('Object Repository/Create Packet/Page_MTR Web/input_Next_react-aria678189088-r75'), '123')

WebUI.sendKeys(findTestObject('Create Packet/Page_MTR Web/svg_Next_lucide lucide-chevron-down'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Create Packet/Page_MTR Web/svg_Next_lucide lucide-chevron-down'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Create Packet/Page_MTR Web/svg_Next_lucide lucide-chevron-down'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Create Packet/CP manual/Page_MTR Web/input_1st-r63'), '123')

WebUI.clearText(findTestObject('Create Packet/CP manual/Page_MTR Web/input_2nd-r6d'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Packet/CP manual/Page_MTR Web/input_2nd-r6d'), '12')

WebUI.click(findTestObject('Create Packet/CP manual/Page_MTR Web/Add button'))

WebUI.click(findTestObject('Create Packet/CP manual/Page_MTR Web/dropdown'))

WebUI.sendKeys(findTestObject('Create Packet/CP manual/Page_MTR Web/input_COMPLETED_downshift-r6j-input'), Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Create Packet/CP manual/Page_MTR Web/input_COMPLETED_downshift-r6j-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Create Packet/CP manual/Page_MTR Web/Generate btn'))

WebUI.click(findTestObject('Create Packet/CP manual/Page_MTR Web/button_Save'))

