﻿'//////////////////////////////////////////////////////////////////////////////
'
' This file was automatically generated by RANOREX.
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

Namespace Validation_Creation_templates

	''' <summary>
	''' The Recording1 recording.
	''' </summary>
	Public Partial Class JMS_IBM

'//////////////////////////////////////////////////////////////////////////////
			Public Shared Property URL_IBM As String  
			    Get  
			        Return URLIBM   
			    End Get  
			    Set  
			        URLIBM  = Value   
			    End Set  
			End Property  
			Private Shared URLIBM  As String

		Public Shared Sub getURL_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(URLIBM)
			Keyboard.Press(URLIBM)
		End Sub
	Public Shared Property Srcqueue_IBM As String  
			    Get  
			        Return SrcqueueIBM   
			    End Get  
			    Set  
			        SrcqueueIBM  = Value   
			    End Set  
			End Property  
			Private Shared SrcqueueIBM  As String       
 
		Public Shared Sub getSrcqueue_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			'Srcqueue_IBM
			Report.Info(SrcqueueIBM)
			Keyboard.Press(SrcqueueIBM)
		End Sub
 
 
 	Public Shared Property Userid_IBM As String  
			    Get  
			        Return UseridIBM   
			    End Get  
			    Set  
			        UseridIBM  = Value   
			    End Set  
			End Property  
			Private Shared UseridIBM  As String
		Public Shared Sub getUserid_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(UseridIBM)
			Keyboard.Press(UseridIBM)
		End Sub
		
		
		 	Public Shared Property port_IBM As String  
			    Get  
			        Return portIBM   
			    End Get  
			    Set  
			        portIBM  = Value   
			    End Set  
			End Property  
			Private Shared portIBM  As String

		Public Shared Sub getport_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(portIBM)
			Keyboard.Press(portIBM)
		End Sub

		 	Public Shared Property QueueMGR_IBM As String  
			    Get  
			        Return QueueMGRIBM   
			    End Get  
			    Set  
			        QueueMGRIBM  = Value   
			    End Set  
			End Property  
			Private Shared QueueMGRIBM  As String
		Public Shared Sub getQueueMGR_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(QueueMGRIBM)
			Keyboard.Press(QueueMGRIBM)
		End Sub

		 	Public Shared Property QueueChannel_ibm As String  
			    Get  
			        Return QueueChannelibm   
			    End Get  
			    Set  
			        QueueChannelibm  = Value   
			    End Set  
			End Property  
			Private Shared QueueChannelibm  As String

		Public Shared Sub getQueueChannel_ibm()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(QueueChannelibm)
			Keyboard.Press(QueueChannelibm)
		End Sub
		 Public Shared Property Delmode_IBM As String  
			    Get  
			        Return DelmodeIBM   
			    End Get  
			    Set  
			        DelmodeIBM  = Value   
			    End Set  
			End Property  
			Private Shared DelmodeIBM  As String
		Public Shared Sub getDelmode_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(DelmodeIBM)
			Keyboard.Press(DelmodeIBM)
		End Sub
		 Public Shared Property Pwd_IBM As String  
			    Get  
			        Return PwdIBM   
			    End Get  
			    Set  
			        PwdIBM  = Value   
			    End Set  
			End Property  
			Private Shared PwdIBM  As String
		Public Shared Sub getPwd_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(PwdIBM)
			Keyboard.Press(PwdIBM)
		End Sub
		 Public Shared Property srctemp_IBM As String  
			    Get  
			        Return srctempIBM  
			    End Get  
			    Set  
			        srctempIBM  = Value   
			    End Set  
			End Property  
			Private Shared srctempIBM  As String
		Public Shared Sub getsrctemp_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(srctempIBM)
			Keyboard.Press(srctempIBM)
		End Sub
		
				 Public Shared Property DestTemp_IBM As String  
			    Get  
			        Return DestTempIBM  
			    End Get  
			    Set  
			        DestTempIBM  = Value   
			    End Set  
			End Property  
			Private Shared DestTempIBM  As String

		Public Shared Sub getDestTemp_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info(DestTempIBM)
			Keyboard.Press(DestTempIBM)
		End Sub


				 Public Shared Property Destqueue_IBM As String  
			    Get  
			        Return DestqueueIBM  
			    End Get  
			    Set  
			        DestqueueIBM  = Value   
			    End Set  
			End Property  
			Private Shared DestqueueIBM  As String
		Public Shared Sub getDestqueue_IBM()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info("Key sequence 'dest'.")
			Keyboard.Press("ICEFISH.TO.IFEU.LQUEUE")
		End Sub

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub

		Private Sub Init()
			' Your recording specific initialization code goes here.
		End Sub

		Public Sub Key_Sequence_TextIBMMQDeliveryMode11()
			' Your code goes here. Code inside this method will not be changed by the code generator.
			Report.Info(Delmode_IBM)
			Keyboard.Press(Delmode_IBM)
		End Sub

		Public Sub Key_Sequence_TextIBMMQport11()
			' Your code goes here. Code inside this method will not be changed by the code generator.
			Report.Info(port_IBM)
			Keyboard.Press(port_IBM)
		End Sub


	End Class
End Namespace
