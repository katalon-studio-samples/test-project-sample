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

WebUI.navigateToUrl('https://katalon-test.s3.amazonaws.com/aut/html/form.html')

WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_First name_firstName'), 'First name')

WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_Last name_lastName'), 'Last name')

WebUI.click(findTestObject('Object Repository/Page_Demo AUT/input_Female_gender'))

WebUI.click(findTestObject('Object Repository/Page_Demo AUT/input_Date of birth_dob'))

WebUI.click(findTestObject('Object Repository/Page_Demo AUT/td_1'))

WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_Address_address'), 'Address')

WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_Email_email'), 'email@email.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo AUT/input_Password_password'), 'p4y+y39Ir5MSxNs1t5lTZQ==')

WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/input_Company_company'), 'Company')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo AUT/select_DeveloperQAManagerTechnical Architec_7258a1'), 
    'QA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo AUT/select_High salaryNice managerleaderExcelle_8daca8'), 
    'High salary', true)

WebUI.click(findTestObject('Object Repository/Page_Demo AUT/input'))

WebUI.setText(findTestObject('Object Repository/Page_Demo AUT/textarea_Comment_comment'), 'Comment')

WebUI.click(findTestObject('Object Repository/Page_Demo AUT/button_Submit'))

WebUI.closeBrowser()