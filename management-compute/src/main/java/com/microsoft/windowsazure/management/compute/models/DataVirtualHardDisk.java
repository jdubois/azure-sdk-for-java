/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import java.net.URI;

/**
* Objects that are used to create a data disk for a virtual machine.
*/
public class DataVirtualHardDisk {
    private String diskLabel;
    
    /**
    * Specifies the friendly name of the VHD to use to create thedata disk for
    * the virtual machine.
    * @return The DiskLabel value.
    */
    public String getDiskLabel() {
        return this.diskLabel;
    }
    
    /**
    * Specifies the friendly name of the VHD to use to create thedata disk for
    * the virtual machine.
    * @param diskLabelValue The DiskLabel value.
    */
    public void setDiskLabel(final String diskLabelValue) {
        this.diskLabel = diskLabelValue;
    }
    
    private VirtualHardDiskHostCaching hostCaching;
    
    /**
    * Specifies the platform caching behavior of the data disk blob for
    * read/write efficiency. The default vault is ReadOnly.
    * @return The HostCaching value.
    */
    public VirtualHardDiskHostCaching getHostCaching() {
        return this.hostCaching;
    }
    
    /**
    * Specifies the platform caching behavior of the data disk blob for
    * read/write efficiency. The default vault is ReadOnly.
    * @param hostCachingValue The HostCaching value.
    */
    public void setHostCaching(final VirtualHardDiskHostCaching hostCachingValue) {
        this.hostCaching = hostCachingValue;
    }
    
    private int logicalDiskSizeInGB;
    
    /**
    * Specifies the size, in GB, of an empty VHD to be attached to the virtual
    * machine. The VHD can be created as part of disk attach or create virtual
    * machine call by specifying the value for this property.  Windows Azure
    * creates the empty VHD based on size preference and attaches the newly
    * created VHD to the virtual machine.
    * @return The LogicalDiskSizeInGB value.
    */
    public int getLogicalDiskSizeInGB() {
        return this.logicalDiskSizeInGB;
    }
    
    /**
    * Specifies the size, in GB, of an empty VHD to be attached to the virtual
    * machine. The VHD can be created as part of disk attach or create virtual
    * machine call by specifying the value for this property.  Windows Azure
    * creates the empty VHD based on size preference and attaches the newly
    * created VHD to the virtual machine.
    * @param logicalDiskSizeInGBValue The LogicalDiskSizeInGB value.
    */
    public void setLogicalDiskSizeInGB(final int logicalDiskSizeInGBValue) {
        this.logicalDiskSizeInGB = logicalDiskSizeInGBValue;
    }
    
    private Integer logicalUnitNumber;
    
    /**
    * Specifies the Logical Unit Number (LUN) for the data disk. The LUN
    * specifies the slot in which the data drive appears when mounted for
    * usage by the virtual machine. This element is only listed when more than
    * one data disk is attached to a virtual machine.
    * @return The LogicalUnitNumber value.
    */
    public Integer getLogicalUnitNumber() {
        return this.logicalUnitNumber;
    }
    
    /**
    * Specifies the Logical Unit Number (LUN) for the data disk. The LUN
    * specifies the slot in which the data drive appears when mounted for
    * usage by the virtual machine. This element is only listed when more than
    * one data disk is attached to a virtual machine.
    * @param logicalUnitNumberValue The LogicalUnitNumber value.
    */
    public void setLogicalUnitNumber(final Integer logicalUnitNumberValue) {
        this.logicalUnitNumber = logicalUnitNumberValue;
    }
    
    private URI mediaLink;
    
    /**
    * Specifies the location of the disk in Windows Azure storage.
    * @return The MediaLink value.
    */
    public URI getMediaLink() {
        return this.mediaLink;
    }
    
    /**
    * Specifies the location of the disk in Windows Azure storage.
    * @param mediaLinkValue The MediaLink value.
    */
    public void setMediaLink(final URI mediaLinkValue) {
        this.mediaLink = mediaLinkValue;
    }
    
    private String name;
    
    /**
    * Specifies the name of the VHD to use to create thedata disk for the
    * virtual machine.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Specifies the name of the VHD to use to create thedata disk for the
    * virtual machine.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
}
