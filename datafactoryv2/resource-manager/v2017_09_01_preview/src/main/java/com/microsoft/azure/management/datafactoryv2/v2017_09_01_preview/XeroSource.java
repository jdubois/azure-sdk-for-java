/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Xero Service source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("XeroSource")
public class XeroSource extends CopySource {
    /**
     * A query to retrieve data from source. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Get a query to retrieve data from source. Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set a query to retrieve data from source. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the XeroSource object itself.
     */
    public XeroSource withQuery(Object query) {
        this.query = query;
        return this;
    }

}
