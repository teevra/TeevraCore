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
	''' The test recording.
	''' </summary>
	<TestModule("07b94f7f-53cb-45ed-a89f-2e00ffe742fd", ModuleType.Recording, 1)> _
	Partial Public Class test
		Implements ITestModule

		''' <summary>
		''' Holds an instance of the Validation_Creation_templatesRepository repository.
		''' </summary>
		Public Shared repo as Validation_Creation_templatesRepository = Validation_Creation_templatesRepository.Instance

		Shared _instance as test = new test()

		''' <summary>
		''' Constructs a new instance.
		''' </summary>
		Sub New()
		End Sub

		''' <summary>
		''' Gets a static instance of this recording.
		''' </summary>
		Public Shared ReadOnly Property Instance As test
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

			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2' at 37;12.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2Info, new RecordItemIndex(0))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2.Click("37;12")
			Delay.Milliseconds(2650)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2' at 38;13.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2Info, new RecordItemIndex(1))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput2.Click("38;13")
			Delay.Milliseconds(840)
						
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace