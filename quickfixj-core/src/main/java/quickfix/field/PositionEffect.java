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


public class PositionEffect extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 77;
	public static final char CLOSE = 'C';
	public static final char FIFO = 'F';
	public static final char OPEN = 'O';
	public static final char ROLLED = 'R';
	public static final char CLOSE_BUT_NOTIFY_ON_OPEN = 'N';
	public static final char DEFAULT = 'D';
	
	public PositionEffect() {
		super(77);
	}

	public PositionEffect(char data) {
		super(77, data);
	}
	
}
