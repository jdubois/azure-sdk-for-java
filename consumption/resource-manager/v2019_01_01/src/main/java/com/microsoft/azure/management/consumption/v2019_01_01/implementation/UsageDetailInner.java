/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import org.joda.time.DateTime;
import java.math.BigDecimal;
import java.util.UUID;
import com.microsoft.azure.management.consumption.v2019_01_01.MeterDetails;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An usage detail resource.
 */
@JsonFlatten
public class UsageDetailInner extends ProxyResource {
    /**
     * The id of the billing period resource that the usage belongs to.
     */
    @JsonProperty(value = "properties.billingPeriodId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPeriodId;

    /**
     * The id of the invoice resource that the usage belongs to.
     */
    @JsonProperty(value = "properties.invoiceId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceId;

    /**
     * The start of the date time range covered by the usage detail.
     */
    @JsonProperty(value = "properties.usageStart", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageStart;

    /**
     * The end of the date time range covered by the usage detail.
     */
    @JsonProperty(value = "properties.usageEnd", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageEnd;

    /**
     * The name of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceName;

    /**
     * The uri of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /**
     * The location of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceLocation;

    /**
     * The ISO currency in which the meter is charged, for example, USD.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /**
     * The quantity of usage.
     */
    @JsonProperty(value = "properties.usageQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal usageQuantity;

    /**
     * The billable usage quantity.
     */
    @JsonProperty(value = "properties.billableQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal billableQuantity;

    /**
     * The amount of cost before tax.
     */
    @JsonProperty(value = "properties.pretaxCost", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal pretaxCost;

    /**
     * The estimated usage is subject to change.
     */
    @JsonProperty(value = "properties.isEstimated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEstimated;

    /**
     * The meter id (GUID).
     */
    @JsonProperty(value = "properties.meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /**
     * The details about the meter. By default this is not populated, unless
     * it's specified in $expand.
     */
    @JsonProperty(value = "properties.meterDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MeterDetails meterDetails;

    /**
     * Subscription guid.
     */
    @JsonProperty(value = "properties.subscriptionGuid", access = JsonProperty.Access.WRITE_ONLY)
    private UUID subscriptionGuid;

    /**
     * Subscription name.
     */
    @JsonProperty(value = "properties.subscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionName;

    /**
     * Account name.
     */
    @JsonProperty(value = "properties.accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /**
     * Department name.
     */
    @JsonProperty(value = "properties.departmentName", access = JsonProperty.Access.WRITE_ONLY)
    private String departmentName;

    /**
     * Product name.
     */
    @JsonProperty(value = "properties.product", access = JsonProperty.Access.WRITE_ONLY)
    private String product;

    /**
     * Consumed service name.
     */
    @JsonProperty(value = "properties.consumedService", access = JsonProperty.Access.WRITE_ONLY)
    private String consumedService;

    /**
     * The cost center of this department if it is a department and a
     * costcenter exists.
     */
    @JsonProperty(value = "properties.costCenter", access = JsonProperty.Access.WRITE_ONLY)
    private String costCenter;

    /**
     * Part Number.
     */
    @JsonProperty(value = "properties.partNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String partNumber;

    /**
     * Resource Guid.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * Offer Id.
     */
    @JsonProperty(value = "properties.offerId", access = JsonProperty.Access.WRITE_ONLY)
    private String offerId;

    /**
     * Charges billed separately.
     */
    @JsonProperty(value = "properties.chargesBilledSeparately", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean chargesBilledSeparately;

    /**
     * Resource Location.
     */
    @JsonProperty(value = "properties.location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Additional details of this usage item. By default this is not populated,
     * unless it's specified in $expand.
     */
    @JsonProperty(value = "properties.additionalProperties", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalProperties;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the id of the billing period resource that the usage belongs to.
     *
     * @return the billingPeriodId value
     */
    public String billingPeriodId() {
        return this.billingPeriodId;
    }

    /**
     * Get the id of the invoice resource that the usage belongs to.
     *
     * @return the invoiceId value
     */
    public String invoiceId() {
        return this.invoiceId;
    }

    /**
     * Get the start of the date time range covered by the usage detail.
     *
     * @return the usageStart value
     */
    public DateTime usageStart() {
        return this.usageStart;
    }

    /**
     * Get the end of the date time range covered by the usage detail.
     *
     * @return the usageEnd value
     */
    public DateTime usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the name of the resource instance that the usage is about.
     *
     * @return the instanceName value
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Get the uri of the resource instance that the usage is about.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get the location of the resource instance that the usage is about.
     *
     * @return the instanceLocation value
     */
    public String instanceLocation() {
        return this.instanceLocation;
    }

    /**
     * Get the ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the quantity of usage.
     *
     * @return the usageQuantity value
     */
    public BigDecimal usageQuantity() {
        return this.usageQuantity;
    }

    /**
     * Get the billable usage quantity.
     *
     * @return the billableQuantity value
     */
    public BigDecimal billableQuantity() {
        return this.billableQuantity;
    }

    /**
     * Get the amount of cost before tax.
     *
     * @return the pretaxCost value
     */
    public BigDecimal pretaxCost() {
        return this.pretaxCost;
    }

    /**
     * Get the estimated usage is subject to change.
     *
     * @return the isEstimated value
     */
    public Boolean isEstimated() {
        return this.isEstimated;
    }

    /**
     * Get the meter id (GUID).
     *
     * @return the meterId value
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get the details about the meter. By default this is not populated, unless it's specified in $expand.
     *
     * @return the meterDetails value
     */
    public MeterDetails meterDetails() {
        return this.meterDetails;
    }

    /**
     * Get subscription guid.
     *
     * @return the subscriptionGuid value
     */
    public UUID subscriptionGuid() {
        return this.subscriptionGuid;
    }

    /**
     * Get subscription name.
     *
     * @return the subscriptionName value
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Get account name.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get department name.
     *
     * @return the departmentName value
     */
    public String departmentName() {
        return this.departmentName;
    }

    /**
     * Get product name.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Get consumed service name.
     *
     * @return the consumedService value
     */
    public String consumedService() {
        return this.consumedService;
    }

    /**
     * Get the cost center of this department if it is a department and a costcenter exists.
     *
     * @return the costCenter value
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Get part Number.
     *
     * @return the partNumber value
     */
    public String partNumber() {
        return this.partNumber;
    }

    /**
     * Get resource Guid.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get offer Id.
     *
     * @return the offerId value
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Get charges billed separately.
     *
     * @return the chargesBilledSeparately value
     */
    public Boolean chargesBilledSeparately() {
        return this.chargesBilledSeparately;
    }

    /**
     * Get resource Location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get additional details of this usage item. By default this is not populated, unless it's specified in $expand.
     *
     * @return the additionalProperties value
     */
    public String additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
