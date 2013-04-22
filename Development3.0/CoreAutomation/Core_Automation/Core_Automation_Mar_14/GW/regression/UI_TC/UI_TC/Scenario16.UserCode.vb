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
imports System.Data

Namespace UI_TC

	''' <summary>
	''' The Recording1 recording.
	''' </summary>
	Public Partial Class Scenario16
		
			Public shared Sub clickontestprocess()
			dim process_name as String="test_51"
			Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
			Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			Dim val As String =0
			dim  Rowin as String=0
			Do Until temp = count
			Dim cellStr As Cell
			cellStr = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			Report.Info("-----------------------")
			report.Info(cellStr.Text)
			Report.Info( process_name)
			Report.Info("***********************")
			If StrComp( cellStr.Text,process_name)=0  Then
				val= val+1
				Report.Info(temp)
				rowin=temp
				exit do
				End If
				temp=temp+1
			Loop
			Dim row59 As Row
			row59 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/row[@index='"+rowin+"']"
			row59.Click
		End Sub

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub

		Public Shared Sub valdata1()
			dim process_name as String="test_51"
			Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
			Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			Dim val As String =0
			dim  Rowin as String=0
			Do Until temp = count
			Dim cellStr As Cell
			cellStr = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellStr.Text,process_name)=0  Then
				val= val+1
				rowin=temp
				End If
				temp=temp+1
			Loop
			Dim processname As String
			Dim processstatus As String
			Dim servername As String
			Dim cellString1 As Cell
			cellString1 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex=2 and @rowindex='"+rowin+"']"
			processname = cellString1.Text.ToString
			Dim cellString2 As Cell
			cellString2 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Run Status']/cell[@columnindex=3 and @rowindex='"+rowin+"']"
			processstatus=cellString2.Text.ToString
			Dim cellString3 As Cell
			cellString3 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Server']/cell[@columnindex=4 and @rowindex='"+rowin+"']"
			servername=cellString3.Text.ToString
			
			If processname=processname And processstatus="STOPPED" And servername="icefish_server" Then
				Report.Success("test cases passed")
			End If					
		End Sub

		Public Shared Sub UserCodeMethod1()
			'Your code here. Code inside this method will not be changed by the code generator.
			
		End Sub

		Public Shared Sub val_afterstart()
			dim process_name as String="test_51"
			Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
			Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			Dim val As String =0
			dim  Rowin as String=0
			Do Until temp = count
			Dim cellStr As Cell
			cellStr = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellStr.Text,process_name)=0  Then
				val= val+1
				rowin=temp
				End If
				temp=temp+1
			Loop
			Dim processstatus As String
			Dim servername As String
			Dim cellString1 As Cell
			dim processname as String
			cellString1 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex=2 and @rowindex='"+rowin+"']"
			processname = cellString1.Text.ToString
			Dim cellString2 As Cell
			cellString2 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Run Status']/cell[@columnindex=3 and @rowindex='"+rowin+"']"
			processstatus=cellString2.Text.ToString
			Dim cellString3 As Cell
			cellString3 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Server']/cell[@columnindex=4 and @rowindex='"+rowin+"']"
			servername=cellString3.Text.ToString
			
			If processname=processname And processstatus="RUNNING" And servername="icefish_server" Then
				Report.Success("test cases passed")
			End If
			
		End Sub

		Public Shared Sub validate_stop()
		dim process_name as String="test_51"
		Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
			Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			Dim val As String =0
			dim  Rowin as String=0
			Do Until temp = count
			Dim cellStr As Cell
			cellStr = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellStr.Text,process_name)=0  Then
				val= val+1
				rowin=temp
				End If
				temp=temp+1
			Loop
			Dim processstatus As String
			Dim servername As String
			Dim cellString1 As Cell
			dim processname as String
			cellString1 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex=2 and @rowindex='"+rowin+"']"
			processname = cellString1.Text.ToString
			Dim cellString2 As Cell
			cellString2 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Run Status']/cell[@columnindex=3 and @rowindex='"+rowin+"']"
			processstatus=cellString2.Text.ToString
			Dim cellString3 As Cell
			cellString3 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Server']/cell[@columnindex=4 and @rowindex='"+rowin+"']"
			servername=cellString3.Text.ToString
			
			If processname=processname And processstatus="STOPPED" And servername="icefish_server" Then
				Report.Success("test cases passed")
			End If		
			End Sub

		Public Shared Sub vxcvxcv()
			'Your code here. Code inside this method will not be changed by the code generator.
			
		End Sub

		Private Sub Init()
			' Your recording specific initialization code goes here.
		End Sub

	End Class
End Namespace
