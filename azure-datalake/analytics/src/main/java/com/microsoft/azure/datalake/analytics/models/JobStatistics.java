/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics U-SQL job execution statistics.
 */
public class JobStatistics {
    /**
     * Gets the last update time for the statistics.
     */
    @JsonProperty(value = "lastUpdateTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdateTimeUtc;

    /**
     * Gets the list of stages for the job.
     */
    @JsonProperty(value = "stages", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobStatisticsVertexStage> stages;

    /**
     * Get gets the last update time for the statistics.
     *
     * @return the lastUpdateTimeUtc value
     */
    public DateTime lastUpdateTimeUtc() {
        return this.lastUpdateTimeUtc;
    }

    /**
     * Get gets the list of stages for the job.
     *
     * @return the stages value
     */
    public List<JobStatisticsVertexStage> stages() {
        return this.stages;
    }

}
