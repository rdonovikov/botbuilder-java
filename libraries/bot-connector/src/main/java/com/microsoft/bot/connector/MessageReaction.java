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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Message reaction object.
 */
public class MessageReaction {
    /**
     * Message reaction type. Possible values include: 'like', 'plusOne'.
     */
    @JsonProperty(value = "type")
    private MessageReactionTypes type;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public MessageReactionTypes type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the MessageReaction object itself.
     */
    public MessageReaction withType(MessageReactionTypes type) {
        this.type = type;
        return this;
    }

}
