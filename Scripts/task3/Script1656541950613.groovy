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

WebUI.navigateToUrl('https://ourworldindata.org/explorers/coronavirus-data-explorer')

WebUI.click(findTestObject('Object Repository/Page_COVID-19 Data Explorer - Our World in Data/button_I agree'))

WebUI.verifyElementVisible(findTestObject('Page_COVID-19 Data Explorer - Our World in Data/svg_Feb 18, 2020Jun 28, 2022Feb 24, 2021Sep 12, 2021024681012141618United StatesGermanyItalyUnited KingdomFranceCanadaJapan'))

WebUI.mouseOver(findTestObject('Page_COVID-19 Data Explorer - Our World in Data/svg_Feb 18, 2020Jun 28, 2022Feb 24, 2021Sep 12, 2021024681012141618United StatesGermanyItalyUnited KingdomFranceCanadaJapan'))

WebUI.mouseOverOffset(findTestObject('Page_COVID-19 Data Explorer - Our World in Data/svg_Feb 18, 2020Jun 28, 2022Feb 24, 2021Sep 12, 2021024681012141618United StatesGermanyItalyUnited KingdomFranceCanadaJapan'), 
    20, 30)

WebUI.mouseOverOffset(findTestObject('Page_COVID-19 Data Explorer - Our World in Data/svg_Feb 18, 2020Jun 28, 2022Feb 24, 2021Sep 12, 2021024681012141618United StatesGermanyItalyUnited KingdomFranceCanadaJapan'), 
    20, 35)

WebUI.mouseOverOffset(findTestObject('Page_COVID-19 Data Explorer - Our World in Data/svg_Feb 18, 2020Jun 28, 2022Feb 24, 2021Sep 12, 2021024681012141618United StatesGermanyItalyUnited KingdomFranceCanadaJapan'), 
    20, 40)

WebUI.mouseOverOffset(findTestObject('Page_COVID-19 Data Explorer - Our World in Data/svg_Feb 18, 2020Jun 28, 2022Feb 24, 2021Sep 12, 2021024681012141618United StatesGermanyItalyUnited KingdomFranceCanadaJapan'), 
    10, 30)

