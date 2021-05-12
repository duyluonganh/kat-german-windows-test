import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle('C:\\windows\\system32\\notepad.exe', 'Untitled - Notepad')

'Switch from DEU to ENG'
Windows.sendKeys(findWindowsObject('Document'), Keys.chord(Keys.ALT, Keys.SHIFT))

Windows.setText(findWindowsObject('Object Repository/Document'), 'zora driving a yacht')

'Switch from ENG to DEU'
Windows.sendKeys(findWindowsObject('Document'), Keys.chord(Keys.ALT, Keys.SHIFT))