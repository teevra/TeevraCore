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
    /// The Recording9 recording.
    /// </summary>
    [TestModule("6af0494c-2e0b-4614-9c8d-5c84faa87a31", ModuleType.Recording, 1)]
    public partial class Recording9 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the project9Repository repository.
        /// </summary>
        public static project9Repository repo = project9Repository.Instance;

        static Recording9 instance = new Recording9();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Recording9()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Recording9 Instance
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_20' at 12;14.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_20Info, new RecordItemIndex(0));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_20.MoveTo("12;14");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1130);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas' at 112;63.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvasInfo, new RecordItemIndex(1));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas.MoveTo("112;63");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1100);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonParsers' at 50;13.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonParsersInfo, new RecordItemIndex(2));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonParsers.Click("50;13");
            Delay.Milliseconds(1990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_6' at 10;10.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_6Info, new RecordItemIndex(3));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_6.MoveTo("10;10");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(910);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas' at 217;129.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvasInfo, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas.MoveTo("217;129");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonFormatters' at 56;14.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonFormattersInfo, new RecordItemIndex(5));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonFormatters.Click("56;14");
            Delay.Milliseconds(1510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_9' at 11;10.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_9Info, new RecordItemIndex(6));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_9.MoveTo("11;10");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas' at 340;190.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvasInfo, new RecordItemIndex(7));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas.MoveTo("340;190");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2400);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonEndpoints' at 65;9.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(8));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonEndpoints.Click("65;9");
            Delay.Milliseconds(2590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_2' at 16;15.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_2Info, new RecordItemIndex(9));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureIcon_2.MoveTo("16;15");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas' at 476;211.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvasInfo, new RecordItemIndex(10));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas.MoveTo("476;211");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2200);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonRouters' at 37;10.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(11));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.ButtonRouters.Click("37;10");
            Delay.Milliseconds(1600);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine' at 10;5.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(12));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine.Click("10;5");
            Delay.Milliseconds(410);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_20_6324' at 12;16.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_20_6324Info, new RecordItemIndex(13));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_20_6324.MoveTo("12;16");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890' at 18;18.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890Info, new RecordItemIndex(14));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890.MoveTo("18;18");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1320);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine' at 14;10.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(15));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine.Click("14;10");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890' at 13;20.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890Info, new RecordItemIndex(16));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890.MoveTo("13;20");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151' at 11;14.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151Info, new RecordItemIndex(17));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151.MoveTo("11;14");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1340);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine' at 11;6.", repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(18));
            repo.WebDocumentLocalhost_8888.ContainerComponent_Palette.PictureLine.Click("11;6");
            Delay.Milliseconds(1040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151' at 25;19.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151Info, new RecordItemIndex(19));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151.MoveTo("25;19");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_2_427172' at 18;24.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_2_427172Info, new RecordItemIndex(20));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_2_427172.MoveTo("18;24");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(3590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_20_6324' at 17;21.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_20_6324Info, new RecordItemIndex(21));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_20_6324.Click(MouseButtons.Right, "17;21");
            Delay.Milliseconds(1190);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 53;10.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(22));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("53;10");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___' at 62;7.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(23));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___.Click("62;7");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButton' at 115;9.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(24));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButton.Click("115;9");
            Delay.Milliseconds(1050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.TextFtpsource' at 53;6.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextFtpsourceInfo, new RecordItemIndex(25));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextFtpsource.Click("53;6");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad' at 25;5.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(26));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad.Click("25;5");
            Delay.Milliseconds(1440);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId' at 96;7.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(27));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId.Click("96;7");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'source'.", new RecordItemIndex(28));
            Keyboard.Press("source");
            Delay.Milliseconds(3440);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave' at 35;13.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(29));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave.Click("35;13");
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890' at 28;23.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890Info, new RecordItemIndex(30));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_6_16890.Click(MouseButtons.Right, "28;23");
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 37;8.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(31));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("37;8");
            Delay.Milliseconds(1090);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___' at 93;8.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(32));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___.Click("93;8");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButton' at 94;9.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(33));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButton.Click("94;9");
            Delay.Milliseconds(1210);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.TextParserfile1' at 34;4.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextParserfile1Info, new RecordItemIndex(34));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextParserfile1.Click("34;4");
            Delay.Milliseconds(1430);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad' at 46;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(35));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad.Click("46;10");
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId1' at 60;9.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId1Info, new RecordItemIndex(36));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId1.Click("60;9");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'parser'.", new RecordItemIndex(37));
            Keyboard.Press("parser");
            Delay.Milliseconds(1930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave' at 27;8.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(38));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave.Click("27;8");
            Delay.Milliseconds(1400);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151' at 16;20.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151Info, new RecordItemIndex(39));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_9_291151.Click(MouseButtons.Right, "16;20");
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 15;7.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(40));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("15;7");
            Delay.Milliseconds(1080);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___' at 95;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(41));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___.Click("95;10");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButton' at 111;12.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(42));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButton.Click("111;12");
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.TextTagFormater' at 86;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextTagFormaterInfo, new RecordItemIndex(43));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextTagFormater.Click("86;10");
            Delay.Milliseconds(410);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad' at 38;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(44));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad.Click("38;10");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId1' at 115;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId1Info, new RecordItemIndex(45));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId1.Click("115;10");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tagformat'.", new RecordItemIndex(46));
            Keyboard.Press("tagformat");
            Delay.Milliseconds(2700);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave' at 21;6.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(47));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave.Click("21;6");
            Delay.Milliseconds(1150);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_2_427172' at 20;18.", repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_2_427172Info, new RecordItemIndex(48));
            repo.WebDocumentLocalhost_8888.ContainerGraphCanvas1.PictureIcon_2_427172.Click(MouseButtons.Right, "20;18");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 10;10.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(49));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("10;10");
            Delay.Milliseconds(1460);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___' at 50;8.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(50));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad_template___.Click("50;8");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButton' at 150;9.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(51));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonButton.Click("150;9");
            Delay.Milliseconds(2440);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.TextJmsdestination' at 63;9.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextJmsdestinationInfo, new RecordItemIndex(52));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextJmsdestination.Click("63;9");
            Delay.Milliseconds(1990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad' at 35;10.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(53));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonLoad.Click("35;10");
            Delay.Milliseconds(760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId2' at 66;15.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(54));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.TextServiceId2.Click("66;15");
            Delay.Milliseconds(510);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'des'.", new RecordItemIndex(55));
            Keyboard.Press("des");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tinationjms'.", new RecordItemIndex(56));
            Keyboard.Press("tinationjms");
            Delay.Milliseconds(2710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave' at 38;14.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(57));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonSave.Click("38;14");
            Delay.Milliseconds(1300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerVBox.TextNameText' at 104;11.", repo.WebDocumentLocalhost_8888.ContainerVBox.TextNameTextInfo, new RecordItemIndex(58));
            repo.WebDocumentLocalhost_8888.ContainerVBox.TextNameText.Click("104;11");
            Delay.Milliseconds(1380);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{Capital}F{Capital}tp'.", new RecordItemIndex(59));
            Keyboard.Press("{Capital}F{Capital}tp");
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{RShiftKey down}_{RShiftKey up}to'.", new RecordItemIndex(60));
            Keyboard.Press("{RShiftKey down}_{RShiftKey up}to");
            Delay.Milliseconds(1060);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{RShiftKey down}_{RShiftKey up}jms'.", new RecordItemIndex(61));
            Keyboard.Press("{RShiftKey down}_{RShiftKey up}jms");
            Delay.Milliseconds(2520);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerVBox.TextUITextField' at 66;22.", repo.WebDocumentLocalhost_8888.ContainerVBox.TextUITextFieldInfo, new RecordItemIndex(62));
            repo.WebDocumentLocalhost_8888.ContainerVBox.TextUITextField.Click("66;22");
            Delay.Milliseconds(40);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test'.", new RecordItemIndex(63));
            Keyboard.Press("test");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FormForm.CheckBoxRecovery' at 5;6.", repo.WebDocumentLocalhost_8888.FormForm.CheckBoxRecoveryInfo, new RecordItemIndex(64));
            repo.WebDocumentLocalhost_8888.FormForm.CheckBoxRecovery.Click("5;6");
            Delay.Milliseconds(380);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FormForm.CheckBoxPrcsEvntLog' at 3;12.", repo.WebDocumentLocalhost_8888.FormForm.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(65));
            repo.WebDocumentLocalhost_8888.FormForm.CheckBoxPrcsEvntLog.Click("3;12");
            Delay.Milliseconds(440);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FormForm.CheckBoxMsgEvntLog' at 4;7.", repo.WebDocumentLocalhost_8888.FormForm.CheckBoxMsgEvntLogInfo, new RecordItemIndex(66));
            repo.WebDocumentLocalhost_8888.FormForm.CheckBoxMsgEvntLog.Click("4;7");
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerVBox.ButtonSave1' at 32;9.", repo.WebDocumentLocalhost_8888.ContainerVBox.ButtonSave1Info, new RecordItemIndex(67));
            repo.WebDocumentLocalhost_8888.ContainerVBox.ButtonSave1.Click("32;9");
            Delay.Milliseconds(1270);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK' at 37;8.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(68));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK.Click("37;8");
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.ContainerVBox.ButtonPublish' at 12;9.", repo.WebDocumentLocalhost_8888.ContainerVBox.ButtonPublishInfo, new RecordItemIndex(69));
            repo.WebDocumentLocalhost_8888.ContainerVBox.ButtonPublish.Click("12;9");
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK1' at 45;8.", repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK1Info, new RecordItemIndex(70));
            repo.WebDocumentLocalhost_8888.FlexObjectIceFish.ButtonOK1.Click("45;8");
            Delay.Milliseconds(760);
            
        }

#region Image Feature Data
#endregion
    }
}
