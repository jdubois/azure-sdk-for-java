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
 * A copy activity HDFS source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HdfsSource")
public class HdfsSource extends CopySource {
    /**
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /**
     * Specifies Distcp-related settings.
     */
    @JsonProperty(value = "distcpSettings")
    private DistcpSettings distcpSettings;

    /**
     * Get if true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the recursive value
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set if true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set
     * @return the HdfsSource object itself.
     */
    public HdfsSource withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get specifies Distcp-related settings.
     *
     * @return the distcpSettings value
     */
    public DistcpSettings distcpSettings() {
        return this.distcpSettings;
    }

    /**
     * Set specifies Distcp-related settings.
     *
     * @param distcpSettings the distcpSettings value to set
     * @return the HdfsSource object itself.
     */
    public HdfsSource withDistcpSettings(DistcpSettings distcpSettings) {
        this.distcpSettings = distcpSettings;
        return this;
    }

}
