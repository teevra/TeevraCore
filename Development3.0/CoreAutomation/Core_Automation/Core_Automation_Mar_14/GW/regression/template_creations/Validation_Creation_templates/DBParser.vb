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
    ''' The DBParser recording.
    ''' </summary>
    <TestModule("431dbf48-ac0b-40ac-8ade-2ec6064a31dd", ModuleType.Recording, 1)> _
    Partial Public Class DBParser
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the parsersRepository repository.
        ''' </summary>
        Public Shared repo as parsersRepository = parsersRepository.Instance

        Shared _instance as DBParser = new DBParser()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As DBParser
            Get
                Return _instance
            End Get
        End Property

#Region "Variables"

#End Region

        ''' <summary>
        ''' Starts the replay of the static recording <see cref="Instance"/>.
        ''' </summary>
        <System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")> _
        Public Shared Sub Start()
            TestModuleRunner.Run(Instance)
        End Sub

        ''' <summary>
        ''' Performs the playback of actions in this recording.
        ''' </summary>
        ''' <remarks>You should not call this method directly, instead pass the module
        ''' instance to the <see cref="TestModuleRunner.Run(Of ITestModule)"/> method
        ''' that will in turn invoke this method.</remarks>
        <System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")> _
        Sub Run() Implements ITestModule.Run
            Mouse.DefaultMoveTime = 300
            Keyboard.DefaultKeyPressTime = 100
            Delay.SpeedFactor = 1.0

            Init()

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonParsers' at 54;7.", repo.WebDocumentIceFish.ContainerHBox.ButtonParsersInfo, new RecordItemIndex(0))
            repo.WebDocumentIceFish.ContainerHBox.ButtonParsers.Click("54;7", 100)
            Delay.Milliseconds(990)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_52' at 15;18.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_52Info, new RecordItemIndex(1))
            repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_52.MoveTo("15;18", 1000)
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(340)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentIceFish.ContainerHBox.ContainerGraphCanvas' at 246;130.", repo.WebDocumentIceFish.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(2))
            repo.WebDocumentIceFish.ContainerHBox.ContainerGraphCanvas.MoveTo("246;130", 906)
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentIceFish1.ContainerHBox.PictureIcon_5_9065' at 22;23.", repo.WebDocumentIceFish1.ContainerHBox.PictureIcon_5_9065Info, new RecordItemIndex(3))
            repo.WebDocumentIceFish1.ContainerHBox.PictureIcon_5_9065.Click(MouseButtons.Right, "22;23")
            Delay.Milliseconds(1510)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 118;5.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(4))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("118;5")
            Delay.Milliseconds(770)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonX'.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonXInfo, new RecordItemIndex(5))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonXInfo, "Text", "X")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonX1'.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonX1Info, new RecordItemIndex(6))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonX1Info, "Text", "X")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonX2'.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonX2Info, new RecordItemIndex(7))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonX2Info, "Text", "X")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonX3'.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonX3Info, new RecordItemIndex(8))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonX3Info, "Text", "X")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='X') on item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonX4'.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonX4Info, new RecordItemIndex(9))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonX4Info, "Text", "X")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Column in result set') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextColumn_in_result_set'.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextColumn_in_result_setInfo, new RecordItemIndex(10))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextColumn_in_result_setInfo, "Text", "Column in result set")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Attributes') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextAttributes'.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextAttributesInfo, new RecordItemIndex(11))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextAttributesInfo, "Text", "Attributes")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput'.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(12))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInputInfo, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput1'.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput1Info, new RecordItemIndex(13))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput1Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput2'.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput2Info, new RecordItemIndex(14))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput2Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput3'.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput3Info, new RecordItemIndex(15))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput3Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput4'.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput4Info, new RecordItemIndex(16))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput4Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.Text_02'.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_02Info, new RecordItemIndex(17))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.Text_02Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.Text_12'.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_12Info, new RecordItemIndex(18))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.Text_12Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.Text_22'.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_22Info, new RecordItemIndex(19))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.Text_22Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.Text_32'.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_32Info, new RecordItemIndex(20))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.Text_32Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocumentIceFish1.FlexObjectIceFish.Text_42'.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_42Info, new RecordItemIndex(21))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.Text_42Info, "Text", "")
            Delay.Milliseconds(1690)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextServiceId' at 84;6.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(22))
            repo.WebDocumentIceFish1.FlexObjectIceFish.TextServiceId.Click("84;6")
            Delay.Milliseconds(930)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'DBParser'.", new RecordItemIndex(23))
            Keyboard.Press("DBParser")
            Delay.Milliseconds(1840)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonButton' at 10;2.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(24))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton.Click("10;2")
            Delay.Milliseconds(440)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput5' at 55;13.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput5Info, new RecordItemIndex(25))
            repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput5.Click("55;13")
            Delay.Milliseconds(330)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{LShiftKey down}S{LShiftKey up}ample{LShiftKey down}_{LShiftKey up}typ'.", new RecordItemIndex(26))
            Keyboard.Press("{LShiftKey down}S{LShiftKey up}ample{LShiftKey down}_{LShiftKey up}typ")
            Delay.Milliseconds(2850)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput' at 132;4.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(27))
            repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput.Click("132;4")
            Delay.Milliseconds(460)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonButton1' at 5;11.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton1Info, new RecordItemIndex(28))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton1.Click("5;11")
            Delay.Milliseconds(520)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'Messageid'.", new RecordItemIndex(29))
            Keyboard.Press("Messageid")
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.Text_02' at 13;15.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_02Info, new RecordItemIndex(30))
            repo.WebDocumentIceFish1.FlexObjectIceFish.Text_02.Click("13;15")
            Delay.Milliseconds(2120)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonButton2' at 13;14.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton2Info, new RecordItemIndex(31))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton2.Click("13;14")
            Delay.Milliseconds(540)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'Contarctid'.", new RecordItemIndex(32))
            Keyboard.Press("Contarctid")
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.Text_02' at 13;15.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_02Info, new RecordItemIndex(33))
            repo.WebDocumentIceFish1.FlexObjectIceFish.Text_02.Click("13;15")
            Delay.Milliseconds(2120)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonButton3' at 18;13.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton3Info, new RecordItemIndex(34))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton3.Click("18;13")
            Delay.Milliseconds(490)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'Status'.", new RecordItemIndex(35))
            Keyboard.Press("Status")
            Delay.Milliseconds(1270)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextStatus' at 108;2.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextStatusInfo, new RecordItemIndex(36))
            repo.WebDocumentIceFish1.FlexObjectIceFish.TextStatus.Click("108;2")
            Delay.Milliseconds(460)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.Text_02' at 13;15.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_02Info, new RecordItemIndex(37))
            repo.WebDocumentIceFish1.FlexObjectIceFish.Text_02.Click("13;15")
            Delay.Milliseconds(2120)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'id'.", new RecordItemIndex(38))
            Keyboard.Press("id")
            Delay.Milliseconds(450)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.Text_12' at 22;15.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_12Info, new RecordItemIndex(39))
            repo.WebDocumentIceFish1.FlexObjectIceFish.Text_12.Click("22;15")
            Delay.Milliseconds(300)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ename'.", new RecordItemIndex(40))
            Keyboard.Press("ename")
            Delay.Milliseconds(170)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.Text_22' at 23;9.", repo.WebDocumentIceFish1.FlexObjectIceFish.Text_22Info, new RecordItemIndex(41))
            repo.WebDocumentIceFish1.FlexObjectIceFish.Text_22.Click("23;9")
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'status'.", new RecordItemIndex(42))
            Keyboard.Press("status")
            Delay.Milliseconds(1270)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonSave_as_Template___' at Center.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(43))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonSave_as_Template___.Click()
            Delay.Milliseconds(240)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonSave_as_Template___' at Center.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(44))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonSave_as_Template___.Click()
            Delay.Milliseconds(490)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput6' at 84;15.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(45))
            repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput6.Click("84;15")
            Delay.Milliseconds(850)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dbParser'.", new RecordItemIndex(46))
            Keyboard.Press("dbParser")
            Delay.Milliseconds(1240)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonSave' at 11;11.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(47))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonSave.Click("11;11")
            Delay.Milliseconds(1240)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonOK' at 41;7.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(48))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonOK.Click("41;7")
            Delay.Milliseconds(1850)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonSave1' at 39;5.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonSave1Info, new RecordItemIndex(49))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonSave1.Click("39;5")
            Delay.Milliseconds(770)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
