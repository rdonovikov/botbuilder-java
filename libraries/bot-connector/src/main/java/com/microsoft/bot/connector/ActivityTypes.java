/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.connector;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ActivityTypes.
 */
public final class ActivityTypes extends ExpandableStringEnum<ActivityTypes> {
    /** Static value message for ActivityTypes. */
    public static final ActivityTypes MESSAGE = fromString("message");

    /** Static value contactRelationUpdate for ActivityTypes. */
    public static final ActivityTypes CONTACT_RELATION_UPDATE = fromString("contactRelationUpdate");

    /** Static value conversationUpdate for ActivityTypes. */
    public static final ActivityTypes CONVERSATION_UPDATE = fromString("conversationUpdate");

    /** Static value typing for ActivityTypes. */
    public static final ActivityTypes TYPING = fromString("typing");

    /** Static value ping for ActivityTypes. */
    public static final ActivityTypes PING = fromString("ping");

    /** Static value endOfConversation for ActivityTypes. */
    public static final ActivityTypes END_OF_CONVERSATION = fromString("endOfConversation");

    /** Static value event for ActivityTypes. */
    public static final ActivityTypes EVENT = fromString("event");

    /** Static value invoke for ActivityTypes. */
    public static final ActivityTypes INVOKE = fromString("invoke");

    /** Static value deleteUserData for ActivityTypes. */
    public static final ActivityTypes DELETE_USER_DATA = fromString("deleteUserData");

    /** Static value messageUpdate for ActivityTypes. */
    public static final ActivityTypes MESSAGE_UPDATE = fromString("messageUpdate");

    /** Static value messageDelete for ActivityTypes. */
    public static final ActivityTypes MESSAGE_DELETE = fromString("messageDelete");

    /** Static value installationUpdate for ActivityTypes. */
    public static final ActivityTypes INSTALLATION_UPDATE = fromString("installationUpdate");

    /** Static value messageReaction for ActivityTypes. */
    public static final ActivityTypes MESSAGE_REACTION = fromString("messageReaction");

    /** Static value suggestion for ActivityTypes. */
    public static final ActivityTypes SUGGESTION = fromString("suggestion");

    /**
     * Creates or finds a ActivityTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding ActivityTypes
     */
    @JsonCreator
    public static ActivityTypes fromString(String name) {
        return fromString(name, ActivityTypes.class);
    }

    /**
     * @return known ActivityTypes values
     */
    public static Collection<ActivityTypes> values() {
        return values(ActivityTypes.class);
    }
}
