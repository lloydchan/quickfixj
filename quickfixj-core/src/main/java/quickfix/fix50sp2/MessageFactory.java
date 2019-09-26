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

package quickfix.fix50sp2;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.fix50sp2.IOI.MSGTYPE:
				return new quickfix.fix50sp2.IOI();
	
			case quickfix.fix50sp2.Advertisement.MSGTYPE:
				return new quickfix.fix50sp2.Advertisement();
	
			case quickfix.fix50sp2.ExecutionReport.MSGTYPE:
				return new quickfix.fix50sp2.ExecutionReport();
	
			case quickfix.fix50sp2.OrderCancelReject.MSGTYPE:
				return new quickfix.fix50sp2.OrderCancelReject();
	
			case quickfix.fix50sp2.DerivativeSecurityList.MSGTYPE:
				return new quickfix.fix50sp2.DerivativeSecurityList();
	
			case quickfix.fix50sp2.NewOrderMultileg.MSGTYPE:
				return new quickfix.fix50sp2.NewOrderMultileg();
	
			case quickfix.fix50sp2.MultilegOrderCancelReplace.MSGTYPE:
				return new quickfix.fix50sp2.MultilegOrderCancelReplace();
	
			case quickfix.fix50sp2.TradeCaptureReportRequest.MSGTYPE:
				return new quickfix.fix50sp2.TradeCaptureReportRequest();
	
			case quickfix.fix50sp2.TradeCaptureReport.MSGTYPE:
				return new quickfix.fix50sp2.TradeCaptureReport();
	
			case quickfix.fix50sp2.OrderMassStatusRequest.MSGTYPE:
				return new quickfix.fix50sp2.OrderMassStatusRequest();
	
			case quickfix.fix50sp2.QuoteRequestReject.MSGTYPE:
				return new quickfix.fix50sp2.QuoteRequestReject();
	
			case quickfix.fix50sp2.RFQRequest.MSGTYPE:
				return new quickfix.fix50sp2.RFQRequest();
	
			case quickfix.fix50sp2.QuoteStatusReport.MSGTYPE:
				return new quickfix.fix50sp2.QuoteStatusReport();
	
			case quickfix.fix50sp2.QuoteResponse.MSGTYPE:
				return new quickfix.fix50sp2.QuoteResponse();
	
			case quickfix.fix50sp2.Confirmation.MSGTYPE:
				return new quickfix.fix50sp2.Confirmation();
	
			case quickfix.fix50sp2.PositionMaintenanceRequest.MSGTYPE:
				return new quickfix.fix50sp2.PositionMaintenanceRequest();
	
			case quickfix.fix50sp2.PositionMaintenanceReport.MSGTYPE:
				return new quickfix.fix50sp2.PositionMaintenanceReport();
	
			case quickfix.fix50sp2.RequestForPositions.MSGTYPE:
				return new quickfix.fix50sp2.RequestForPositions();
	
			case quickfix.fix50sp2.RequestForPositionsAck.MSGTYPE:
				return new quickfix.fix50sp2.RequestForPositionsAck();
	
			case quickfix.fix50sp2.PositionReport.MSGTYPE:
				return new quickfix.fix50sp2.PositionReport();
	
			case quickfix.fix50sp2.TradeCaptureReportRequestAck.MSGTYPE:
				return new quickfix.fix50sp2.TradeCaptureReportRequestAck();
	
			case quickfix.fix50sp2.TradeCaptureReportAck.MSGTYPE:
				return new quickfix.fix50sp2.TradeCaptureReportAck();
	
			case quickfix.fix50sp2.AllocationReport.MSGTYPE:
				return new quickfix.fix50sp2.AllocationReport();
	
			case quickfix.fix50sp2.AllocationReportAck.MSGTYPE:
				return new quickfix.fix50sp2.AllocationReportAck();
	
			case quickfix.fix50sp2.ConfirmationAck.MSGTYPE:
				return new quickfix.fix50sp2.ConfirmationAck();
	
			case quickfix.fix50sp2.SettlementInstructionRequest.MSGTYPE:
				return new quickfix.fix50sp2.SettlementInstructionRequest();
	
			case quickfix.fix50sp2.AssignmentReport.MSGTYPE:
				return new quickfix.fix50sp2.AssignmentReport();
	
			case quickfix.fix50sp2.CollateralRequest.MSGTYPE:
				return new quickfix.fix50sp2.CollateralRequest();
	
			case quickfix.fix50sp2.CollateralAssignment.MSGTYPE:
				return new quickfix.fix50sp2.CollateralAssignment();
	
			case quickfix.fix50sp2.CollateralResponse.MSGTYPE:
				return new quickfix.fix50sp2.CollateralResponse();
	
			case quickfix.fix50sp2.News.MSGTYPE:
				return new quickfix.fix50sp2.News();
	
			case quickfix.fix50sp2.CollateralReport.MSGTYPE:
				return new quickfix.fix50sp2.CollateralReport();
	
			case quickfix.fix50sp2.CollateralInquiry.MSGTYPE:
				return new quickfix.fix50sp2.CollateralInquiry();
	
			case quickfix.fix50sp2.NetworkCounterpartySystemStatusRequest.MSGTYPE:
				return new quickfix.fix50sp2.NetworkCounterpartySystemStatusRequest();
	
			case quickfix.fix50sp2.NetworkCounterpartySystemStatusResponse.MSGTYPE:
				return new quickfix.fix50sp2.NetworkCounterpartySystemStatusResponse();
	
			case quickfix.fix50sp2.UserRequest.MSGTYPE:
				return new quickfix.fix50sp2.UserRequest();
	
			case quickfix.fix50sp2.UserResponse.MSGTYPE:
				return new quickfix.fix50sp2.UserResponse();
	
			case quickfix.fix50sp2.CollateralInquiryAck.MSGTYPE:
				return new quickfix.fix50sp2.CollateralInquiryAck();
	
			case quickfix.fix50sp2.ConfirmationRequest.MSGTYPE:
				return new quickfix.fix50sp2.ConfirmationRequest();
	
			case quickfix.fix50sp2.TradingSessionListRequest.MSGTYPE:
				return new quickfix.fix50sp2.TradingSessionListRequest();
	
			case quickfix.fix50sp2.TradingSessionList.MSGTYPE:
				return new quickfix.fix50sp2.TradingSessionList();
	
			case quickfix.fix50sp2.SecurityListUpdateReport.MSGTYPE:
				return new quickfix.fix50sp2.SecurityListUpdateReport();
	
			case quickfix.fix50sp2.AdjustedPositionReport.MSGTYPE:
				return new quickfix.fix50sp2.AdjustedPositionReport();
	
			case quickfix.fix50sp2.AllocationInstructionAlert.MSGTYPE:
				return new quickfix.fix50sp2.AllocationInstructionAlert();
	
			case quickfix.fix50sp2.ExecutionAcknowledgement.MSGTYPE:
				return new quickfix.fix50sp2.ExecutionAcknowledgement();
	
			case quickfix.fix50sp2.ContraryIntentionReport.MSGTYPE:
				return new quickfix.fix50sp2.ContraryIntentionReport();
	
			case quickfix.fix50sp2.SecurityDefinitionUpdateReport.MSGTYPE:
				return new quickfix.fix50sp2.SecurityDefinitionUpdateReport();
	
			case quickfix.fix50sp2.SettlementObligationReport.MSGTYPE:
				return new quickfix.fix50sp2.SettlementObligationReport();
	
			case quickfix.fix50sp2.DerivativeSecurityListUpdateReport.MSGTYPE:
				return new quickfix.fix50sp2.DerivativeSecurityListUpdateReport();
	
			case quickfix.fix50sp2.TradingSessionListUpdateReport.MSGTYPE:
				return new quickfix.fix50sp2.TradingSessionListUpdateReport();
	
			case quickfix.fix50sp2.MarketDefinitionRequest.MSGTYPE:
				return new quickfix.fix50sp2.MarketDefinitionRequest();
	
			case quickfix.fix50sp2.MarketDefinition.MSGTYPE:
				return new quickfix.fix50sp2.MarketDefinition();
	
			case quickfix.fix50sp2.MarketDefinitionUpdateReport.MSGTYPE:
				return new quickfix.fix50sp2.MarketDefinitionUpdateReport();
	
			case quickfix.fix50sp2.ApplicationMessageRequest.MSGTYPE:
				return new quickfix.fix50sp2.ApplicationMessageRequest();
	
			case quickfix.fix50sp2.ApplicationMessageRequestAck.MSGTYPE:
				return new quickfix.fix50sp2.ApplicationMessageRequestAck();
	
			case quickfix.fix50sp2.ApplicationMessageReport.MSGTYPE:
				return new quickfix.fix50sp2.ApplicationMessageReport();
	
			case quickfix.fix50sp2.OrderMassActionReport.MSGTYPE:
				return new quickfix.fix50sp2.OrderMassActionReport();
	
			case quickfix.fix50sp2.Email.MSGTYPE:
				return new quickfix.fix50sp2.Email();
	
			case quickfix.fix50sp2.OrderMassActionRequest.MSGTYPE:
				return new quickfix.fix50sp2.OrderMassActionRequest();
	
			case quickfix.fix50sp2.UserNotification.MSGTYPE:
				return new quickfix.fix50sp2.UserNotification();
	
			case quickfix.fix50sp2.StreamAssignmentRequest.MSGTYPE:
				return new quickfix.fix50sp2.StreamAssignmentRequest();
	
			case quickfix.fix50sp2.StreamAssignmentReport.MSGTYPE:
				return new quickfix.fix50sp2.StreamAssignmentReport();
	
			case quickfix.fix50sp2.StreamAssignmentReportACK.MSGTYPE:
				return new quickfix.fix50sp2.StreamAssignmentReportACK();
	
			case quickfix.fix50sp2.NewOrderSingle.MSGTYPE:
				return new quickfix.fix50sp2.NewOrderSingle();
	
			case quickfix.fix50sp2.NewOrderList.MSGTYPE:
				return new quickfix.fix50sp2.NewOrderList();
	
			case quickfix.fix50sp2.OrderCancelRequest.MSGTYPE:
				return new quickfix.fix50sp2.OrderCancelRequest();
	
			case quickfix.fix50sp2.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix50sp2.OrderCancelReplaceRequest();
	
			case quickfix.fix50sp2.OrderStatusRequest.MSGTYPE:
				return new quickfix.fix50sp2.OrderStatusRequest();
	
			case quickfix.fix50sp2.AllocationInstruction.MSGTYPE:
				return new quickfix.fix50sp2.AllocationInstruction();
	
			case quickfix.fix50sp2.ListCancelRequest.MSGTYPE:
				return new quickfix.fix50sp2.ListCancelRequest();
	
			case quickfix.fix50sp2.ListExecute.MSGTYPE:
				return new quickfix.fix50sp2.ListExecute();
	
			case quickfix.fix50sp2.ListStatusRequest.MSGTYPE:
				return new quickfix.fix50sp2.ListStatusRequest();
	
			case quickfix.fix50sp2.ListStatus.MSGTYPE:
				return new quickfix.fix50sp2.ListStatus();
	
			case quickfix.fix50sp2.AllocationInstructionAck.MSGTYPE:
				return new quickfix.fix50sp2.AllocationInstructionAck();
	
			case quickfix.fix50sp2.DontKnowTrade.MSGTYPE:
				return new quickfix.fix50sp2.DontKnowTrade();
	
			case quickfix.fix50sp2.QuoteRequest.MSGTYPE:
				return new quickfix.fix50sp2.QuoteRequest();
	
			case quickfix.fix50sp2.Quote.MSGTYPE:
				return new quickfix.fix50sp2.Quote();
	
			case quickfix.fix50sp2.SettlementInstructions.MSGTYPE:
				return new quickfix.fix50sp2.SettlementInstructions();
	
			case quickfix.fix50sp2.MarketDataRequest.MSGTYPE:
				return new quickfix.fix50sp2.MarketDataRequest();
	
			case quickfix.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh();
	
			case quickfix.fix50sp2.MarketDataIncrementalRefresh.MSGTYPE:
				return new quickfix.fix50sp2.MarketDataIncrementalRefresh();
	
			case quickfix.fix50sp2.MarketDataRequestReject.MSGTYPE:
				return new quickfix.fix50sp2.MarketDataRequestReject();
	
			case quickfix.fix50sp2.QuoteCancel.MSGTYPE:
				return new quickfix.fix50sp2.QuoteCancel();
	
			case quickfix.fix50sp2.QuoteStatusRequest.MSGTYPE:
				return new quickfix.fix50sp2.QuoteStatusRequest();
	
			case quickfix.fix50sp2.MassQuoteAcknowledgement.MSGTYPE:
				return new quickfix.fix50sp2.MassQuoteAcknowledgement();
	
			case quickfix.fix50sp2.SecurityDefinitionRequest.MSGTYPE:
				return new quickfix.fix50sp2.SecurityDefinitionRequest();
	
			case quickfix.fix50sp2.SecurityDefinition.MSGTYPE:
				return new quickfix.fix50sp2.SecurityDefinition();
	
			case quickfix.fix50sp2.SecurityStatusRequest.MSGTYPE:
				return new quickfix.fix50sp2.SecurityStatusRequest();
	
			case quickfix.fix50sp2.SecurityStatus.MSGTYPE:
				return new quickfix.fix50sp2.SecurityStatus();
	
			case quickfix.fix50sp2.TradingSessionStatusRequest.MSGTYPE:
				return new quickfix.fix50sp2.TradingSessionStatusRequest();
	
			case quickfix.fix50sp2.TradingSessionStatus.MSGTYPE:
				return new quickfix.fix50sp2.TradingSessionStatus();
	
			case quickfix.fix50sp2.MassQuote.MSGTYPE:
				return new quickfix.fix50sp2.MassQuote();
	
			case quickfix.fix50sp2.BusinessMessageReject.MSGTYPE:
				return new quickfix.fix50sp2.BusinessMessageReject();
	
			case quickfix.fix50sp2.BidRequest.MSGTYPE:
				return new quickfix.fix50sp2.BidRequest();
	
			case quickfix.fix50sp2.BidResponse.MSGTYPE:
				return new quickfix.fix50sp2.BidResponse();
	
			case quickfix.fix50sp2.ListStrikePrice.MSGTYPE:
				return new quickfix.fix50sp2.ListStrikePrice();
	
			case quickfix.fix50sp2.RegistrationInstructions.MSGTYPE:
				return new quickfix.fix50sp2.RegistrationInstructions();
	
			case quickfix.fix50sp2.RegistrationInstructionsResponse.MSGTYPE:
				return new quickfix.fix50sp2.RegistrationInstructionsResponse();
	
			case quickfix.fix50sp2.OrderMassCancelRequest.MSGTYPE:
				return new quickfix.fix50sp2.OrderMassCancelRequest();
	
			case quickfix.fix50sp2.OrderMassCancelReport.MSGTYPE:
				return new quickfix.fix50sp2.OrderMassCancelReport();
	
			case quickfix.fix50sp2.NewOrderCross.MSGTYPE:
				return new quickfix.fix50sp2.NewOrderCross();
	
			case quickfix.fix50sp2.CrossOrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest();
	
			case quickfix.fix50sp2.CrossOrderCancelRequest.MSGTYPE:
				return new quickfix.fix50sp2.CrossOrderCancelRequest();
	
			case quickfix.fix50sp2.SecurityTypeRequest.MSGTYPE:
				return new quickfix.fix50sp2.SecurityTypeRequest();
	
			case quickfix.fix50sp2.SecurityTypes.MSGTYPE:
				return new quickfix.fix50sp2.SecurityTypes();
	
			case quickfix.fix50sp2.SecurityListRequest.MSGTYPE:
				return new quickfix.fix50sp2.SecurityListRequest();
	
			case quickfix.fix50sp2.SecurityList.MSGTYPE:
				return new quickfix.fix50sp2.SecurityList();
	
			case quickfix.fix50sp2.DerivativeSecurityListRequest.MSGTYPE:
				return new quickfix.fix50sp2.DerivativeSecurityListRequest();
	
		}

		return new quickfix.fix50sp2.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.fix50sp2.IOI.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.IOI.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.IOI.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.IOI.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.IOI.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.IOI.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.IOI.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoIOIQualifiers.FIELD:
					return new quickfix.fix50sp2.IOI.NoIOIQualifiers();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.IOI.NoRoutingIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.Advertisement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.Advertisement.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.Advertisement.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50sp2.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoContraBrokers.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoContraBrokers();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoStrategyParameters();
	
				case quickfix.field.NoFills.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoFills();
	
				case quickfix.field.NoNested4PartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoFills.NoNested4PartyIDs();
	
				case quickfix.field.NoNested4PartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoFills.NoNested4PartyIDs.NoNested4PartySubIDs();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoRateSources();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoContAmts();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoMiscFees();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoTrdRegTimestamps();
	
				}
				break;
	
			case quickfix.fix50sp2.DerivativeSecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.DerivativeSecurityList.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.DerivativeSecurityList.NoRelatedSym.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.NewOrderMultileg.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoStrategyParameters();
	
				}
				break;
	
			case quickfix.fix50sp2.MultilegOrderCancelReplace.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoStrategyParameters();
	
				}
				break;
	
			case quickfix.fix50sp2.TradeCaptureReportRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoLegs();
	
				case quickfix.field.NoDates.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoDates();
	
				}
				break;
	
			case quickfix.fix50sp2.TradeCaptureReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoUnderlyings();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoPosAmt();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoOfLegUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs.NoOfLegUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoContAmts();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoMiscFees();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSideTrdRegTS.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoSideTrdRegTS();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoTrdRepIndicators.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoTrdRepIndicators();
	
				}
				break;
	
			case quickfix.fix50sp2.OrderMassStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassStatusRequest.NoTargetPartyIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.QuoteRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.RFQRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoRelatedSym.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.QuoteStatusReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoTargetPartyIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoQuoteQualifiers();
	
				}
				break;
	
			case quickfix.fix50sp2.QuoteResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.Confirmation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoTrdRegTimestamps();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoLegs();
	
				case quickfix.field.NoCapacities.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoCapacities();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoMiscFees();
	
				}
				break;
	
			case quickfix.fix50sp2.PositionMaintenanceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoTradingSessions();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50sp2.PositionMaintenanceReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoTradingSessions();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50sp2.RequestForPositions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix50sp2.RequestForPositionsAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RequestForPositionsAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.RequestForPositionsAck.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.RequestForPositionsAck.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50sp2.PositionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingAmounts.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoUnderlyings.NoUnderlyingAmounts();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50sp2.TradeCaptureReportRequestAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequestAck.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequestAck.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.TradeCaptureReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoUnderlyings();
	
				case quickfix.field.NoTrdRepIndicators.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoTrdRepIndicators();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoOfLegUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs.NoOfLegUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoTrdRegTimestamps();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoPosAmt();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoContAmts();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoMiscFees();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSideTrdRegTS.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoSideTrdRegTS();
	
				}
				break;
	
			case quickfix.fix50sp2.AllocationReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs.NoClearingInstructions();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoRateSources();
	
				}
				break;
	
			case quickfix.fix50sp2.AllocationReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.SettlementInstructionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.SettlementInstructionRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.AssignmentReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoUnderlyings();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPosAmt();
	
				}
				break;
	
			case quickfix.fix50sp2.CollateralRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50sp2.CollateralAssignment.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50sp2.CollateralResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50sp2.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoNewsRefIDs.FIELD:
					return new quickfix.fix50sp2.News.NoNewsRefIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.News.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.News.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.News.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.News.NoUnderlyings();
	
				case quickfix.field.NoLinesOfText.FIELD:
					return new quickfix.fix50sp2.News.NoLinesOfText();
	
				}
				break;
	
			case quickfix.fix50sp2.CollateralReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50sp2.CollateralInquiry.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoCollInquiryQualifier();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoStipulations();
	
				}
				break;
	
			case quickfix.fix50sp2.NetworkCounterpartySystemStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix50sp2.NetworkCounterpartySystemStatusRequest.NoCompIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.NetworkCounterpartySystemStatusResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix50sp2.NetworkCounterpartySystemStatusResponse.NoCompIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.CollateralInquiryAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoCollInquiryQualifier();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50sp2.ConfirmationRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.ConfirmationRequest.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.ConfirmationRequest.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.TradingSessionList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.TradingSessionList.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityListUpdateReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoStrikeRules.NoMaturityRules();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoLegs.NoLegStipulations();
	
				}
				break;
	
			case quickfix.fix50sp2.AdjustedPositionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoRelatedSym();
	
				}
				break;
	
			case quickfix.fix50sp2.AllocationInstructionAlert.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs.NoClearingInstructions();
	
				}
				break;
	
			case quickfix.fix50sp2.ExecutionAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.ExecutionAcknowledgement.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.ExecutionAcknowledgement.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.ContraryIntentionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ContraryIntentionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ContraryIntentionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExpiration.FIELD:
					return new quickfix.fix50sp2.ContraryIntentionReport.NoExpiration();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.ContraryIntentionReport.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityDefinitionUpdateReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoLegs();
	
				case quickfix.field.NoMarketSegments.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoMarketSegments();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoMarketSegments.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoMarketSegments.NoStrikeRules.NoMaturityRules();
	
				}
				break;
	
			case quickfix.fix50sp2.SettlementObligationReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSettlOblig.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.DerivativeSecurityListUpdateReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.DerivativeSecurityListUpdateReport.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.DerivativeSecurityListUpdateReport.NoRelatedSym.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.TradingSessionListUpdateReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.TradingSessionListUpdateReport.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix50sp2.MarketDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrdTypeRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinition.NoOrdTypeRules();
	
				case quickfix.field.NoTimeInForceRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinition.NoTimeInForceRules();
	
				case quickfix.field.NoExecInstRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinition.NoExecInstRules();
	
				}
				break;
	
			case quickfix.fix50sp2.MarketDefinitionUpdateReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrdTypeRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinitionUpdateReport.NoOrdTypeRules();
	
				case quickfix.field.NoTimeInForceRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinitionUpdateReport.NoTimeInForceRules();
	
				case quickfix.field.NoExecInstRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinitionUpdateReport.NoExecInstRules();
	
				}
				break;
	
			case quickfix.fix50sp2.ApplicationMessageRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoApplIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoApplIDs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoApplIDs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.ApplicationMessageRequestAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoApplIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoApplIDs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoApplIDs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.ApplicationMessageReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageReport.NoApplIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.OrderMassActionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAffectedOrders.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoAffectedOrders();
	
				case quickfix.field.NoNotAffectedOrders.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoNotAffectedOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoTargetPartyIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.Email.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.Email.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.Email.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.Email.NoLegs();
	
				case quickfix.field.NoLinesOfText.FIELD:
					return new quickfix.fix50sp2.Email.NoLinesOfText();
	
				}
				break;
	
			case quickfix.fix50sp2.OrderMassActionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionRequest.NoTargetPartyIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.UserNotification.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUsernames.FIELD:
					return new quickfix.fix50sp2.UserNotification.NoUsernames();
	
				}
				break;
	
			case quickfix.fix50sp2.StreamAssignmentRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAsgnReqs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentRequest.NoAsgnReqs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentRequest.NoAsgnReqs.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentRequest.NoAsgnReqs.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentRequest.NoAsgnReqs.NoRelatedSym();
	
				}
				break;
	
			case quickfix.fix50sp2.StreamAssignmentReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAsgnReqs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentReport.NoAsgnReqs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentReport.NoAsgnReqs.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentReport.NoAsgnReqs.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentReport.NoAsgnReqs.NoRelatedSym();
	
				}
				break;
	
			case quickfix.fix50sp2.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoTrdRegTimestamps();
	
				}
				break;
	
			case quickfix.fix50sp2.NewOrderList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoStrategyParameters();
	
				}
				break;
	
			case quickfix.fix50sp2.OrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.OrderCancelRequest.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50sp2.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoTrdRegTimestamps();
	
				}
				break;
	
			case quickfix.fix50sp2.OrderStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.OrderStatusRequest.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50sp2.AllocationInstruction.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs.NoClearingInstructions();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoRateSources();
	
				}
				break;
	
			case quickfix.fix50sp2.ListCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ListCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ListCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.ListStatus.NoOrders();
	
				}
				break;
	
			case quickfix.fix50sp2.AllocationInstructionAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.DontKnowTrade.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.DontKnowTrade.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.DontKnowTrade.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.QuoteRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoRateSources();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.Quote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.Quote.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.Quote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.Quote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.Quote.NoUnderlyings();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.Quote.NoRateSources();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.Quote.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.Quote.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.Quote.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.Quote.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.SettlementInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSettlInst.FIELD:
					return new quickfix.fix50sp2.SettlementInstructions.NoSettlInst();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.SettlementInstructions.NoSettlInst.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoMDEntryTypes.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoTradingSessions();
	
				}
				break;
	
			case quickfix.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoLegs();
	
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries.NoRateSources();
	
				case quickfix.field.NoOfSecSizes.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries.NoOfSecSizes();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoRoutingIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoRateSources();
	
				case quickfix.field.NoOfSecSizes.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoOfSecSizes();
	
				case quickfix.field.NoStatsIndicators.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoStatsIndicators();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoRoutingIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.MarketDataRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequestReject.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequestReject.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAltMDSource.FIELD:
					return new quickfix.fix50sp2.MarketDataRequestReject.NoAltMDSource();
	
				}
				break;
	
			case quickfix.fix50sp2.QuoteCancel.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoTargetPartyIDs();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoQuoteEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoQuoteEntries.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoQuoteEntries.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.QuoteStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoTargetPartyIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.MassQuoteAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoTargetPartyIDs();
	
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityDefinitionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionRequest.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionRequest.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionRequest.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoLegs();
	
				case quickfix.field.NoMarketSegments.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoMarketSegments();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoMarketSegments.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoMarketSegments.NoStrikeRules.NoMaturityRules();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityStatusRequest.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityStatus.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityStatus.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.TradingSessionStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				}
				break;
	
			case quickfix.fix50sp2.MassQuote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.BidRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidDescriptors.FIELD:
					return new quickfix.fix50sp2.BidRequest.NoBidDescriptors();
	
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix50sp2.BidRequest.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix50sp2.BidResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix50sp2.BidResponse.NoBidComponents();
	
				}
				break;
	
			case quickfix.fix50sp2.ListStrikePrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoStrikes.FIELD:
					return new quickfix.fix50sp2.ListStrikePrice.NoStrikes();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.ListStrikePrice.NoStrikes.NoUnderlyings();
	
				}
				break;
	
			case quickfix.fix50sp2.RegistrationInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRegistDtls.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoRegistDtls();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoDistribInsts.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoDistribInsts();
	
				}
				break;
	
			case quickfix.fix50sp2.RegistrationInstructionsResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructionsResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.OrderMassCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelRequest.NoTargetPartyIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.OrderMassCancelReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoAffectedOrders.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoAffectedOrders();
	
				case quickfix.field.NoNotAffectedOrders.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoNotAffectedOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoTargetPartyIDs();
	
				}
				break;
	
			case quickfix.fix50sp2.NewOrderCross.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoTradingSessions();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoStrategyParameters();
	
				}
				break;
	
			case quickfix.fix50sp2.CrossOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoStrategyParameters();
	
				}
				break;
	
			case quickfix.fix50sp2.CrossOrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityTypes.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityTypes.FIELD:
					return new quickfix.fix50sp2.SecurityTypes.NoSecurityTypes();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityListRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityListRequest.NoLegs();
	
				}
				break;
	
			case quickfix.fix50sp2.SecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoStrikeRules.NoMaturityRules();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
	
				}
				break;
	
			case quickfix.fix50sp2.DerivativeSecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				}
				break;
	
		}

		return null;
	}
}
