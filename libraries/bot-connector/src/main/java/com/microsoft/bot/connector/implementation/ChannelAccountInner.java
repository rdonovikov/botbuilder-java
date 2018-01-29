/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.connector.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Channel account information needed to route a message.
 */
public class ChannelAccountInner {
    /**
     * Channel id for the user or bot on this channel (Example: joe@smith.com,
     * or @joesmith or 123456).
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Display friendly name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ChannelAccountInner object itself.
     */
    public ChannelAccountInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ChannelAccountInner object itself.
     */
    public ChannelAccountInner withName(String name) {
        this.name = name;
        return this;
    }

}
