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

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Page register/btn_register_now'))

WebUI.click(findTestObject('Page register/input_username2'))

WebUI.setText(findTestObject('Page register/input_username2'), 'akuntestt')

WebUI.click(findTestObject('Page register/input_email2'))

WebUI.setText(findTestObject('Page register/input_email2'), 'akuntestt@gmail.com')

WebUI.click(findTestObject('Page register/input_phone_number2'))

WebUI.setText(findTestObject('Page register/input_phone_number2'), '94837434734223')

WebUI.click(findTestObject('Page register/input_password2'))

WebUI.setEncryptedText(findTestObject('Page register/input_password2'), password)

WebUI.click(findTestObject('Page register/input_confirm_password2'))

WebUI.setEncryptedText(findTestObject('Page register/input_confirm_password2'), confirm_password)

WebUI.click(findTestObject('Page register/input_address2'))

WebUI.setText(findTestObject('Page register/input_address2'), 'jalan melati')

WebUI.click(findTestObject('Page register/btn_rgst'))

WebUI.verifyElementVisible(findTestObject('Page register/verify_hello'), FailureHandling.STOP_ON_FAILURE)

