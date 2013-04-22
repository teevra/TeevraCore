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
	''' The XMLParser recording.
	''' </summary>
	<TestModule("f3c974d0-640d-4285-be81-b6a0662ad8da", ModuleType.Recording, 1)> _
	Partial Public Class XMLParser
		Implements ITestModule

		''' <summary>
		''' Holds an instance of the parsersRepository repository.
		''' </summary>
		Public Shared repo as parsersRepository = parsersRepository.Instance

		Shared _instance as XMLParser = new XMLParser()

		''' <summary>
		''' Constructs a new instance.
		''' </summary>
		Sub New()
		End Sub

		''' <summary>
		''' Gets a static instance of this recording.
		''' </summary>
		Public Shared ReadOnly Property Instance As XMLParser
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

			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_4' at 10;21.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_4Info, new RecordItemIndex(0))
			repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_4.MoveTo("10;21", 1000)
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(790)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentIceFish.ContainerHBox.ContainerGraphCanvas' at 458;130.", repo.WebDocumentIceFish.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(1))
			repo.WebDocumentIceFish.ContainerHBox.ContainerGraphCanvas.MoveTo("458;130", 1000)
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(710)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_4_40991' at 24;26.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_4_40991Info, new RecordItemIndex(2))
			repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_4_40991.Click(MouseButtons.Right, "24;26", 1000)
			Delay.Milliseconds(280)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 17;4.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(3))
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("17;4", 224)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId2'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(4))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId2Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='serviceId') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId2'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(5))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId2Info, "Id", "serviceId")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId2'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(6))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId2Info, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Schema Name:') on item 'WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_1'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_1Info, new RecordItemIndex(7))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_1Info, "Text", "Schema Name:")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='Label') on item 'WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_1'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_1Info, new RecordItemIndex(8))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextSchema_Name_1Info, "Type", "Label")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Attributes') on item 'WebDocumentIceFish.FlexObjectIceFish.TextAttributes1'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextAttributes1Info, new RecordItemIndex(9))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextAttributes1Info, "Text", "Attributes")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='XPath') on item 'WebDocumentIceFish.FlexObjectIceFish.TextXPath'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextXPathInfo, new RecordItemIndex(10))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextXPathInfo, "Text", "XPath")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonX'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonXInfo, new RecordItemIndex(11))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonXInfo, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput2'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput2Info, new RecordItemIndex(12))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput2Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.Text_021'.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_021Info, new RecordItemIndex(13))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.Text_021Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonX1'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonX1Info, new RecordItemIndex(14))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonX1Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonX2'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonX2Info, new RecordItemIndex(15))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonX2Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonX3'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonX3Info, new RecordItemIndex(16))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonX3Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonX4'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonX4Info, new RecordItemIndex(17))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonX4Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3Info, new RecordItemIndex(18))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput4'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4Info, new RecordItemIndex(19))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput5'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput5Info, new RecordItemIndex(20))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput5Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(21))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.Text_121'.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_121Info, new RecordItemIndex(22))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.Text_121Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.Text_221'.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_221Info, new RecordItemIndex(23))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.Text_221Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.Text_32'.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_32Info, new RecordItemIndex(24))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.Text_32Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish.FlexObjectIceFish.Text_42'.", repo.WebDocumentIceFish.FlexObjectIceFish.Text_42Info, new RecordItemIndex(25))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.Text_42Info, "Text", "")
			Delay.Milliseconds(1430)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextServiceId2' at 54;17.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(26))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextServiceId2.Click("54;17")
			Delay.Milliseconds(990)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'serv'.", new RecordItemIndex(27))
			Keyboard.Press("serv")
			Delay.Milliseconds(1690)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput7' at 72;6.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput7Info, new RecordItemIndex(28))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput7.Click("72;6")
			Delay.Milliseconds(1260)
						
			getSchemaname()
			Delay.Milliseconds(3090)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ElementGrid' at 129;52.", repo.WebDocumentIceFish.FlexObjectIceFish.ElementGridInfo, new RecordItemIndex(30))
			repo.WebDocumentIceFish.FlexObjectIceFish.ElementGrid.Click("129;52")
			Delay.Milliseconds(370)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput2' at 89;13.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput2Info, new RecordItemIndex(31))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput2.Click("89;13")
			Delay.Milliseconds(1210)
						
			getAttr1()
			Delay.Milliseconds(710)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput4' at 69;4.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4Info, new RecordItemIndex(33))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4.Click("69;4")
			Delay.Milliseconds(820)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3' at 70;8.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3Info, new RecordItemIndex(34))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3.Click("70;8")
			Delay.Milliseconds(870)
						
			getAttr2()
			Delay.Milliseconds(1010)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput4' at 64;12.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4Info, new RecordItemIndex(36))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4.Click("64;12")
			Delay.Milliseconds(770)
						
			getAttr3()
			Delay.Milliseconds(1460)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput5' at 69;17.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput5Info, new RecordItemIndex(38))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput5.Click("69;17")
			Delay.Milliseconds(1070)
						
			getAttr4()
			Delay.Milliseconds(670)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 73;7.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(40))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("73;7")
			Delay.Milliseconds(1040)
						
			getAttr5()
			Delay.Milliseconds(620)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.Text_022' at 28;11.", repo.WebDocumentIceFish.ContainerVBox.Text_022Info, new RecordItemIndex(42))
			repo.WebDocumentIceFish.ContainerVBox.Text_022.Click("28;11")
			Delay.Milliseconds(1120)
						
			getXpath1()
			Delay.Milliseconds(870)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.Text_122' at 40;10.", repo.WebDocumentIceFish.ContainerVBox.Text_122Info, new RecordItemIndex(44))
			repo.WebDocumentIceFish.ContainerVBox.Text_122.Click("40;10")
			Delay.Milliseconds(1010)
						
			getXpath2()
			Delay.Milliseconds(1180)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.Text_222' at 56;13.", repo.WebDocumentIceFish.ContainerVBox.Text_222Info, new RecordItemIndex(46))
			repo.WebDocumentIceFish.ContainerVBox.Text_222.Click("56;13")
			Delay.Milliseconds(1230)
						
			getXpath3()
			Delay.Milliseconds(1090)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.Text_321' at 49;12.", repo.WebDocumentIceFish.ContainerVBox.Text_321Info, new RecordItemIndex(48))
			repo.WebDocumentIceFish.ContainerVBox.Text_321.Click("49;12")
			Delay.Milliseconds(1090)
						
			getXpath4()
			Delay.Milliseconds(870)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.Text_421' at 57;17.", repo.WebDocumentIceFish.ContainerVBox.Text_421Info, new RecordItemIndex(50))
			repo.WebDocumentIceFish.ContainerVBox.Text_421.Click("57;17")
			Delay.Milliseconds(1120)
						
			Keyboard5()
			Delay.Milliseconds(600)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(52))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, "Text", "Save")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Cancel') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonCancel'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCancelInfo, new RecordItemIndex(53))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCancelInfo, "Text", "Cancel")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocumentIceFish.FlexObjectIceFish.FormXML_Parser_Configuration'.", repo.WebDocumentIceFish.FlexObjectIceFish.FormXML_Parser_ConfigurationInfo, new RecordItemIndex(54))
			Validate.Exists(repo.WebDocumentIceFish.FlexObjectIceFish.FormXML_Parser_ConfigurationInfo)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save as Template...') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(55))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___Info, "Text", "Save as Template...")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Load template...') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonLoad_template___'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(56))
			Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonLoad_template___Info, "Text", "Load template...")
			Delay.Milliseconds(800)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___' at 90;10.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(57))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave_as_Template___.Click("90;10")
			Delay.Milliseconds(800)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput1' at 38;7.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput1Info, new RecordItemIndex(58))
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput1.Click("38;7")
			Delay.Milliseconds(1260)
						
			getTempName_XMLParserr()
			Delay.Milliseconds(870)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 32;10.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(60))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("32;10")
			Delay.Milliseconds(1070)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK' at 35;8.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(61))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK.Click("35;8")
			Delay.Milliseconds(880)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 32;7.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(62))
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("32;7")
			Delay.Milliseconds(820)
						
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
