﻿'//////////////////////////////////////////////////////////////////////////////
'
' This file was automatically generated by RANOREX.
' DO NOT MODIFY THIS FILE! It is regenerated by the designer.
' All your modifications will be lost!
' http://www.ranorex.com
'
'//////////////////////////////////////////////////////////////////////////////

Imports System
Imports System.Collections.Generic
Imports System.Text
Imports System.Text.RegularExpressions
Imports System.Drawing
Imports System.Threading
Imports System.Windows.Forms

Imports Ranorex
Imports Ranorex.Core

Namespace UI_TC
	''' <summary>
	''' The Scenario54 recording.
	''' </summary>
	Partial Public Class Scenario54

		Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
		Public Shared Sub Start()
			Mouse.DefaultMoveTime = 300
			Keyboard.DefaultKeyPressTime = 100
			Delay.SpeedFactor = 1.0

			Scenario54.starttest()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.TextAdministration_' at 38;7.")
			repo.WebDocumentIceFish1.TextAdministration_.Click("38;7", 10)
			Delay.Milliseconds(1750)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin' at 61;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin.Click("61;10", 10)
			Delay.Milliseconds(160)
			Report.Info("Validating AttributeEqual (Text='Server Id') on item 'WebDocumentIceFish.ContainerVBox.CellString9'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString9Info, "Text", "Server Id")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Server Name') on item 'WebDocumentIceFish.ContainerVBox.CellString10'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString10Info, "Text", "Server Name")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='JMX URL') on item 'WebDocumentIceFish.ContainerVBox.CellString11'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString11Info, "Text", "JMX URL")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Registered Date') on item 'WebDocumentIceFish.ContainerVBox.CellString12'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString12Info, "Text", "Registered Date")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='12345') on item 'WebDocumentIceFish1.Row0.CellString8'.")
			Validate.Attribute(repo.WebDocumentIceFish1.Row0.CellString8Info, "Text", "12345")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='iceFish_server') on item 'WebDocumentIceFish.ContainerVBox.CellString13'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString13Info, "Text", "iceFish_server")
			Delay.Milliseconds(2080)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonRegister' at 46;12.")
			repo.WebDocumentIceFish.ContainerVBox.ButtonRegister.Click("46;12", 10)
			Delay.Milliseconds(190)
			Report.Info("Validating AttributeEqual (Text='New Server Configuration') on item 'WebDocumentIceFish.FlexObjectIceFish.TextNew_Server_Configuration'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextNew_Server_ConfigurationInfo, "Text", "New Server Configuration")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Server Name*') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServer_NameAsterisk'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServer_NameAsteriskInfo, "Text", "Server Name*")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='JMX URL*') on item 'WebDocumentIceFish.FlexObjectIceFish.TextJMX_URLAsterisk'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextJMX_URLAsteriskInfo, "Text", "JMX URL*")
			Delay.Milliseconds(100)
			Report.Info("Validating Exists on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6'.")
			Validate.Exists(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info)
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Save') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, "Text", "Save")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Close') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCloseInfo, "Text", "Close")
			Delay.Milliseconds(1250)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 19;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("19;9", 10)
			Delay.Milliseconds(160)
			Report.Info("Validating AttributeEqual (Text='Please enter all mandatory fields') on item 'WebDocumentIceFish.FlexObjectIceFish.TextPlease_enter_all_mandato'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextPlease_enter_all_mandatoInfo, "Text", "Please enter all mandatory fields")
			Delay.Milliseconds(1220)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK2' at 24;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK2.Click("24;11", 10)
			Delay.Milliseconds(2030)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 77;14.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("77;14", 10)
			Delay.Milliseconds(4160)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(390)
			Report.Info("Key 'Back' Press.")
			Keyboard.Press(Keys.Back, 14, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(320)
			Report.Info("Key 'I' Press.")
			Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(110)
			Report.Info("Key 'C' Press.")
			Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key 'F' Press.")
			Keyboard.Press(Keys.F, 33, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(860)
			Report.Info("Key 'I' Press.")
			Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(40)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(50)
			Report.Info("Key 'H' Press.")
			Keyboard.Press(Keys.H, 35, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(230)
			Report.Info("Key 'OemMinus, Shift' Down.")
			Keyboard.Down(Keys.OemMinus, 12, False)
			Delay.Milliseconds(60)
			Report.Info("Key 'LShiftKey' Up.")
			Keyboard.Up(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(0)
			Report.Info("Key 'OemMinus' Up.")
			Keyboard.Up(Keys.OemMinus, 12, False)
			Delay.Milliseconds(140)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(100)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key 'R' Press.")
			Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key 'V' Press.")
			Keyboard.Press(Keys.V, 47, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(110)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key 'R' Press.")
			Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(660)
			Report.Info("Key 'D2' Press.")
			Keyboard.Press(Keys.D2, 3, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1270)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput' at 47;15.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput.Click("47;15", 10)
			Delay.Milliseconds(1340)
			Report.Info("Key sequence 'service:jmx:rmi:///jndi/rmi://10.200.20.65:8008/jmxrmi'.")
			Keyboard.Press("service:jmx:rmi:///jndi/rmi://10.200.20.65:8008/jmxrmi")
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 36;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("36;10", 10)
			Delay.Milliseconds(1060)
			Report.Info("Validating AttributeEqual (Text='Server has been successfully registered') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServer_has_been_successf'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServer_has_been_successfInfo, "Text", "Server has been successfully registered")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='OK') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3Info, "Text", "OK")
			Delay.Milliseconds(630)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 38;16.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("38;16", 10)
			Delay.Milliseconds(950)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonRegister' at 39;13.")
			repo.WebDocumentIceFish.ContainerVBox.ButtonRegister.Click("39;13", 10)
			Delay.Milliseconds(910)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 113;12.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("113;12", 10)
			Delay.Milliseconds(950)
			Report.Info("Key 'I' Press.")
			Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(50)
			Report.Info("Key 'C' Press.")
			Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(250)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(150)
			Report.Info("Key 'F, Shift' Down.")
			Keyboard.Down(Keys.F, 33, False)
			Delay.Milliseconds(30)
			Report.Info("Key 'LShiftKey' Up.")
			Keyboard.Up(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(60)
			Report.Info("Key 'F' Up.")
			Keyboard.Up(Keys.F, 33, False)
			Delay.Milliseconds(120)
			Report.Info("Key 'I' Press.")
			Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(270)
			Report.Info("Key 'H' Press.")
			Keyboard.Press(Keys.H, 35, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(140)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(150)
			Report.Info("Key 'OemMinus, Shift' Press.")
			Keyboard.Press(Keys.OemMinus, 12, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(0)
			Report.Info("Key 'LShiftKey' Up.")
			Keyboard.Up(Keys.LShiftKey, 42, False)
			Delay.Milliseconds(90)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(140)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key 'R' Press.")
			Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1940)
			Report.Info("Key 'V' Press.")
			Keyboard.Press(Keys.V, 47, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(40)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
			Report.Info("Key 'R' Press.")
			Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(290)
			Report.Info("Key 'Tab' Press.")
			Keyboard.Press(Keys.Tab, 15, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1740)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 93, 1, False)
			Delay.Milliseconds(0)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(50)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(20)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1160)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 46;5.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("46;5", 10)
			Delay.Milliseconds(150)
			Report.Info("Validating AttributeEqual (Text='Server cannot be retrieved') on item 'WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextServer_cannot_be_retriev'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextServer_cannot_be_retrievInfo, "Text", "Server cannot be retrieved")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='com.headstrong.icefish.services.serveradmin.exception.UniqueServerException : A server with the name &apos;iceFish_server&apos; is already exists in the system') on item 'WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextCom_headstrong_icefish_s'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextCom_headstrong_icefish_sInfo, "Text", "com.headstrong.icefish.services.serveradmin.exception.UniqueServerException : A server with the name &apos;iceFish_server&apos; is already exists in the system")
			Delay.Milliseconds(860)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerServer_cannot_be_retriev.ButtonOK4' at 15;15.")
			repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.ButtonOK4.Click("15;15", 10)
			Delay.Milliseconds(1090)
			Report.Info("Mouse Left DoubleClick item 'WebDocumentIceFish1.TableUserGrid.CellString12' at 95;9.")
			repo.WebDocumentIceFish1.TableUserGrid.CellString12.DoubleClick("95;9", 10)
			Delay.Milliseconds(330)
			Report.Info("Validating AttributeEqual (Text='service:jmx:rmi:///jndi/rmi://10.200.20.65:8008/jmxrmi') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInputInfo, "Text", "service:jmx:rmi:///jndi/rmi://10.200.20.65:8008/jmxrmi")
			Delay.Milliseconds(1850)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 78;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("78;11", 10)
			Delay.Milliseconds(230)
			Report.Info("Validating AttributeEqual (Text='icefish_server2') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, "Text", "icefish_server2")
			Delay.Milliseconds(1500)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 133;3.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("133;3", 10)
			Delay.Milliseconds(3360)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput' at 135;14.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput.Click("135;14", 10)
			Delay.Milliseconds(1170)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 121;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("121;10", 10)
			Delay.Milliseconds(3250)
			Report.Info("Key 'D1' Press.")
			Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1290)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 38;12.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("38;12", 10)
			Delay.Milliseconds(1470)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 25;7.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("25;7", 10)
			Delay.Milliseconds(1560)
			Report.Info("Mouse Left DoubleClick item 'WebDocumentIceFish1.TableUserGrid.CellString12' at 160;5.")
			repo.WebDocumentIceFish1.TableUserGrid.CellString12.DoubleClick("160;5", 10)
			Delay.Milliseconds(330)
			Report.Info("Validating AttributeEqual (Text='icefish_server21') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, "Text", "icefish_server21")
			Delay.Milliseconds(1570)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose' at 17;4.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonClose.Click("17;4", 10)
			Delay.Milliseconds(1080)
			Scenario54.printresults()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.TextAdministration_' at 58;8.")
			repo.WebDocumentIceFish1.TextAdministration_.Click("58;8")
			Delay.Milliseconds(1260)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin' at 54;1.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin.Click("54;1")
			Delay.Milliseconds(760)
			Report.Info("Mouse Left DoubleClick item 'WebDocumentIceFish1.TableUserGrid.CellString15' at 118;7.")
			repo.WebDocumentIceFish1.TableUserGrid.CellString15.DoubleClick("118;7")
			Delay.Milliseconds(940)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 111;4.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("111;4")
			Delay.Milliseconds(930)
			Report.Info("Key 'Back' Press.")
			Keyboard.Press(Keys.Back, 14, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(850)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 21;3.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("21;3")
			Delay.Milliseconds(1880)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 48;1.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("48;1")
			Delay.Milliseconds(770)
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
