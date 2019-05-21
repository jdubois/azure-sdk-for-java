/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation.ScriptExecutionHistorysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ScriptExecutionHistorys.
 */
public interface ScriptExecutionHistorys extends HasInner<ScriptExecutionHistorysInner> {
    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RuntimeScriptActionDetail> listAsync(final String resourceGroupName, final String clusterName);

    /**
     * Promotes the specified ad-hoc script execution to a persisted script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable promoteAsync(String resourceGroupName, String clusterName, String scriptExecutionId);

}