/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Hyper V Replica Azure provider specific settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
public class HyperVReplicaAzureReplicationDetails extends ReplicationProviderSpecificSettings {
    /**
     * Azure VM Disk details.
     */
    @JsonProperty(value = "azureVmDiskDetails")
    private List<AzureVmDiskDetails> azureVmDiskDetails;

    /**
     * Recovery Azure given name.
     */
    @JsonProperty(value = "recoveryAzureVmName")
    private String recoveryAzureVmName;

    /**
     * The Recovery Azure VM size.
     */
    @JsonProperty(value = "recoveryAzureVMSize")
    private String recoveryAzureVMSize;

    /**
     * The recovery Azure storage account.
     */
    @JsonProperty(value = "recoveryAzureStorageAccount")
    private String recoveryAzureStorageAccount;

    /**
     * The ARM id of the log storage account used for replication. This will be
     * set to null if no log storage account was provided during enable
     * protection.
     */
    @JsonProperty(value = "recoveryAzureLogStorageAccountId")
    private String recoveryAzureLogStorageAccountId;

    /**
     * The Last replication time.
     */
    @JsonProperty(value = "lastReplicatedTime")
    private DateTime lastReplicatedTime;

    /**
     * Last RPO value.
     */
    @JsonProperty(value = "rpoInSeconds")
    private Long rpoInSeconds;

    /**
     * The last RPO calculated time.
     */
    @JsonProperty(value = "lastRpoCalculatedTime")
    private DateTime lastRpoCalculatedTime;

    /**
     * The virtual machine Id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /**
     * The protection state for the vm.
     */
    @JsonProperty(value = "vmProtectionState")
    private String vmProtectionState;

    /**
     * The protection state description for the vm.
     */
    @JsonProperty(value = "vmProtectionStateDescription")
    private String vmProtectionStateDescription;

    /**
     * Initial replication details.
     */
    @JsonProperty(value = "initialReplicationDetails")
    private InitialReplicationDetails initialReplicationDetails;

    /**
     * The PE Network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMNicDetails> vmNics;

    /**
     * The selected recovery azure network Id.
     */
    @JsonProperty(value = "selectedRecoveryAzureNetworkId")
    private String selectedRecoveryAzureNetworkId;

    /**
     * The selected source nic Id which will be used as the primary nic during
     * failover.
     */
    @JsonProperty(value = "selectedSourceNicId")
    private String selectedSourceNicId;

    /**
     * The encryption info.
     */
    @JsonProperty(value = "encryption")
    private String encryption;

    /**
     * The operating system info.
     */
    @JsonProperty(value = "oSDetails")
    private OSDetails oSDetails;

    /**
     * The RAM size of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmRamSizeInMB")
    private Integer sourceVmRamSizeInMB;

    /**
     * The CPU count of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmCpuCount")
    private Integer sourceVmCpuCount;

    /**
     * The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     */
    @JsonProperty(value = "enableRdpOnTargetOption")
    private String enableRdpOnTargetOption;

    /**
     * The target resource group Id.
     */
    @JsonProperty(value = "recoveryAzureResourceGroupId")
    private String recoveryAzureResourceGroupId;

    /**
     * The recovery availability set Id.
     */
    @JsonProperty(value = "recoveryAvailabilitySetId")
    private String recoveryAvailabilitySetId;

    /**
     * A value indicating whether managed disks should be used during failover.
     */
    @JsonProperty(value = "useManagedDisks")
    private String useManagedDisks;

    /**
     * License Type of the VM to be used.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /**
     * Get azure VM Disk details.
     *
     * @return the azureVmDiskDetails value
     */
    public List<AzureVmDiskDetails> azureVmDiskDetails() {
        return this.azureVmDiskDetails;
    }

    /**
     * Set azure VM Disk details.
     *
     * @param azureVmDiskDetails the azureVmDiskDetails value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withAzureVmDiskDetails(List<AzureVmDiskDetails> azureVmDiskDetails) {
        this.azureVmDiskDetails = azureVmDiskDetails;
        return this;
    }

    /**
     * Get recovery Azure given name.
     *
     * @return the recoveryAzureVmName value
     */
    public String recoveryAzureVmName() {
        return this.recoveryAzureVmName;
    }

