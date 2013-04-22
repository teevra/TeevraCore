﻿///////////////////////////////////////////////////////////////////////////////
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
    /// The Recording43 recording.
    /// </summary>
    [TestModule("89c31978-6119-40d0-b520-18826259beb0", ModuleType.Recording, 1)]
    public partial class Recording43 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the FinetunedRepository repository.
        /// </summary>
        public static FinetunedRepository repo = FinetunedRepository.Instance;

        static Recording43 instance = new Recording43();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Recording43()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Recording43 Instance
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextProcess_Modeling_' at 19;8.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(0));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextProcess_Modeling_.Click("19;8");
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.MenuItemView_Process' at 28;2.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(1));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.MenuItemView_Process.Click("28;2");
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.ContainerVBox.ButtonNew' at 21;4.", repo.WebDocument10_200_41_76_8880.ContainerVBox.ButtonNewInfo, new RecordItemIndex(2));
            repo.WebDocument10_200_41_76_8880.ContainerVBox.ButtonNew.Click("21;4");
            Delay.Milliseconds(2350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8880.ContainerVBox.PictureIcon_1' at 9;18.", repo.WebDocument10_200_41_76_8880.ContainerVBox.PictureIcon_1Info, new RecordItemIndex(3));
            repo.WebDocument10_200_41_76_8880.ContainerVBox.PictureIcon_1.MoveTo("9;18");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas' at 87;77.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvasInfo, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas.MoveTo("87;77");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(3260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8880.ContainerHBox.PictureIcon_20' at 16;22.", repo.WebDocument10_200_41_76_8880.ContainerHBox.PictureIcon_20Info, new RecordItemIndex(5));
            repo.WebDocument10_200_41_76_8880.ContainerHBox.PictureIcon_20.MoveTo("16;22");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(2380);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas' at 528;160.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvasInfo, new RecordItemIndex(6));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas.MoveTo("528;160");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonParsers' at 119;11.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonParsersInfo, new RecordItemIndex(7));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonParsers.Click("119;11");
            Delay.Milliseconds(4850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down at 16;17.", new RecordItemIndex(8));
            Mouse.MoveTo(165, 225);
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas' at 137;192.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvasInfo, new RecordItemIndex(9));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas.MoveTo("137;192");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonFormatters' at 40;8.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonFormattersInfo, new RecordItemIndex(10));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonFormatters.Click("40;8");
            Delay.Milliseconds(2440);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8880.ContainerHBox.PictureIcon_8' at 8;18.", repo.WebDocument10_200_41_76_8880.ContainerHBox.PictureIcon_8Info, new RecordItemIndex(11));
            repo.WebDocument10_200_41_76_8880.ContainerHBox.PictureIcon_8.MoveTo("8;18");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1340);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas' at 288;173.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvasInfo, new RecordItemIndex(12));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas.MoveTo("288;173");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonRouters' at 75;19.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(13));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonRouters.Click("75;19");
            Delay.Milliseconds(1430);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine' at 5;19.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(14));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine.Click("5;19");
            Delay.Milliseconds(1980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down at 24;29.", new RecordItemIndex(15));
            Mouse.MoveTo(274, 384);
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up at 11;16.", new RecordItemIndex(16));
            Mouse.MoveTo(311, 486);
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine' at 15;9.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(17));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine.Click("15;9");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down at 9;19.", new RecordItemIndex(18));
            Mouse.MoveTo(309, 489);
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up at 11;21.", new RecordItemIndex(19));
            Mouse.MoveTo(462, 472);
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1070);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine' at 8;8.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(20));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine.Click("8;8");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down at 17;20.", new RecordItemIndex(21));
            Mouse.MoveTo(468, 471);
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up at 14;22.", new RecordItemIndex(22));
            Mouse.MoveTo(705, 460);
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click at 14;22.", new RecordItemIndex(23));
            Mouse.MoveTo(705, 460);
            Mouse.Click(MouseButtons.Right);
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 18;6.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(24));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("18;6");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___' at 110;9.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(25));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___.Click("110;9");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput' at 86;5.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(26));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput.Click("86;5");
            Delay.Milliseconds(1820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextFtpendpoint' at 65;7.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextFtpendpointInfo, new RecordItemIndex(27));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextFtpendpoint.Click("65;7");
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad' at 22;11.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(28));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad.Click("22;11");
            Delay.Milliseconds(1230);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId4' at 59;18.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId4Info, new RecordItemIndex(29));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId4.Click("59;18");
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dest'.", new RecordItemIndex(30));
            Keyboard.Press("dest");
            Delay.Milliseconds(1050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave' at 24;8.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(31));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave.Click("24;8");
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click at 13;28.", new RecordItemIndex(32));
            Mouse.MoveTo(263, 383);
            Mouse.Click(MouseButtons.Right);
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 24;7.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(33));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("24;7");
            Delay.Milliseconds(600);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___' at 35;11.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(34));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___.Click("35;11");
            Delay.Milliseconds(1800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput' at 40;7.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(35));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput.Click("40;7");
            Delay.Milliseconds(1740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbsource' at 37;16.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbsourceInfo, new RecordItemIndex(36));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbsource.Click("37;16");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad' at 36;7.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(37));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad.Click("36;7");
            Delay.Milliseconds(1570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput1' at 44;9.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput1Info, new RecordItemIndex(38));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput1.Click("44;9");
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextOracle' at 38;6.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextOracleInfo, new RecordItemIndex(39));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextOracle.Click("38;6");
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId' at 54;8.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(40));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId.Click("54;8");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'src'.", new RecordItemIndex(41));
            Keyboard.Press("src");
            Delay.Milliseconds(1480);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave' at 33;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(42));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave.Click("33;10");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click at 31;28.", new RecordItemIndex(43));
            Mouse.MoveTo(331, 498);
            Mouse.Click(MouseButtons.Right);
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 20;3.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(44));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("20;3");
            Delay.Milliseconds(580);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___' at 29;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(45));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___.Click("29;10");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput' at 51;5.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(46));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput.Click("51;5");
            Delay.Milliseconds(1340);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbParser' at 42;3.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbParserInfo, new RecordItemIndex(47));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbParser.Click("42;3");
            Delay.Milliseconds(350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad' at 41;11.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(48));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad.Click("41;11");
            Delay.Milliseconds(460);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId2' at 69;6.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(49));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId2.Click("69;6");
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'pa'.", new RecordItemIndex(50));
            Keyboard.Press("pa");
            Delay.Milliseconds(720);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'rser'.", new RecordItemIndex(51));
            Keyboard.Press("rser");
            Delay.Milliseconds(1300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave' at 32;17.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(52));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave.Click("32;17");
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click at 16;37.", new RecordItemIndex(53));
            Mouse.MoveTo(467, 488);
            Mouse.Click(MouseButtons.Right);
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 14;9.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(54));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("14;9");
            Delay.Milliseconds(1190);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___' at 98;7.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(55));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___.Click("98;7");
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput' at 59;7.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInputInfo, new RecordItemIndex(56));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextTextInput.Click("59;7");
            Delay.Milliseconds(1020);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbFormatter' at 56;14.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbFormatterInfo, new RecordItemIndex(57));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextDbFormatter.Click("56;14");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad' at 31;6.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(58));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad.Click("31;6");
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId2' at 71;15.", repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(59));
            repo.WebDocument10_200_41_76_8880.FlexObjectIceFish.TextServiceId2.Click("71;15");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dbformater'.", new RecordItemIndex(60));
            Keyboard.Press("dbformater");
            Delay.Milliseconds(2370);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave' at 23;15.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(61));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave.Click("23;15");
            Delay.Milliseconds(2330);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerVBox.TextNameText' at 156;6.", repo.WebDocumentLocalhost_8888.ContainerVBox.TextNameTextInfo, new RecordItemIndex(62));
            repo.WebDocumentLocalhost_8888.ContainerVBox.TextNameText.Click("156;6");
            Delay.Milliseconds(1510);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{LShiftKey down}DB_FTP{LShiftKey up}'.", new RecordItemIndex(63));
            Keyboard.Press("{LShiftKey down}DB_FTP{LShiftKey up}");
            Delay.Milliseconds(2340);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FormForm.CheckBoxRecovery' at 4;7.", repo.WebDocumentLocalhost_8888.FormForm.CheckBoxRecoveryInfo, new RecordItemIndex(64));
            repo.WebDocumentLocalhost_8888.FormForm.CheckBoxRecovery.Click("4;7");
            Delay.Milliseconds(2270);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FormForm.CheckBoxPrcsEvntLog' at 8;10.", repo.WebDocumentLocalhost_8888.FormForm.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(65));
            repo.WebDocumentLocalhost_8888.FormForm.CheckBoxPrcsEvntLog.Click("8;10");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FormForm.CheckBoxMsgEvntLog' at 6;12.", repo.WebDocumentLocalhost_8888.FormForm.CheckBoxMsgEvntLogInfo, new RecordItemIndex(66));
            repo.WebDocumentLocalhost_8888.FormForm.CheckBoxMsgEvntLog.Click("6;12");
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerVBox.ButtonSave1' at 14;12.", repo.WebDocumentLocalhost_8888.ContainerVBox.ButtonSave1Info, new RecordItemIndex(67));
            repo.WebDocumentLocalhost_8888.ContainerVBox.ButtonSave1.Click("14;12");
            Delay.Milliseconds(2410);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK' at 42;0.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(68));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK.Click("42;0");
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerVBox.ButtonPublish' at 27;6.", repo.WebDocumentLocalhost_8888.ContainerVBox.ButtonPublishInfo, new RecordItemIndex(69));
            repo.WebDocumentLocalhost_8888.ContainerVBox.ButtonPublish.Click("27;6");
            Delay.Milliseconds(1600);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK1' at 43;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK1Info, new RecordItemIndex(70));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK1.Click("43;10");
            Delay.Milliseconds(840);
            
        }

#region Image Feature Data
#endregion
    }
}
