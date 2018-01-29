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
 * Media URL.
 */
public class MediaUrl {
    /**
     * Url for the media.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /**
     * Optional profile hint to the client to differentiate multiple MediaUrl
     * objects from each other.
     */
    @JsonProperty(value = "profile")
    private String profile;

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the MediaUrl object itself.
     */
    public MediaUrl withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the profile value.
     *
     * @return the profile value
     */
    public String profile() {
        return this.profile;
    }

    /**
     * Set the profile value.
     *
     * @param profile the profile value to set
     * @return the MediaUrl object itself.
     */
    public MediaUrl withProfile(String profile) {
        this.profile = profile;
        return this;
    }

}
