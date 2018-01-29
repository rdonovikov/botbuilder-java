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
 * Set of key-value pairs. Advantage of this section is that key and value
 * properties will be
 * rendered with default style information with some delimiter between them. So
 * there is no need for developer to specify style information.
 */
public class Fact {
    /**
     * The key for this Fact.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * The value for this Fact.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the key value.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key value.
     *
     * @param key the key value to set
     * @return the Fact object itself.
     */
    public Fact withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the Fact object itself.
     */
    public Fact withValue(String value) {
        this.value = value;
        return this;
    }

}
