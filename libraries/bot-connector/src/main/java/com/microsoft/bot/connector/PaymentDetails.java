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
 * Provides information about the requested transaction.
 */
public class PaymentDetails {
    /**
     * Contains the total amount of the payment request.
     */
    @JsonProperty(value = "total")
    private PaymentItem total;

    /**
     * Contains line items for the payment request that the user agent may
     * display.
     */
    @JsonProperty(value = "displayItems")
    private List<PaymentItem> displayItems;

    /**
     * A sequence containing the different shipping options for the user to
     * choose from.
     */
    @JsonProperty(value = "shippingOptions")
    private List<PaymentShippingOption> shippingOptions;

    /**
     * Contains modifiers for particular payment method identifiers.
     */
    @JsonProperty(value = "modifiers")
    private List<PaymentDetailsModifier> modifiers;

    /**
     * Error description.
     */
    @JsonProperty(value = "error")
    private String error;

    /**
     * Get the total value.
     *
     * @return the total value
     */
    public PaymentItem total() {
        return this.total;
    }

    /**
     * Set the total value.
     *
     * @param total the total value to set
     * @return the PaymentDetails object itself.
     */
    public PaymentDetails withTotal(PaymentItem total) {
        this.total = total;
        return this;
    }

    /**
     * Get the displayItems value.
     *
     * @return the displayItems value
     */
    public List<PaymentItem> displayItems() {
        return this.displayItems;
    }

    /**
     * Set the displayItems value.
     *
     * @param displayItems the displayItems value to set
     * @return the PaymentDetails object itself.
     */
    public PaymentDetails withDisplayItems(List<PaymentItem> displayItems) {
        this.displayItems = displayItems;
        return this;
    }

    /**
     * Get the shippingOptions value.
     *
     * @return the shippingOptions value
     */
    public List<PaymentShippingOption> shippingOptions() {
        return this.shippingOptions;
    }

    /**
     * Set the shippingOptions value.
     *
     * @param shippingOptions the shippingOptions value to set
     * @return the PaymentDetails object itself.
     */
    public PaymentDetails withShippingOptions(List<PaymentShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
        return this;
    }

    /**
     * Get the modifiers value.
     *
     * @return the modifiers value
     */
    public List<PaymentDetailsModifier> modifiers() {
        return this.modifiers;
    }

    /**
     * Set the modifiers value.
     *
     * @param modifiers the modifiers value to set
     * @return the PaymentDetails object itself.
     */
    public PaymentDetails withModifiers(List<PaymentDetailsModifier> modifiers) {
        this.modifiers = modifiers;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the PaymentDetails object itself.
     */
    public PaymentDetails withError(String error) {
        this.error = error;
        return this;
    }

}
