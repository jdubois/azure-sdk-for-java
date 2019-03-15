/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AccountType.
 */
public final class AccountType extends ExpandableStringEnum<AccountType> {
    /** Static value GeneralPurposeStorage for AccountType. */
    public static final AccountType GENERAL_PURPOSE_STORAGE = fromString("GeneralPurposeStorage");

    /** Static value BlobStorage for AccountType. */
    public static final AccountType BLOB_STORAGE = fromString("BlobStorage");

    /**
     * Creates or finds a AccountType from its string representation.
     * @param name a name to look for
     * @return the corresponding AccountType
     */
    @JsonCreator
    public static AccountType fromString(String name) {
        return fromString(name, AccountType.class);
    }

    /**
     * @return known AccountType values
     */
    public static Collection<AccountType> values() {
        return values(AccountType.class);
    }
}
