/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.field;

import quickfix.CharField;


public class RegistStatus extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 506;
	public static final char ACCEPTED = 'A';
	public static final char REJECTED = 'R';
	public static final char HELD = 'H';
	public static final char REMINDER_I_E_REGISTRATION_INSTRUCTIONS_ARE_STILL_OUTSTANDING = 'N';
	
	public RegistStatus() {
		super(506);
	}

	public RegistStatus(char data) {
		super(506, data);
	}
	
}
