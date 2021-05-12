# kat-german-windows-test
This project is a demonstration to use Katalon Windows test to input text of the preferred keyword layout (German in case).

## Problem
This problem is an issue of WinAppDriver that could not sendKeys with correctly text when German keyboard is the default setting.
For example, we want to type "zora driving a yacht" into a text field.
- With German keyboard, the output is "yora driving a zacht" -> Incorrect
- With English keyboard, the output is "zora driving a yacht" -> Correct

Therefore, WinAppDriver could not type correctly German if the default keyboard setting is German but English.
This problem is also reported at: https://github.com/Microsoft/WinAppDriver/issues/446

## Solution
There are many workarounds at the above issue but there is no official solution from Microsoft team. The resonable solution I found is switching from German to English keyboard before setText then switching back to German after the action.
We can use hot-key Left Alf + Shift to toggle keyboard language.

![Change keyboard](https://raw.githubusercontent.com/duyluonganh/kat-german-windows-test/main/Demo/Change%20keyboard.PNG "Change keyboard")

## Usage

Sample script
```
'Switch from DEU to ENG'
Windows.sendKeys(findWindowsObject('Document'), Keys.chord(Keys.ALT, Keys.SHIFT))

Windows.setText(findWindowsObject('Object Repository/Document'), 'zora driving a yacht')

'Switch from ENG to DEU'
Windows.sendKeys(findWindowsObject('Document'), Keys.chord(Keys.ALT, Keys.SHIFT))
```

Open "Test Cases/Set German text" and run the test.

Tutorial video in "Demo/German Windows Test.mp4"