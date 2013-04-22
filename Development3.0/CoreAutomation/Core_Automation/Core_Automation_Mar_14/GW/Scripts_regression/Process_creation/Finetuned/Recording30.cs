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
    /// The Recording30 recording.
    /// </summary>
    [TestModule("74415a44-65dd-41d5-afc0-75e9b025cf89", ModuleType.Recording, 1)]
    public partial class Recording1 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the project30Repository repository.
        /// </summary>
        public static project30Repository repo = project30Repository.Instance;

        static Recording1 instance = new Recording1();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Recording1()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Recording1 Instance
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerPanel.ButtonEndpoints' at 68;9.", repo.WebDocumentIceFish.ContainerPanel.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentIceFish.ContainerPanel.ButtonEndpoints.Click("68;9");
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_3' at 6;14.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(1));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_3.MoveTo("6;14");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1230);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas' at 117;71.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvasInfo, new RecordItemIndex(2));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas.MoveTo("117;71");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1050);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'F11' Press.", new RecordItemIndex(3));
            Keyboard.Press(Keys.F11, 87, Keyboard.DefaultKeyPressTime, 1, false);
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonParsers' at 53;8.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonParsersInfo, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonParsers.Click("53;8");
            Delay.Milliseconds(1680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_6' at 5;10.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_6Info, new RecordItemIndex(5));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_6.MoveTo("5;10");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas' at 104;173.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvasInfo, new RecordItemIndex(6));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas.MoveTo("104;173");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1270);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonFormatters' at 89;10.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonFormattersInfo, new RecordItemIndex(7));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonFormatters.Click("89;10");
            Delay.Milliseconds(1800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_9' at 5;11.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_9Info, new RecordItemIndex(8));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_9.MoveTo("5;11");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas' at 414;152.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvasInfo, new RecordItemIndex(9));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas.MoveTo("414;152");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpoints' at 53;6.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(10));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpoints.Click("53;6");
            Delay.Milliseconds(3300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_3' at 9;14.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(11));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_3.MoveTo("9;14", 1234);
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(0);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas' at 653;124.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvasInfo, new RecordItemIndex(12));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas.MoveTo("653;124", 2300);
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonServices' at 58;10.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonServicesInfo, new RecordItemIndex(13));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonServices.Click("58;10");
            Delay.Milliseconds(1440);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_19' at 4;7.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_19Info, new RecordItemIndex(14));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureIcon_19.MoveTo("4;7");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1100);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas' at 240;128.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvasInfo, new RecordItemIndex(15));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas.MoveTo("240;128");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1370);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonRouters' at 72;8.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(16));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonRouters.Click("72;8");
            Delay.Milliseconds(1380);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLine' at 15;7.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(17));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLine.Click("15;7");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_6832' at 19;34.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_6832Info, new RecordItemIndex(18));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_6832.MoveTo("19;34");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134' at 26;7.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134Info, new RecordItemIndex(19));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134.MoveTo("26;7");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLine' at 16;6.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(20));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLine.Click("16;6");
            Delay.Milliseconds(490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134' at 31;11.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134Info, new RecordItemIndex(21));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134.MoveTo("31;11");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(520);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189' at 23;38.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189Info, new RecordItemIndex(22));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189.MoveTo("23;38");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(950);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLine' at 11;5.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(23));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLine.Click("11;5");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189' at 29;27.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189Info, new RecordItemIndex(24));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189.MoveTo("29;27");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113' at 18;27.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113Info, new RecordItemIndex(25));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113.MoveTo("18;27");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLine' at 9;5.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(26));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.PictureLine.Click("9;5");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113' at 17;30.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113Info, new RecordItemIndex(27));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113.MoveTo("17;30");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_60485' at 14;27.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_60485Info, new RecordItemIndex(28));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_60485.MoveTo("14;27");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1230);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_6832' at 22;22.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_6832Info, new RecordItemIndex(29));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_6832.Click(MouseButtons.Right, "22;22");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 10;8.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(30));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("10;8");
            Delay.Milliseconds(830);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___' at 31;8.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(31));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___.Click("31;8");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(32));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(1010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextSourcefile' at Center.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextSourcefileInfo, new RecordItemIndex(33));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextSourcefile.Click();
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad' at 34;6.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(34));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad.Click("34;6");
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId' at 48;17.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(35));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId.Click("48;17");
            Delay.Milliseconds(120);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(36));
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, false);
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ource'.", new RecordItemIndex(37));
            Keyboard.Press("ource");
            Delay.Milliseconds(1780);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave' at 36;15.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(38));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave.Click("36;15");
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134' at 21;22.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134Info, new RecordItemIndex(39));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_6_55134.Click(MouseButtons.Right, "21;22");
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 20;12.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(40));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("20;12");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___' at 42;12.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(41));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___.Click("42;12");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(42));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(1510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextParserfile' at Center.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextParserfileInfo, new RecordItemIndex(43));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextParserfile.Click();
            Delay.Milliseconds(480);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad' at 20;11.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(44));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad.Click("20;11");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId1' at 87;12.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId1Info, new RecordItemIndex(45));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId1.Click("87;12");
            Delay.Milliseconds(120);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tag'.", new RecordItemIndex(46));
            Keyboard.Press("tag");
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'parser'.", new RecordItemIndex(47));
            Keyboard.Press("parser");
            Delay.Milliseconds(1020);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave' at 27;13.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(48));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave.Click("27;13");
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189' at 17;23.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189Info, new RecordItemIndex(49));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_19_19189.Click(MouseButtons.Right, "17;23");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 20;6.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(50));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("20;6");
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___' at 105;10.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(51));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___.Click("105;10");
            Delay.Milliseconds(1050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(52));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(2330);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8080.FlexObjectIceFish.IndicatorScrollThumb' at 4;16.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.IndicatorScrollThumbInfo, new RecordItemIndex(53));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.IndicatorScrollThumb.MoveTo("4;16");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(5660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8080.FlexObjectIceFish.IndicatorScrollThumb' at 4;60.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.IndicatorScrollThumbInfo, new RecordItemIndex(54));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.IndicatorScrollThumb.MoveTo("4;60");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(320);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextNumberformat' at 97;11.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextNumberformatInfo, new RecordItemIndex(55));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextNumberformat.Click("97;11");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad' at 23;14.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(56));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad.Click("23;14");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId2' at 97;9.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(57));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId2.Click("97;9");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'numfo'.", new RecordItemIndex(58));
            Keyboard.Press("numfo");
            Delay.Milliseconds(1230);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'rmat'.", new RecordItemIndex(59));
            Keyboard.Press("rmat");
            Delay.Milliseconds(1450);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave' at 40;7.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(60));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave.Click("40;7");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113' at 19;26.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113Info, new RecordItemIndex(61));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_9_365113.Click(MouseButtons.Right, "19;26");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 13;6.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(62));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("13;6");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___' at 86;12.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(63));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___.Click("86;12");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(64));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(960);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextTagFormater' at 99;5.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextTagFormaterInfo, new RecordItemIndex(65));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextTagFormater.Click("99;5");
            Delay.Milliseconds(510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad' at Center.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(66));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad.Click();
            Delay.Milliseconds(540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId1' at 114;16.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId1Info, new RecordItemIndex(67));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId1.Click("114;16");
            Delay.Milliseconds(40);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ta'.", new RecordItemIndex(68));
            Keyboard.Press("ta");
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'G' Press.", new RecordItemIndex(69));
            Keyboard.Press(Keys.G, 34, Keyboard.DefaultKeyPressTime, 1, false);
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave' at 39;7.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(70));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave.Click("39;7");
            Delay.Milliseconds(1180);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_60485' at 15;19.", repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_60485Info, new RecordItemIndex(71));
            repo.WebDocumentLocalhost_8080.ContainerGraphCanvas1.PictureIcon_3_60485.Click(MouseButtons.Right, "15;19");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 13;8.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(72));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("13;8");
            Delay.Milliseconds(1730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___' at 92;8.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(73));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad_template___.Click("92;8");
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton' at 136;18.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(74));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonButton.Click("136;18");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextDestinationfile' at 96;11.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextDestinationfileInfo, new RecordItemIndex(75));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextDestinationfile.Click("96;11");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad' at 39;8.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(76));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonLoad.Click("39;8");
            Delay.Milliseconds(490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId' at 77;13.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(77));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.TextServiceId.Click("77;13");
            Delay.Milliseconds(20);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'destination'.", new RecordItemIndex(78));
            Keyboard.Press("destination");
            Delay.Milliseconds(3710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave' at 41;10.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(79));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonSave.Click("41;10");
            Delay.Milliseconds(1230);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerVBox.TextNameText' at 118;13.", repo.WebDocumentLocalhost_8080.ContainerVBox.TextNameTextInfo, new RecordItemIndex(80));
            repo.WebDocumentLocalhost_8080.ContainerVBox.TextNameText.Click("118;13");
            Delay.Milliseconds(400);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'file{RShiftKey down}_{RShiftKey up}'.", new RecordItemIndex(81));
            Keyboard.Press("file{RShiftKey down}_{RShiftKey up}");
            Delay.Milliseconds(1400);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'file'.", new RecordItemIndex(82));
            Keyboard.Press("file");
            Delay.Milliseconds(860);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{RShiftKey down}_{RShiftKey up}'.", new RecordItemIndex(83));
            Keyboard.Press("{RShiftKey down}_{RShiftKey up}");
            Delay.Milliseconds(2120);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'fo'.", new RecordItemIndex(84));
            Keyboard.Press("fo");
            Delay.Milliseconds(750);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'rmat'.", new RecordItemIndex(85));
            Keyboard.Press("rmat");
            Delay.Milliseconds(1130);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerVBox.TextUITextField' at 115;16.", repo.WebDocumentLocalhost_8080.ContainerVBox.TextUITextFieldInfo, new RecordItemIndex(86));
            repo.WebDocumentLocalhost_8080.ContainerVBox.TextUITextField.Click("115;16");
            Delay.Milliseconds(120);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test'.", new RecordItemIndex(87));
            Keyboard.Press("test");
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FormForm.CheckBoxRecovery' at 4;10.", repo.WebDocumentLocalhost_8080.FormForm.CheckBoxRecoveryInfo, new RecordItemIndex(88));
            repo.WebDocumentLocalhost_8080.FormForm.CheckBoxRecovery.Click("4;10");
            Delay.Milliseconds(510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FormForm.CheckBoxPrcsEvntLog' at 7;10.", repo.WebDocumentLocalhost_8080.FormForm.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(89));
            repo.WebDocumentLocalhost_8080.FormForm.CheckBoxPrcsEvntLog.Click("7;10");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FormForm.CheckBoxMsgEvntLog' at 7;7.", repo.WebDocumentLocalhost_8080.FormForm.CheckBoxMsgEvntLogInfo, new RecordItemIndex(90));
            repo.WebDocumentLocalhost_8080.FormForm.CheckBoxMsgEvntLog.Click("7;7");
            Delay.Milliseconds(1180);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerVBox.ButtonSave1' at 23;9.", repo.WebDocumentLocalhost_8080.ContainerVBox.ButtonSave1Info, new RecordItemIndex(91));
            repo.WebDocumentLocalhost_8080.ContainerVBox.ButtonSave1.Click("23;9");
            Delay.Milliseconds(1710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonOK' at 19;10.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(92));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonOK.Click("19;10");
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerVBox.ButtonPublish' at 36;7.", repo.WebDocumentLocalhost_8080.ContainerVBox.ButtonPublishInfo, new RecordItemIndex(93));
            repo.WebDocumentLocalhost_8080.ContainerVBox.ButtonPublish.Click("36;7");
            Delay.Milliseconds(1510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonOK1' at 36;10.", repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonOK1Info, new RecordItemIndex(94));
            repo.WebDocumentLocalhost_8080.FlexObjectIceFish.ButtonOK1.Click("36;10");
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerPanel.TextProcess_Modeling_' at 16;3.", repo.WebDocumentIceFish.ContainerPanel.TextProcess_Modeling_Info, new RecordItemIndex(95));
            repo.WebDocumentIceFish.ContainerPanel.TextProcess_Modeling_.Click("16;3");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.MenuItemView_Process' at 23;9.", repo.WebDocumentIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(96));
            repo.WebDocumentIceFish.MenuItemView_Process.Click("23;9");
            Delay.Milliseconds(1540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerPanel.ButtonNew' at 18;12.", repo.WebDocumentIceFish.ContainerPanel.ButtonNewInfo, new RecordItemIndex(97));
            repo.WebDocumentIceFish.ContainerPanel.ButtonNew.Click("18;12");
            Delay.Milliseconds(840);
            
        }

#region Image Feature Data
#endregion
    }
}