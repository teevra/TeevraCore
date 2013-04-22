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
Imports Ranorex.Core.Testing

Namespace Validation_Creation_templates
	''' <summary>
	''' The tagdelparser recording.
	''' </summary>
	<TestModule("2811364e-6f4a-41b8-802f-76b079a580da", ModuleType.Recording, 1)> _
	Partial Public Class tagdelparser
		Implements ITestModule

		''' <summary>
		''' Holds an instance of the parsersRepository repository.
		''' </summary>
		Public Shared repo as parsersRepository = parsersRepository.Instance

		Shared _instance as tagdelparser = new tagdelparser()

		''' <summary>
		''' Constructs a new instance.
		''' </summary>
		Sub New()
		End Sub

		''' <summary>
		''' Gets a static instance of this recording.
		''' </summary>
		Public Shared ReadOnly Property Instance As tagdelparser
			Get
				Return _instance
			End Get
		End Property

#Region "Variables"

#End Region

		''' <summary>
		''' Starts the replay of the static recording <see cref="Instance"/>.
		''' </summary>
		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.1")> _
		Public Shared Sub Start()
			TestModuleRunner.Run(Instance)
		End Sub

		''' <summary>
		''' Performs the playback of actions in this recording.
		''' </summary>
		''' <remarks>You should not call this method directly, instead pass the module
		''' instance to the <see cref="TestModuleRunner.Run(Of ITestModule)"/> method
		''' that will in turn invoke this method.</remarks>
		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.1")> _
		Sub Run() Implements ITestModule.Run
			Mouse.DefaultMoveTime = 300
			Keyboard.DefaultKeyPressTime = 100
			Delay.SpeedFactor = 1.0

			Init()

			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_6' at 14;19.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_6Info, new RecordItemIndex(0))
			repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_6.MoveTo("14;19")
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(1380)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentIceFish.ContainerHBox.ContainerGraphCanvas' at 468;69.", repo.WebDocumentIceFish.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(1))
			repo.WebDocumentIceFish.ContainerHBox.ContainerGraphCanvas.MoveTo("468;69")
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(980)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_6_41930' at 28;30.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_6_41930Info, new RecordItemIndex(2))
			repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_6_41930.Click(MouseButtons.Right, "28;30")
			Delay.Milliseconds(1850)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 31;8.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(3))
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("31;8")
			Delay.Milliseconds(1260)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId1' at 56;4.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId1Info, new RecordItemIndex(4))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId1.Click("56;4")
			Delay.Milliseconds(900)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tage'.", new RecordItemIndex(5))
			Keyboard.Press("tage")
			Delay.Milliseconds(2530)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonButton' at 5;11.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(6))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton.Click("5;11")
			Delay.Milliseconds(620)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput' at 90;9.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(7))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput.Click("90;9")
			Delay.Milliseconds(1660)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'Sample_typ'.", new RecordItemIndex(8))
			Keyboard.Press("Sample_typ")
			Delay.Milliseconds(420)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextDelimiter' at 105;8.", repo.WebDocumentIceFish.FlexObjectIceFish.TextDelimiterInfo, new RecordItemIndex(9))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextDelimiter.Click("105;8")
			Delay.Milliseconds(660)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '@'.", new RecordItemIndex(10))
			Keyboard.Press("@")
			Delay.Milliseconds(1080)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLine' at 95;7.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(11))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextMessageStartLine.Click("95;7")
			Delay.Milliseconds(760)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(12))
			Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(680)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextFooterPattern' at 19;13.", repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(13))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPattern.Click("19;13")
			Delay.Milliseconds(870)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_011' at 105;15.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_011Info, new RecordItemIndex(14))
			repo.WebDocumentIceFish.FlexObjectIceFish.Text_011.Click("105;15")
			Delay.Milliseconds(680)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(15))
			Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(270)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_111' at 77;11.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_111Info, new RecordItemIndex(16))
			repo.WebDocumentIceFish.FlexObjectIceFish.Text_111.Click("77;11", 280)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key '2' Press.", new RecordItemIndex(17))
			Keyboard.Press(Keys.D2, 3, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(300)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.Text_211' at 71;12.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_211Info, new RecordItemIndex(18))
			repo.WebDocumentIceFish.FlexObjectIceFish.Text_211.Click("71;12", 264)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key '3' Press.", new RecordItemIndex(19))
			Keyboard.Press(Keys.D3, 4, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(880)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonButton1' at 8;15.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton1Info, new RecordItemIndex(20))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton1.Click("8;15")
			Delay.Milliseconds(600)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextMessage_id' at 108;3.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMessage_idInfo, new RecordItemIndex(21))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextMessage_id.Click("108;3")
			Delay.Milliseconds(370)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonButton2' at 5;6.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton2Info, new RecordItemIndex(22))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton2.Click("5;6")
			Delay.Milliseconds(540)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextContract_id' at 63;5.", repo.WebDocumentIceFish.FlexObjectIceFish.TextContract_idInfo, new RecordItemIndex(23))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextContract_id.Click("63;5")
			Delay.Milliseconds(490)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonButton3' at 7;11.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton3Info, new RecordItemIndex(24))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonButton3.Click("7;11")
			Delay.Milliseconds(760)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextStatus' at 56;13.", repo.WebDocumentIceFish.FlexObjectIceFish.TextStatusInfo, new RecordItemIndex(25))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextStatus.Click("56;13")
			Delay.Milliseconds(1410)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextFooterPattern' at 56;12.", repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(26))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextFooterPattern.Click("56;12")
			Delay.Milliseconds(690)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___' at 52;11.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(27))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___.Click("52;11")
			Delay.Milliseconds(1020)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput1' at 23;12.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput1Info, new RecordItemIndex(28))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput1.Click("23;12")
			Delay.Milliseconds(760)
						
			getTempname_tagdel()
			Delay.Milliseconds(1150)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 45;7.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(30))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("45;7")
			Delay.Milliseconds(830)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK' at 22;10.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(31))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK.Click("22;10")
			Delay.Milliseconds(1600)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 28;11.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(32))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("28;11")
			Delay.Milliseconds(770)
						
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
