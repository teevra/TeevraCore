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
    /// The Recording22 recording.
    /// </summary>
    [TestModule("1b61f7a0-3a94-467d-be0c-3a7468ac7e74", ModuleType.Recording, 1)]
    public partial class Recording22 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the project22Repository repository.
        /// </summary>
        public static project22Repository repo = project22Repository.Instance;

        static Recording22 instance = new Recording22();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Recording22()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Recording22 Instance
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
            Mouse.DefaultMoveTime = 60;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 5.0;

            Init();

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpoints' at 61;11.", repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentLocalhost_8080.ContainerComponent_Palette.ButtonEndpoints.Click("61;11");
            Delay.Milliseconds(790);
            
            records22();
            Delay.Milliseconds(0);
            
        }

#region Image Feature Data
#endregion
    }
}