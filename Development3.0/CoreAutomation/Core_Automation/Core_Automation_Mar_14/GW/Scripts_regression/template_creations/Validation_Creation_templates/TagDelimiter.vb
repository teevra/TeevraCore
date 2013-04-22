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
	''' The TagDelimiter recording.
	''' </summary>
	<TestModule("5a97bdbf-a71a-46b2-8e92-9aad1e351fac", ModuleType.Recording, 1)> _
	Partial Public Class TagDelimiter
		Implements ITestModule

		''' <summary>
		''' Holds an instance of the FormattersRepository repository.
		''' </summary>
		Public Shared repo as FormattersRepository = FormattersRepository.Instance

		Shared _instance as TagDelimiter = new TagDelimiter()

		''' <summary>
		''' Constructs a new instance.
		''' </summary>
		Sub New()
		End Sub

		''' <summary>
		''' Gets a static instance of this recording.
		''' </summary>
		Public Shared ReadOnly Property Instance As TagDelimiter
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

			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerHBox.ButtonFormatters1' at 72;12.", repo.WebDocument10_200_41_76_8888.ContainerHBox.ButtonFormatters1Info, new RecordItemIndex(0))
			repo.WebDocument10_200_41_76_8888.ContainerHBox.ButtonFormatters1.Click("72;12", 100)
			Delay.Milliseconds(990)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_9' at 6;17.", repo.WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_9Info, new RecordItemIndex(1))
			repo.WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_9.MoveTo("6;17", 1000)
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(150)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvas' at 138;93.", repo.WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(2))
			repo.WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvas.MoveTo("138;93", 1000)
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(1280)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_9_8954' at 24;21.", repo.WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_9_8954Info, new RecordItemIndex(3))
			repo.WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_9_8954.Click(MouseButtons.Right, "24;21", 1000)
			Delay.Milliseconds(30)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 23;4.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(4))
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("23;4", 240)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(5))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='serviceId') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(6))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, "Id", "serviceId")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(7))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Schema Name:') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSchema_Name_'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSchema_Name_Info, new RecordItemIndex(8))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSchema_Name_Info, "Text", "Schema Name:")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='Label') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSchema_Name_'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSchema_Name_Info, new RecordItemIndex(9))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSchema_Name_Info, "Type", "Label")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiter'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiterInfo, new RecordItemIndex(10))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiterInfo, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='delimiter') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiter'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiterInfo, new RecordItemIndex(11))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiterInfo, "Id", "delimiter")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiter'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiterInfo, new RecordItemIndex(12))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiterInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLine'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(13))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLineInfo, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='messageStartLine') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLine'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(14))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLineInfo, "Id", "messageStartLine")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLine'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(15))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLineInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPattern'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(16))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPatternInfo, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='footerPattern') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPattern'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(17))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPatternInfo, "Id", "footerPattern")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPattern'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(18))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPatternInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Field Index') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextField_Index'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextField_IndexInfo, new RecordItemIndex(19))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextField_IndexInfo, "Text", "Field Index")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='Label') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextField_Index'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextField_IndexInfo, new RecordItemIndex(20))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextField_IndexInfo, "Type", "Label")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Attributes') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextAttributes'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextAttributesInfo, new RecordItemIndex(21))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextAttributesInfo, "Text", "Attributes")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonXInfo, new RecordItemIndex(22))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonXInfo, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX1'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX1Info, new RecordItemIndex(23))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX1Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX2'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX2Info, new RecordItemIndex(24))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX2Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX3'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX3Info, new RecordItemIndex(25))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX3Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX4'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX4Info, new RecordItemIndex(26))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonX4Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_01'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_01Info, new RecordItemIndex(27))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_01Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_11'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_11Info, new RecordItemIndex(28))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_11Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_21'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_21Info, new RecordItemIndex(29))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_21Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_31'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_31Info, new RecordItemIndex(30))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_31Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_41'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_41Info, new RecordItemIndex(31))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_41Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(32))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInputInfo, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput1'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput1Info, new RecordItemIndex(33))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput1Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput2'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput2Info, new RecordItemIndex(34))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput2Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput3'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput3Info, new RecordItemIndex(35))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput3Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput4'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput4Info, new RecordItemIndex(36))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput4Info, "Text", "")
			Delay.Milliseconds(1570)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId' at 15;8.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(37))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId.Click("15;8")
			Delay.Milliseconds(630)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'service'.", new RecordItemIndex(38))
			Keyboard.Press("service")
			Delay.Milliseconds(510)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput5' at 72;14.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput5Info, new RecordItemIndex(39))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput5.Click("72;14")
			Delay.Milliseconds(290)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'Sample_typ'.", new RecordItemIndex(40))
			Keyboard.Press("Sample_typ")
			Delay.Milliseconds(3870)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiter' at 56;20.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiterInfo, new RecordItemIndex(41))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDelimiter.Click("56;20")
			Delay.Milliseconds(510)
						
			getDelimiter_Tagdel()
			Delay.Milliseconds(1540)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLine' at 53;3.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLineInfo, new RecordItemIndex(43))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessageStartLine.Click("53;3")
			Delay.Milliseconds(680)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(44))
			Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(640)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPattern' at 36;3.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPatternInfo, new RecordItemIndex(45))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextFooterPattern.Click("36;3")
			Delay.Milliseconds(650)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'footer'.", new RecordItemIndex(46))
			Keyboard.Press("footer")
			Delay.Milliseconds(1690)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_01' at 38;16.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_01Info, new RecordItemIndex(47))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_01.Click("38;16")
			Delay.Milliseconds(2380)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(48))
			Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1140)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton' at 10;12.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(49))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton.Click("10;12")
			Delay.Milliseconds(880)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessage_id' at 98;14.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessage_idInfo, new RecordItemIndex(50))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextMessage_id.Click("98;14")
			Delay.Milliseconds(440)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_11' at 99;20.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_11Info, new RecordItemIndex(51))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_11.Click("99;20")
			Delay.Milliseconds(760)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key '2' Press.", new RecordItemIndex(52))
			Keyboard.Press(Keys.D2, 3, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(580)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton1' at 10;10.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton1Info, new RecordItemIndex(53))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton1.Click("10;10")
			Delay.Milliseconds(490)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextContract_id' at 90;3.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextContract_idInfo, new RecordItemIndex(54))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextContract_id.Click("90;3")
			Delay.Milliseconds(400)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_21' at 104;11.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_21Info, new RecordItemIndex(55))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_21.Click("104;11")
			Delay.Milliseconds(760)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key '3' Press.", new RecordItemIndex(56))
			Keyboard.Press(Keys.D3, 4, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(800)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton2' at 17;13.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton2Info, new RecordItemIndex(57))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton2.Click("17;13")
			Delay.Milliseconds(590)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextStatus' at 85;9.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextStatusInfo, new RecordItemIndex(58))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextStatus.Click("85;9")
			Delay.Milliseconds(2160)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___' at 103;15.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(59))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___.Click("103;15")
			Delay.Milliseconds(830)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput6' at 31;14.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(60))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput6.Click("31;14")
			Delay.Milliseconds(570)
						
			GetTempName_TagDel()
			Delay.Milliseconds(3400)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave' at 41;4.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(62))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave.Click("41;4", 224)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Template saved successfully.') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTemplate_saved_successfu'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTemplate_saved_successfuInfo, new RecordItemIndex(63))
			Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTemplate_saved_successfuInfo, "Text", "Template saved successfully.")
			Delay.Milliseconds(940)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK' at 42;13.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(64))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK.Click("42;13")
			Delay.Milliseconds(1930)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1' at 20;14.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1Info, new RecordItemIndex(65))
			repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1.Click("20;14")
			Delay.Milliseconds(790)
						
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
