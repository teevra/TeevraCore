﻿'//////////////////////////////////////////////////////////////////////////////
'
' This file was automatically generated by RANOREX.
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

Namespace Validation_Creation_templates

	''' <summary>
	''' The Recording1 recording.
	''' </summary>
	Public Partial Class test1

Public Shared Property paramname() As String
		Get
			Return trans_param_name
		End Get
		Set
			trans_param_name = Value
		End Set
		End Property
	
	Private Shared trans_param_name As String
	
	
		Public Shared Sub function2()		
		Dim buttonLoad_template___ As Ranorex.Button
		buttonLoad_template___ = "/dom[@domain~'^.*']/body/flexobject/form/element[@type='ControlBar']/button[@text='Load template...']"
		buttonLoad_template___.Click()
		Dim formChoose_Template As ranorex.Form
		formChoose_Template = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']"
		formChoose_Template.Click()		
		Dim buttonButton As ranorex.Button
		buttonButton = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']/form/container/combobox/button[@type='Button']"
			buttonButton.Click()
			formChoose_Template.Click()

		Dim listList As List
		listList = "/dom[@domain~'^.*']/body/flexobject/list[@type='List']"
					
           Dim count As Integer=listList.Items.Count
          ' messagebox.Show(count)
           dim i as Integer=1

			Dim buttonLoad As Ranorex.Button
			buttonLoad = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']/element[@type='ControlBar']/button[@text='Load']"
			
			For Each item As Ranorex.ListItem In listList.Items
			Keyboard.Press(Keys.Down, 80, Keyboard.DefaultKeyPressTime, 1, False)
			report.Info(item.Text)
			i=i+1
			If StrComp( item.Text,trans_param_name)=0 Then	
				if i<count then
				Keyboard.Press(Keys.Up, 80, Keyboard.DefaultKeyPressTime, 1, False)	
			 	 end if
				buttonLoad.Click		
			exit For
			Else
			report.Info(item.Text+" doesnt matched with " + trans_param_name)
			End If				
			Next
		End Sub

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub

		Private Sub Init()
			' Your recording specific initialization code goes here.
		End Sub

	End Class
End Namespace
