package org.myfly.apps.crm.domain;

import java.sql.Timestamp;

import org.myfly.platform.system.core.domain.EnumValue;

/**
 * 
 * Represents people (a user, a lead, or contacts) or a resource (such as a
 * conference room) invited to an event. This object lets you add or remove
 * invitees from an event and use the API to manage invitees’ responses to
 * invitations. If Shared Activities is enabled, this object doesn’t support
 * triggers, workflow, or data validation rules. EventRelation allows a variable
 * number of relationships and handles deleted events differently, depending on
 * whether Shared Activities is enabled.
 * 
 * @author xiangwanhong
 *
 */
public class EventRelation {
	/**
	 * Contains the Account ID of the relation. For information on IDs, see ID
	 * Field Type. AccountId is visible when Shared Activities is enabled.
	 */
	private String AccountId;
	/**
	 * Contains the ID of the event. This value can’t be changed after it’s been
	 * specified.
	 */
	private String EventId;
	/**
	 * Indicates whether the object has been moved to the Recycle Bin (true) or
	 * not (false). Label is Deleted.
	 */
	private Boolean IsDeleted;
	/**
	 * Indicates whether the relation is an invitee. • IsInvitee is visible
	 * while Shared Activities is being enabled, after it has been enabled, and
	 * while it is being disabled. • IsInvitee defaults to true while Shared
	 * Activities is being enabled, after it has been enabled, and while it is
	 * being disabled if IsInvitee, IsParent, and IsWhat are not set. This
	 * configuration ensures compatibility when Shared Activities isn’t enabled
	 * and EventRelation represents event invitees only. • IsInvitee defaults to
	 * false when Shared Activities is enabled if IsParent is set to true.
	 */
	private Boolean IsInvitee;
	/**
	 * Indicates whether the relation is a contact or lead, or an account,
	 * opportunity, or other object. IsParent is visible when Shared Activities
	 * is enabled
	 */
	private Boolean IsParent;
	/**
	 * Indicates whether the relation is an account, an opportunity, or another
	 * object. Value is false if RelationId is a contact or a lead, and true
	 * otherwise. IsWhat is visible when Shared Activities is enabled.
	 */
	private Boolean IsWhat;
	/**
	 * Contains the ID of the person (User, Contact, or Lead) or the resource
	 * invited to an event. When Shared Activities is enabled, RelationId can
	 * also contain the ID of the contacts or lead related to an event. This
	 * value can’t be changed after it’s been specified.
	 */
	private String RelationId;
	/**
	 * Indicates the most recent date and time when the invitee responded to an
	 * invitation to an event.
	 */
	private Timestamp RespondedDate;
	/**
	 * Contains optional text that the invitee can enter when responding to an
	 * invitation to an event.
	 */
	private String Response;
	/**
	 * Indicates the invitee status with one of the following values: • New:
	 * Invitee has received the invitation but hasn’t yet responded. This value
	 * is the default. • Declined: Invitee has declined the invitation. •
	 * Accepted: Invitee has accepted the invitation.
	 */
	private EnumValue Status;
}
