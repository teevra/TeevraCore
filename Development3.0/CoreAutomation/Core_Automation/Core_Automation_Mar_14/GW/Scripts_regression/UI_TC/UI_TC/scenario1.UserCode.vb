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

Namespace UI_TC

	''' <summary>
	''' The Recording1 recording.
	''' </summary>
	Public Partial Class scenario1

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub
		
		
		Public Shared Property user_id() As String
		Get
			Return m_userid
		End Get
		Set
			m_userid = Value
		End Set
	End Property
	
	Private Shared m_userid As String
		Public Shared Sub userid()
			Dim textUserIdTextInput As Text
			textUserIdTextInput = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container[@id='loginHbox']/container/container/form/container[3]/text[@id='userIdTextInput']"
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextUserIdTextInput' at 19;12.")
			repo.WebDocumentIceFish.FormForm.TextUserIdTextInput.Click("19;12")
			Delay.Milliseconds(1000)
			Keyboard.Press(m_userid)
			End Sub

		Public Shared Sub UserCodeMethod1()
						
		End Sub







		Public Shared Property pwd_id() As String
		Get
			Return m_pwd
		End Get
		Set
			m_pwd = Value
		End Set
	End Property
	Private Shared m_pwd As String
		Public Shared Sub pwd()
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FormForm.TextPasswordTextInput' at 20;15.")
			repo.WebDocumentIceFish.FormForm.TextPasswordTextInput.Click("20;15")
			Delay.Milliseconds(540)
			Report.Info("Key sequence :" + m_pwd)
			Keyboard.Press(m_pwd)
			Delay.Milliseconds(790)
				
						
		End Sub

		Public Shared Sub submit()
		Dim buttonSubmit As Ranorex.Button
		buttonSubmit = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container[@id='loginHbox']/container/container/form/container[1]/container/button[@text='Submit']"
		buttonSubmit.Click()
		End Sub

		Public Shared Sub pass_fail()
			
				If StrComp(m_pwd,"")=0 Or StrComp(m_userid,"")=0 Then
				Dim textAsteriskLogin_Details_ar As Text
				try
				textAsteriskLogin_Details_ar = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container[@id='loginHbox']/container/text[@caption~'^\*Login\ Details\ are\ missin']"
				report.Success("testcases passsed")
				Dim buttonReset As ranorex.Button
				buttonReset = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container[@id='loginHbox']/container/container/form/container[1]/container/button[@text='Reset']"
				buttonReset.Click
				Catch e As Exception
					report.Failure("Message not proper")
					End Try
				
				Else
					
		
			Try
				Dim textAsteriskLogin_Failed___I As Text
				textAsteriskLogin_Failed___I = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container[@id='loginHbox']/container/text[@caption~'^\*Login\ Failed\ :\ Invalid\ L']"
			Catch e As Exception
				report.Success("userid/pwd coreect for:"+m_pwd+m_userid)
				Dim buttonLogout As ranorex.Button
				buttonLogout = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='logoBox']/button[@id='logoutBtn']"
				buttonLogout.Click
				report.Success("sucessfully loged out")
			End Try
			report.Success("failed for:" +m_pwd+m_userid)
				
	End If	
	
		
			
		
		End Sub

		Public Shared Sub startsce1()
			report.Info("----------------------------------")
			report.Info("Started scenario 1")
			
		End Sub







		Public Shared Sub end1()
			report.Info("----------------------------------")
			report.Info("End of scenario 1")	
		End Sub

	End Class
End Namespace
