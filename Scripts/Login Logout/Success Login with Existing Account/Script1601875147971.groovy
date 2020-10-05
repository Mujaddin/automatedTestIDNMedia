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

'And  I click Sign In Tab'
WebUI.click(findTestObject('Login_Screen/tab_signIn'))

'When I enter correct credentials'
WebUI.sendKeys(findTestObject('textbox_by_text', [('text') : 'Email']), 'generalemailtest47@gmail.com')

WebUI.sendKeys(findTestObject('textbox_by_text', [('text') : 'Password']), 'P@ssw0rd')

WebUI.click(findTestObject('button_by_text', [('text') : 'Sign In']))

'Then I see Dashboard'
WebUI.verifyElementText(findTestObject('profile-text'), 'IDN Media Test Account')

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'User Info']))

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'How To & FAQ']))

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'Panduan Menulis']))

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'Assignment']))

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'Publish']))

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'Draft']))

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'Pending']))

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'Rejected']))

WebUI.verifyElementVisible(findTestObject('media_component', [('text') : 'Redeem History']))

'And I see Event & Promo'
WebUI.verifyElementPresent(findTestObject('panel', [('title') : 'Event & Promo']), 0)

'And I see Jumlah Point'
WebUI.verifyElementPresent(findTestObject('panel', [('title') : 'Jumlah Point']), 0)

'And I see Badge and reward'
WebUI.verifyElementPresent(findTestObject('panel', [('title') : 'Badge and reward']), 0)

'And I see Total View'
WebUI.verifyElementPresent(findTestObject('panel', [('title') : 'Total View']), 0)

