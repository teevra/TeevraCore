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
	Public Partial Class _Create_Delete_Update_User

	

'		Public Shared Sub FindUser_Cancel()
'Dim cellString As Cell
'cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@text='testuser']"
'Dim rowind As Integer
'rowind =0
'rowind= cellString.RowIndex
'
'If rowind > 0 Then
'	Report.Failure("user exist after cancel action: TC <iceFish><IT6><0590 failed")
'Else
'	rowind =0
'	Report.Success("USer doesnt exist after cancel action: TC <iceFish><IT6><0590 passed")
'End If
'
'
'
'End Sub

'Public Shared Sub FindUser_Save()
'		Dim cellString As Cell
'cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@text='Status']/cell[@text~'^.*' and @columnindex='3' and @rowindex='"+rowin+"']"
'Dim rowind As Integer
'rowind =0
'rowind= cellString.RowIndex
'
'If rowind = 0 Then
'	Report.Failure("user doesnt exist after save action: TC <iceFish><IT6><0591 failed")
'Else
'	rowind =0
'	Report.Success("USer  exist after save action: TC <iceFish><IT6><0591 passed")
'End If
'		End Sub
'
'		Shared Sub New()
'			'Your recording specific initialization code goes here.
'		End Sub
'
'Public Shared Sub Clickontestuser()
'		Dim cellString As Cell
'cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@text='testuser']"
'	cellString.DoubleClick
'Dim formform As ranorex.Form
'formform = "/dom[@domain='10.200.41.38:8080']/body/flexobject/form/form[@type='Form']"
'
'
'
'If formForm.Active Then
'	Report.Success("Edit User screen exist: TC <iceFish><IT6><0592 passed")
'	Dim buttonClose As ranorex.Button
'buttonClose = "/dom[@domain='10.200.41.38:8080']/body/flexobject/form/element[@type='ControlBar']/button[@text='Close']"
'buttonClose.Click
'Else
'	Report.Failure("TC <iceFish><IT6><0592 failed")
'End If
'
'			End Sub
'
'		Public Shared Sub Deleteuser()
'			
'				Dim cellString As Cell
'cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@text='testuser']"
'cellString.Click
'Dim buttonDelete As ranorex.Button
'buttonDelete = "/dom[@domain='10.200.41.38:8080']/body/flexobject/container/container[@id='mainArea']/container/element/container/button[@id='deleteButton']"
'buttonDelete.Click
'
'		End Sub

		Public Shared Sub Verify_save()
            Dim tableUserGrid As Table
			tableUserGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='userGrid']"
			Dim rowcount As integer
			rowcount =tableUserGrid.Rows.Count
			msgbox(rowcount)
			Dim columnName As Column
			columnName = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']"
			Dim a As string
			a=0
			Dim b As Integer=0
		
			Dim username as Cell
			Do Until a=rowcount
				msgbox(rowcount)
				msgbox(a)
				username="/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='1' and @rowindex='"+a+"']"
				If String.Compare("icefish",username.Text.ToString)=0 Then
					
					b=b+1
						
				End If
				a=a+1			
			Loop
			If b=1 Then
				Report.Success("Test user exist after Save: <iceFish><IT6><0591 passed")
			Else
				Report.Failure("Test user not exist after Save: <iceFish><IT6><0591 failed")
			End If
		End Sub

		Public Shared Sub verify_close()
            Dim tableUserGrid As Table
			tableUserGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='userGrid']"
			Dim rowcount As integer
			rowcount =tableUserGrid.Rows.Count
			Dim columnName As Column
			columnName = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']"
			Dim a As string
			a=0
			Dim b As Integer=0		
			Dim username as Cell
			Do Until a=rowcount			
				username="/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='1' and @rowindex='"+a+"']"
				If String.Compare("icefish",username.Text.ToString)=0 Then
										b=b+1					
				End If
				a=a+1			
			Loop
			If b=0 Then
				Report.Success("Test user not exist after close: <iceFish><IT6><0590 passed")
			Else
				Report.Failure("Test user  exist after close: <iceFish><IT6><0590 failed")
			End If	
		End Sub

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub

		Public Shared Sub newuser_save()
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonNew' at 19;11.")
			repo.WebDocumentIceFish.ContainerHBox.ButtonNew.Click("19;11")
			'Delay.Milliseconds(1250)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput' at 131;13.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput.Click("131;13")
			'Delay.Milliseconds(980)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 100, 1, False)
			'Delay.Milliseconds(20)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(70)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 93, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 100, 1, False)
			'Delay.Milliseconds(820)
			Report.Info("Key 'U' Press.")
			Keyboard.Press(Keys.U, 22, 100, 1, False)
			'Delay.Milliseconds(50)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 100, 1, False)
			'Delay.Milliseconds(80)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(80)
			Report.Info("Key 'R' Press.")
			Keyboard.Press(Keys.R, 19, 100, 1, False)
			Report.Info("Key 'o' Press.")
			Keyboard.Press(Keys.o, 19, 100, 1, False)
			'Delay.Milliseconds(1180)
			Report.Info("Key 'n' Press.")
			Keyboard.Press(Keys.n, 19, 100, 1, False)
			Report.Info("Key 'e' Press.")
			Keyboard.Press(Keys.e, 19, 100, 1, False)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput1' at 115;12.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput1.Click("115;12")
			'Delay.Milliseconds(1230)
			Report.Info("Key 'F' Press.")
			Keyboard.Press(Keys.F, 33, 100, 1, False)
			'Delay.Milliseconds(110)
			Report.Info("Key 'I' Press.")
			Keyboard.Press(Keys.I, 23, 100, 1, False)
			'Delay.Milliseconds(470)
			Report.Info("Key 'R' Press.")
			Keyboard.Press(Keys.R, 19, 100, 1, False)
			'Delay.Milliseconds(130)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 100, 1, False)
			'Delay.Milliseconds(70)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 100, 1, False)
			'Delay.Milliseconds(490)
			Report.Info("Key 'N' Press.")
			Keyboard.Press(Keys.N, 49, 77, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'A' Press.")
			Keyboard.Press(Keys.A, 30, 100, 1, False)
			'Delay.Milliseconds(50)
			Report.Info("Key 'M' Press.")
			Keyboard.Press(Keys.M, 50, 100, 1, False)
			'Delay.Milliseconds(30)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(1270)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput2' at 98;11.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput2.Click("98;11")
			'Delay.Milliseconds(940)
			Report.Info("Key 'L' Press.")
			Keyboard.Press(Keys.L, 38, 100, 1, False)
			'Delay.Milliseconds(40)
			Report.Info("Key 'A' Press.")
			Keyboard.Press(Keys.A, 30, 100, 1, False)
			'Delay.Milliseconds(80)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 100, 1, False)
			'Delay.Milliseconds(100)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 100, 1, False)
			'Delay.Milliseconds(350)
			Report.Info("Key 'N' Press.")
			Keyboard.Press(Keys.N, 49, 100, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'A' Press.")
			Keyboard.Press(Keys.A, 30, 100, 1, False)
			'Delay.Milliseconds(30)
			Report.Info("Key 'M' Press.")
			Keyboard.Press(Keys.M, 50, 100, 1, False)
			'Delay.Milliseconds(20)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(1130)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput5' at 85;19.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput5.Click("85;19")
			'Delay.Milliseconds(860)
			Report.Info("Key 'P' Press.")
			Keyboard.Press(Keys.P, 25, 100, 1, False)
			'Delay.Milliseconds(380)
			Report.Info("Key 'W' Press.")
			Keyboard.Press(Keys.W, 17, 100, 1, False)
			'Delay.Milliseconds(70)
			Report.Info("Key 'D' Press.")
			Keyboard.Press(Keys.D, 32, 100, 1, False)
			'Delay.Milliseconds(910)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3' at 77;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3.Click("77;9")
			'Delay.Milliseconds(810)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(160)
			Report.Info("Key 'M' Press.")
			Keyboard.Press(Keys.M, 50, 93, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'A' Press.")
			Keyboard.Press(Keys.A, 30, 100, 1, False)
			'Delay.Milliseconds(100)
			Report.Info("Key 'I' Down.")
			Keyboard.Down(Keys.I, 23, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'O' Press.")
			Keyboard.Press(Keys.O, 24, 61, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'I' Up.")
			Keyboard.Up(Keys.I, 23, False)
			'Delay.Milliseconds(810)
			Report.Info("Key 'L' Press.")
			Keyboard.Press(Keys.L, 38, 100, 1, False)
			'Delay.Milliseconds(490)
			Report.Info("Key 'LShiftKey, Shift' Down.")
			Keyboard.Down(Keys.LShiftKey, 42, False)
			''''Delay.Milliseconds(290)
			Report.Info("Key 'D2, Shift' Down.")
			Keyboard.Down(Keys.D2, 3, False)
			'Delay.Milliseconds(30)
			Report.Info("Key 'LShiftKey' Up.")
			Keyboard.Up(Keys.LShiftKey, 42, False)
			'Delay.Milliseconds(60)
			Report.Info("Key 'D2' Up.")
			Keyboard.Up(Keys.D2, 3, False)
			'Delay.Milliseconds(530)
			Report.Info("Key 'H' Press.")
			Keyboard.Press(Keys.H, 35, 100, 1, False)
			'Delay.Milliseconds(320)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 100, 1, False)
			'Delay.Milliseconds(500)
			Report.Info("Key 'OemPeriod' Press.")
			Keyboard.Press(Keys.OemPeriod, 52, 100, 1, False)
			'Delay.Milliseconds(50)
			Report.Info("Key 'C' Press.")
			Keyboard.Press(Keys.C, 46, 100, 1, False)
			'Delay.Milliseconds(180)
			Report.Info("Key 'O' Press.")
			Keyboard.Press(Keys.O, 24, 100, 1, False)
			'Delay.Milliseconds(110)
			Report.Info("Key 'M' Press.")
			Keyboard.Press(Keys.M, 50, 100, 1, False)
			'Delay.Milliseconds(1050)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput4' at 70;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4.Click("70;10")
			'Delay.Milliseconds(830)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextACTIVE' at 68;5.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextACTIVE.Click("68;5")
			'Delay.Milliseconds(1330)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 31;14.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("31;14")
			'Delay.Milliseconds(210)
			Report.Info("Validating AttributeEqual (Text='Save User') on item 'WebDocumentIceFish.ContainerSave_User.TextSave_User'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerSave_User.TextSave_UserInfo, "Text", "Save User")
			'Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='User has been added successfully') on item 'WebDocumentIceFish.ContainerSave_User.TextUser_has_been_added_succ'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerSave_User.TextUser_has_been_added_succInfo, "Text", "User has been added successfully")
			'Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='OK') on item 'WebDocumentIceFish.ContainerSave_User.ButtonOK'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerSave_User.ButtonOKInfo, "Text", "OK")
			'Delay.Milliseconds(1070)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.ContainerSave_User.ButtonOK' at 13;6.")
			repo.WebDocumentIceFish.ContainerSave_User.ButtonOK.Click("13;6")
			'Delay.Milliseconds(1080)		
		End Sub

		Public Shared Sub verify_save1()
			 Dim tableUserGrid As Table
			tableUserGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='userGrid']"
			Dim rowcount As integer
			rowcount =tableUserGrid.Rows.Count
			msgbox(rowcount)
			Dim columnName As Column
			columnName = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']"
			Dim a As string
			a=0
			Dim b As Integer=0
		
			Dim username as Cell
			Do Until a=rowcount
				msgbox(rowcount)
				msgbox(a)
				username="/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='1' and @rowindex='"+a+"']"
				If String.Compare("testuserone",username.Text.ToString)=0 Then
					
					b=b+1
						
				End If
				a=a+1			
			Loop
			If b=1 Then
				Report.Success("Test user exist after Save: <iceFish><IT6><0593 passed")
			Else
				Report.Failure("Test user not exist after Save: <iceFish><IT6><0593 failed")
			End If		
		End Sub

		Public Shared Sub newuser_Close()
						repo.WebDocumentIceFish.ContainerHBox.ButtonNew.Click("32;14")
			'Delay.Milliseconds(210)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput' at 79;10.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput.Click("79;10")
			'Delay.Milliseconds(1550)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 100, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(70)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 46, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 100, 1, False)
			'Delay.Milliseconds(1600)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput1' at 64;5.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput1.Click("64;5")
			'Delay.Milliseconds(940)
			Report.Info("Key 'F' Press.")
			Keyboard.Press(Keys.F, 33, 100, 1, False)
			'Delay.Milliseconds(140)
			Report.Info("Key 'I' Press.")
			Keyboard.Press(Keys.I, 23, 100, 1, False)
			'Delay.Milliseconds(140)
			Report.Info("Key 'R' Press.")
			Keyboard.Press(Keys.R, 19, 100, 1, False)
			'Delay.Milliseconds(140)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 100, 1, False)
			'Delay.Milliseconds(110)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 100, 1, False)
			'Delay.Milliseconds(490)
			Report.Info("Key 'N' Press.")
			Keyboard.Press(Keys.N, 49, 93, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'A' Press.")
			Keyboard.Press(Keys.A, 30, 100, 1, False)
			'Delay.Milliseconds(40)
			Report.Info("Key 'M' Press.")
			Keyboard.Press(Keys.M, 50, 100, 1, False)
			'Delay.Milliseconds(50)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(990)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput2' at 49;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput2.Click("49;8")
			'Delay.Milliseconds(1170)
			Report.Info("Key 'L' Press.")
			Keyboard.Press(Keys.L, 38, 100, 1, False)
			'Delay.Milliseconds(610)
			Report.Info("Key 'A' Press.")
			Keyboard.Press(Keys.A, 30, 100, 1, False)
			'Delay.Milliseconds(80)
			Report.Info("Key 'S' Press.")
			Keyboard.Press(Keys.S, 31, 100, 1, False)
			'Delay.Milliseconds(130)
			Report.Info("Key 'T' Press.")
			Keyboard.Press(Keys.T, 20, 100, 1, False)
			'Delay.Milliseconds(640)
			Report.Info("Key 'N' Press.")
			Keyboard.Press(Keys.N, 49, 100, 1, False)
			'Delay.Milliseconds(50)
			Report.Info("Key 'A' Press.")
			Keyboard.Press(Keys.A, 30, 93, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'M' Press.")
			Keyboard.Press(Keys.M, 50, 100, 1, False)
			'Delay.Milliseconds(100)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(960)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput5' at 41;14.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput5.Click("41;14")
			'Delay.Milliseconds(860)
			Report.Info("Key 'P' Press.")
			Keyboard.Press(Keys.P, 25, 100, 1, False)
			'Delay.Milliseconds(110)
			Report.Info("Key 'W' Press.")
			Keyboard.Press(Keys.W, 17, 100, 1, False)
			'Delay.Milliseconds(140)
			Report.Info("Key 'D' Press.")
			Keyboard.Press(Keys.D, 32, 100, 1, False)
			'Delay.Milliseconds(720)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput3' at 37;4.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput3.Click("37;4")
			'Delay.Milliseconds(860)
			Report.Info("Key 'E' Press.")
			Keyboard.Press(Keys.E, 18, 100, 1, False)
			'Delay.Milliseconds(140)
			Report.Info("Key 'M' Press.")
			Keyboard.Press(Keys.M, 50, 100, 1, False)
			'Delay.Milliseconds(0)
			Report.Info("Key 'A' Press.")
			Keyboard.Press(Keys.A, 30, 100, 1, False)
			'Delay.Milliseconds(100)
			Report.Info("Key 'I' Press.")
			Keyboard.Press(Keys.I, 23, 100, 1, False)
			'Delay.Milliseconds(110)
			Report.Info("Key 'L' Press.")
			Keyboard.Press(Keys.L, 38, 100, 1, False)
			'Delay.Milliseconds(1550)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput4' at 35;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput4.Click("35;9")
			'Delay.Milliseconds(1280)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextACTIVE' at 32;1.")
			repo.WebDocumentIceFish.FlexObjectIceFish.TextACTIVE.Click("32;1")
			'Delay.Milliseconds(3450)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose' at 31;8.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonClose.Click("31;8")
			'Delay.Milliseconds(1110)	
		End Sub

		Public Shared Sub UserCodeMethod1()
			'Your code here. Code inside this method will not be changed by the code generator.
			
		End Sub

		Public Shared Sub verify_close1()
			            Dim tableUserGrid As Table
			tableUserGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='userGrid']"
			Dim rowcount As integer
			rowcount =tableUserGrid.Rows.Count
			Dim columnName As Column
			columnName = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']"
			Dim a As string
			a=0
			Dim b As Integer=0		
			Dim username as Cell
			Do Until a=rowcount			
				username="/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='1' and @rowindex='"+a+"']"
				If String.Compare("test",username.Text.ToString)=0 Then
										b=b+1					
				End If
				a=a+1			
			Loop
			If b=0 Then
				Report.Success("Test user not exist after close: <iceFish><IT6><0592 passed")
			Else
				Report.Failure("Test user  exist after close: <iceFish><IT6><0592 failed")
			End If			
		End Sub

		Public Shared Sub deleteuser()
	Dim cellString As Cell
cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/row[@index='1']/cell[@text='testuser']"
cellString.Click
Dim buttonDelete As ranorex.Button
buttonDelete = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/container/button[@id='deleteButton']"
buttonDelete.Click
Dim containerConfirm_delete As Container
containerConfirm_delete = "/dom[@domain~'^.*']/body/flexobject/container[@caption='Confirm delete']"
Dim buttonNo As Ranorex.Button
buttonNo = "/dom[@domain~'^.*']/body/flexobject/container[@caption='Confirm delete']/element[@type='AlertForm']/button[@text='No']"
buttonNo.Click
verify_close()
cellString.Click
buttonDelete.Click
Dim buttonYes As Ranorex.Button
buttonYes = "/dom[@domain~'^.*']/body/flexobject/container[@caption='Confirm delete']/element[@type='AlertForm']/button[@text='Yes']"
buttonYes.Click
Verify_save()

Report.Success("<iceFish><IT6><0595 to <iceFish><IT6><0598> passed")



	End Sub

		Public Shared Sub Mouse_Click_ButtonClose1()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info("Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonClose' at 21;9.")
			repo.WebDocumentIceFish.FlexObjectIceFish.ButtonClose.Click("21;9")
		End Sub

		Public Shared Sub modify_cancel()
			Dim cellString As Cell
cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/row[@index='1']/cell[@text='testuser']"
cellString.DoubleClick

		End Sub

	End Class
End Namespace
