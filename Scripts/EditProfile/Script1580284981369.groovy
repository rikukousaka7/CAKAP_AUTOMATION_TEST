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

WebUI.waitForElementPresent(findTestObject('Logout/btn_UserProf'), 60)

WebUI.delay(15)

WebUI.click(findTestObject('Logout/btn_CascadeUserProf'), 10)\

WebUI.click(findTestObject('Dashboard/btn_Profile'), 10)

WebUI.delay(10)

WebUI.click(findTestObject('Dashboard/btn_EditProfile'), 10)

WebUI.click(findTestObject('Dashboard/input_BirthDate'), 10)

WebUI.setText(findTestObject('Dashboard/input_BirthDate'),'1995-06-07')

WebUI.click(findTestObject('Dashboard/input__City'), 10)

WebUI.setText(findTestObject('Dashboard/input__City'),'Jakarta')

WebUI.click(findTestObject('Dashboard/input_Address'), 10)

WebUI.setText(findTestObject('Dashboard/input_Address'),'Jl.Kebon Pala 1 Kelurahan Kebon Melati Kecamatan Tanah Abang')

WebUI.click(findTestObject('Dashboard/btn_Close'), 10)

WebUI.delay(10)