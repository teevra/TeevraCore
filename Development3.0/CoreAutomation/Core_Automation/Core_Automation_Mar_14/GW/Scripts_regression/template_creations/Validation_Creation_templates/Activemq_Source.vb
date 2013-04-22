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
	''' The Activemq_Source recording.
	''' </summary>
	<TestModule("1d40e37c-6ba9-4c92-b339-c781ecc8d5b5", ModuleType.Recording, 1)> _
	Partial Public Class Activemq_Source
		Implements ITestModule

		''' <summary>
		''' Holds an instance of the FILE_FTP_JMS_TCPRepository repository.
		''' </summary>
		Public Shared repo as FILE_FTP_JMS_TCPRepository = FILE_FTP_JMS_TCPRepository.Instance

		Shared _instance as Activemq_Source = new Activemq_Source()

		''' <summary>
		''' Constructs a new instance.
		''' </summary>
		Sub New()
		End Sub

		''' <summary>
		''' Gets a static instance of this recording.
		''' </summary>
		Public Shared ReadOnly Property Instance As Activemq_Source
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

			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2' at 6;11.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2Info, new RecordItemIndex(0))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2.MoveTo("6;11", 1000)
			Mouse.ButtonDown(MouseButtons.Left)
			Delay.Milliseconds(590)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_123_11_8080.ContainerHBox.ContainerGraphCanvas' at 497;149.", repo.WebDocument10_200_123_11_8080.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(1))
			repo.WebDocument10_200_123_11_8080.ContainerHBox.ContainerGraphCanvas.MoveTo("497;149", 1000)
			Mouse.ButtonUp(MouseButtons.Left)
			Delay.Milliseconds(230)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2_448110' at 19;17.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2_448110Info, new RecordItemIndex(2))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2_448110.Click(MouseButtons.Right, "19;17", 1000)
			Delay.Milliseconds(230)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 18;5.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(3))
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("18;5", 100)
			Delay.Milliseconds(0)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Service Id') on item 'WebDocument10_200_123_11_8080.FormForm.TextService_Id1'.", repo.WebDocument10_200_123_11_8080.FormForm.TextService_Id1Info, new RecordItemIndex(4))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextService_Id1Info, "Text", "Service Id")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='ServiceId') on item 'WebDocument10_200_123_11_8080.FormForm.TextServiceId1'.", repo.WebDocument10_200_123_11_8080.FormForm.TextServiceId1Info, new RecordItemIndex(5))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextServiceId1Info, "Id", "ServiceId")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextServiceId1'.", repo.WebDocument10_200_123_11_8080.FormForm.TextServiceId1Info, new RecordItemIndex(6))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextServiceId1Info, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURL'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURLInfo, new RecordItemIndex(7))
			Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURLInfo)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPProviderURL'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPProviderURLInfo, new RecordItemIndex(8))
			Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPProviderURLInfo)
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactor'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactorInfo, new RecordItemIndex(9))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactorInfo, "Text", "")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='LDAPInitialContextFactory') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactor'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactorInfo, new RecordItemIndex(10))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactorInfo, "Id", "LDAPInitialContextFactory")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactor'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactorInfo, new RecordItemIndex(11))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPInitialContextFactorInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='LDAPSecurityAuthentication') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityAuthenticati'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityAuthenticatiInfo, new RecordItemIndex(12))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityAuthenticatiInfo, "Id", "LDAPSecurityAuthentication")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityAuthenticati'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityAuthenticatiInfo, new RecordItemIndex(13))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityAuthenticatiInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='LDAPSecurityCredentials') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityCredentials'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityCredentialsInfo, new RecordItemIndex(14))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityCredentialsInfo, "Id", "LDAPSecurityCredentials")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityCredentials'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityCredentialsInfo, new RecordItemIndex(15))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPSecurityCredentialsInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='LDAPConnectionFactoryJNDIName') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPConnectionFactoryJND'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPConnectionFactoryJNDInfo, new RecordItemIndex(16))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPConnectionFactoryJNDInfo, "Id", "LDAPConnectionFactoryJNDIName")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPConnectionFactoryJND'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPConnectionFactoryJNDInfo, new RecordItemIndex(17))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAPConnectionFactoryJNDInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='JMSDestinationQueueTopicName') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopicInfo, new RecordItemIndex(18))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopicInfo, "Id", "JMSDestinationQueueTopicName")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopicInfo, new RecordItemIndex(19))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopicInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='UserName') on item 'WebDocument10_200_123_11_8080.FormForm.TextUserName'.", repo.WebDocument10_200_123_11_8080.FormForm.TextUserNameInfo, new RecordItemIndex(20))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextUserNameInfo, "Id", "UserName")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextUserName'.", repo.WebDocument10_200_123_11_8080.FormForm.TextUserNameInfo, new RecordItemIndex(21))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextUserNameInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='Password') on item 'WebDocument10_200_123_11_8080.FormForm.TextPassword1'.", repo.WebDocument10_200_123_11_8080.FormForm.TextPassword1Info, new RecordItemIndex(22))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextPassword1Info, "Id", "Password")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextPassword1'.", repo.WebDocument10_200_123_11_8080.FormForm.TextPassword1Info, new RecordItemIndex(23))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextPassword1Info, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='Password') on item 'WebDocument10_200_123_11_8080.FormForm.TextPassword1'.", repo.WebDocument10_200_123_11_8080.FormForm.TextPassword1Info, new RecordItemIndex(24))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextPassword1Info, "Id", "Password")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextPassword1'.", repo.WebDocument10_200_123_11_8080.FormForm.TextPassword1Info, new RecordItemIndex(25))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextPassword1Info, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='IBMMQport') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQport'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQportInfo, new RecordItemIndex(26))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQportInfo, "Id", "IBMMQport")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQport'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQportInfo, new RecordItemIndex(27))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQportInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='IBMMQQueueManager') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManager'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManagerInfo, new RecordItemIndex(28))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManagerInfo, "Id", "IBMMQQueueManager")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManager'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManagerInfo, new RecordItemIndex(29))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManagerInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='IBMMQQueueManager') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManager'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManagerInfo, new RecordItemIndex(30))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManagerInfo, "Id", "IBMMQQueueManager")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManager'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManagerInfo, new RecordItemIndex(31))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQQueueManagerInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='IBMMQChannel') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQChannel'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQChannelInfo, new RecordItemIndex(32))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQChannelInfo, "Id", "IBMMQChannel")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQChannel'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQChannelInfo, new RecordItemIndex(33))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQChannelInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='IBMMQDeliveryMode') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQDeliveryMode'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQDeliveryModeInfo, new RecordItemIndex(34))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQDeliveryModeInfo, "Id", "IBMMQDeliveryMode")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBMMQDeliveryMode'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQDeliveryModeInfo, new RecordItemIndex(35))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBMMQDeliveryModeInfo, "Type", "TextInput")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='JMS Broker URL') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMS_Broker_URL'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMS_Broker_URLInfo, new RecordItemIndex(36))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMS_Broker_URLInfo, "Text", "JMS Broker URL")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='LDAP Provider URL') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Provider_URL'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Provider_URLInfo, new RecordItemIndex(37))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Provider_URLInfo, "Text", "LDAP Provider URL")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='LDAP Initial Context Factory') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Initial_Context_Fac'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Initial_Context_FacInfo, new RecordItemIndex(38))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Initial_Context_FacInfo, "Text", "LDAP Initial Context Factory")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='LDAP Security Authentication') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_Authentica'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_AuthenticaInfo, new RecordItemIndex(39))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_AuthenticaInfo, "Text", "LDAP Security Authentication")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='LDAP Security Principal') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_Principal'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_PrincipalInfo, new RecordItemIndex(40))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_PrincipalInfo, "Text", "LDAP Security Principal")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='LDAP Security Principal') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_Principal'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_PrincipalInfo, new RecordItemIndex(41))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_PrincipalInfo, "Text", "LDAP Security Principal")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='LDAP Security Credentials') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_Credential'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_CredentialInfo, new RecordItemIndex(42))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Security_CredentialInfo, "Text", "LDAP Security Credentials")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='LDAP Connection Factory JNDI Name') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Connection_Factory_'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Connection_Factory_Info, new RecordItemIndex(43))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextLDAP_Connection_Factory_Info, "Text", "LDAP Connection Factory JNDI Name")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='JMS Destination ( Queue/Topic ) Name') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMS_Destination___Queue_'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMS_Destination___Queue_Info, new RecordItemIndex(44))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMS_Destination___Queue_Info, "Text", "JMS Destination ( Queue/Topic ) Name")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Source / Destination Type') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSource___Destination_Typ'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSource___Destination_TypInfo, new RecordItemIndex(45))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextSource___Destination_TypInfo, "Text", "Source / Destination Type")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Provider Type') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextProvider_Type'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextProvider_TypeInfo, new RecordItemIndex(46))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextProvider_TypeInfo, "Text", "Provider Type")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='User Name') on item 'WebDocument10_200_123_11_8080.FormForm.TextUser_Name'.", repo.WebDocument10_200_123_11_8080.FormForm.TextUser_NameInfo, new RecordItemIndex(47))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextUser_NameInfo, "Text", "User Name")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Password') on item 'WebDocument10_200_123_11_8080.FormForm.TextPassword'.", repo.WebDocument10_200_123_11_8080.FormForm.TextPasswordInfo, new RecordItemIndex(48))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextPasswordInfo, "Text", "Password")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='IBM MQ port') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBM_MQ_port'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBM_MQ_portInfo, new RecordItemIndex(49))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBM_MQ_portInfo, "Text", "IBM MQ port")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='IBM MQ Delivery Mode') on item 'WebDocument10_200_123_11_8080.FormForm.TextIBM_MQ_Delivery_Mode'.", repo.WebDocument10_200_123_11_8080.FormForm.TextIBM_MQ_Delivery_ModeInfo, new RecordItemIndex(50))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.FormForm.TextIBM_MQ_Delivery_ModeInfo, "Text", "IBM MQ Delivery Mode")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURL' at 17;12.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURLInfo, new RecordItemIndex(51))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURL.Click("17;12")
			Delay.Milliseconds(1160)
						
			getURL_ActiveMQ()
			Delay.Milliseconds(1450)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic' at 49;13.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopicInfo, new RecordItemIndex(53))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic.Click("49;13")
			Delay.Milliseconds(2010)
						
			getQueue_ActiveMQ()
			Delay.Milliseconds(1150)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave_as_Template___' at 59;7.", repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave_as_Template___Info, new RecordItemIndex(55))
			repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave_as_Template___.Click("59;7")
			Delay.Milliseconds(880)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.TextTextInput' at 127;15.", repo.WebDocument10_200_123_11_8080.TextTextInputInfo, new RecordItemIndex(56))
			repo.WebDocument10_200_123_11_8080.TextTextInput.Click("127;15")
			Delay.Milliseconds(700)
						
			getTemp_ActiveMQ()
			Delay.Milliseconds(2340)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave' at 22;14.", repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSaveInfo, new RecordItemIndex(58))
			repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave.Click("22;14")
			Delay.Milliseconds(560)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save successful') on item 'WebDocument10_200_123_11_8080.ContainerSave_successful.TextSave_successful'.", repo.WebDocument10_200_123_11_8080.ContainerSave_successful.TextSave_successfulInfo, new RecordItemIndex(59))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.ContainerSave_successful.TextSave_successfulInfo, "Text", "Save successful")
			Delay.Milliseconds(100)
						
			Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='OK') on item 'WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOK'.", repo.WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOKInfo, new RecordItemIndex(60))
			Validate.Attribute(repo.WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOKInfo, "Text", "OK")
			Delay.Milliseconds(910)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOK' at 46;17.", repo.WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOKInfo, new RecordItemIndex(61))
			repo.WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOK.Click("46;17")
			Delay.Milliseconds(2380)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave' at 22;5.", repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSaveInfo, new RecordItemIndex(62))
			repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave.Click("22;5")
			Delay.Milliseconds(820)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2_448110' at 33;36.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2_448110Info, new RecordItemIndex(63))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.PictureIcon_2_448110.Click(MouseButtons.Right, "33;36")
			Delay.Milliseconds(1040)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 11;6.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(64))
			repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("11;6")
			Delay.Milliseconds(930)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left DoubleClick item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic' at 82;16.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopicInfo, new RecordItemIndex(65))
			repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic.DoubleClick("82;16")
			Delay.Milliseconds(2210)
						
			getdestque_ActiveMQ()
			Delay.Milliseconds(2430)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave_as_Template___' at 51;14.", repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave_as_Template___Info, new RecordItemIndex(67))
			repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave_as_Template___.Click("51;14")
			Delay.Milliseconds(690)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.TextTextInput' at 108;19.", repo.WebDocument10_200_123_11_8080.TextTextInputInfo, new RecordItemIndex(68))
			repo.WebDocument10_200_123_11_8080.TextTextInput.Click("108;19")
			Delay.Milliseconds(880)
						
			getTempDest_Activemq()
			Delay.Milliseconds(1960)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave' at 3;11.", repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSaveInfo, new RecordItemIndex(70))
			repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave.Click("3;11")
			Delay.Milliseconds(1290)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOK' at 48;11.", repo.WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOKInfo, new RecordItemIndex(71))
			repo.WebDocument10_200_123_11_8080.ContainerSave_successful.ButtonOK.Click("48;11")
			Delay.Milliseconds(1010)
						
			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave' at 42;2.", repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSaveInfo, new RecordItemIndex(72))
			repo.WebDocument10_200_123_11_8080.FormFile_Endpoint_Configurat.ButtonSave.Click("42;2")
			Delay.Milliseconds(800)
						
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
