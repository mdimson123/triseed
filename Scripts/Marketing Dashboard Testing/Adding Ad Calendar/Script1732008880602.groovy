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

WebUI.setText(findTestObject('Object Repository/Adding In Ad Calendar/Page_Sign in to your account/input_Sign in_loginfmt'), 
    'lpangan@porterpipe.com')

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Adding In Ad Calendar/Page_Sign in to your account/input_Enter password_passwd'), 
    'NZzDLtg5iKQPWnifuqC+Cw==')

WebUI.click(findTestObject('Adding In Ad Calendar/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/span_Ad Calendar'))

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/button_November_inline-flex items-center ju_474e80'))

WebUI.setText(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/input_Title_title'), 'Test ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/select_Homepage'), 
    'Homepage', true)

WebUI.setText(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/input_Sequence_sequence'), 
    '1')

WebUI.click(findTestObject('Adding In Ad Calendar/Page_Pipeline Marketing/div_Drag and drop or browse from File Manager to upload'))

WebUI.uploadFile(findTestObject('Object Repository/YourFileInputObject'), 'C:\\Users\\New User\\git\\triseed2\\UploadFiles\\Screenshot_1.png')

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/button_Ad Type_h-6 flex-1 transition-all ho_429c80'))

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/span_Drag and drop or browse from File Mana_afac7e'))

WebUI.setText(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/input_Start Date_startDate'), 
    '25112024')

WebUI.setText(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/input_Start Time_startTime'), 
    '12001')

WebUI.setText(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/textarea_Notes_note'), 'test note')

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/div_Drag and drop or browse from File Manag_003297'))

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/button_Save'))

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/button_Crop'))

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/button_Save'))

WebUI.click(findTestObject('Object Repository/Adding In Ad Calendar/Page_Pipeline Marketing/button_Close'))

WebUI.closeBrowser()

