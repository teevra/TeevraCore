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
 * $Id: DuplicateAliasException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 11, 2008 
 */

package com.headstrong.fusion.commons.resolver.exception;

/**
 * 
 */
public class DuplicateAliasException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5661152737541789798L;

	/**
	 * 
	 */
	public DuplicateAliasException() {
	}

	/**
	 * @param message
	 */
	public DuplicateAliasException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public DuplicateAliasException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DuplicateAliasException(String message, Throwable cause) {
		super(message, cause);
	}

}
