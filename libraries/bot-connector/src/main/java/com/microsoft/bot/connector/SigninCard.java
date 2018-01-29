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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A card representing a request to sign in.
 */
public class SigninCard {
    /**
     * Text for signin request.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Action to use to perform signin.
     */
    @JsonProperty(value = "buttons")
    private List<CardAction> buttons;

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the SigninCard object itself.
     */
    public SigninCard withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the buttons value.
     *
     * @return the buttons value
     */
    public List<CardAction> buttons() {
        return this.buttons;
    }

    /**
     * Set the buttons value.
     *
     * @param buttons the buttons value to set
     * @return the SigninCard object itself.
     */
    public SigninCard withButtons(List<CardAction> buttons) {
        this.buttons = buttons;
        return this;
    }

}
