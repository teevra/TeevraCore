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
    ''' The login recording.
    ''' </summary>
    <TestModule("79cd2f65-01f9-434a-bdac-ccb838b7b11a", ModuleType.Recording, 1)> _
    Partial Public Class login
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the Validation_Creation_templatesRepository repository.
        ''' </summary>
        Public Shared repo as Validation_Creation_templatesRepository = Validation_Creation_templatesRepository.Instance

        Shared _instance as login = new login()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As login
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
            Mouse.DefaultMoveTime = 0
            Keyboard.DefaultKeyPressTime = 20
            Delay.SpeedFactor = 0.0

            Init()

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerPanel.ButtonLogout' at Center.", repo.WebDocument10_200_123_11_8080.ContainerPanel.ButtonLogoutInfo, new RecordItemIndex(0))
            repo.WebDocument10_200_123_11_8080.ContainerPanel.ButtonLogout.Click()
                        
            Report.Log(ReportLevel.Info, "Delay", "Waiting for 1000ms.", new RecordItemIndex(1))
            Delay.Duration(1000, False)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerPanel.TextUserIdTextInput' at 30;7.", repo.WebDocument10_200_123_11_8080.ContainerPanel.TextUserIdTextInputInfo, new RecordItemIndex(2))
            repo.WebDocument10_200_123_11_8080.ContainerPanel.TextUserIdTextInput.Click("30;7")
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(3))
            Keyboard.Press(Keys.T, 23, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(4))
            Keyboard.Press(Keys.E, 46, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(5))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'V' Press.", new RecordItemIndex(6))
            Keyboard.Press(Keys.V, 33, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(7))
            Keyboard.Press(Keys.R, 23, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'A' Press.", new RecordItemIndex(8))
            Keyboard.Press(Keys.A, 31, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerPanel.TextPasswordTextInput' at 93;15.", repo.WebDocument10_200_123_11_8080.ContainerPanel.TextPasswordTextInputInfo, new RecordItemIndex(9))
            repo.WebDocument10_200_123_11_8080.ContainerPanel.TextPasswordTextInput.Click("93;15")
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(10))
            Keyboard.Press(Keys.T, 23, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(11))
            Keyboard.Press(Keys.E, 46, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(12))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'V' Press.", new RecordItemIndex(13))
            Keyboard.Press(Keys.V, 33, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(14))
            Keyboard.Press(Keys.R, 23, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'A' Press.", new RecordItemIndex(15))
            Keyboard.Press(Keys.A, 31, Keyboard.DefaultKeyPressTime, 1, False)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerPanel.ButtonSubmit' at Center.", repo.WebDocument10_200_123_11_8080.ContainerPanel.ButtonSubmitInfo, new RecordItemIndex(16))
            repo.WebDocument10_200_123_11_8080.ContainerPanel.ButtonSubmit.Click()
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerVBox1.ButtonNew' at Center.", repo.WebDocument10_200_123_11_8080.ContainerVBox1.ButtonNewInfo, new RecordItemIndex(17))
            repo.WebDocument10_200_123_11_8080.ContainerVBox1.ButtonNew.Click()
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
