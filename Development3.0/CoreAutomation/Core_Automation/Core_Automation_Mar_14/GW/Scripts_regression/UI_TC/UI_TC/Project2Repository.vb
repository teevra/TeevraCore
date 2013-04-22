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
Imports System.Drawing
Imports Ranorex
Imports Ranorex.Core
Imports Ranorex.Core.Repository

Namespace UI_TC
	''' <summary>
	''' The class representing the Project2Repository element repository.
	''' </summary>
	<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
	Partial Public Class Project2Repository
		Inherits RepoGenBaseFolder

		Shared _instance As Project2Repository

		''' <summary>
		''' Gets the singleton class instance representing the Project2Repository element repository.
		''' </summary>
		Public Shared ReadOnly Property Instance() As Project2Repository
			Get
				Return _instance
			End Get
		End Property

		''' <summary>
		''' Repository class static constructor.
		''' </summary>
		Shared Sub New()
			_instance = New Project2Repository()
		End Sub

		Dim _webdocumenthash As Project2RepositoryFolders.WebDocumentHashAppFolder

		''' <summary>
		''' Repository class constructor.
		''' </summary>
		Public Sub New()
			MyBase.New("Project2Repository", "", Nothing, 30000, False)
			_webdocumenthash = New Project2RepositoryFolders.WebDocumentHashAppFolder(Me)
		End Sub

		''' <summary>
		''' The WebDocumentHash folder.
		''' </summary>
		Public Overridable ReadOnly Property WebDocumentHash As Project2RepositoryFolders.WebDocumentHashAppFolder
			Get
				Return _webdocumenthash
			End Get
		End Property
	End Class

	''' <summary>
	''' Inner folder classes.
	''' </summary>
	Partial Public Class Project2RepositoryFolders
		''' <summary>
		''' The WebDocumentHashAppFolder folder.
		''' </summary>
		Partial Public Class WebDocumentHashAppFolder
			Inherits RepoGenBaseFolder
			Dim _formform As Project2RepositoryFolders.FormFormFolder
			Dim _containernavigationcanvas As Project2RepositoryFolders.ContainerNavigationCanvasFolder
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new WebDocumentHash  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("WebDocumentHash", "/dom[@domain~'^.*']", Nothing, 30000, False)

				_formform = New Project2RepositoryFolders.FormFormFolder(Me)
				_containernavigationcanvas = New Project2RepositoryFolders.ContainerNavigationCanvasFolder(Me)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 30000, Nothing)
			End Sub

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.WebDocument
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.WebDocument)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property

			''' <summary>
			''' The FormForm folder.
			''' </summary>
			Public Overridable ReadOnly Property FormForm As Project2RepositoryFolders.FormFormFolder
				Get
					Return _formform
				End Get
			End Property

			''' <summary>
			''' The ContainerNavigationCanvas folder.
			''' </summary>
			Public Overridable ReadOnly Property ContainerNavigationCanvas As Project2RepositoryFolders.ContainerNavigationCanvasFolder
				Get
					Return _containernavigationcanvas
				End Get
			End Property
		End Class

		''' <summary>
		''' The FormFormFolder folder.
		''' </summary>
		Partial Public Class FormFormFolder
			Inherits RepoGenBaseFolder
			Dim _buttonsubmitInfo As RepoItemInfo
			Dim _textpasswordtextinputInfo As RepoItemInfo
			Dim _textuseridtextinputInfo As RepoItemInfo
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new FormForm  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("FormForm", "body/flexobject/container/container[@id='mainArea']/container[@id='loginHbox']/container/container/form", parentFolder, 10000, False)

				_buttonsubmitInfo = New RepoItemInfo(Me, "ButtonSubmit", "container[1]/container/button[@text='Submit']", 10000, Nothing)
				_textpasswordtextinputInfo = New RepoItemInfo(Me, "TextPasswordTextInput", "container[2]/text[@id='passwordTextInput']", 10000, Nothing)
				_textuseridtextinputInfo = New RepoItemInfo(Me, "TextUserIdTextInput", "container[3]/text[@id='userIdTextInput']", 10000, Nothing)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing)
			End Sub

			''' <summary>
			''' The ButtonSubmit item.
			''' </summary>
			Public Overridable ReadOnly Property ButtonSubmit As Ranorex.Button
				Get
					Return _buttonsubmitInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonSubmit item info.
			''' </summary>
			Public Overridable ReadOnly Property ButtonSubmitInfo As RepoItemInfo
				Get
					Return _buttonsubmitInfo
				End Get
			End Property

			''' <summary>
			''' The TextPasswordTextInput item.
			''' </summary>
			Public Overridable ReadOnly Property TextPasswordTextInput As Ranorex.Text
				Get
					Return _textpasswordtextinputInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextPasswordTextInput item info.
			''' </summary>
			Public Overridable ReadOnly Property TextPasswordTextInputInfo As RepoItemInfo
				Get
					Return _textpasswordtextinputInfo
				End Get
			End Property

			''' <summary>
			''' The TextUserIdTextInput item.
			''' </summary>
			Public Overridable ReadOnly Property TextUserIdTextInput As Ranorex.Text
				Get
					Return _textuseridtextinputInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextUserIdTextInput item info.
			''' </summary>
			Public Overridable ReadOnly Property TextUserIdTextInputInfo As RepoItemInfo
				Get
					Return _textuseridtextinputInfo
				End Get
			End Property

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.Form
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Form)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property
		End Class

		''' <summary>
		''' The ContainerNavigationCanvasFolder folder.
		''' </summary>
		Partial Public Class ContainerNavigationCanvasFolder
			Inherits RepoGenBaseFolder
			Dim _textadministration_Info As RepoItemInfo
			Dim _textmonitoring_console_Info As RepoItemInfo
			Dim _textprocess_management_Info As RepoItemInfo
			Dim _textprocess_modeling_Info As RepoItemInfo
			Dim _selfInfo As RepoItemInfo

			''' <summary>
			''' Creates a new ContainerNavigationCanvas  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("ContainerNavigationCanvas", "body/flexobject/container/toolbar/container", parentFolder, 10000, False)

				_textadministration_Info = New RepoItemInfo(Me, "TextAdministration_", "text[@id='nav_admin']", 10000, Nothing)
				_textmonitoring_console_Info = New RepoItemInfo(Me, "TextMonitoring_Console_", "text[@id='nav_exceptionHandling']", 10000, Nothing)
				_textprocess_management_Info = New RepoItemInfo(Me, "TextProcess_Management_", "text[@id='nav_processManagement']", 10000, Nothing)
				_textprocess_modeling_Info = New RepoItemInfo(Me, "TextProcess_Modeling_", "text[@id='nav_processModel']", 10000, Nothing)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing)
			End Sub

			''' <summary>
			''' The TextAdministration_ item.
			''' </summary>
			Public Overridable ReadOnly Property TextAdministration_ As Ranorex.Text
				Get
					Return _textadministration_Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextAdministration_ item info.
			''' </summary>
			Public Overridable ReadOnly Property TextAdministration_Info As RepoItemInfo
				Get
					Return _textadministration_Info
				End Get
			End Property

			''' <summary>
			''' The TextMonitoring_Console_ item.
			''' </summary>
			Public Overridable ReadOnly Property TextMonitoring_Console_ As Ranorex.Text
				Get
					Return _textmonitoring_console_Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextMonitoring_Console_ item info.
			''' </summary>
			Public Overridable ReadOnly Property TextMonitoring_Console_Info As RepoItemInfo
				Get
					Return _textmonitoring_console_Info
				End Get
			End Property

			''' <summary>
			''' The TextProcess_Management_ item.
			''' </summary>
			Public Overridable ReadOnly Property TextProcess_Management_ As Ranorex.Text
				Get
					Return _textprocess_management_Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextProcess_Management_ item info.
			''' </summary>
			Public Overridable ReadOnly Property TextProcess_Management_Info As RepoItemInfo
				Get
					Return _textprocess_management_Info
				End Get
			End Property

			''' <summary>
			''' The TextProcess_Modeling_ item.
			''' </summary>
			Public Overridable ReadOnly Property TextProcess_Modeling_ As Ranorex.Text
				Get
					Return _textprocess_modeling_Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextProcess_Modeling_ item info.
			''' </summary>
			Public Overridable ReadOnly Property TextProcess_Modeling_Info As RepoItemInfo
				Get
					Return _textprocess_modeling_Info
				End Get
			End Property

			''' <summary>
			''' The Self item.
			''' </summary>
			Public Overridable ReadOnly Property Self As Ranorex.Container
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Container)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property
		End Class

	End Class
End Namespace