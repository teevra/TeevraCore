/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: FusionException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 15, 2008 
 */

package com.headstrong.fusion.commons.exception;

/**
 * 
 */
public class FusionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4936916972120975676L;

	/**
	 * 
	 */
	public FusionException() {
		super();
	}

	/**
	 * @param message
	 */
	public FusionException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public FusionException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FusionException(String message, Throwable cause) {
		super(message, cause);
	}

}
