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
    ''' The scenario1 recording.
    ''' </summary>
    <TestModule("ba0e493b-a4a9-47d1-bf3f-d2b9e3131954", ModuleType.Recording, 1)> _
    Partial Public Class scenario1
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the UI_TCRepository repository.
        ''' </summary>
        Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

        Shared _instance as scenario1 = new scenario1()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As scenario1
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

            startsce1()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='User Name') on item 'WebDocumentIceFish1.FormForm.TextUser_Name'.", repo.WebDocumentIceFish1.FormForm.TextUser_NameInfo, new RecordItemIndex(1))
            Validate.Attribute(repo.WebDocumentIceFish1.FormForm.TextUser_NameInfo, "Text", "User Name")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Password') on item 'WebDocumentIceFish1.FormForm.TextPassword'.", repo.WebDocumentIceFish1.FormForm.TextPasswordInfo, new RecordItemIndex(2))
            Validate.Attribute(repo.WebDocumentIceFish1.FormForm.TextPasswordInfo, "Text", "Password")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Submit') on item 'WebDocumentIceFish.FormForm.ButtonSubmit'.", repo.WebDocumentIceFish.FormForm.ButtonSubmitInfo, new RecordItemIndex(3))
            Validate.Attribute(repo.WebDocumentIceFish.FormForm.ButtonSubmitInfo, "Text", "Submit")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Reset') on item 'WebDocumentIceFish1.FormForm.ButtonReset'.", repo.WebDocumentIceFish1.FormForm.ButtonResetInfo, new RecordItemIndex(4))
            Validate.Attribute(repo.WebDocumentIceFish1.FormForm.ButtonResetInfo, "Text", "Reset")
            Delay.Milliseconds(520)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FormForm.TextUserIdTextInput' at 58;8.", repo.WebDocumentIceFish.FormForm.TextUserIdTextInputInfo, new RecordItemIndex(5))
            repo.WebDocumentIceFish.FormForm.TextUserIdTextInput.Click("58;8", 100)
            Delay.Milliseconds(1080)
                        
            userid()
            Delay.Milliseconds(0)
                        
            pwd()
            Delay.Milliseconds(0)
                        
            submit()
            Delay.Milliseconds(0)
                        
            pass_fail()
            Delay.Milliseconds(100)
                        
            end1()
            Delay.Milliseconds(0)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
