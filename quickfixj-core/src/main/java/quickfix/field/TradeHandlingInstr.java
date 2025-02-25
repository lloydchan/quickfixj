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


public class TradeHandlingInstr extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1123;
	public static final char TRADE_CONFIRMATION = '0';
	public static final char TWO_PARTY_REPORT = '1';
	public static final char ONE_PARTY_REPORT_FOR_MATCHING = '2';
	public static final char ONE_PARTY_REPORT_FOR_PASS_THROUGH = '3';
	public static final char AUTOMATED_FLOOR_ORDER_ROUTING = '4';
	public static final char TWO_PARTY_REPORT_FOR_CLAIM = '5';
	
	public TradeHandlingInstr() {
		super(1123);
	}

	public TradeHandlingInstr(char data) {
		super(1123, data);
	}
	
}
