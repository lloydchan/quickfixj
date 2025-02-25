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

import quickfix.StringField;


public class PriceQuoteMethod extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1196;
	public static final String STANDARD_MONEY_PER_UNIT_OF_A_PHYSICAL = "STD";
	public static final String INDEX = "INX";
	public static final String INTEREST_RATE_INDEX = "INT";
	public static final String PERCENT_OF_PAR = "PCTPAR";
	
	public PriceQuoteMethod() {
		super(1196);
	}

	public PriceQuoteMethod(String data) {
		super(1196, data);
	}
	
}
