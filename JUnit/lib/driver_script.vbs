dim qtp
set qtp=createobject("QuickTest.Application")
qtp.Launch
qtp.Visible=True
qtp.open "C:\Users\aktar\Desktop\JavaFiles\JUnit\lib"
qtp.Test.Run
qtp.quit
