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
Imports Ranorex.Core.Testing

Namespace Validation_Creation_templates
	''' <summary>
	''' The class representing the EndpointsRepository element repository.
	''' </summary>
	<System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.1"), RepositoryFolder("31097da2-1aff-446c-99c8-77ee9da049d7")> _
	Partial Public Class EndpointsRepository
		Inherits RepoGenBaseFolder

		Shared _instance As EndpointsRepository = New EndpointsRepository()

		''' <summary>
		''' Gets the singleton class instance representing the EndpointsRepository element repository.
		''' </summary>
		Public Shared ReadOnly Property Instance() As EndpointsRepository
			Get
				Return _instance
			End Get
		End Property

		Dim _webdocument10_200_41_76_8888 As EndpointsRepositoryFolders.WebDocument10_200_41_76_8888AppFolder
		Dim _contextmenuiexplore As EndpointsRepositoryFolders.ContextMenuIexploreAppFolder

		''' <summary>
		''' Repository class constructor.
		''' </summary>
		Public Sub New()
			MyBase.New("EndpointsRepository", "", Nothing, 30000, False)
			_webdocument10_200_41_76_8888 = New EndpointsRepositoryFolders.WebDocument10_200_41_76_8888AppFolder(Me)
			_contextmenuiexplore = New EndpointsRepositoryFolders.ContextMenuIexploreAppFolder(Me)
		End Sub

#Region "Variables"

#End Region

		''' <summary>
		''' The WebDocument10_200_41_76_8888 folder.
		''' </summary>
		<RepositoryFolder("f10386aa-f991-4f5f-bfb9-51e2c9ad1dc3")> _
		Public Overridable ReadOnly Property WebDocument10_200_41_76_8888 As EndpointsRepositoryFolders.WebDocument10_200_41_76_8888AppFolder
			Get
				Return _webdocument10_200_41_76_8888
			End Get
		End Property

		''' <summary>
		''' The ContextMenuIexplore folder.
		''' </summary>
		<RepositoryFolder("94970e3d-3fe8-42c9-ab96-fe8872063a4e")> _
		Public Overridable ReadOnly Property ContextMenuIexplore As EndpointsRepositoryFolders.ContextMenuIexploreAppFolder
			Get
				Return _contextmenuiexplore
			End Get
		End Property
	End Class

	''' <summary>
	''' Inner folder classes.
	''' </summary>
	Partial Public Class EndpointsRepositoryFolders
		''' <summary>
		''' The WebDocument10_200_41_76_8888AppFolder folder.
		''' </summary>
		<RepositoryFolder("f10386aa-f991-4f5f-bfb9-51e2c9ad1dc3")> _
		Partial Public Class WebDocument10_200_41_76_8888AppFolder
			Inherits RepoGenBaseFolder
			Dim _containerhbox As EndpointsRepositoryFolders.ContainerHBoxFolder
			Dim _containersave_successful As EndpointsRepositoryFolders.ContainerSave_successfulFolder
			Dim _formdb_endpoint_configuratio As EndpointsRepositoryFolders.FormDB_Endpoint_ConfiguratioFolder
			Dim _formform As EndpointsRepositoryFolders.FormFormFolder
			Dim _selfInfo As RepoItemInfo
			Dim _texttextinputInfo As RepoItemInfo
			Dim _buttonsaveInfo As RepoItemInfo

			''' <summary>
			''' Creates a new WebDocument10_200_41_76_8888  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("WebDocument10_200_41_76_8888", "/dom[@domain~'^.*']", parentFolder, 30000, False, "f10386aa-f991-4f5f-bfb9-51e2c9ad1dc3")

				_containerhbox = New EndpointsRepositoryFolders.ContainerHBoxFolder(Me)
				_containersave_successful = New EndpointsRepositoryFolders.ContainerSave_successfulFolder(Me)
				_formdb_endpoint_configuratio = New EndpointsRepositoryFolders.FormDB_Endpoint_ConfiguratioFolder(Me)
				_formform = New EndpointsRepositoryFolders.FormFormFolder(Me)
				_selfInfo = New RepoItemInfo(Me, "Self", "", 30000, Nothing, "f10386aa-f991-4f5f-bfb9-51e2c9ad1dc3")
				_texttextinputInfo = New RepoItemInfo(Me, "TextTextInput", "body/flexobject/form[@title='Save Template']/form/container/text[@type='TextInput']", 10000, Nothing, "8859851b-29f1-4522-8eb7-75bd165e971b")
				_buttonsaveInfo = New RepoItemInfo(Me, "ButtonSave", "body/flexobject/form[@title='Save Template']/element[@type='ControlBar']/button[@text='Save']", 10000, Nothing, "93cfd3fb-2cd9-4f4a-a850-6baf2ed4a88e")
			End Sub

			''' <summary>
			''' The Self item.
			''' </summary>
			<RepositoryItem("f10386aa-f991-4f5f-bfb9-51e2c9ad1dc3")> _
			Public Overridable ReadOnly Property Self As Ranorex.WebDocument
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.WebDocument)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			<RepositoryItemInfo("f10386aa-f991-4f5f-bfb9-51e2c9ad1dc3")> _
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property

			''' <summary>
			''' The TextTextInput item.
			''' </summary>
			<RepositoryItem("8859851b-29f1-4522-8eb7-75bd165e971b")> _
			Public Overridable ReadOnly Property TextTextInput As Ranorex.Text
				Get
					Return _texttextinputInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextTextInput item info.
			''' </summary>
			<RepositoryItemInfo("8859851b-29f1-4522-8eb7-75bd165e971b")> _
			Public Overridable ReadOnly Property TextTextInputInfo As RepoItemInfo
				Get
					Return _texttextinputInfo
				End Get
			End Property

			''' <summary>
			''' The ButtonSave item.
			''' </summary>
			<RepositoryItem("93cfd3fb-2cd9-4f4a-a850-6baf2ed4a88e")> _
			Public Overridable ReadOnly Property ButtonSave As Ranorex.Button
				Get
					Return _buttonsaveInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonSave item info.
			''' </summary>
			<RepositoryItemInfo("93cfd3fb-2cd9-4f4a-a850-6baf2ed4a88e")> _
			Public Overridable ReadOnly Property ButtonSaveInfo As RepoItemInfo
				Get
					Return _buttonsaveInfo
				End Get
			End Property

			''' <summary>
			''' The ContainerHBox folder.
			''' </summary>
			<RepositoryFolder("8059dc18-06b1-44ef-87c5-fe15e76f762f")> _
			Public Overridable ReadOnly Property ContainerHBox As EndpointsRepositoryFolders.ContainerHBoxFolder
				Get
					Return _containerhbox
				End Get
			End Property

			''' <summary>
			''' The ContainerSave_successful folder.
			''' </summary>
			<RepositoryFolder("ddfb315e-4dcf-48db-aa45-6d29cbbc2ebb")> _
			Public Overridable ReadOnly Property ContainerSave_successful As EndpointsRepositoryFolders.ContainerSave_successfulFolder
				Get
					Return _containersave_successful
				End Get
			End Property

			''' <summary>
			''' The FormDB_Endpoint_Configuratio folder.
			''' </summary>
			<RepositoryFolder("0858c739-46f4-4358-b199-5bb45c837209")> _
			Public Overridable ReadOnly Property FormDB_Endpoint_Configuratio As EndpointsRepositoryFolders.FormDB_Endpoint_ConfiguratioFolder
				Get
					Return _formdb_endpoint_configuratio
				End Get
			End Property

			''' <summary>
			''' The FormForm folder.
			''' </summary>
			<RepositoryFolder("43f161ba-dd93-4265-9618-b1a452638f3e")> _
			Public Overridable ReadOnly Property FormForm As EndpointsRepositoryFolders.FormFormFolder
				Get
					Return _formform
				End Get
			End Property
		End Class

		''' <summary>
		''' The ContainerHBoxFolder folder.
		''' </summary>
		<RepositoryFolder("8059dc18-06b1-44ef-87c5-fe15e76f762f")> _
		Partial Public Class ContainerHBoxFolder
			Inherits RepoGenBaseFolder
			Dim _selfInfo As RepoItemInfo
			Dim _pictureicon_1Info As RepoItemInfo
			Dim _containergraphcanvasInfo As RepoItemInfo
			Dim _pictureicon_1_14168Info As RepoItemInfo
			Dim _pictureicon_11Info As RepoItemInfo
			Dim _pictureicon_1_32876Info As RepoItemInfo
			Dim _pictureicon_1_32963Info As RepoItemInfo

			''' <summary>
			''' Creates a new ContainerHBox  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("ContainerHBox", "body/flexobject/container/container[@id='mainArea']/container/element/container/container[1]", parentFolder, 10000, False, "8059dc18-06b1-44ef-87c5-fe15e76f762f")

				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing, "8059dc18-06b1-44ef-87c5-fe15e76f762f")
				_pictureicon_1Info = New RepoItemInfo(Me, "PictureIcon_1", "dom[@domain='10.200.41.76:8888']/body/flexobject/container/container[@id='mainArea']/container/element/container/container[1]/container[@caption='Component Palette']/element[@id='compPalette']/element[6]/container[5]/container[2]/container/container/container/picture[@id='icon_1']", 10000, Nothing, "d384c508-f48d-405d-875c-455debb8cf1c")
				_containergraphcanvasInfo = New RepoItemInfo(Me, "ContainerGraphCanvas", "container[@type='VBox']/container[@id='graphCanvas']", 10000, Nothing, "1c5a6663-e227-42d9-a79d-dfe4a269a911")
				_pictureicon_1_14168Info = New RepoItemInfo(Me, "PictureIcon_1_14168", "container[@type='VBox']/container[@id='graphCanvas']/container/picture[@id~'^icon_1_1.*']", 10000, Nothing, "edd3204a-be50-4800-adcf-ee10572a15fe")
				_pictureicon_11Info = New RepoItemInfo(Me, "PictureIcon_11", "container[@caption='Component Palette']/element[@id='compPalette']/element/container/container/container/container/container/picture[@id='icon_1']", 10000, Nothing, "e3f50cab-a344-4d55-9fa7-f3348eb1bcc1")
				_pictureicon_1_32876Info = New RepoItemInfo(Me, "PictureIcon_1_32876", "container[@type='VBox']/container[@id='graphCanvas']/container[@id~'^Box.*']/picture[@id='icon_1_32876']", 10000, Nothing, "6826f41f-ba5d-4fed-8d26-3ef432c148ee")
				_pictureicon_1_32963Info = New RepoItemInfo(Me, "PictureIcon_1_32963", "container[@type='VBox']/container[@id='graphCanvas']/container[@id~'^Box.*']/picture[@id='icon_1_32963']", 10000, Nothing, "ea0eb2e3-7aeb-4e42-8bd5-6c5aac6fe2b8")
			End Sub

			''' <summary>
			''' The Self item.
			''' </summary>
			<RepositoryItem("8059dc18-06b1-44ef-87c5-fe15e76f762f")> _
			Public Overridable ReadOnly Property Self As Ranorex.Container
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Container)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			<RepositoryItemInfo("8059dc18-06b1-44ef-87c5-fe15e76f762f")> _
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_1 item.
			''' </summary>
			<RepositoryItem("d384c508-f48d-405d-875c-455debb8cf1c")> _
			Public Overridable ReadOnly Property PictureIcon_1 As Ranorex.Picture
				Get
					Return _pictureicon_1Info.CreateAdapter(Of Ranorex.Picture)(True)
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_1 item info.
			''' </summary>
			<RepositoryItemInfo("d384c508-f48d-405d-875c-455debb8cf1c")> _
			Public Overridable ReadOnly Property PictureIcon_1Info As RepoItemInfo
				Get
					Return _pictureicon_1Info
				End Get
			End Property

			''' <summary>
			''' The ContainerGraphCanvas item.
			''' </summary>
			<RepositoryItem("1c5a6663-e227-42d9-a79d-dfe4a269a911")> _
			Public Overridable ReadOnly Property ContainerGraphCanvas As Ranorex.Container
				Get
					Return _containergraphcanvasInfo.CreateAdapter(Of Ranorex.Container)(True)
				End Get
			End Property

			''' <summary>
			''' The ContainerGraphCanvas item info.
			''' </summary>
			<RepositoryItemInfo("1c5a6663-e227-42d9-a79d-dfe4a269a911")> _
			Public Overridable ReadOnly Property ContainerGraphCanvasInfo As RepoItemInfo
				Get
					Return _containergraphcanvasInfo
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_1_14168 item.
			''' </summary>
			<RepositoryItem("edd3204a-be50-4800-adcf-ee10572a15fe")> _
			Public Overridable ReadOnly Property PictureIcon_1_14168 As Ranorex.Picture
				Get
					Return _pictureicon_1_14168Info.CreateAdapter(Of Ranorex.Picture)(True)
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_1_14168 item info.
			''' </summary>
			<RepositoryItemInfo("edd3204a-be50-4800-adcf-ee10572a15fe")> _
			Public Overridable ReadOnly Property PictureIcon_1_14168Info As RepoItemInfo
				Get
					Return _pictureicon_1_14168Info
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_11 item.
			''' </summary>
			<RepositoryItem("e3f50cab-a344-4d55-9fa7-f3348eb1bcc1")> _
			Public Overridable ReadOnly Property PictureIcon_11 As Ranorex.Picture
				Get
					Return _pictureicon_11Info.CreateAdapter(Of Ranorex.Picture)(True)
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_11 item info.
			''' </summary>
			<RepositoryItemInfo("e3f50cab-a344-4d55-9fa7-f3348eb1bcc1")> _
			Public Overridable ReadOnly Property PictureIcon_11Info As RepoItemInfo
				Get
					Return _pictureicon_11Info
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_1_32876 item.
			''' </summary>
			<RepositoryItem("6826f41f-ba5d-4fed-8d26-3ef432c148ee")> _
			Public Overridable ReadOnly Property PictureIcon_1_32876 As Ranorex.Picture
				Get
					Return _pictureicon_1_32876Info.CreateAdapter(Of Ranorex.Picture)(True)
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_1_32876 item info.
			''' </summary>
			<RepositoryItemInfo("6826f41f-ba5d-4fed-8d26-3ef432c148ee")> _
			Public Overridable ReadOnly Property PictureIcon_1_32876Info As RepoItemInfo
				Get
					Return _pictureicon_1_32876Info
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_1_32963 item.
			''' </summary>
			<RepositoryItem("ea0eb2e3-7aeb-4e42-8bd5-6c5aac6fe2b8")> _
			Public Overridable ReadOnly Property PictureIcon_1_32963 As Ranorex.Picture
				Get
					Return _pictureicon_1_32963Info.CreateAdapter(Of Ranorex.Picture)(True)
				End Get
			End Property

			''' <summary>
			''' The PictureIcon_1_32963 item info.
			''' </summary>
			<RepositoryItemInfo("ea0eb2e3-7aeb-4e42-8bd5-6c5aac6fe2b8")> _
			Public Overridable ReadOnly Property PictureIcon_1_32963Info As RepoItemInfo
				Get
					Return _pictureicon_1_32963Info
				End Get
			End Property
		End Class

		''' <summary>
		''' The ContainerSave_successfulFolder folder.
		''' </summary>
		<RepositoryFolder("ddfb315e-4dcf-48db-aa45-6d29cbbc2ebb")> _
		Partial Public Class ContainerSave_successfulFolder
			Inherits RepoGenBaseFolder
			Dim _selfInfo As RepoItemInfo
			Dim _buttonokInfo As RepoItemInfo
			Dim _texttemplate_saved_successfuInfo As RepoItemInfo
			Dim _textsave_successfulInfo As RepoItemInfo

			''' <summary>
			''' Creates a new ContainerSave_successful  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("ContainerSave_successful", "body/flexobject/container[@caption='Save successful']", parentFolder, 10000, False, "ddfb315e-4dcf-48db-aa45-6d29cbbc2ebb")

				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing, "ddfb315e-4dcf-48db-aa45-6d29cbbc2ebb")
				_buttonokInfo = New RepoItemInfo(Me, "ButtonOK", "element[@type='AlertForm']/button[@text='OK']", 10000, Nothing, "fe1501b2-b3c2-479d-b276-e8358d5f90aa")
				_texttemplate_saved_successfuInfo = New RepoItemInfo(Me, "TextTemplate_saved_successfu", "element[@type='AlertForm']/text[@caption~'^Template\ saved\ successful']", 10000, Nothing, "8ef2f6be-d4cb-4184-a69b-28e182c6ce68")
				_textsave_successfulInfo = New RepoItemInfo(Me, "TextSave_successful", "element[@type='UIComponent']/text[@caption='Save successful']", 10000, Nothing, "1c39ff3a-04f7-4499-977b-a63cb6c9f014")
			End Sub

			''' <summary>
			''' The Self item.
			''' </summary>
			<RepositoryItem("ddfb315e-4dcf-48db-aa45-6d29cbbc2ebb")> _
			Public Overridable ReadOnly Property Self As Ranorex.Container
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Container)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			<RepositoryItemInfo("ddfb315e-4dcf-48db-aa45-6d29cbbc2ebb")> _
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property

			''' <summary>
			''' The ButtonOK item.
			''' </summary>
			<RepositoryItem("fe1501b2-b3c2-479d-b276-e8358d5f90aa")> _
			Public Overridable ReadOnly Property ButtonOK As Ranorex.Button
				Get
					Return _buttonokInfo.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonOK item info.
			''' </summary>
			<RepositoryItemInfo("fe1501b2-b3c2-479d-b276-e8358d5f90aa")> _
			Public Overridable ReadOnly Property ButtonOKInfo As RepoItemInfo
				Get
					Return _buttonokInfo
				End Get
			End Property

			''' <summary>
			''' The TextTemplate_saved_successfu item.
			''' </summary>
			<RepositoryItem("8ef2f6be-d4cb-4184-a69b-28e182c6ce68")> _
			Public Overridable ReadOnly Property TextTemplate_saved_successfu As Ranorex.Text
				Get
					Return _texttemplate_saved_successfuInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextTemplate_saved_successfu item info.
			''' </summary>
			<RepositoryItemInfo("8ef2f6be-d4cb-4184-a69b-28e182c6ce68")> _
			Public Overridable ReadOnly Property TextTemplate_saved_successfuInfo As RepoItemInfo
				Get
					Return _texttemplate_saved_successfuInfo
				End Get
			End Property

			''' <summary>
			''' The TextSave_successful item.
			''' </summary>
			<RepositoryItem("1c39ff3a-04f7-4499-977b-a63cb6c9f014")> _
			Public Overridable ReadOnly Property TextSave_successful As Ranorex.Text
				Get
					Return _textsave_successfulInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextSave_successful item info.
			''' </summary>
			<RepositoryItemInfo("1c39ff3a-04f7-4499-977b-a63cb6c9f014")> _
			Public Overridable ReadOnly Property TextSave_successfulInfo As RepoItemInfo
				Get
					Return _textsave_successfulInfo
				End Get
			End Property
		End Class

		''' <summary>
		''' The FormDB_Endpoint_ConfiguratioFolder folder.
		''' </summary>
		<RepositoryFolder("0858c739-46f4-4358-b199-5bb45c837209")> _
		Partial Public Class FormDB_Endpoint_ConfiguratioFolder
			Inherits RepoGenBaseFolder
			Dim _selfInfo As RepoItemInfo
			Dim _buttonsave_as_template___Info As RepoItemInfo
			Dim _buttonsave1Info As RepoItemInfo
			Dim _textpassword1Info As RepoItemInfo
			Dim _textpasswordInfo As RepoItemInfo
			Dim _textreadsizeInfo As RepoItemInfo
			Dim _textread_sizeInfo As RepoItemInfo
			Dim _textupdatequeryInfo As RepoItemInfo
			Dim _textupdate_queryInfo As RepoItemInfo
			Dim _textwaitintervalInfo As RepoItemInfo
			Dim _textwait_intervalInfo As RepoItemInfo
			Dim _textquery1Info As RepoItemInfo
			Dim _textqueryInfo As RepoItemInfo
			Dim _textusernameInfo As RepoItemInfo
			Dim _textserverurlInfo As RepoItemInfo
			Dim _textserviceidInfo As RepoItemInfo

			''' <summary>
			''' Creates a new FormDB_Endpoint_Configuratio  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("FormDB_Endpoint_Configuratio", "body/flexobject/form", parentFolder, 10000, False, "0858c739-46f4-4358-b199-5bb45c837209")

				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing, "0858c739-46f4-4358-b199-5bb45c837209")
				_buttonsave_as_template___Info = New RepoItemInfo(Me, "ButtonSave_as_Template___", "element[@type='ControlBar']/button[@text='Save as Template...']", 10000, Nothing, "775ca318-8ac3-4d6b-a927-5491feb920a8")
				_buttonsave1Info = New RepoItemInfo(Me, "ButtonSave1", "element[@type='ControlBar']/button[@text='Save']", 10000, Nothing, "381a51ae-0919-44c0-b495-221a9976ba71")
				_textpassword1Info = New RepoItemInfo(Me, "TextPassword1", "form/container/text[@id='Password']", 10000, Nothing, "f6c7b163-0dc8-44b6-a5e1-7ed932d945b1")
				_textpasswordInfo = New RepoItemInfo(Me, "TextPassword", "form/container/text[@type='FormItemLabel']/text[@caption='Password']", 10000, Nothing, "f040fb0f-a70a-4b70-b34d-c02f4af775ec")
				_textreadsizeInfo = New RepoItemInfo(Me, "TextReadSize", "form/container/text[@id='ReadSize']", 10000, Nothing, "6f4c254f-e5be-4afe-942b-77aa2dd55e78")
				_textread_sizeInfo = New RepoItemInfo(Me, "TextRead_Size", "form/container/text[@type='FormItemLabel']/text[@caption='Read Size']", 10000, Nothing, "03c0ceac-56c4-408e-b566-a16c0114940c")
				_textupdatequeryInfo = New RepoItemInfo(Me, "TextUpdateQuery", "form/container/text[@id='UpdateQuery']", 10000, Nothing, "05625e04-8ac3-4f20-a9af-d1c1dbe189a2")
				_textupdate_queryInfo = New RepoItemInfo(Me, "TextUpdate_Query", "form/container/text[@type='FormItemLabel']/text[@caption='Update Query']", 10000, Nothing, "5679428a-d2b0-4fc9-af87-d50608f619f7")
				_textwaitintervalInfo = New RepoItemInfo(Me, "TextWaitInterval", "form/container/text[@id='WaitInterval']", 10000, Nothing, "54850b24-73ba-4f49-9489-d686fed290e6")
				_textwait_intervalInfo = New RepoItemInfo(Me, "TextWait_Interval", "form/container/text[@type='FormItemLabel']/text[@caption='Wait Interval']", 10000, Nothing, "68a1d8a6-c50f-41ae-a48c-6c9fbbcd2781")
				_textquery1Info = New RepoItemInfo(Me, "TextQuery1", "form/container/text[@id='Query']", 10000, Nothing, "192f4eed-6bf6-47e5-bd1c-486654dbf4f9")
				_textqueryInfo = New RepoItemInfo(Me, "TextQuery", "form/container/text[@type='FormItemLabel']/text[@caption='Query']", 10000, Nothing, "df3a2662-b7b8-4abe-b5d7-54fffb57fdf1")
				_textusernameInfo = New RepoItemInfo(Me, "TextUserName", "form/container/text[@id='UserName']", 10000, Nothing, "8019071c-21b6-43bd-b838-a46200069bf3")
				_textserverurlInfo = New RepoItemInfo(Me, "TextServerURL", "form/container/text[@id='ServerURL']", 10000, Nothing, "dfefd1a5-09e8-459a-9c9d-572229955861")
				_textserviceidInfo = New RepoItemInfo(Me, "TextServiceId", "form/container/text[@id='ServiceId']", 10000, Nothing, "99e7d09e-fa03-48a6-8afe-34ba25e089c4")
			End Sub

			''' <summary>
			''' The Self item.
			''' </summary>
			<RepositoryItem("0858c739-46f4-4358-b199-5bb45c837209")> _
			Public Overridable ReadOnly Property Self As Ranorex.Form
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Form)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			<RepositoryItemInfo("0858c739-46f4-4358-b199-5bb45c837209")> _
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property

			''' <summary>
			''' The ButtonSave_as_Template___ item.
			''' </summary>
			<RepositoryItem("775ca318-8ac3-4d6b-a927-5491feb920a8")> _
			Public Overridable ReadOnly Property ButtonSave_as_Template___ As Ranorex.Button
				Get
					Return _buttonsave_as_template___Info.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonSave_as_Template___ item info.
			''' </summary>
			<RepositoryItemInfo("775ca318-8ac3-4d6b-a927-5491feb920a8")> _
			Public Overridable ReadOnly Property ButtonSave_as_Template___Info As RepoItemInfo
				Get
					Return _buttonsave_as_template___Info
				End Get
			End Property

			''' <summary>
			''' The ButtonSave1 item.
			''' </summary>
			<RepositoryItem("381a51ae-0919-44c0-b495-221a9976ba71")> _
			Public Overridable ReadOnly Property ButtonSave1 As Ranorex.Button
				Get
					Return _buttonsave1Info.CreateAdapter(Of Ranorex.Button)(True)
				End Get
			End Property

			''' <summary>
			''' The ButtonSave1 item info.
			''' </summary>
			<RepositoryItemInfo("381a51ae-0919-44c0-b495-221a9976ba71")> _
			Public Overridable ReadOnly Property ButtonSave1Info As RepoItemInfo
				Get
					Return _buttonsave1Info
				End Get
			End Property

			''' <summary>
			''' The TextPassword1 item.
			''' </summary>
			<RepositoryItem("f6c7b163-0dc8-44b6-a5e1-7ed932d945b1")> _
			Public Overridable ReadOnly Property TextPassword1 As Ranorex.Text
				Get
					Return _textpassword1Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextPassword1 item info.
			''' </summary>
			<RepositoryItemInfo("f6c7b163-0dc8-44b6-a5e1-7ed932d945b1")> _
			Public Overridable ReadOnly Property TextPassword1Info As RepoItemInfo
				Get
					Return _textpassword1Info
				End Get
			End Property

			''' <summary>
			''' The TextPassword item.
			''' </summary>
			<RepositoryItem("f040fb0f-a70a-4b70-b34d-c02f4af775ec")> _
			Public Overridable ReadOnly Property TextPassword As Ranorex.Text
				Get
					Return _textpasswordInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextPassword item info.
			''' </summary>
			<RepositoryItemInfo("f040fb0f-a70a-4b70-b34d-c02f4af775ec")> _
			Public Overridable ReadOnly Property TextPasswordInfo As RepoItemInfo
				Get
					Return _textpasswordInfo
				End Get
			End Property

			''' <summary>
			''' The TextReadSize item.
			''' </summary>
			<RepositoryItem("6f4c254f-e5be-4afe-942b-77aa2dd55e78")> _
			Public Overridable ReadOnly Property TextReadSize As Ranorex.Text
				Get
					Return _textreadsizeInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextReadSize item info.
			''' </summary>
			<RepositoryItemInfo("6f4c254f-e5be-4afe-942b-77aa2dd55e78")> _
			Public Overridable ReadOnly Property TextReadSizeInfo As RepoItemInfo
				Get
					Return _textreadsizeInfo
				End Get
			End Property

			''' <summary>
			''' The TextRead_Size item.
			''' </summary>
			<RepositoryItem("03c0ceac-56c4-408e-b566-a16c0114940c")> _
			Public Overridable ReadOnly Property TextRead_Size As Ranorex.Text
				Get
					Return _textread_sizeInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextRead_Size item info.
			''' </summary>
			<RepositoryItemInfo("03c0ceac-56c4-408e-b566-a16c0114940c")> _
			Public Overridable ReadOnly Property TextRead_SizeInfo As RepoItemInfo
				Get
					Return _textread_sizeInfo
				End Get
			End Property

			''' <summary>
			''' The TextUpdateQuery item.
			''' </summary>
			<RepositoryItem("05625e04-8ac3-4f20-a9af-d1c1dbe189a2")> _
			Public Overridable ReadOnly Property TextUpdateQuery As Ranorex.Text
				Get
					Return _textupdatequeryInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextUpdateQuery item info.
			''' </summary>
			<RepositoryItemInfo("05625e04-8ac3-4f20-a9af-d1c1dbe189a2")> _
			Public Overridable ReadOnly Property TextUpdateQueryInfo As RepoItemInfo
				Get
					Return _textupdatequeryInfo
				End Get
			End Property

			''' <summary>
			''' The TextUpdate_Query item.
			''' </summary>
			<RepositoryItem("5679428a-d2b0-4fc9-af87-d50608f619f7")> _
			Public Overridable ReadOnly Property TextUpdate_Query As Ranorex.Text
				Get
					Return _textupdate_queryInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextUpdate_Query item info.
			''' </summary>
			<RepositoryItemInfo("5679428a-d2b0-4fc9-af87-d50608f619f7")> _
			Public Overridable ReadOnly Property TextUpdate_QueryInfo As RepoItemInfo
				Get
					Return _textupdate_queryInfo
				End Get
			End Property

			''' <summary>
			''' The TextWaitInterval item.
			''' </summary>
			<RepositoryItem("54850b24-73ba-4f49-9489-d686fed290e6")> _
			Public Overridable ReadOnly Property TextWaitInterval As Ranorex.Text
				Get
					Return _textwaitintervalInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextWaitInterval item info.
			''' </summary>
			<RepositoryItemInfo("54850b24-73ba-4f49-9489-d686fed290e6")> _
			Public Overridable ReadOnly Property TextWaitIntervalInfo As RepoItemInfo
				Get
					Return _textwaitintervalInfo
				End Get
			End Property

			''' <summary>
			''' The TextWait_Interval item.
			''' </summary>
			<RepositoryItem("68a1d8a6-c50f-41ae-a48c-6c9fbbcd2781")> _
			Public Overridable ReadOnly Property TextWait_Interval As Ranorex.Text
				Get
					Return _textwait_intervalInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextWait_Interval item info.
			''' </summary>
			<RepositoryItemInfo("68a1d8a6-c50f-41ae-a48c-6c9fbbcd2781")> _
			Public Overridable ReadOnly Property TextWait_IntervalInfo As RepoItemInfo
				Get
					Return _textwait_intervalInfo
				End Get
			End Property

			''' <summary>
			''' The TextQuery1 item.
			''' </summary>
			<RepositoryItem("192f4eed-6bf6-47e5-bd1c-486654dbf4f9")> _
			Public Overridable ReadOnly Property TextQuery1 As Ranorex.Text
				Get
					Return _textquery1Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextQuery1 item info.
			''' </summary>
			<RepositoryItemInfo("192f4eed-6bf6-47e5-bd1c-486654dbf4f9")> _
			Public Overridable ReadOnly Property TextQuery1Info As RepoItemInfo
				Get
					Return _textquery1Info
				End Get
			End Property

			''' <summary>
			''' The TextQuery item.
			''' </summary>
			<RepositoryItem("df3a2662-b7b8-4abe-b5d7-54fffb57fdf1")> _
			Public Overridable ReadOnly Property TextQuery As Ranorex.Text
				Get
					Return _textqueryInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextQuery item info.
			''' </summary>
			<RepositoryItemInfo("df3a2662-b7b8-4abe-b5d7-54fffb57fdf1")> _
			Public Overridable ReadOnly Property TextQueryInfo As RepoItemInfo
				Get
					Return _textqueryInfo
				End Get
			End Property

			''' <summary>
			''' The TextUserName item.
			''' </summary>
			<RepositoryItem("8019071c-21b6-43bd-b838-a46200069bf3")> _
			Public Overridable ReadOnly Property TextUserName As Ranorex.Text
				Get
					Return _textusernameInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextUserName item info.
			''' </summary>
			<RepositoryItemInfo("8019071c-21b6-43bd-b838-a46200069bf3")> _
			Public Overridable ReadOnly Property TextUserNameInfo As RepoItemInfo
				Get
					Return _textusernameInfo
				End Get
			End Property

			''' <summary>
			''' The TextServerURL item.
			''' </summary>
			<RepositoryItem("dfefd1a5-09e8-459a-9c9d-572229955861")> _
			Public Overridable ReadOnly Property TextServerURL As Ranorex.Text
				Get
					Return _textserverurlInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextServerURL item info.
			''' </summary>
			<RepositoryItemInfo("dfefd1a5-09e8-459a-9c9d-572229955861")> _
			Public Overridable ReadOnly Property TextServerURLInfo As RepoItemInfo
				Get
					Return _textserverurlInfo
				End Get
			End Property

			''' <summary>
			''' The TextServiceId item.
			''' </summary>
			<RepositoryItem("99e7d09e-fa03-48a6-8afe-34ba25e089c4")> _
			Public Overridable ReadOnly Property TextServiceId As Ranorex.Text
				Get
					Return _textserviceidInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextServiceId item info.
			''' </summary>
			<RepositoryItemInfo("99e7d09e-fa03-48a6-8afe-34ba25e089c4")> _
			Public Overridable ReadOnly Property TextServiceIdInfo As RepoItemInfo
				Get
					Return _textserviceidInfo
				End Get
			End Property
		End Class

		''' <summary>
		''' The FormFormFolder folder.
		''' </summary>
		<RepositoryFolder("43f161ba-dd93-4265-9618-b1a452638f3e")> _
		Partial Public Class FormFormFolder
			Inherits RepoGenBaseFolder
			Dim _selfInfo As RepoItemInfo
			Dim _textupdatequery1Info As RepoItemInfo
			Dim _textwaitinterval1Info As RepoItemInfo
			Dim _textquery2Info As RepoItemInfo
			Dim _textreadsizeInfo As RepoItemInfo
			Dim _textpasswordInfo As RepoItemInfo

			''' <summary>
			''' Creates a new FormForm  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("FormForm", "body/flexobject/form/form", parentFolder, 10000, False, "43f161ba-dd93-4265-9618-b1a452638f3e")

				_selfInfo = New RepoItemInfo(Me, "Self", "", 10000, Nothing, "43f161ba-dd93-4265-9618-b1a452638f3e")
				_textupdatequery1Info = New RepoItemInfo(Me, "TextUpdateQuery1", "container[2]/text[@id='UpdateQuery']", 10000, Nothing, "7ef1291a-5534-4cda-9be8-31a60e1bd626")
				_textwaitinterval1Info = New RepoItemInfo(Me, "TextWaitInterval1", "container[4]/text[@id='WaitInterval']", 10000, Nothing, "fb690254-9a3d-4fd3-aa9e-d081421832b4")
				_textquery2Info = New RepoItemInfo(Me, "TextQuery2", "container[5]/text[@id='Query']", 10000, Nothing, "2c89b08f-ea12-4460-9921-e4f6549ace44")
				_textreadsizeInfo = New RepoItemInfo(Me, "TextReadSize", "container[1]/text[@id='ReadSize']", 10000, Nothing, "60dbcd47-c165-4f52-8827-4d26c6ac8d2b")
				_textpasswordInfo = New RepoItemInfo(Me, "TextPassword", "container[6]/text[@id='Password']", 10000, Nothing, "4bd56376-1322-4122-9401-8dab89014cfd")
			End Sub

			''' <summary>
			''' The Self item.
			''' </summary>
			<RepositoryItem("43f161ba-dd93-4265-9618-b1a452638f3e")> _
			Public Overridable ReadOnly Property Self As Ranorex.Form
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.Form)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			<RepositoryItemInfo("43f161ba-dd93-4265-9618-b1a452638f3e")> _
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property

			''' <summary>
			''' The TextUpdateQuery1 item.
			''' </summary>
			<RepositoryItem("7ef1291a-5534-4cda-9be8-31a60e1bd626")> _
			Public Overridable ReadOnly Property TextUpdateQuery1 As Ranorex.Text
				Get
					Return _textupdatequery1Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextUpdateQuery1 item info.
			''' </summary>
			<RepositoryItemInfo("7ef1291a-5534-4cda-9be8-31a60e1bd626")> _
			Public Overridable ReadOnly Property TextUpdateQuery1Info As RepoItemInfo
				Get
					Return _textupdatequery1Info
				End Get
			End Property

			''' <summary>
			''' The TextWaitInterval1 item.
			''' </summary>
			<RepositoryItem("fb690254-9a3d-4fd3-aa9e-d081421832b4")> _
			Public Overridable ReadOnly Property TextWaitInterval1 As Ranorex.Text
				Get
					Return _textwaitinterval1Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextWaitInterval1 item info.
			''' </summary>
			<RepositoryItemInfo("fb690254-9a3d-4fd3-aa9e-d081421832b4")> _
			Public Overridable ReadOnly Property TextWaitInterval1Info As RepoItemInfo
				Get
					Return _textwaitinterval1Info
				End Get
			End Property

			''' <summary>
			''' The TextQuery2 item.
			''' </summary>
			<RepositoryItem("2c89b08f-ea12-4460-9921-e4f6549ace44")> _
			Public Overridable ReadOnly Property TextQuery2 As Ranorex.Text
				Get
					Return _textquery2Info.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextQuery2 item info.
			''' </summary>
			<RepositoryItemInfo("2c89b08f-ea12-4460-9921-e4f6549ace44")> _
			Public Overridable ReadOnly Property TextQuery2Info As RepoItemInfo
				Get
					Return _textquery2Info
				End Get
			End Property

			''' <summary>
			''' The TextReadSize item.
			''' </summary>
			<RepositoryItem("60dbcd47-c165-4f52-8827-4d26c6ac8d2b")> _
			Public Overridable ReadOnly Property TextReadSize As Ranorex.Text
				Get
					Return _textreadsizeInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextReadSize item info.
			''' </summary>
			<RepositoryItemInfo("60dbcd47-c165-4f52-8827-4d26c6ac8d2b")> _
			Public Overridable ReadOnly Property TextReadSizeInfo As RepoItemInfo
				Get
					Return _textreadsizeInfo
				End Get
			End Property

			''' <summary>
			''' The TextPassword item.
			''' </summary>
			<RepositoryItem("4bd56376-1322-4122-9401-8dab89014cfd")> _
			Public Overridable ReadOnly Property TextPassword As Ranorex.Text
				Get
					Return _textpasswordInfo.CreateAdapter(Of Ranorex.Text)(True)
				End Get
			End Property

			''' <summary>
			''' The TextPassword item info.
			''' </summary>
			<RepositoryItemInfo("4bd56376-1322-4122-9401-8dab89014cfd")> _
			Public Overridable ReadOnly Property TextPasswordInfo As RepoItemInfo
				Get
					Return _textpasswordInfo
				End Get
			End Property
		End Class

		''' <summary>
		''' The ContextMenuIexploreAppFolder folder.
		''' </summary>
		<RepositoryFolder("94970e3d-3fe8-42c9-ab96-fe8872063a4e")> _
		Partial Public Class ContextMenuIexploreAppFolder
			Inherits RepoGenBaseFolder
			Dim _selfInfo As RepoItemInfo
			Dim _menuitemconfigure_componentInfo As RepoItemInfo

			''' <summary>
			''' Creates a new ContextMenuIexplore  folder.
			''' </summary>
			Public Sub New(parentFolder As RepoGenBaseFolder)
				MyBase.New("ContextMenuIexplore", "/contextmenu[@processname='iexplore']", parentFolder, 30000, True, "94970e3d-3fe8-42c9-ab96-fe8872063a4e")

				_selfInfo = New RepoItemInfo(Me, "Self", "", 30000, Nothing, "94970e3d-3fe8-42c9-ab96-fe8872063a4e")
				_menuitemconfigure_componentInfo = New RepoItemInfo(Me, "MenuItemConfigure_Component", "contextmenu/menuitem[@accessiblename='Configure Component']", 10000, Nothing, "eaca9b21-afb7-4364-80fd-3d6017d6a53f")
			End Sub

			''' <summary>
			''' The Self item.
			''' </summary>
			<RepositoryItem("94970e3d-3fe8-42c9-ab96-fe8872063a4e")> _
			Public Overridable ReadOnly Property Self As Ranorex.ContextMenu
				Get
					Return _selfInfo.CreateAdapter(Of Ranorex.ContextMenu)(True)
				End Get
			End Property

			''' <summary>
			''' The Self item info.
			''' </summary>
			<RepositoryItemInfo("94970e3d-3fe8-42c9-ab96-fe8872063a4e")> _
			Public Overridable ReadOnly Property SelfInfo As RepoItemInfo
				Get
					Return _selfInfo
				End Get
			End Property

			''' <summary>
			''' The MenuItemConfigure_Component item.
			''' </summary>
			<RepositoryItem("eaca9b21-afb7-4364-80fd-3d6017d6a53f")> _
			Public Overridable ReadOnly Property MenuItemConfigure_Component As Ranorex.MenuItem
				Get
					Return _menuitemconfigure_componentInfo.CreateAdapter(Of Ranorex.MenuItem)(True)
				End Get
			End Property

			''' <summary>
			''' The MenuItemConfigure_Component item info.
			''' </summary>
			<RepositoryItemInfo("eaca9b21-afb7-4364-80fd-3d6017d6a53f")> _
			Public Overridable ReadOnly Property MenuItemConfigure_ComponentInfo As RepoItemInfo
				Get
					Return _menuitemconfigure_componentInfo
				End Get
			End Property
		End Class

	End Class
End Namespace
