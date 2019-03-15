/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DataFactoryManager;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.SsisObjectMetadataStatusResponseInner;

/**
 * Type representing SsisObjectMetadataStatusResponse.
 */
public interface SsisObjectMetadataStatusResponse extends HasInner<SsisObjectMetadataStatusResponseInner>, HasManager<DataFactoryManager> {
    /**
     * @return the error value.
     */
    String error();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    String properties();

    /**
     * @return the status value.
     */
    String status();

}
