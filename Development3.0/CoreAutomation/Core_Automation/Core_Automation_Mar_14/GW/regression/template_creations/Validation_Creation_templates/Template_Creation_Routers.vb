'//////////////////////////////////////////////////////////////////////////////
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
    ''' The Template_Creation_Routers recording.
    ''' </summary>
    <TestModule("84f31713-39f1-494f-ae14-344961100798", ModuleType.Recording, 1)> _
    Partial Public Class Template_Creation_Routers
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the Template_C_Route repository.
        ''' </summary>
        Public Shared repo as Template_C_Route = Template_C_Route.Instance

        Shared _instance as Template_Creation_Routers = new Template_Creation_Routers()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As Template_Creation_Routers
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ButtonRouters' at Center.", repo.WebDocumentLocalhost_8082.ButtonRoutersInfo, new RecordItemIndex(0))
            repo.WebDocumentLocalhost_8082.ButtonRouters.Click()
            Delay.Milliseconds(800)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_16' at 9;12.", repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_16Info, new RecordItemIndex(1))
            repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_16.MoveTo("9;12")
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(1370)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas' at 224;146.", repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(2))
            repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas.MoveTo("224;146")
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(1900)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_16_175107' at Center.", repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_16_175107Info, new RecordItemIndex(3))
            repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_16_175107.Click(MouseButtons.Right)
            Delay.Milliseconds(870)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 36;8.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(4))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("36;8")
            Delay.Milliseconds(2010)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox.TextServiceId' at 43;13.", repo.WebDocumentLocalhost_8082.ContainerVBox.TextServiceIdInfo, new RecordItemIndex(5))
            repo.WebDocumentLocalhost_8082.ContainerVBox.TextServiceId.Click("43;13")
            Delay.Milliseconds(990)
                        
            Splitter_Serviceid1_Router_usercall()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1' at 5;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1Info, new RecordItemIndex(7))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton1.Click("5;8")
            Delay.Milliseconds(960)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextSample_typ' at 43;4.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextSample_typInfo, new RecordItemIndex(8))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextSample_typ.Click("43;4")
            Delay.Milliseconds(1180)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox.ButtonButton' at 115;6.", repo.WebDocumentLocalhost_8082.ContainerVBox.ButtonButtonInfo, new RecordItemIndex(9))
            repo.WebDocumentLocalhost_8082.ContainerVBox.ButtonButton.Click("115;6")
            Delay.Milliseconds(730)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextPartition_Key1' at 26;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextPartition_Key1Info, new RecordItemIndex(10))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextPartition_Key1.Click("26;7")
            Delay.Milliseconds(1870)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox.ButtonX' at 20;7.", repo.WebDocumentLocalhost_8082.ContainerVBox.ButtonXInfo, new RecordItemIndex(11))
            repo.WebDocumentLocalhost_8082.ContainerVBox.ButtonX.Click("20;7")
            Delay.Milliseconds(1440)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox.ButtonX1' at 21;10.", repo.WebDocumentLocalhost_8082.ContainerVBox.ButtonX1Info, new RecordItemIndex(12))
            repo.WebDocumentLocalhost_8082.ContainerVBox.ButtonX1.Click("21;10")
            Delay.Milliseconds(770)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton2' at 350;10.", repo.WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton2Info, new RecordItemIndex(13))
            repo.WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton2.Click("350;10")
            Delay.Milliseconds(990)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextMessageid' at 190;1.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextMessageidInfo, new RecordItemIndex(14))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextMessageid.Click("190;1")
            Delay.Milliseconds(1040)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton3' at 350;10.", repo.WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton3Info, new RecordItemIndex(15))
            repo.WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton3.Click("350;10")
            Delay.Milliseconds(1010)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextContractid' at 264;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextContractidInfo, new RecordItemIndex(16))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextContractid.Click("264;10")
            Delay.Milliseconds(930)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton4' at 350;9.", repo.WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton4Info, new RecordItemIndex(17))
            repo.WebDocumentLocalhost_8082.ContainerVBox1.ButtonButton4.Click("350;9")
            Delay.Milliseconds(1770)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextStatus' at 38;4.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextStatusInfo, new RecordItemIndex(18))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextStatus.Click("38;4")
            Delay.Milliseconds(3930)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___' at 98;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___Info, new RecordItemIndex(19))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___.Click("98;10")
            Delay.Milliseconds(1040)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput' at 18;13.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInputInfo, new RecordItemIndex(20))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput.Click("18;13")
            Delay.Milliseconds(1300)
                        
            Tempname_Splitter1_Router_call()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(22))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click()
            Delay.Milliseconds(1490)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOKInfo, new RecordItemIndex(23))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK.Click()
            Delay.Milliseconds(2330)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1Info, new RecordItemIndex(24))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1.Click()
            Delay.Milliseconds(3290)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.FlexObjectTeevra.PictureIcon_47' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.PictureIcon_47Info, new RecordItemIndex(25))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.PictureIcon_47.MoveTo()
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(930)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas' at 290;302.", repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(26))
            repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas.MoveTo("290;302")
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(1260)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.PictureIcon_47_241263' at 20;23.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.PictureIcon_47_241263Info, new RecordItemIndex(27))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.PictureIcon_47_241263.Click(MouseButtons.Right, "20;23")
            Delay.Milliseconds(760)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 56;8.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(28))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("56;8")
            Delay.Milliseconds(1150)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox.TextServiceId1' at 36;7.", repo.WebDocumentLocalhost_8082.ContainerVBox.TextServiceId1Info, new RecordItemIndex(29))
            repo.WebDocumentLocalhost_8082.ContainerVBox.TextServiceId1.Click("36;7")
            Delay.Milliseconds(370)
                        
            Multicast_Serviceid1_Router_call()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox.Text_02' at 38;15.", repo.WebDocumentLocalhost_8082.ContainerVBox.Text_02Info, new RecordItemIndex(31))
            repo.WebDocumentLocalhost_8082.ContainerVBox.Text_02.Click("38;15")
            Delay.Milliseconds(800)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox.Text_02' at 10;7.", repo.WebDocumentLocalhost_8082.ContainerVBox.Text_02Info, new RecordItemIndex(32))
            repo.WebDocumentLocalhost_8082.ContainerVBox.Text_02.Click("10;7")
            Delay.Milliseconds(730)
                        
            Destination_11_Router_call()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerVBox.Text_12' at 30;13.", repo.WebDocumentLocalhost_8082.ContainerVBox.Text_12Info, new RecordItemIndex(34))
            repo.WebDocumentLocalhost_8082.ContainerVBox.Text_12.Click("30;13")
            Delay.Milliseconds(600)
                        
            Destination_21_Router_call()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___Info, new RecordItemIndex(36))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___.Click()
            Delay.Milliseconds(1190)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput' at 25;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInputInfo, new RecordItemIndex(37))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput.Click("25;10")
            Delay.Milliseconds(290)
                        
            Tempname_Multicast1_Router_call()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(39))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click()
            Delay.Milliseconds(1290)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOKInfo, new RecordItemIndex(40))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK.Click()
            Delay.Milliseconds(1960)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1Info, new RecordItemIndex(41))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1.Click()
            Delay.Milliseconds(840)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerHBox.ButtonServices' at 71;8.", repo.WebDocumentLocalhost_8082.ContainerHBox.ButtonServicesInfo, new RecordItemIndex(42))
            repo.WebDocumentLocalhost_8082.ContainerHBox.ButtonServices.Click("71;8")
            Delay.Milliseconds(1660)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_44' at 7;13.", repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_44Info, new RecordItemIndex(43))
            repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_44.MoveTo("7;13")
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(1600)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas' at 598;239.", repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(44))
            repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas.MoveTo("598;239")
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_44_549200' at 20;23.", repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_44_549200Info, new RecordItemIndex(45))
            repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_44_549200.Click(MouseButtons.Right, "20;23")
            Delay.Milliseconds(630)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 54;6.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(46))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("54;6")
            Delay.Milliseconds(1900)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FormForm.TextServiceId' at 36;7.", repo.WebDocumentLocalhost_8082.FormForm.TextServiceIdInfo, new RecordItemIndex(47))
            repo.WebDocumentLocalhost_8082.FormForm.TextServiceId.Click("36;7")
            Delay.Milliseconds(1120)
                        
            TEDI_Serviceid1_Router_call()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FormForm.ButtonButton' at Center.", repo.WebDocumentLocalhost_8082.FormForm.ButtonButtonInfo, new RecordItemIndex(49))
            repo.WebDocumentLocalhost_8082.FormForm.ButtonButton.Click()
            Delay.Milliseconds(1830)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextM_Teevra_C21_FixedToFIXM' at 77;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextM_Teevra_C21_FixedToFIXMInfo, new RecordItemIndex(50))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextM_Teevra_C21_FixedToFIXM.Click("77;6")
            Delay.Milliseconds(400)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___Info, new RecordItemIndex(51))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave_as_Template___.Click()
            Delay.Milliseconds(880)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput' at 22;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInputInfo, new RecordItemIndex(52))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput.Click("22;11")
            Delay.Milliseconds(440)
                        
            Tempname_TEDI1_Router_call()
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(54))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click()
            Delay.Milliseconds(1010)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOKInfo, new RecordItemIndex(55))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK.Click()
            Delay.Milliseconds(710)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1' at Center.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1Info, new RecordItemIndex(56))
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1.Click()
            Delay.Milliseconds(740)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
