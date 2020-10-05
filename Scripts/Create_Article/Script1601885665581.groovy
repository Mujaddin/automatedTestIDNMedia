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

WebUI.navigateToUrl('https://community.idntimes.com/dashboard/create-article')

'When I enter correct credentials'
WebUI.sendKeys(findTestObject('textbox_by_text', [('text') : 'Email']), 'generalemailtest47@gmail.com')

WebUI.sendKeys(findTestObject('textbox_by_text', [('text') : 'Password']), 'P@ssw0rd')

WebUI.click(findTestObject('button_by_text', [('text') : 'Sign In']))

'And I enter correct data'
WebUI.click(findTestObject('label_by_text', [('text') : 'Pilih Topics']))

WebUI.sendKeys(findTestObject('textbox_by_placeholder', [('placeholder') : 'Cari...']), 'Automotive')

WebUI.waitForElementPresent(findTestObject('multi_select', [('text') : 'Automotive']), 40)

WebUI.click(findTestObject('multi_select', [('text') : 'Automotive']))

WebUI.sendKeys(findTestObject('heading2_by_placeholder'), 'This Is Sub Judul')

WebUI.sendKeys(findTestObject('heading1_by_placeholder'), 'This Is Article')

WebUI.click(findTestObject('True Data/Remove Button', [('placeholder') : 'Sub-Judul Ke-1']))

WebUI.click(findTestObject('True Data/Remove Button', [('placeholder') : 'Sub-Judul Ke-1']))

WebUI.click(findTestObject('True Data/Remove Button', [('placeholder') : 'Sub-Judul Ke-1']))

WebUI.switchToFrame(findTestObject('tinymce_frame'), 30)

WebUI.sendKeys(findTestObject('tinyMce'), 'This Is Text for Article in Body Content at tiny mce')

WebUI.switchToDefaultContent()

WebUI.scrollToElement(findTestObject('button_image_select'), 30)

WebUI.click(findTestObject('button_image_select'))

WebUI.waitForElementPresent(findTestObject('image_by_title', [('title') : 'tabo']), 60)

WebUI.click(findTestObject('image_by_title', [('title') : 'tabo']))

WebUI.click(findTestObject('button_by_title', [('title') : 'Submit to Editorial']))

'And I click Ya Saya Yakin'
WebUI.waitForElementPresent(findTestObject('button_span_by_text', [('text') : 'Ya, saya yakin']), 30)

WebUI.click(findTestObject('button_span_by_text', [('text') : 'Ya, saya yakin']))

