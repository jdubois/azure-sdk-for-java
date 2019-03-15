/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * HDInsight Spark activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsightSpark")
@JsonFlatten
public class HDInsightSparkActivity extends ExecutionActivity {
    /**
     * The root path in 'sparkJobLinkedService' for all the job’s files. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.rootPath", required = true)
    private Object rootPath;

    /**
     * The relative path to the root folder of the code/package to be executed.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.entryFilePath", required = true)
    private Object entryFilePath;

    /**
     * The user-specified arguments to HDInsightSparkActivity.
     */
    @JsonProperty(value = "typeProperties.arguments")
    private List<Object> arguments;

    /**
     * Debug info option. Possible values include: 'None', 'Always', 'Failure'.
     */
    @JsonProperty(value = "typeProperties.getDebugInfo")
    private HDInsightActivityDebugInfoOption getDebugInfo;

    /**
     * The storage linked service for uploading the entry file and
     * dependencies, and for receiving logs.
     */
    @JsonProperty(value = "typeProperties.sparkJobLinkedService")
    private LinkedServiceReference sparkJobLinkedService;

    /**
     * The application's Java/Spark main class.
     */
    @JsonProperty(value = "typeProperties.className")
    private String className;

    /**
     * The user to impersonate that will execute the job. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.proxyUser")
    private Object proxyUser;

    /**
     * Spark configuration property.
     */
    @JsonProperty(value = "typeProperties.sparkConfig")
    private Map<String, Object> sparkConfig;

    /**
     * Get the root path in 'sparkJobLinkedService' for all the job’s files. Type: string (or Expression with resultType string).
     *
     * @return the rootPath value
     */
    public Object rootPath() {
        return this.rootPath;
    }

    /**
     * Set the root path in 'sparkJobLinkedService' for all the job’s files. Type: string (or Expression with resultType string).
     *
     * @param rootPath the rootPath value to set
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withRootPath(Object rootPath) {
        this.rootPath = rootPath;
        return this;
    }

    /**
     * Get the relative path to the root folder of the code/package to be executed. Type: string (or Expression with resultType string).
     *
     * @return the entryFilePath value
     */
    public Object entryFilePath() {
        return this.entryFilePath;
    }

    /**
     * Set the relative path to the root folder of the code/package to be executed. Type: string (or Expression with resultType string).
     *
     * @param entryFilePath the entryFilePath value to set
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withEntryFilePath(Object entryFilePath) {
        this.entryFilePath = entryFilePath;
        return this;
    }

    /**
     * Get the user-specified arguments to HDInsightSparkActivity.
     *
     * @return the arguments value
     */
    public List<Object> arguments() {
        return this.arguments;
    }

    /**
     * Set the user-specified arguments to HDInsightSparkActivity.
     *
     * @param arguments the arguments value to set
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withArguments(List<Object> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get debug info option. Possible values include: 'None', 'Always', 'Failure'.
     *
     * @return the getDebugInfo value
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.getDebugInfo;
    }

    /**
     * Set debug info option. Possible values include: 'None', 'Always', 'Failure'.
     *
     * @param getDebugInfo the getDebugInfo value to set
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        this.getDebugInfo = getDebugInfo;
        return this;
    }

    /**
     * Get the storage linked service for uploading the entry file and dependencies, and for receiving logs.
     *
     * @return the sparkJobLinkedService value
     */
    public LinkedServiceReference sparkJobLinkedService() {
        return this.sparkJobLinkedService;
    }

    /**
     * Set the storage linked service for uploading the entry file and dependencies, and for receiving logs.
     *
     * @param sparkJobLinkedService the sparkJobLinkedService value to set
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withSparkJobLinkedService(LinkedServiceReference sparkJobLinkedService) {
        this.sparkJobLinkedService = sparkJobLinkedService;
        return this;
    }

    /**
     * Get the application's Java/Spark main class.
     *
     * @return the className value
     */
    public String className() {
        return this.className;
    }

    /**
     * Set the application's Java/Spark main class.
     *
     * @param className the className value to set
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * Get the user to impersonate that will execute the job. Type: string (or Expression with resultType string).
     *
     * @return the proxyUser value
     */
    public Object proxyUser() {
        return this.proxyUser;
    }

    /**
     * Set the user to impersonate that will execute the job. Type: string (or Expression with resultType string).
     *
     * @param proxyUser the proxyUser value to set
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withProxyUser(Object proxyUser) {
        this.proxyUser = proxyUser;
        return this;
    }

    /**
     * Get spark configuration property.
     *
     * @return the sparkConfig value
     */
    public Map<String, Object> sparkConfig() {
        return this.sparkConfig;
    }

    /**
     * Set spark configuration property.
     *
     * @param sparkConfig the sparkConfig value to set
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withSparkConfig(Map<String, Object> sparkConfig) {
        this.sparkConfig = sparkConfig;
        return this;
    }

}
