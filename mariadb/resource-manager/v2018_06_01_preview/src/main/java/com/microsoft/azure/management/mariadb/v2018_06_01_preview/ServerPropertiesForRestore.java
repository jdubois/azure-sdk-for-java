/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties used to create a new server by restoring from a backup.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode")
@JsonTypeName("PointInTimeRestore")
public class ServerPropertiesForRestore extends ServerPropertiesForCreate {
    /**
     * The source server id to restore from.
     */
    @JsonProperty(value = "sourceServerId", required = true)
    private String sourceServerId;

    /**
     * Restore point creation time (ISO8601 format), specifying the time to
     * restore from.
     */
    @JsonProperty(value = "restorePointInTime", required = true)
    private DateTime restorePointInTime;

    /**
     * Get the source server id to restore from.
     *
     * @return the sourceServerId value
     */
    public String sourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Set the source server id to restore from.
     *
     * @param sourceServerId the sourceServerId value to set
     * @return the ServerPropertiesForRestore object itself.
     */
    public ServerPropertiesForRestore withSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
        return this;
    }

    /**
     * Get restore point creation time (ISO8601 format), specifying the time to restore from.
     *
     * @return the restorePointInTime value
     */
    public DateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set restore point creation time (ISO8601 format), specifying the time to restore from.
     *
     * @param restorePointInTime the restorePointInTime value to set
     * @return the ServerPropertiesForRestore object itself.
     */
    public ServerPropertiesForRestore withRestorePointInTime(DateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

}
