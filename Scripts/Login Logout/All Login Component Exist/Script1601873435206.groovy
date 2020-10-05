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

'Given I open https://community.idntimes.com'
WebUI.openBrowser('https://community.idntimes.com/')

'And I click Sign In Tab'
WebUI.click(findTestObject('Login_Screen/tab_signIn'))

'Then I see username, password, and submit button'
WebUI.verifyElementPresent(findTestObject('Login_Screen/Sign_In/textbox_email'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Screen/Sign_In/textbox_password'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Screen/Sign_In/button_SignIn'), 0)

'And I can login with google account'
WebUI.verifyElementPresent(findTestObject('Login_Screen/button_google'), 0)

'And I can login with facebook account'
WebUI.verifyElementClickable(findTestObject('Login_Screen/button_facebook'))

