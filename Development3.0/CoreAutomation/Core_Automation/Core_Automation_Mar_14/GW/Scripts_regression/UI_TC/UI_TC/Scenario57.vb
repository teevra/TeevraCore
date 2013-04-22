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
	''' The Scenario57 recording.
	''' </summary>
	Partial Public Class Scenario57

		Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
		Public Shared Sub Start()
			Mouse.DefaultMoveTime = 300
			Keyboard.DefaultKeyPressTime = 100
			Delay.SpeedFactor = 1.0

			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextProcess_Modeling_' at 85;0.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextProcess_Modeling_.Click("85;0", 10)
			Delay.Milliseconds(1310)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process' at 81;7.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemView_Process.Click("81;7", 10)
			Delay.Milliseconds(2340)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonNew' at 30;9.")
			repo.WebDocumentIceFish.ContainerHBox.ButtonNew.Click("30;9", 10)
			Delay.Milliseconds(2450)
			Report.Info("Mouse Left Down item 'WebDocumentIceFish1.ContainerHBox1.PictureIcon_3' at 16;15.")
			repo.WebDocumentIceFish1.ContainerHBox1.PictureIcon_3.MoveTo("16;15", 1000)
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(120)
			Report.Info("Mouse Left Up item 'WebDocumentIceFish1.ContainerHBox1.ContainerGraphCanvas' at 111;102.")
			repo.WebDocumentIceFish1.ContainerHBox1.ContainerGraphCanvas.MoveTo("111;102", 1000)
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(30)
			Report.Info("Mouse Right Click item 'WebDocumentIceFish1.ContainerHBox1.PictureIcon_3_6263' at 40;33.")
			repo.WebDocumentIceFish1.ContainerHBox1.PictureIcon_3_6263.Click(MouseButtons.Right, "40;33", 1000)
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 36;1.")
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("36;1", 10)
			Delay.Milliseconds(1050)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceId' at 4;13.")
			repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceId.Click("4;13", 10)
			Delay.Milliseconds(1730)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(330)
			Report.Info("Key 'R' Press.")
			Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(390)
			Report.Info("Key 'C' Press.")
			Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1250)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextDirectory' at 59;17.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextDirectory.Click("59;17")
			Delay.Milliseconds(880)
			Report.Info("Key sequence '{LShiftKey down}D{LShiftKey up}{RShiftKey down}:{RShiftKey up}/test1'.")
			Keyboard.Press("{LShiftKey down}D{LShiftKey up}{RShiftKey down}:{RShiftKey up}/test1")
			Delay.Milliseconds(1920)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 44;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("44;9")
			Delay.Milliseconds(770)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.TextNameText' at 105;12.")
			repo.WebDocumentIceFish.ContainerHBox.TextNameText.Click("105;12", 10)
			Delay.Milliseconds(1110)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 78, 1, False)
			Delay.Milliseconds(0)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(40)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 77, 1, False)
			Delay.Milliseconds(0)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(740)
			Report.Info("Key 'D3' Press.")
			Keyboard.Press(Keys.D3, 4, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1140)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonSave' at 26;15.")
			repo.WebDocumentIceFish.ContainerHBox.ButtonSave.Click("26;15", 10)
			Delay.Milliseconds(2050)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK' at 35;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK.Click("35;11", 10)
			Delay.Milliseconds(840)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonPublish' at 45;6.")
			repo.WebDocumentIceFish.ContainerHBox.ButtonPublish.Click("45;6", 10)
			Delay.Milliseconds(1640)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK1' at 28;13.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK1.Click("28;13", 10)
			Delay.Milliseconds(1300)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_' at 78;11.")
			repo.WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_.Click("78;11", 10)
			Delay.Milliseconds(1080)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status' at 56;12.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status.Click("56;12", 10)
			Delay.Milliseconds(1090)
			Scenario57.click_test3()
			Delay.Milliseconds(1370)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 112;6.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("112;6", 10)
			Delay.Milliseconds(1450)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 92;12.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("92;12", 10)
			Delay.Milliseconds(1170)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel1.ButtonAssign' at 21;7.")
			repo.WebDocumentIceFish1.ContainerPanel1.ButtonAssign.Click("21;7", 10)
			Delay.Milliseconds(2110)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonOK1' at 36;10.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonOK1.Click("36;10", 10)
			Delay.Milliseconds(1090)
			Scenario57.preconditioncompleted()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_' at 50;8.")
			repo.WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_.Click("50;8", 10)
			Delay.Milliseconds(1110)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status' at 57;6.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status.Click("57;6", 10)
			Delay.Milliseconds(3330)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 71;15.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("71;15", 1000)
			Delay.Milliseconds(590)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server' at 65;3.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server.Click("65;3", 1000)
			Delay.Milliseconds(620)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 37;7.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("37;7", 10)
			Delay.Milliseconds(1080)
			Scenario57.processname_ser1()
			Delay.Milliseconds(1400)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 104;2.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("104;2", 10)
			Delay.Milliseconds(1050)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 96;2.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("96;2", 10)
			Delay.Milliseconds(1700)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 27;10.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("27;10", 10)
			Delay.Milliseconds(1080)
			Scenario57.processname_ser2()
			Delay.Milliseconds(1600)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.TextAdministration_' at 55;7.")
			repo.WebDocumentIceFish1.TextAdministration_.Click("55;7", 10)
			Delay.Milliseconds(1620)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin' at 57;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin.Click("57;8", 10)
			Delay.Milliseconds(2910)
			Report.Info("Mouse Left DoubleClick item 'WebDocumentIceFish1.FlexObjectIceFish.CellString14' at 236;6.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.CellString14.DoubleClick("236;6", 10)
			Delay.Milliseconds(2010)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput' at 281;9.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput.Click("281;9", 10)
			Delay.Milliseconds(1200)
			Report.Info("Key 'Back' Press.")
			Keyboard.Press(Keys.Back, 14, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(380)
			Report.Info("Key 'NumPad2' Press.")
			Keyboard.Press(Keys.NumPad2, 77, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(2100)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 39;15.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("39;15", 10)
			Delay.Milliseconds(1640)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 20;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("20;8", 10)
			Delay.Milliseconds(1630)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_' at 88;8.")
			repo.WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_.Click("88;8", 10)
			Delay.Milliseconds(1030)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status' at 92;7.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status.Click("92;7", 10)
			Delay.Milliseconds(5440)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.TableUserGrid.CellString14' at 71;14.")
			repo.WebDocumentIceFish1.TableUserGrid.CellString14.Click("71;14", 10)
			Delay.Milliseconds(1060)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 76;6.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("76;6", 10)
			Delay.Milliseconds(1450)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 79;11.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("79;11", 10)
			Delay.Milliseconds(1230)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 45;14.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("45;14", 10)
			Delay.Milliseconds(2090)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonStart' at 25;11.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonStart.Click("25;11", 10)
			Delay.Milliseconds(160)
			Report.Info("Validating AttributeEqual (Text='Process cannot be started') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextProcess_cannot_be_starte'.")
			Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextProcess_cannot_be_starteInfo, "Text", "Process cannot be started")
			Delay.Milliseconds(860)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonOK2' at 41;18.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonOK2.Click("41;18", 10)
			Delay.Milliseconds(2550)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.TextAdministration_' at 54;12.")
			repo.WebDocumentIceFish1.TextAdministration_.Click("54;12", 10)
			Delay.Milliseconds(1330)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin' at 53;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin.Click("53;9", 10)
			Delay.Milliseconds(1980)
			Report.Info("Mouse Left DoubleClick item 'WebDocumentIceFish1.FlexObjectIceFish.CellString14' at 290;8.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.CellString14.DoubleClick("290;8", 1000)
			Delay.Milliseconds(1180)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput' at 284;10.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput.Click("284;10", 10)
			Delay.Milliseconds(1140)
			Report.Info("Key 'Back' Press.")
			Keyboard.Press(Keys.Back, 14, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(300)
			Report.Info("Key 'NumPad4' Press.")
			Keyboard.Press(Keys.NumPad4, 75, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1360)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 35;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("35;11", 10)
			Delay.Milliseconds(1140)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 27;15.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("27;15", 10)
			Delay.Milliseconds(1170)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_' at 77;7.")
			repo.WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_.Click("77;7", 10)
			Delay.Milliseconds(1170)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status' at 82;8.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status.Click("82;8", 10)
			Delay.Milliseconds(1190)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.TableUserGrid.CellString14' at 61;15.")
			repo.WebDocumentIceFish1.TableUserGrid.CellString14.Click("61;15", 10)
			Delay.Milliseconds(1060)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 43;7.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("43;7", 10)
			Delay.Milliseconds(950)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 51;5.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("51;5", 10)
			Delay.Milliseconds(1470)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 28;3.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("28;3", 10)
			Delay.Milliseconds(2640)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonStart' at 38;11.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonStart.Click("38;11", 10)
			Delay.Milliseconds(210)
			Report.Info("Validating AttributeEqual (Text='Process has been Successfully Started') on item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_has_been_Success'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_has_been_SuccessInfo, "Text", "Process has been Successfully Started")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='OK') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK4'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK4Info, "Text", "OK")
			Delay.Milliseconds(1290)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK4' at 32;19.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK4.Click("32;19", 10)
			Delay.Milliseconds(1110)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 89;12.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("89;12", 10)
			Delay.Milliseconds(1140)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 91;4.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("91;4", 10)
			Delay.Milliseconds(1860)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 31;12.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("31;12", 10)
			Delay.Milliseconds(180)
			Scenario57.validatetest3_status()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 73;9.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("73;9", 10)
			Delay.Milliseconds(1410)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server' at 70;9.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server.Click("70;9", 10)
			Delay.Milliseconds(1530)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 28;13.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("28;13", 10)
			Delay.Milliseconds(150)
			Scenario57.Click_test1()
			Delay.Milliseconds(2320)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonStart' at 34;15.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonStart.Click("34;15", 10)
			Delay.Milliseconds(190)
			Report.Info("Validating AttributeEqual (Text='Process has been Successfully Started') on item 'WebDocumentIceFish.FlexObjectIceFish.TextProcess_has_been_Success'.")
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextProcess_has_been_SuccessInfo, "Text", "Process has been Successfully Started")
			Delay.Milliseconds(1360)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK4' at 23;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK4.Click("23;8", 10)
			Delay.Milliseconds(190)
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace