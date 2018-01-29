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
 * Defines values for InstallationUpdateActionTypes.
 */
public final class InstallationUpdateActionTypes extends ExpandableStringEnum<InstallationUpdateActionTypes> {
    /** Static value add for InstallationUpdateActionTypes. */
    public static final InstallationUpdateActionTypes ADD = fromString("add");

    /** Static value remove for InstallationUpdateActionTypes. */
    public static final InstallationUpdateActionTypes REMOVE = fromString("remove");

    /**
     * Creates or finds a InstallationUpdateActionTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding InstallationUpdateActionTypes
     */
    @JsonCreator
    public static InstallationUpdateActionTypes fromString(String name) {
        return fromString(name, InstallationUpdateActionTypes.class);
    }

    /**
     * @return known InstallationUpdateActionTypes values
     */
    public static Collection<InstallationUpdateActionTypes> values() {
        return values(InstallationUpdateActionTypes.class);
    }
}
