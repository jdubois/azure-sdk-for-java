/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Fields for tracking refresh job on the share.
 */
public class RefreshDetails {
    /**
     * If a refresh share job is currently in progress on this share, this
     * field indicates the ARM resource ID of that job. The field is empty if
     * no job is in progress.
     */
    @JsonProperty(value = "inProgressRefreshJobId")
    private String inProgressRefreshJobId;

    /**
     * Indicates the completed time for the last refresh job on this particular
     * share, if any.This could be a failed job or a successful job.
     */
    @JsonProperty(value = "lastCompletedRefreshJobTimeInUTC")
    private DateTime lastCompletedRefreshJobTimeInUTC;

    /**
     * Indicates the relative path of the error xml for the last refresh job on
     * this particular share, if any. This could be a failed job or a
     * successful job.
     */
    @JsonProperty(value = "errorManifestFile")
    private String errorManifestFile;

    /**
     * Indicates the id of the last refresh job on this particular share,if
     * any. This could be a failed job or a successful job.
     */
    @JsonProperty(value = "lastJob")
    private String lastJob;

    /**
     * Get if a refresh share job is currently in progress on this share, this field indicates the ARM resource ID of that job. The field is empty if no job is in progress.
     *
     * @return the inProgressRefreshJobId value
     */
    public String inProgressRefreshJobId() {
        return this.inProgressRefreshJobId;
    }

    /**
     * Set if a refresh share job is currently in progress on this share, this field indicates the ARM resource ID of that job. The field is empty if no job is in progress.
     *
     * @param inProgressRefreshJobId the inProgressRefreshJobId value to set
     * @return the RefreshDetails object itself.
     */
    public RefreshDetails withInProgressRefreshJobId(String inProgressRefreshJobId) {
        this.inProgressRefreshJobId = inProgressRefreshJobId;
        return this;
    }

    /**
     * Get indicates the completed time for the last refresh job on this particular share, if any.This could be a failed job or a successful job.
     *
     * @return the lastCompletedRefreshJobTimeInUTC value
     */
    public DateTime lastCompletedRefreshJobTimeInUTC() {
        return this.lastCompletedRefreshJobTimeInUTC;
    }

    /**
     * Set indicates the completed time for the last refresh job on this particular share, if any.This could be a failed job or a successful job.
     *
     * @param lastCompletedRefreshJobTimeInUTC the lastCompletedRefreshJobTimeInUTC value to set
     * @return the RefreshDetails object itself.
     */
    public RefreshDetails withLastCompletedRefreshJobTimeInUTC(DateTime lastCompletedRefreshJobTimeInUTC) {
        this.lastCompletedRefreshJobTimeInUTC = lastCompletedRefreshJobTimeInUTC;
        return this;
    }

    /**
     * Get indicates the relative path of the error xml for the last refresh job on this particular share, if any. This could be a failed job or a successful job.
     *
     * @return the errorManifestFile value
     */
    public String errorManifestFile() {
        return this.errorManifestFile;
    }

    /**
     * Set indicates the relative path of the error xml for the last refresh job on this particular share, if any. This could be a failed job or a successful job.
     *
     * @param errorManifestFile the errorManifestFile value to set
     * @return the RefreshDetails object itself.
     */
    public RefreshDetails withErrorManifestFile(String errorManifestFile) {
        this.errorManifestFile = errorManifestFile;
        return this;
    }

    /**
     * Get indicates the id of the last refresh job on this particular share,if any. This could be a failed job or a successful job.
     *
     * @return the lastJob value
     */
    public String lastJob() {
        return this.lastJob;
    }

    /**
     * Set indicates the id of the last refresh job on this particular share,if any. This could be a failed job or a successful job.
     *
     * @param lastJob the lastJob value to set
     * @return the RefreshDetails object itself.
     */
    public RefreshDetails withLastJob(String lastJob) {
        this.lastJob = lastJob;
        return this;
    }

}
