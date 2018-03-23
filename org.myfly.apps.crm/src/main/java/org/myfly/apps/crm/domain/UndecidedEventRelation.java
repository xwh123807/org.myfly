package org.myfly.apps.crm.domain;

import java.sql.Timestamp;

public class UndecidedEventRelation {
	/**
	 * Indicates the ID of the event.
	 */
	private Event EventId;
	/**
	 * Indicates the ID of the invitee.
	 */
	private String RelationId;
	/**
	 * Indicates the most recent date and time when the invitee accepted an
	 * invitation to the event.
	 */
	private Timestamp RespondedDate;
	/**
	 * Indicates the content of the response field. Label is Comment.
	 */
	private String Response;
	/**
	 * Indicates whether the invitee is a user, lead or contact, or resource.
	 */
	private String Type;
}
