/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Analytics catalog credential deletion parameters.
 */
public class DataLakeAnalyticsCatalogCredentialDeleteParameters {
    /**
     * the current password for the credential and user with access to the data
     * source. This is required if the requester is not the account owner.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the current password for the credential and user with access to the data source. This is required if the requester is not the account owner.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the current password for the credential and user with access to the data source. This is required if the requester is not the account owner.
     *
     * @param password the password value to set
     * @return the DataLakeAnalyticsCatalogCredentialDeleteParameters object itself.
     */
    public DataLakeAnalyticsCatalogCredentialDeleteParameters withPassword(String password) {
        this.password = password;
        return this;
    }

}
