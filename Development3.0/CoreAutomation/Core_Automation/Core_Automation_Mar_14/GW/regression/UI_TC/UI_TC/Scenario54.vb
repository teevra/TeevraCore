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

Namespace UI_TC
    ''' <summary>
    ''' The Scenario54 recording.
    ''' </summary>
    <TestModule("10905c2f-82f9-49be-bb67-265e03aabda8", ModuleType.Recording, 1)> _
    Partial Public Class Scenario54
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the UI_TCRepository repository.
        ''' </summary>
        Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

        Shared _instance as Scenario54 = new Scenario54()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As Scenario54
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

            starttest()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.TextAdministration_' at 38;7.", repo.WebDocumentIceFish1.TextAdministration_Info, new RecordItemIndex(1))
            repo.WebDocumentIceFish1.TextAdministration_.Click("38;7", 10)
            Delay.Milliseconds(1750)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin' at 61;10.", repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_AdminInfo, new RecordItemIndex(2))
            repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin.Click("61;10", 10)
            Delay.Milliseconds(160)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Server Id') on item 'WebDocumentIceFish.ContainerVBox.CellString9'.", repo.WebDocumentIceFish.ContainerVBox.CellString9Info, new RecordItemIndex(3))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString9Info, "Text", "Server Id")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Server Name') on item 'WebDocumentIceFish.ContainerVBox.CellString10'.", repo.WebDocumentIceFish.ContainerVBox.CellString10Info, new RecordItemIndex(4))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString10Info, "Text", "Server Name")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='JMX URL') on item 'WebDocumentIceFish.ContainerVBox.CellString11'.", repo.WebDocumentIceFish.ContainerVBox.CellString11Info, new RecordItemIndex(5))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString11Info, "Text", "JMX URL")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Registered Date') on item 'WebDocumentIceFish.ContainerVBox.CellString12'.", repo.WebDocumentIceFish.ContainerVBox.CellString12Info, new RecordItemIndex(6))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString12Info, "Text", "Registered Date")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='1') on item 'WebDocumentIceFish1.Row0.CellString8'.", repo.WebDocumentIceFish1.Row0.CellString8Info, new RecordItemIndex(7))
            Validate.Attribute(repo.WebDocumentIceFish1.Row0.CellString8Info, "Text", "1")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='iceFish_server') on item 'WebDocumentIceFish.ContainerVBox.CellString13'.", repo.WebDocumentIceFish.ContainerVBox.CellString13Info, new RecordItemIndex(8))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerVBox.CellString13Info, "Text", "iceFish_server")
            Delay.Milliseconds(2080)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonRegister' at 46;12.", repo.WebDocumentIceFish.ContainerVBox.ButtonRegisterInfo, new RecordItemIndex(9))
            repo.WebDocumentIceFish.ContainerVBox.ButtonRegister.Click("46;12", 10)
            Delay.Milliseconds(190)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='New Server Configuration') on item 'WebDocumentIceFish.FlexObjectIceFish.TextNew_Server_Configuration'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextNew_Server_ConfigurationInfo, new RecordItemIndex(10))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextNew_Server_ConfigurationInfo, "Text", "New Server Configuration")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Server Name*') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServer_NameAsterisk'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServer_NameAsteriskInfo, new RecordItemIndex(11))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServer_NameAsteriskInfo, "Text", "Server Name*")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='JMX URL*') on item 'WebDocumentIceFish.FlexObjectIceFish.TextJMX_URLAsterisk'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextJMX_URLAsteriskInfo, new RecordItemIndex(12))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextJMX_URLAsteriskInfo, "Text", "JMX URL*")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(13))
            Validate.Exists(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info)
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(14))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, "Text", "Save")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Close') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCloseInfo, new RecordItemIndex(15))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCloseInfo, "Text", "Close")
            Delay.Milliseconds(1250)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 19;9.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(16))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("19;9", 10)
            Delay.Milliseconds(160)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Please enter all mandatory fields') on item 'WebDocumentIceFish.FlexObjectIceFish.TextPlease_enter_all_mandato'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextPlease_enter_all_mandatoInfo, new RecordItemIndex(17))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextPlease_enter_all_mandatoInfo, "Text", "Please enter all mandatory fields")
            Delay.Milliseconds(1220)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK2' at 24;11.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK2Info, new RecordItemIndex(18))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK2.Click("24;11", 10)
            Delay.Milliseconds(2030)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 77;14.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(19))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("77;14", 10)
            Delay.Milliseconds(4160)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(20))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(390)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Back' Press.", new RecordItemIndex(21))
            Keyboard.Press(Keys.Back, 14, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(320)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(22))
            Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(110)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'C' Press.", new RecordItemIndex(23))
            Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(24))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(70)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'F' Press.", new RecordItemIndex(25))
            Keyboard.Press(Keys.F, 33, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(860)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(26))
            Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(40)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(27))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(50)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'H' Press.", new RecordItemIndex(28))
            Keyboard.Press(Keys.H, 35, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(70)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+LShiftKey' Down.", new RecordItemIndex(29))
            Keyboard.Down(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(230)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+OemMinus' Down.", new RecordItemIndex(30))
            Keyboard.Down(Keys.OemMinus, 12, False)
            Delay.Milliseconds(60)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'LShiftKey' Up.", new RecordItemIndex(31))
            Keyboard.Up(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'OemMinus' Up.", new RecordItemIndex(32))
            Keyboard.Up(Keys.OemMinus, 12, False)
            Delay.Milliseconds(140)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(33))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(34))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(35))
            Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'V' Press.", new RecordItemIndex(36))
            Keyboard.Press(Keys.V, 47, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(110)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(37))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(38))
            Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(660)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key '2' Press.", new RecordItemIndex(39))
            Keyboard.Press(Keys.D2, 3, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1270)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput' at 47;15.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(40))
            repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput.Click("47;15", 10)
            Delay.Milliseconds(1340)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'service:jmx:rmi:///jndi/rmi://10.200.41.76:8006/jmxrmi'.", new RecordItemIndex(41))
            Keyboard.Press("service:jmx:rmi:///jndi/rmi://10.200.41.76:8006/jmxrmi")
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 36;10.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(42))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("36;10", 10)
            Delay.Milliseconds(1060)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Server has been successfully registered') on item 'WebDocumentIceFish.FlexObjectIceFish.TextServer_has_been_successf'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextServer_has_been_successfInfo, new RecordItemIndex(43))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextServer_has_been_successfInfo, "Text", "Server has been successfully registered")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='OK') on item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3'.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3Info, new RecordItemIndex(44))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3Info, "Text", "OK")
            Delay.Milliseconds(630)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 38;16.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3Info, new RecordItemIndex(45))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("38;16", 10)
            Delay.Milliseconds(950)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonRegister' at 39;13.", repo.WebDocumentIceFish.ContainerVBox.ButtonRegisterInfo, new RecordItemIndex(46))
            repo.WebDocumentIceFish.ContainerVBox.ButtonRegister.Click("39;13", 10)
            Delay.Milliseconds(910)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 113;12.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(47))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("113;12", 10)
            Delay.Milliseconds(950)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(48))
            Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(50)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'C' Press.", new RecordItemIndex(49))
            Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(50))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(250)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+LShiftKey' Down.", new RecordItemIndex(51))
            Keyboard.Down(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(150)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+F' Down.", new RecordItemIndex(52))
            Keyboard.Down(Keys.F, 33, False)
            Delay.Milliseconds(30)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'LShiftKey' Up.", new RecordItemIndex(53))
            Keyboard.Up(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(60)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'F' Up.", new RecordItemIndex(54))
            Keyboard.Up(Keys.F, 33, False)
            Delay.Milliseconds(120)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(55))
            Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(70)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(56))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(270)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'H' Press.", new RecordItemIndex(57))
            Keyboard.Press(Keys.H, 35, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(140)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+LShiftKey' Down.", new RecordItemIndex(58))
            Keyboard.Down(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(150)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+OemMinus' Press.", new RecordItemIndex(59))
            Keyboard.Press(Keys.OemMinus, 12, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'LShiftKey' Up.", new RecordItemIndex(60))
            Keyboard.Up(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(90)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(61))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(140)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(62))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(70)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(63))
            Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1940)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'V' Press.", new RecordItemIndex(64))
            Keyboard.Press(Keys.V, 47, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(40)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(65))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(70)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(66))
            Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(290)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Tab' Press.", new RecordItemIndex(67))
            Keyboard.Press(Keys.Tab, 15, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1740)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(68))
            Keyboard.Press(Keys.T, 20, 93, 1, False)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(69))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(50)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(70))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(20)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(71))
            Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1160)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 46;5.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(72))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("46;5", 10)
            Delay.Milliseconds(150)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Server cannot be retrieved') on item 'WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextServer_cannot_be_retriev'.", repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextServer_cannot_be_retrievInfo, new RecordItemIndex(73))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextServer_cannot_be_retrievInfo, "Text", "Server cannot be retrieved")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='com.headstrong.icefish.services.serveradmin.exception.UniqueServerException : A server with the name &apos;iceFish_server&apos; is already exists in the system') on item 'WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextCom_headstrong_icefish_s'.", repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextCom_headstrong_icefish_sInfo, new RecordItemIndex(74))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.TextCom_headstrong_icefish_sInfo, "Text", "com.headstrong.icefish.services.serveradmin.exception.UniqueServerException : A server with the name &apos;iceFish_server&apos; is already exists in the system")
            Delay.Milliseconds(860)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerServer_cannot_be_retriev.ButtonOK4' at 15;15.", repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.ButtonOK4Info, new RecordItemIndex(75))
            repo.WebDocumentIceFish.ContainerServer_cannot_be_retriev.ButtonOK4.Click("15;15", 10)
            Delay.Milliseconds(1090)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left DoubleClick item 'WebDocumentIceFish1.TableUserGrid.CellString12' at 95;9.", repo.WebDocumentIceFish1.TableUserGrid.CellString12Info, new RecordItemIndex(76))
            repo.WebDocumentIceFish1.TableUserGrid.CellString12.DoubleClick("95;9", 10)
            Delay.Milliseconds(330)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='service:jmx:rmi:///jndi/rmi://10.200.41.76:8006/jmxrmi') on item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput'.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(77))
            Validate.Attribute(repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInputInfo, "Text", "service:jmx:rmi:///jndi/rmi://10.200.41.76:8006/jmxrmi")
            Delay.Milliseconds(1850)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 78;11.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(78))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("78;11", 10)
            Delay.Milliseconds(230)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='icefish_server2') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(79))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, "Text", "icefish_server2")
            Delay.Milliseconds(1500)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 133;3.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(80))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("133;3", 10)
            Delay.Milliseconds(3360)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextTextInput' at 135;14.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(81))
            repo.WebDocumentIceFish1.FlexObjectIceFish.TextTextInput.Click("135;14", 10)
            Delay.Milliseconds(1170)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6' at 121;10.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(82))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6.Click("121;10", 10)
            Delay.Milliseconds(3250)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(83))
            Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1290)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 38;12.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(84))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("38;12", 10)
            Delay.Milliseconds(1470)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK3' at 25;7.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3Info, new RecordItemIndex(85))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK3.Click("25;7", 10)
            Delay.Milliseconds(1560)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left DoubleClick item 'WebDocumentIceFish1.TableUserGrid.CellString12' at 160;5.", repo.WebDocumentIceFish1.TableUserGrid.CellString12Info, new RecordItemIndex(86))
            repo.WebDocumentIceFish1.TableUserGrid.CellString12.DoubleClick("160;5", 10)
            Delay.Milliseconds(330)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='icefish_server21') on item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput6'.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(87))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput6Info, "Text", "icefish_server21")
            Delay.Milliseconds(1570)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose' at 17;4.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonCloseInfo, new RecordItemIndex(88))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonClose.Click("17;4", 10)
            Delay.Milliseconds(1080)
                        
            printresults()
            Delay.Milliseconds(0)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