    /**
     * Set recovery Azure given name.
     *
     * @param recoveryAzureVmName the recoveryAzureVmName value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureVmName(String recoveryAzureVmName) {
        this.recoveryAzureVmName = recoveryAzureVmName;
        return this;
    }

    /**
     * Get the Recovery Azure VM size.
     *
     * @return the recoveryAzureVMSize value
     */
    public String recoveryAzureVMSize() {
        return this.recoveryAzureVMSize;
    }

    /**
     * Set the Recovery Azure VM size.
     *
     * @param recoveryAzureVMSize the recoveryAzureVMSize value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureVMSize(String recoveryAzureVMSize) {
        this.recoveryAzureVMSize = recoveryAzureVMSize;
        return this;
    }

    /**
     * Get the recovery Azure storage account.
     *
     * @return the recoveryAzureStorageAccount value
     */
    public String recoveryAzureStorageAccount() {
        return this.recoveryAzureStorageAccount;
    }

    /**
     * Set the recovery Azure storage account.
     *
     * @param recoveryAzureStorageAccount the recoveryAzureStorageAccount value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureStorageAccount(String recoveryAzureStorageAccount) {
        this.recoveryAzureStorageAccount = recoveryAzureStorageAccount;
        return this;
    }

    /**
     * Get the ARM id of the log storage account used for replication. This will be set to null if no log storage account was provided during enable protection.
     *
     * @return the recoveryAzureLogStorageAccountId value
     */
    public String recoveryAzureLogStorageAccountId() {
        return this.recoveryAzureLogStorageAccountId;
    }

    /**
     * Set the ARM id of the log storage account used for replication. This will be set to null if no log storage account was provided during enable protection.
     *
     * @param recoveryAzureLogStorageAccountId the recoveryAzureLogStorageAccountId value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureLogStorageAccountId(String recoveryAzureLogStorageAccountId) {
        this.recoveryAzureLogStorageAccountId = recoveryAzureLogStorageAccountId;
        return this;
    }

    /**
     * Get the Last replication time.
     *
     * @return the lastReplicatedTime value
     */
    public DateTime lastReplicatedTime() {
        return this.lastReplicatedTime;
    }

    /**
     * Set the Last replication time.
     *
     * @param lastReplicatedTime the lastReplicatedTime value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withLastReplicatedTime(DateTime lastReplicatedTime) {
        this.lastReplicatedTime = lastReplicatedTime;
        return this;
    }

    /**
     * Get last RPO value.
     *
     * @return the rpoInSeconds value
     */
    public Long rpoInSeconds() {
        return this.rpoInSeconds;
    }

