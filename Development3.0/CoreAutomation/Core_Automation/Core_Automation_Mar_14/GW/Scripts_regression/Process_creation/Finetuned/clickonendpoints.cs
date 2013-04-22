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
	/// The clickonendpoints recording.
	/// </summary>
	[TestModule("3a177992-8bf8-49e3-9996-06693f54db0c", ModuleType.Recording, 1)]
	public partial class clickonendpoints : ITestModule
	{
		/// <summary>
		/// Holds an instance of the FinetunedRepository repository.
		/// </summary>
		public static FinetunedRepository repo = FinetunedRepository.Instance;

		static clickonendpoints instance = new clickonendpoints();

		/// <summary>
		/// Constructs a new instance.
		/// </summary>
		public clickonendpoints()
		{
		}

		/// <summary>
		/// Gets a static instance of this recording.
		/// </summary>
		public static clickonendpoints Instance
		{
			get { return instance; }
		}

#region Variables

#endregion

		/// <summary>
		/// Starts the replay of the static recording <see cref="Instance"/>.
		/// </summary>
		[System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.1")]
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
		[System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.1")]
		void ITestModule.Run()
		{
			Mouse.DefaultMoveTime = 300;
			Keyboard.DefaultKeyPressTime = 100;
			Delay.SpeedFactor = 1.0;

			Init();

			Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ButtonEndpoints' at 65;11.", repo.WebDocumentIceFish.ButtonEndpointsInfo, new RecordItemIndex(0));
			repo.WebDocumentIceFish.ButtonEndpoints.Click("65;11", 100);
			Delay.Milliseconds(960);
			
		}

#region Image Feature Data
#endregion
	}
}
