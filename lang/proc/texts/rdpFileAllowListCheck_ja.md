# RDP????????????

XPipe?RDP????????????????????????????????????????????????????RDP??????????????????????????????????????????????????

## RDP?????

RDP???????????????????????????????????????????????????????????????????? ????????????????????????????????????????? ?????????

?????????????????????`HKEY_LOCAL_MACHINESOFTWARE`????

### ?????????????????

????????????XPipe?????????????????????????????????????????????PowerShell??????????????????: `Set-ItemProperty -Path 'HKLM:?SOFTWARE?Microsoft?Windows NT?CurrentVersion?Terminal Server?TSAppAllowList' -Name "fDisabledAllowList" -Value 1`.

### ??????????????????

????????????????????????????????????????????????????????????XPipe???????????????

`TSAppAllowList`?`Applications`?????????????????????????????????"Applications "???????????????????`Name`?`Path`?`CommandLineSetting`????PowerShell???????????????????????

```
appName="???"
AppPath="C:�WindowsSystem�notepad.exe"

$regKey="HKLM:?SOFTWARE?Microsoft?Windows NT?CurrentVersion?Terminal Server?TSAppAllowList?Applications"
New-item -Path "$regKey$appName"
New-ItemProperty -Path "$regKey$appName" -Name "Name" -Value "$appName" -Force
New-ItemProperty -Path "$regKey$appName" -Name "Path" -Value "$appPath" -Force
New-ItemProperty -Path "$regKey$appName" -Name "CommandLineSetting" -Value "1" -PropertyType DWord -Force
<???>`<???

XPipe???????????????????????????????????????????`C:����cmd.exe`????????????????? 

## ??????????????

RDP????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????XPipe?????????????????????XPipe????????????????????????????