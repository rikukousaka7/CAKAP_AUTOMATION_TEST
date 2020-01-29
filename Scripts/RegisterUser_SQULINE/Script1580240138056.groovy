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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.URL_Register)

WebUI.waitForElementPresent(findTestObject('Register/img_LogoRegister'), 30)

WebUI.delay(2)

WebUI.click(findTestObject('Register/input_Email'))

WebUI.setText(findTestObject('Register/input_Email'), GlobalVariable.Username)

WebUI.delay(2)

WebUI.click(findTestObject('Register/btn_Male'))

WebUI.delay(2)

WebUI.click(findTestObject('Register/input_FirstName'))

WebUI.setText(findTestObject('Register/input_FirstName'), GlobalVariable.FirstName)

WebUI.click(findTestObject('Register/input_LastName'))

WebUI.setText(findTestObject('Register/input_LastName'), GlobalVariable.LastName)

WebUI.click(findTestObject('Register/input_Password'))

WebUI.setEncryptedText(findTestObject('Register/input_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Register/input_ConfirmPassword'))

WebUI.setEncryptedText(findTestObject('Register/input_ConfirmPassword'), GlobalVariable.Password)

WebUI.delay(2)

WebUI.click(findTestObject('Register/btn_SIGNUP'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('ChooseLearning/title_ChooseLearning'), 60)

WebUI.click(findTestObject('ChooseLearning/btn_EnglishCourse'))

WebUI.delay(2)

WebUI.click(findTestObject('ChooseLearning/btn_NEXT'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Data_PhoneNum/title_InputPhoneNum'), 30)

WebUI.click(findTestObject('Daya_PhoneNum/btn_CountryContainer'))

WebUI.click(findTestObject('Data_PhoneNum/btn_CHooseIndonesia'))

WebUI.click(findTestObject('Data_PhoneNum/input_PhoneNUm'))

WebUI.setText(findTestObject('Data_PhoneNum/input_PhoneNUm'), GlobalVariable.PhoneNumber)

WebUI.click(findTestObject('Data_PhoneNum/btn_STARTLEARNING'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Success Regist/title_SuccessRegist'), 60)

WebUI.click(findTestObject('Success Regist/btn_GoToMyDashboard'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Timezone/title_ChooseTimezone'), 60)

WebUI.click(findTestObject('Timezone/btn_CascadeTimezone'))

WebUI.click(findTestObject('Timezone/btn_OK'))

