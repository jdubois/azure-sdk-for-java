/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Integration runtime status.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("IntegrationRuntimeStatus")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SelfHosted", value = SelfHostedIntegrationRuntimeStatus.class),
    @JsonSubTypes.Type(name = "Managed", value = ManagedIntegrationRuntimeStatus.class)
})
public class IntegrationRuntimeStatus {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The data factory name which the integration runtime belong to.
     */
    @JsonProperty(value = "dataFactoryName", access = JsonProperty.Access.WRITE_ONLY)
    private String dataFactoryName;

    /**
     * The state of integration runtime. Possible values include: 'Initial',
     * 'Stopped', 'Started', 'Starting', 'Stopping', 'NeedRegistration',
     * 'Online', 'Limited', 'Offline', 'AccessDenied'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeState state;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the IntegrationRuntimeStatus object itself.
     */
    public IntegrationRuntimeStatus withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the data factory name which the integration runtime belong to.
     *
     * @return the dataFactoryName value
     */
    public String dataFactoryName() {
        return this.dataFactoryName;
    }

    /**
     * Get the state of integration runtime. Possible values include: 'Initial', 'Stopped', 'Started', 'Starting', 'Stopping', 'NeedRegistration', 'Online', 'Limited', 'Offline', 'AccessDenied'.
     *
     * @return the state value
     */
    public IntegrationRuntimeState state() {
        return this.state;
    }

}
