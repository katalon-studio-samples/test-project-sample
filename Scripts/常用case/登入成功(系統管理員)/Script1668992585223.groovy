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

WebUI.callTestCase(findTestCase('Main test cases/3登入/common-openLoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Page/input__account'), 'admin@mail.com')

WebUI.setEncryptedText(findTestObject('Login_Page/input__password'), 'kZvHk3aTNFwN+RCu+B57qQmErkmHIZQASIBwz4TUwm/7KFrovjhU7w==')

WebUI.click(findTestObject('Login_Page/button_login_mid'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Admin/homepage/div_guidebar'), 0)

WebUI.verifyElementPresent(findTestObject('Admin/homepage/div_sidebar'), 0)

WebUI.verifyElementPresent(findTestObject('Admin/homepage/div_description'), 0)

