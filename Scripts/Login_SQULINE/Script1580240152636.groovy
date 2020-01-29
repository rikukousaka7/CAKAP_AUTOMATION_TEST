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

WebUI.openBrowser(GlobalVariable.URL_Login)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('LoginPage/img_LogoLogin'), 20)

WebUI.click(findTestObject('LoginPage/input_EmailUser'), 10)

WebUI.setText(findTestObject('LoginPage/input_EmailUser'), GlobalVariable.Username)

WebUI.click(findTestObject('LoginPage/input_PasswordUser'), 10)

WebUI.setText(findTestObject('LoginPage/PasswordUser'), GlobalVariable.Password)

WebUI.click(findTestObject('LoginPage/img_ShowPassword'), 10)

WebUI.click(findTestObject('LoginPage/button_LOGIN'),)

WebUI.delay(10)