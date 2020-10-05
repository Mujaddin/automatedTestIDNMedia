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

UUID uuid = UUID.randomUUID()

String strUuid = uuid.toString().substring(12, 15)

'And I click Sign Up Tab'
WebUI.click(findTestObject('Login_Screen/tab_signOut'))

'When I enter all correct information'
WebUI.verifyElementPresent(findTestObject('textbox_by_text', [('text') : 'Name']), 'Testing Name' + strUuid)

WebUI.sendKeys(findTestObject('textbox_by_text', [('text') : 'Email']), ('someEmail' + strUuid) + '@gmail.com')

WebUI.sendKeys(findTestObject('textbox_by_text', [('text') : 'Password']), 'thisIsPassword' + uuid)

WebUI.sendKeys(findTestObject('textbox_by_text', [('text') : 'Confirm Password']), 'thisIsPassword' + uuid)

'And I click Sign Up'
WebUI.click(findTestObject('button_by_text', [('text') : 'Sign Up']))

'Then I see a message register success'
WebUI.verifyElementVisible(findTestObject('notification_loginScreen', [('text') : 'Register Success']))

