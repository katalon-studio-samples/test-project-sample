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

WebUI.callTestCase(findTestCase('Main test cases/1註冊/common-openRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register_Page/input__email'), email)

if (email == '') {
    WebUI.verifyElementPresent(findTestObject('Register_Page/div_input_emailpls'), 0)
}

WebUI.setText(findTestObject('Register_Page/input__password'), password)

if (password == '') {
    WebUI.verifyElementPresent(findTestObject('Register_Page/div_input_pswdpls'), 0)
}

WebUI.setText(findTestObject('Register_Page/input__pswdConfirm'), password)

if (confirm_password == '') {
    WebUI.verifyElementPresent(findTestObject('Register_Page/div_input_pswdConfirmpls'), 0)
}

WebUI.setText(findTestObject('Register_Page/input__name'), name)

if (name == '') {
    WebUI.verifyElementPresent(findTestObject('Register_Page/div_input_namepls'), 0)
}

WebUI.sendKeys(findTestObject('Register_Page/input__birthday'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Register_Page/input__birthday'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Register_Page/input__birthday'), birthday)

WebUI.setText(findTestObject('Register_Page/input__cellphone'), phone)

if (phone == '') {
    WebUI.verifyElementPresent(findTestObject('Register_Page/div_input_phonepls'), 0)
}

WebUI.setText(findTestObject('Register_Page/input__address'), address)

WebUI.setText(findTestObject('Register_Page/input__ID'), ID)

if (ID == '') {
    WebUI.verifyElementPresent(findTestObject('Register_Page/div_inputIDpls'), 0)
}

WebUI.click(findTestObject('Register_Page/div__school'))

WebUI.verifyTextPresent('師範大學', false)

WebUI.click(findTestObject('Register_Page/div_sele1'))

WebUI.click(findTestObject('Register_Page/button_registerConfirm'))

