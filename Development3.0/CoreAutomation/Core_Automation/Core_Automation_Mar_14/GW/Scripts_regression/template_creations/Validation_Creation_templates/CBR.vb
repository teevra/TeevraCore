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
	''' The CBR recording.
	''' </summary>
	<TestModule("7f1f6d72-083f-4389-874a-67269f74e747", ModuleType.Recording, 1)> _
	Partial Public Class CBR
		Implements ITestModule

		''' <summary>
		''' Holds an instance of the Validation_Creation_templatesRepository repository.
		''' </summary>
		Public Shared repo as Validation_Creation_templatesRepository = Validation_Creation_templatesRepository.Instance

		Shared _instance as CBR = new CBR()

		''' <summary>
		''' Constructs a new instance.
		''' </summary>
		Sub New()
		End Sub

		''' <summary>
		''' Gets a static instance of this recording.
		''' </summary>
		Public Shared ReadOnly Property Instance As CBR
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

			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13' at 12;14.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13Info, new RecordItemIndex(0))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13.MoveTo("12;14", 1000)
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(70)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_123_11_8080.ContainerHBox.ContainerGraphCanvas' at 214;130.", repo.WebDocument10_200_123_11_8080.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(1))
			repo.WebDocument10_200_123_11_8080.ContainerHBox.ContainerGraphCanvas.MoveTo("214;130", 1000)
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(350)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13_16591' at 12;24.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13_16591Info, new RecordItemIndex(2))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13_16591.Click(MouseButtons.Right, "12;24", 796)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 18;16.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(3))
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("18;16", 209)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Service Id:*') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextService_Id_Asterisk'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextService_Id_AsteriskInfo, new RecordItemIndex(4))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextService_Id_AsteriskInfo, "Text", "Service Id:*")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Default Target Node:') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDefault_Target_Node_'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDefault_Target_Node_Info, new RecordItemIndex(5))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDefault_Target_Node_Info, "Text", "Default Target Node:")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Operand Type:') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextOperand_Type_'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextOperand_Type_Info, new RecordItemIndex(6))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextOperand_Type_Info, "Text", "Operand Type:")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Seq #') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSeq_Hash1'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSeq_Hash1Info, new RecordItemIndex(7))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSeq_Hash1Info, "Text", "Seq #")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Expression') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextExpression'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextExpressionInfo, new RecordItemIndex(8))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextExpressionInfo, "Text", "Expression")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Destination Node') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDestination_Node'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDestination_NodeInfo, new RecordItemIndex(9))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDestination_NodeInfo, "Text", "Destination Node")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonX4'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonX4Info, new RecordItemIndex(10))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonX4Info, "Text", "X")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='1') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_011'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_011Info, new RecordItemIndex(11))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_011Info, "Text", "1")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField4'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField4Info, new RecordItemIndex(12))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField4Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03Info, new RecordItemIndex(13))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1Info, new RecordItemIndex(14))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1Info, "Text", "Save")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Cancel') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1Info, new RecordItemIndex(15))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1Info, "Text", "Cancel")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Configure Error Handler...') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonConfigure_Error_Handler_'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonConfigure_Error_Handler_Info, new RecordItemIndex(16))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonConfigure_Error_Handler_Info, "Text", "Configure Error Handler...")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save as Template...') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(17))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___Info, "Text", "Save as Template...")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Load template...') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonLoad_template___'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(18))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonLoad_template___Info, "Text", "Load template...")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='1') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_011'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_011Info, new RecordItemIndex(19))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_011Info, "Text", "1")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='2') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_111'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_111Info, new RecordItemIndex(20))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_111Info, "Text", "2")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='4') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_311'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_311Info, new RecordItemIndex(21))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_311Info, "Text", "4")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='4') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_311'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_311Info, new RecordItemIndex(22))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_311Info, "Text", "4")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField5'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField5Info, new RecordItemIndex(23))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField5Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField6'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField6Info, new RecordItemIndex(24))
			Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField6Info)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField7'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField7Info, new RecordItemIndex(25))
			Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField7Info)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField7'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField7Info, new RecordItemIndex(26))
			Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField7Info)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03Info, new RecordItemIndex(27))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03Info, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_13'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_13Info, new RecordItemIndex(28))
			Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_13Info)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_23'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_23Info, new RecordItemIndex(29))
			Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_23Info)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_33'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_33Info, new RecordItemIndex(30))
			Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_33Info)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_33'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_33Info, new RecordItemIndex(31))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_33Info, "Text", "")
			Delay.Milliseconds(2080)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceId' at 76;9.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(32))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceId.Click("76;9", 10)
			Delay.Milliseconds(950)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(33))
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(34))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(50)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(35))
			Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(50)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'V' Press.", new RecordItemIndex(36))
			Keyboard.Press(Keys.V, 47, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(180)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(37))
			Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'C' Press.", new RecordItemIndex(38))
			Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(39))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(270)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(40))
			Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(40)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'D' Press.", new RecordItemIndex(41))
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1070)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDefaultTargetNode' at 32;16.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDefaultTargetNodeInfo, new RecordItemIndex(42))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDefaultTargetNode.Click("32;16", 10)
			Delay.Milliseconds(1190)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'D' Press.", new RecordItemIndex(43))
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(50)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(44))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(970)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'F' Press.", new RecordItemIndex(45))
			Keyboard.Press(Keys.F, 33, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'A' Press.", new RecordItemIndex(46))
			Keyboard.Press(Keys.A, 30, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(250)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'U' Press.", new RecordItemIndex(47))
			Keyboard.Press(Keys.U, 22, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(130)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'L' Press.", new RecordItemIndex(48))
			Keyboard.Press(Keys.L, 38, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(210)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(49))
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(520)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(50))
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(20)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'A' Press.", new RecordItemIndex(51))
			Keyboard.Press(Keys.A, 30, 93, 1, False)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(52))
			Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(470)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'G' Press.", new RecordItemIndex(53))
			Keyboard.Press(Keys.G, 34, 93, 1, False)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(54))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(40)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(55))
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(910)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'N' Press.", new RecordItemIndex(56))
			Keyboard.Press(Keys.N, 49, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(110)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'O' Press.", new RecordItemIndex(57))
			Keyboard.Press(Keys.O, 24, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'C' Press.", new RecordItemIndex(58))
			Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1500)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'Back' Press.", new RecordItemIndex(59))
			Keyboard.Press(Keys.Back, 14, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'D' Press.", new RecordItemIndex(60))
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(61))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1240)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2' at 111;13.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2Info, new RecordItemIndex(62))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2.Click("111;13", 10)
			Delay.Milliseconds(910)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJEXPRESSION' at 103;0.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJEXPRESSIONInfo, new RecordItemIndex(63))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJEXPRESSION.Click("103;0", 10)
			Delay.Milliseconds(770)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField4' at 96;10.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField4Info, new RecordItemIndex(64))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextUITextField4.Click("96;10", 10)
			Delay.Milliseconds(1160)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(65))
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(20)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(66))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(40)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(67))
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(130)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(68))
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1390)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(69))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(140)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'X' Press.", new RecordItemIndex(70))
			Keyboard.Press(Keys.X, 45, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(290)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'P' Press.", new RecordItemIndex(71))
			Keyboard.Press(Keys.P, 25, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(380)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(72))
			Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(73))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(240)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(74))
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(40)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(75))
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(40)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(76))
			Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(50)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'O' Press.", new RecordItemIndex(77))
			Keyboard.Press(Keys.O, 24, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(130)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'N' Press.", new RecordItemIndex(78))
			Keyboard.Press(Keys.N, 49, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1130)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03' at 40;14.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03Info, new RecordItemIndex(79))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03.Click("40;14", 10)
			Delay.Milliseconds(980)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'D' Press.", new RecordItemIndex(80))
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(80)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(81))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(82))
			Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(110)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(83))
			Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(1050)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'N' Press.", new RecordItemIndex(84))
			Keyboard.Press(Keys.N, 49, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(130)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'O' Press.", new RecordItemIndex(85))
			Keyboard.Press(Keys.O, 24, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(250)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'D' Press.", new RecordItemIndex(86))
			Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
						
			Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(87))
			Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
			Delay.Milliseconds(70)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='testexpression') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTestexpression'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTestexpressionInfo, new RecordItemIndex(88))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTestexpressionInfo, "Text", "testexpression")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='destnode') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03Info, new RecordItemIndex(89))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_03Info, "Text", "destnode")
			Delay.Milliseconds(1830)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___' at 30;8.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(90))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___.MoveTo("30;8", 10)
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(1300)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.FormCBR_Configuration' at 241;396.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.FormCBR_ConfigurationInfo, new RecordItemIndex(91))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.FormCBR_Configuration.MoveTo("241;396", 10)
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(780)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1' at 48;12.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1Info, new RecordItemIndex(92))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave1.Click("48;12", 10)
			Delay.Milliseconds(1520)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13_16591' at 21;27.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13_16591Info, new RecordItemIndex(93))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_13_16591.Click(MouseButtons.Right, "21;27", 10)
			Delay.Milliseconds(750)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 35;12.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(94))
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("35;12", 10)
			Delay.Milliseconds(190)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='testexpression') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTestexpression1'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTestexpression1Info, new RecordItemIndex(95))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTestexpression1Info, "Text", "testexpression")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='destnode') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_031'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_031Info, new RecordItemIndex(96))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.Text_031Info, "Text", "destnode")
			Delay.Milliseconds(3930)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1' at 64;5.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1Info, new RecordItemIndex(97))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1.Click("64;5", 10)
			Delay.Milliseconds(1190)
						
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
