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
    /// The Process_QPID_DBEndpoint_10 recording.
    /// </summary>
    [TestModule("0f5037f5-54bf-4732-a77a-ff204113ce1b", ModuleType.Recording, 1)]
    public partial class Process_QPID_DBEndpoint_10 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the Prcess_QPIDDBEndpoint_10 repository.
        /// </summary>
        public static Prcess_QPIDDBEndpoint_10 repo = Prcess_QPIDDBEndpoint_10.Instance;

        static Process_QPID_DBEndpoint_10 instance = new Process_QPID_DBEndpoint_10();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Process_QPID_DBEndpoint_10()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Process_QPID_DBEndpoint_10 Instance
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints' at 83;12.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints.Click("83;12");
            Delay.Milliseconds(1050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46' at 11;13.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46Info, new RecordItemIndex(1));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_46.MoveTo("11;13");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 110;159.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(2));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("110;159");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsers' at 73;7.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsersInfo, new RecordItemIndex(3));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonParsers.Click("73;7");
            Delay.Milliseconds(3320);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6' at 8;10.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6Info, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_6.MoveTo("8;10");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 232;194.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(5));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("232;194");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2320);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormatters' at 85;7.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormattersInfo, new RecordItemIndex(6));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonFormatters.Click("85;7");
            Delay.Milliseconds(1680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_8' at 5;14.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_8Info, new RecordItemIndex(7));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_8.MoveTo("5;14");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 380;220.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(8));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("380;220");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2600);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints' at 77;9.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(9));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints.Click("77;9");
            Delay.Milliseconds(1850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_1' at 10;11.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_1Info, new RecordItemIndex(10));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_1.MoveTo("10;11");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 517;236.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(11));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("517;236");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters' at 55;12.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(12));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters.Click("55;12");
            Delay.Milliseconds(1340);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 11;9.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(13));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("11;9");
            Delay.Milliseconds(300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_61120' at 18;31.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_61120Info, new RecordItemIndex(14));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_61120.MoveTo("18;31");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155' at 9;35.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155Info, new RecordItemIndex(15));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155.MoveTo("9;35");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 8;7.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(16));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("8;7");
            Delay.Milliseconds(260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155' at 19;23.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155Info, new RecordItemIndex(17));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155.MoveTo("19;23");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181' at 25;29.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181Info, new RecordItemIndex(18));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181.MoveTo("25;29");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 12;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(19));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("12;8");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181' at 22;18.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181Info, new RecordItemIndex(20));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181.MoveTo("22;18");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_1_468197' at 14;26.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_1_468197Info, new RecordItemIndex(21));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_1_468197.MoveTo("14;26");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_61120' at 20;21.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_61120Info, new RecordItemIndex(22));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_46_61120.Click(MouseButtons.Right, "20;21");
            Delay.Milliseconds(1010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 30;9.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(23));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("30;9");
            Delay.Milliseconds(1050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 79;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(24));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("79;7");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 60;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(25));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("60;8");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpid' at 21;2.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpidInfo, new RecordItemIndex(26));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextQpid.Click("21;2");
            Delay.Milliseconds(630);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 30;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(27));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("30;7");
            Delay.Milliseconds(590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId' at 90;19.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(28));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.Click("90;19");
            Delay.Milliseconds(1430);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'qpidsrc' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(29));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.PressKeys("qpidsrc");
            Delay.Milliseconds(2290);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 28;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(30));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("28;7");
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155' at 15;20.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155Info, new RecordItemIndex(31));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_6_183155.Click(MouseButtons.Right, "15;20");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 26;8.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(32));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("26;8");
            Delay.Milliseconds(1180);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 57;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(33));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("57;6");
            Delay.Milliseconds(1150);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 92;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(34));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("92;11");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfile' at 56;3.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfileInfo, new RecordItemIndex(35));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextParserfile.Click("56;3");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 29;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(36));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("29;10");
            Delay.Milliseconds(1080);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1' at 54;16.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(37));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.Click("54;16");
            Delay.Milliseconds(760);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'p' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(38));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("p");
            Delay.Milliseconds(1020);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ars{e down}' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(39));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("ars{e down}");
            Delay.Milliseconds(1410);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'r{e up}' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(40));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("r{e up}");
            Delay.Milliseconds(2010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 26;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(41));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("26;9");
            Delay.Milliseconds(1010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181' at 15;20.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181Info, new RecordItemIndex(42));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_8_331181.Click(MouseButtons.Right, "15;20");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 38;10.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(43));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("38;10");
            Delay.Milliseconds(1410);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 73;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(44));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("73;9");
            Delay.Milliseconds(1270);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 114;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(45));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("114;10");
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextDbFormatter' at 61;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextDbFormatterInfo, new RecordItemIndex(46));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextDbFormatter.Click("61;7");
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 22;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(47));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("22;9");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2' at 52;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(48));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.Click("52;11");
            Delay.Milliseconds(730);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'db' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(49));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("db");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'form' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(50));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("form");
            Delay.Milliseconds(1690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 39;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(51));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("39;8");
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_1_468197' at 20;24.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_1_468197Info, new RecordItemIndex(52));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_1_468197.Click(MouseButtons.Right, "20;24");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 27;12.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(53));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("27;12");
            Delay.Milliseconds(930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 41;3.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(54));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("41;3");
            Delay.Milliseconds(1150);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 119;12.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(55));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("119;12");
            Delay.Milliseconds(2760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextDbdestination' at 36;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextDbdestinationInfo, new RecordItemIndex(56));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextDbdestination.Click("36;7");
            Delay.Milliseconds(1070);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 27;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(57));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("27;11");
            Delay.Milliseconds(1370);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3' at 55;12.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(58));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.Click("55;12");
            Delay.Milliseconds(540);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'db' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(59));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.PressKeys("db");
            Delay.Milliseconds(1110);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dest' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(60));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.PressKeys("dest");
            Delay.Milliseconds(1560);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 24;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(61));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("24;9");
            Delay.Milliseconds(2480);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting' at 43;10.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_ReportingInfo, new RecordItemIndex(62));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting.Click("43;10");
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton1' at 142;10.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton1Info, new RecordItemIndex(63));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton1.Click("142;10");
            Delay.Milliseconds(1930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter' at 55;4.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporterInfo, new RecordItemIndex(64));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter.Click("55;4");
            Delay.Milliseconds(580);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure' at 24;11.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigureInfo, new RecordItemIndex(65));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure.Click("24;11");
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 68;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(66));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("68;8");
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton' at 133;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButtonInfo, new RecordItemIndex(67));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonButton.Click("133;5");
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter' at 32;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporterInfo, new RecordItemIndex(68));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter.Click("32;6");
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 27;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(69));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("27;11");
            Delay.Milliseconds(910);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId4' at 65;12.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId4Info, new RecordItemIndex(70));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId4.Click("65;12");
            Delay.Milliseconds(550);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'jmserr' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId4'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId4Info, new RecordItemIndex(71));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId4.PressKeys("jmserr");
            Delay.Milliseconds(1850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 20;13.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(72));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("20;13");
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties' at 83;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_PropertiesInfo, new RecordItemIndex(73));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties.Click("83;8");
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText' at 29;12.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(74));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.Click("29;12");
            Delay.Milliseconds(570);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'qpid' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(75));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("qpid");
            Delay.Milliseconds(1300);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{RShiftKey down}_{RShiftKey up}' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(76));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("{RShiftKey down}_{RShiftKey up}");
            Delay.Milliseconds(1600);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '10' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(77));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("10");
            Delay.Milliseconds(2150);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField' at 51;19.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextFieldInfo, new RecordItemIndex(78));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField.Click("51;19");
            Delay.Milliseconds(210);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextFieldInfo, new RecordItemIndex(79));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextUITextField.PressKeys("test");
            Delay.Milliseconds(1300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery' at 7;6.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecoveryInfo, new RecordItemIndex(80));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery.Click("7;6");
            Delay.Milliseconds(260);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog' at 8;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(81));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog.Click("8;8");
            Delay.Milliseconds(400);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog' at 7;6.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLogInfo, new RecordItemIndex(82));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog.Click("7;6");
            Delay.Milliseconds(760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1' at 25;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1Info, new RecordItemIndex(83));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1.Click("25;11");
            Delay.Milliseconds(2150);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK' at 30;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOKInfo, new RecordItemIndex(84));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK.Click("30;6");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish' at 32;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublishInfo, new RecordItemIndex(85));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish.Click("32;11");
            Delay.Milliseconds(2190);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1' at 39;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1Info, new RecordItemIndex(86));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1.Click("39;8");
            Delay.Milliseconds(760);
            
        }

#region Image Feature Data
#endregion
    }
}
