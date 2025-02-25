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

import quickfix.IntField;


public class DiscretionLimitType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 843;
	public static final int OR_BETTER_PRICE_IMPROVEMENT_ALLOWED = 0;
	public static final int STRICT_LIMIT_IS_A_STRICT_LIMIT = 1;
	public static final int OR_WORSE_FOR_A_BUY_THE_DISCRETION_PRICE_IS_A_MINIMUM_AND_FOR_A_SELL_THE_DISCRETION_PRICE_IS_A_MAXIMUM = 2;
	
	public DiscretionLimitType() {
		super(843);
	}

	public DiscretionLimitType(int data) {
		super(843, data);
	}
	
}