    /**
     * Set last RPO value.
     *
     * @param rpoInSeconds the rpoInSeconds value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRpoInSeconds(Long rpoInSeconds) {
        this.rpoInSeconds = rpoInSeconds;
        return this;
    }

    /**
     * Get the last RPO calculated time.
     *
     * @return the lastRpoCalculatedTime value
     */
    public DateTime lastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }

    /**
     * Set the last RPO calculated time.
     *
     * @param lastRpoCalculatedTime the lastRpoCalculatedTime value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withLastRpoCalculatedTime(DateTime lastRpoCalculatedTime) {
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        return this;
    }

    /**
     * Get the virtual machine Id.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set the virtual machine Id.
     *
     * @param vmId the vmId value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get the protection state for the vm.
     *
     * @return the vmProtectionState value
     */
    public String vmProtectionState() {
        return this.vmProtectionState;
    }

    /**
     * Set the protection state for the vm.
     *
     * @param vmProtectionState the vmProtectionState value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withVmProtectionState(String vmProtectionState) {
        this.vmProtectionState = vmProtectionState;
        return this;
    }

    /**
     * Get the protection state description for the vm.
     *
     * @return the vmProtectionStateDescription value
     */
    public String vmProtectionStateDescription() {
        return this.vmProtectionStateDescription;
    }

    /**
     * Set the protection state description for the vm.
     *
     * @param vmProtectionStateDescription the vmProtectionStateDescription value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withVmProtectionStateDescription(String vmProtectionStateDescription) {
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        return this;
    }

    /**
     * Get initial replication details.
     *
     * @return the initialReplicationDetails value
     */
    public InitialReplicationDetails initialReplicationDetails() {
        return this.initialReplicationDetails;
    }

    /**
     * Set initial replication details.
     *
     * @param initialReplicationDetails the initialReplicationDetails value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withInitialReplicationDetails(InitialReplicationDetails initialReplicationDetails) {
        this.initialReplicationDetails = initialReplicationDetails;
        return this;
    }

    /**
     * Get the PE Network details.
     *
     * @return the vmNics value
     */
    public List<VMNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the PE Network details.
     *
     * @param vmNics the vmNics value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withVmNics(List<VMNicDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the selected recovery azure network Id.
     *
     * @return the selectedRecoveryAzureNetworkId value
     */
    public String selectedRecoveryAzureNetworkId() {
        return this.selectedRecoveryAzureNetworkId;
    }

    /**
     * Set the selected recovery azure network Id.
     *
     * @param selectedRecoveryAzureNetworkId the selectedRecoveryAzureNetworkId value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withSelectedRecoveryAzureNetworkId(String selectedRecoveryAzureNetworkId) {
        this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
        return this;
    }

    /**
     * Get the selected source nic Id which will be used as the primary nic during failover.
     *
     * @return the selectedSourceNicId value
     */
    public String selectedSourceNicId() {
        return this.selectedSourceNicId;
    }

    /**
     * Set the selected source nic Id which will be used as the primary nic during failover.
     *
     * @param selectedSourceNicId the selectedSourceNicId value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withSelectedSourceNicId(String selectedSourceNicId) {
        this.selectedSourceNicId = selectedSourceNicId;
        return this;
    }

    /**
     * Get the encryption info.
     *
     * @return the encryption value
     */
    public String encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption info.
     *
     * @param encryption the encryption value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the operating system info.
     *
     * @return the oSDetails value
     */
    public OSDetails oSDetails() {
        return this.oSDetails;
    }

    /**
     * Set the operating system info.
     *
     * @param oSDetails the oSDetails value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withOSDetails(OSDetails oSDetails) {
        this.oSDetails = oSDetails;
        return this;
    }

    /**
     * Get the RAM size of the VM on the primary side.
     *
     * @return the sourceVmRamSizeInMB value
     */
    public Integer sourceVmRamSizeInMB() {
        return this.sourceVmRamSizeInMB;
    }

    /**
     * Set the RAM size of the VM on the primary side.
     *
     * @param sourceVmRamSizeInMB the sourceVmRamSizeInMB value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withSourceVmRamSizeInMB(Integer sourceVmRamSizeInMB) {
        this.sourceVmRamSizeInMB = sourceVmRamSizeInMB;
        return this;
    }

    /**
     * Get the CPU count of the VM on the primary side.
     *
     * @return the sourceVmCpuCount value
     */
    public Integer sourceVmCpuCount() {
        return this.sourceVmCpuCount;
    }

    /**
     * Set the CPU count of the VM on the primary side.
     *
     * @param sourceVmCpuCount the sourceVmCpuCount value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withSourceVmCpuCount(Integer sourceVmCpuCount) {
        this.sourceVmCpuCount = sourceVmCpuCount;
        return this;
    }

    /**
     * Get the selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @return the enableRdpOnTargetOption value
     */
    public String enableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption;
    }

    /**
     * Set the selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @param enableRdpOnTargetOption the enableRdpOnTargetOption value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withEnableRdpOnTargetOption(String enableRdpOnTargetOption) {
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        return this;
    }

    /**
     * Get the target resource group Id.
     *
     * @return the recoveryAzureResourceGroupId value
     */
    public String recoveryAzureResourceGroupId() {
        return this.recoveryAzureResourceGroupId;
    }

    /**
     * Set the target resource group Id.
     *
     * @param recoveryAzureResourceGroupId the recoveryAzureResourceGroupId value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAzureResourceGroupId(String recoveryAzureResourceGroupId) {
        this.recoveryAzureResourceGroupId = recoveryAzureResourceGroupId;
        return this;
    }

    /**
     * Get the recovery availability set Id.
     *
     * @return the recoveryAvailabilitySetId value
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the recovery availability set Id.
     *
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        return this;
    }

    /**
     * Get a value indicating whether managed disks should be used during failover.
     *
     * @return the useManagedDisks value
     */
    public String useManagedDisks() {
        return this.useManagedDisks;
    }

    /**
     * Set a value indicating whether managed disks should be used during failover.
     *
     * @param useManagedDisks the useManagedDisks value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withUseManagedDisks(String useManagedDisks) {
        this.useManagedDisks = useManagedDisks;
        return this;
    }

    /**
     * Get license Type of the VM to be used.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set license Type of the VM to be used.
     *
     * @param licenseType the licenseType value to set
     * @return the HyperVReplicaAzureReplicationDetails object itself.
     */
    public HyperVReplicaAzureReplicationDetails withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

}