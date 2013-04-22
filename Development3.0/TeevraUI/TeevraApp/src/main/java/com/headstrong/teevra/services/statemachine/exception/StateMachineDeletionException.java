/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: StateMachineDeletionException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 4, 2009 
 */

package com.headstrong.teevra.services.statemachine.exception;

/**
 * When dependencies exist for the state machine specified to delete
 */
public class StateMachineDeletionException extends StateMachineServiceException {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 8235573570511902594L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public StateMachineDeletionException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public StateMachineDeletionException() {
		super();
	}
}
