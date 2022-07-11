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

CucumberKW.runFeatureFile('Include/features/WP-3 Winda- Add rating.feature')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Add to cart/image'))

WebUI.click(findTestObject('Object Repository/Add to cart/btn_review'))

WebUI.click(findTestObject('Object Repository/Add to cart/review_bintang'))

WebUI.setText(findTestObject('Object Repository/Add to cart/txt_comment'), 'coba')

WebUI.setText(findTestObject('Object Repository/Add to cart/txt_name'), 'akuntest')

WebUI.setText(findTestObject('Object Repository/Add to cart/txt_email'), 'akuntest@gmail.com')

WebUI.click(findTestObject('Object Repository/Add to cart/checkbox'))

WebUI.click(findTestObject('Object Repository/Add to cart/submit'))

if (WebUI.verifyElementVisible(findTestObject('Add to cart/duplicate'))) {
	WebUI.delay(5)

	WebUI.closeBrowser()
} else {
	WebUI.verifyElementVisible(findTestObject('Add to cart/div_ReviewsRated 5 out of 5Your review is awaiting approvalcheck'),
		FailureHandling.STOP_ON_FAILURE)

	WebUI.closeBrowser()
}

