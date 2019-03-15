/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.implementation;

import com.microsoft.azure.management.edgegateway.JobStatus;
import org.joda.time.DateTime;
import com.microsoft.azure.management.edgegateway.JobErrorDetails;
import com.microsoft.azure.management.edgegateway.JobType;
import com.microsoft.azure.management.edgegateway.UpdateOperationStage;
import com.microsoft.azure.management.edgegateway.UpdateDownloadProgress;
import com.microsoft.azure.management.edgegateway.UpdateInstallProgress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A device job.
 */
@JsonFlatten
public class JobInner {
    /**
     * The path ID that uniquely identifies the object.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The name of the object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The hierarchical type of the object.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The current status of the job. Possible values include: 'Invalid',
     * 'Running', 'Succeeded', 'Failed', 'Canceled', 'Paused', 'Scheduled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private JobStatus status;

    /**
     * The UTC date and time at which the job started.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The UTC date and time at which the job completed.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * The percentage of the job that is complete.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /**
     * The error details.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private JobErrorDetails error;

    /**
     * The type of the job. Possible values include: 'Invalid',
     * 'ScanForUpdates', 'DownloadUpdates', 'InstallUpdates', 'RefreshShare'.
     */
    @JsonProperty(value = "properties.jobType", access = JsonProperty.Access.WRITE_ONLY)
    private JobType jobType;

    /**
     * Current stage of the update operation. Possible values include:
     * 'Unknown', 'Initial', 'ScanStarted', 'ScanComplete', 'ScanFailed',
     * 'DownloadStarted', 'DownloadComplete', 'DownloadFailed',
     * 'InstallStarted', 'InstallComplete', 'InstallFailed', 'RebootInitiated',
     * 'Success', 'Failure', 'RescanStarted', 'RescanComplete', 'RescanFailed'.
     */
    @JsonProperty(value = "properties.currentStage", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateOperationStage currentStage;

    /**
     * The download progress.
     */
    @JsonProperty(value = "properties.downloadProgress", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateDownloadProgress downloadProgress;

    /**
     * The install progress.
     */
    @JsonProperty(value = "properties.installProgress", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateInstallProgress installProgress;

    /**
     * Total number of errors encountered during the refresh process.
     */
    @JsonProperty(value = "properties.totalRefreshErrors", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalRefreshErrors;

    /**
     * Local share/remote container relative path to the error manifest file of
     * the refresh.
     */
    @JsonProperty(value = "properties.errorManifestFile", access = JsonProperty.Access.WRITE_ONLY)
    private String errorManifestFile;

    /**
     * ARM ID of the share that was refreshed.
     */
    @JsonProperty(value = "properties.shareId", access = JsonProperty.Access.WRITE_ONLY)
    private String shareId;

    /**
     * If only subfolders need to be refreshed, then the subfolder path inside
     * the share. (The path is empty if there are no subfolders.).
     */
    @JsonProperty(value = "properties.folder")
    private String folder;

    /**
     * Get the path ID that uniquely identifies the object.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name of the object.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the hierarchical type of the object.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the current status of the job. Possible values include: 'Invalid', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Paused', 'Scheduled'.
     *
     * @return the status value
     */
    public JobStatus status() {
        return this.status;
    }

    /**
     * Get the UTC date and time at which the job started.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the UTC date and time at which the job completed.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the percentage of the job that is complete.
     *
     * @return the percentComplete value
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the error details.
     *
     * @return the error value
     */
    public JobErrorDetails error() {
        return this.error;
    }

    /**
     * Get the type of the job. Possible values include: 'Invalid', 'ScanForUpdates', 'DownloadUpdates', 'InstallUpdates', 'RefreshShare'.
     *
     * @return the jobType value
     */
    public JobType jobType() {
        return this.jobType;
    }

    /**
     * Get current stage of the update operation. Possible values include: 'Unknown', 'Initial', 'ScanStarted', 'ScanComplete', 'ScanFailed', 'DownloadStarted', 'DownloadComplete', 'DownloadFailed', 'InstallStarted', 'InstallComplete', 'InstallFailed', 'RebootInitiated', 'Success', 'Failure', 'RescanStarted', 'RescanComplete', 'RescanFailed'.
     *
     * @return the currentStage value
     */
    public UpdateOperationStage currentStage() {
        return this.currentStage;
    }

    /**
     * Get the download progress.
     *
     * @return the downloadProgress value
     */
    public UpdateDownloadProgress downloadProgress() {
        return this.downloadProgress;
    }

    /**
     * Get the install progress.
     *
     * @return the installProgress value
     */
    public UpdateInstallProgress installProgress() {
        return this.installProgress;
    }

    /**
     * Get total number of errors encountered during the refresh process.
     *
     * @return the totalRefreshErrors value
     */
    public Integer totalRefreshErrors() {
        return this.totalRefreshErrors;
    }

    /**
     * Get local share/remote container relative path to the error manifest file of the refresh.
     *
     * @return the errorManifestFile value
     */
    public String errorManifestFile() {
        return this.errorManifestFile;
    }

    /**
     * Get aRM ID of the share that was refreshed.
     *
     * @return the shareId value
     */
    public String shareId() {
        return this.shareId;
    }

    /**
     * Get if only subfolders need to be refreshed, then the subfolder path inside the share. (The path is empty if there are no subfolders.).
     *
     * @return the folder value
     */
    public String folder() {
        return this.folder;
    }

    /**
     * Set if only subfolders need to be refreshed, then the subfolder path inside the share. (The path is empty if there are no subfolders.).
     *
     * @param folder the folder value to set
     * @return the JobInner object itself.
     */
    public JobInner withFolder(String folder) {
        this.folder = folder;
        return this;
    }

}
