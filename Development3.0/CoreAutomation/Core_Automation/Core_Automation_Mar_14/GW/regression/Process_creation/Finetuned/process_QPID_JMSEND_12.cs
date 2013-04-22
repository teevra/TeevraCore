///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
using System.Drawing;
using System.Threading;
using System.Windows.Forms;

using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Testing;

namespace Finetuned
{
    /// <summary>
    /// The process_QPID_JMSEND_12 recording.
    /// </summary>
    [TestModule("5a984023-f2ba-4f94-88c4-f0be88d5fe6b", ModuleType.Recording, 1)]
    public partial class process_QPID_JMSEND_12 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the Prs_QPID_JMS_End_12 repository.
        /// </summary>
        public static Prs_QPID_JMS_End_12 repo = Prs_QPID_JMS_End_12.Instance;

        static process_QPID_JMSEND_12 instance = new process_QPID_JMSEND_12();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public process_QPID_JMSEND_12()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static process_QPID_JMSEND_12 Instance
        {
            get { return instance; }
        }

#region Variables

#endregion

        /// <summary>
        /// Starts the replay of the static recording <see cref="Instance"/>.
        /// </summary>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")]
        public static void Start()
        {
            TestModuleRunner.Run(Instance);
        }

        /// <summary>
        /// Performs the playback of actions in this recording.
        /// </summary>
        /// <remarks>You should not call this method directly, instead pass the module
        /// instance to the <see cref="TestModuleRunner.Run(ITestModule)"/> method
        /// that will in turn invoke this method.</remarks>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")]
        void ITestModule.Run()
        {
            Mouse.DefaultMoveTime = 300;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 1.0;

            Init();

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerHBox.ButtonEndpoints' at 73;8.", repo.WebDocumentLocalhost_8082.ContainerHBox.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentLocalhost_8082.ContainerHBox.ButtonEndpoints.Click("73;8");
            Delay.Milliseconds(2620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_46' at 8;12.", repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_46Info, new RecordItemIndex(1));
            repo.WebDocumentLocalhost_8082.ContainerHBox.PictureIcon_46.MoveTo("8;12");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas' at 143;182.", repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(2));
            repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas.MoveTo("143;182");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsers' at 98;6.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsersInfo, new RecordItemIndex(3));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsers.Click("98;6");
            Delay.Milliseconds(2230);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6' at 9;13.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6Info, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6.MoveTo("9;13");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1090);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas' at 261;196.", repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(5));
            repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas.MoveTo("261;196");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormatters' at 83;10.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormattersInfo, new RecordItemIndex(6));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormatters.Click("83;10");
            Delay.Milliseconds(2010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_9' at 7;13.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_9Info, new RecordItemIndex(7));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_9.MoveTo("7;13");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1340);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas' at 391;198.", repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(8));
            repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas.MoveTo("391;198");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerHBox.ButtonEndpoints' at 73;7.", repo.WebDocumentLocalhost_8082.ContainerHBox.ButtonEndpointsInfo, new RecordItemIndex(9));
            repo.WebDocumentLocalhost_8082.ContainerHBox.ButtonEndpoints.Click("73;7");
            Delay.Milliseconds(2240);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_2' at 12;14.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_2Info, new RecordItemIndex(10));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_2.MoveTo("12;14");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(2510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas' at 533;206.", repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(11));
            repo.WebDocumentLocalhost_8082.ContainerHBox.ContainerGraphCanvas.MoveTo("533;206");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting' at 49;5.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_ReportingInfo, new RecordItemIndex(12));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting.Click("49;5");
            Delay.Milliseconds(1130);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton' at 137;9.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButtonInfo, new RecordItemIndex(13));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton.Click("137;9");
            Delay.Milliseconds(1010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter' at 70;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporterInfo, new RecordItemIndex(14));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter.Click("70;6");
            Delay.Milliseconds(600);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure' at 27;11.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigureInfo, new RecordItemIndex(15));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure.Click("27;11");
            Delay.Milliseconds(1070);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 45;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(16));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("45;10");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 127;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(17));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("127;11");
            Delay.Milliseconds(600);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter' at 46;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporterInfo, new RecordItemIndex(18));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter.Click("46;11");
            Delay.Milliseconds(490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 16;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(19));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("16;5");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId' at 37;12.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(20));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.Click("37;12");
            Delay.Milliseconds(480);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ms' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(21));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.PressKeys("ms");
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{Back}{Back}m' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(22));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.PressKeys("{Back}{Back}m");
            Delay.Milliseconds(1320);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{Back}{Back}{Back}jmserr' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(23));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.PressKeys("{Back}{Back}{Back}jmserr");
            Delay.Milliseconds(2500);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 25;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(24));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("25;5");
            Delay.Milliseconds(1490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties' at 69;6.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_PropertiesInfo, new RecordItemIndex(25));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties.Click("69;6");
            Delay.Milliseconds(2350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters' at 82;6.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(26));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters.Click("82;6");
            Delay.Milliseconds(1370);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 8;5.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(27));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("8;5");
            Delay.Milliseconds(320);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_46_94143' at 16;20.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_46_94143Info, new RecordItemIndex(28));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_46_94143.MoveTo("16;20");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157' at 13;18.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157Info, new RecordItemIndex(29));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157.MoveTo("13;18");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1150);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 12;10.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(30));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("12;10");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157' at 25;20.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157Info, new RecordItemIndex(31));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157.MoveTo("25;20");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159' at 11;22.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159Info, new RecordItemIndex(32));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159.MoveTo("11;22");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1100);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 14;12.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(33));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("14;12");
            Delay.Milliseconds(540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159' at 24;25.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159Info, new RecordItemIndex(34));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159.MoveTo("24;25");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_2_484167' at 21;19.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_2_484167Info, new RecordItemIndex(35));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_2_484167.MoveTo("21;19");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText' at 71;10.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(36));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.Click("71;10");
            Delay.Milliseconds(1040);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'qpid' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(37));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("qpid");
            Delay.Milliseconds(1220);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{RShiftKey down}_{RShiftKey up}12' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(38));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("{RShiftKey down}_{RShiftKey up}12");
            Delay.Milliseconds(1570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField' at 73;12.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextFieldInfo, new RecordItemIndex(39));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField.Click("73;12");
            Delay.Milliseconds(40);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextFieldInfo, new RecordItemIndex(40));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField.PressKeys("test");
            Delay.Milliseconds(840);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery' at 9;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecoveryInfo, new RecordItemIndex(41));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery.Click("9;8");
            Delay.Milliseconds(400);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog' at 7;13.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(42));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog.Click("7;13");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog' at 7;5.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLogInfo, new RecordItemIndex(43));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog.Click("7;5");
            Delay.Milliseconds(930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_46_94143' at 21;19.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_46_94143Info, new RecordItemIndex(44));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_46_94143.Click(MouseButtons.Right, "21;19");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 27;6.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(45));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("27;6");
            Delay.Milliseconds(1070);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 63;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(46));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("63;11");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 65;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(47));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("65;11");
            Delay.Milliseconds(490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpid' at 27;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpidInfo, new RecordItemIndex(48));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpid.Click("27;5");
            Delay.Milliseconds(460);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 31;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(49));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("31;9");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1' at 81;17.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(50));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.Click("81;17");
            Delay.Milliseconds(540);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'qpi' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(51));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("qpi");
            Delay.Milliseconds(1430);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dsrc' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(52));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("dsrc");
            Delay.Milliseconds(1470);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 29;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(53));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("29;8");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157' at 21;27.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157Info, new RecordItemIndex(54));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_6_212157.Click(MouseButtons.Right, "21;27");
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 18;6.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(55));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("18;6");
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 44;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(56));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("44;9");
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 88;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(57));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("88;6");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfile' at 40;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfileInfo, new RecordItemIndex(58));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfile.Click("40;7");
            Delay.Milliseconds(490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 33;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(59));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("33;6");
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2' at 56;15.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(60));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.Click("56;15");
            Delay.Milliseconds(540);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'parser' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(61));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("parser");
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 21;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(62));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("21;5");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159' at 15;20.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159Info, new RecordItemIndex(63));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_9_342159.Click(MouseButtons.Right, "15;20");
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 39;11.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(64));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("39;11");
            Delay.Milliseconds(1290);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 81;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(65));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("81;7");
            Delay.Milliseconds(830);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 113;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(66));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("113;11");
            Delay.Milliseconds(540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTagFormater' at 64;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTagFormaterInfo, new RecordItemIndex(67));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTagFormater.Click("64;6");
            Delay.Milliseconds(540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 31;14.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(68));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("31;14");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2' at 48;14.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(69));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.Click("48;14");
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tag' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(70));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("tag");
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'for' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(71));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("for");
            Delay.Milliseconds(1210);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 29;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(72));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("29;9");
            Delay.Milliseconds(1130);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_2_484167' at 17;22.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_2_484167Info, new RecordItemIndex(73));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.PictureIcon_2_484167.Click(MouseButtons.Right, "17;22");
            Delay.Milliseconds(830);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 36;10.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(74));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("36;10");
            Delay.Milliseconds(1070);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 72;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(75));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("72;6");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 127;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(76));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("127;11");
            Delay.Milliseconds(1680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJmsdestination' at 27;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJmsdestinationInfo, new RecordItemIndex(77));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJmsdestination.Click("27;10");
            Delay.Milliseconds(830);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 24;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(78));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("24;8");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3' at 59;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(79));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.Click("59;7");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dest' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(80));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.PressKeys("dest");
            Delay.Milliseconds(1140);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 28;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(81));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("28;7");
            Delay.Milliseconds(1240);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1' at 35;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1Info, new RecordItemIndex(82));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1.Click("35;5");
            Delay.Milliseconds(2090);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK' at 25;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOKInfo, new RecordItemIndex(83));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK.Click("25;9");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish' at 37;13.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublishInfo, new RecordItemIndex(84));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish.Click("37;13");
            Delay.Milliseconds(2160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1' at 36;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1Info, new RecordItemIndex(85));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1.Click("36;7");
            Delay.Milliseconds(740);
            
        }

#region Image Feature Data
#endregion
    }
}
