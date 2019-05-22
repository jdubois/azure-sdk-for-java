/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_02_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.eventgrid.v2019_02_01_preview.implementation.EventSubscriptionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing EventSubscriptions.
 */
public interface EventSubscriptions extends SupportsCreating<EventSubscription.DefinitionStages.Blank>, SupportsListingByResourceGroup<EventSubscription>, SupportsListing<EventSubscription>, HasInner<EventSubscriptionsInner> {
    /**
     * Get an event subscription.
     * Get properties of an event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use '/subscriptions/{subscriptionId}/' for a subscription, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}' for a resource, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}' for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> getAsync(String scope, String eventSubscriptionName);

    /**
     * Delete an event subscription.
     * Delete an existing event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use '/subscriptions/{subscriptionId}/' for a subscription, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}' for a resource, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}' for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String scope, String eventSubscriptionName);

    /**
     * Get full URL of an event subscription.
     * Get the full endpoint URL for an event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use '/subscriptions/{subscriptionId}/' for a subscription, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}' for a resource, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}' for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscriptionFullUrl> getFullUrlAsync(String scope, String eventSubscriptionName);

    /**
     * List all global event subscriptions for a topic type.
     * List all global event subscriptions under an Azure subscription for a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> listGlobalBySubscriptionForTopicTypeAsync(final String topicTypeName);

    /**
     * List all global event subscriptions under a resource group for a topic type.
     * List all global event subscriptions under a resource group for a specific topic type.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> listGlobalByResourceGroupForTopicTypeAsync(final String resourceGroupName, final String topicTypeName);

    /**
     * List all regional event subscriptions under an Azure subscription.
     * List all event subscriptions from the given location under a specific Azure subscription.
     *
     * @param location Name of the location
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> listRegionalBySubscriptionAsync(final String location);

    /**
     * List all regional event subscriptions under an Azure subscription and resource group.
     * List all event subscriptions from the given location under a specific Azure subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param location Name of the location
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> listRegionalByResourceGroupAsync(final String resourceGroupName, final String location);

    /**
     * List all regional event subscriptions under an Azure subscription for a topic type.
     * List all event subscriptions from the given location under a specific Azure subscription and topic type.
     *
     * @param location Name of the location
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> listRegionalBySubscriptionForTopicTypeAsync(final String location, final String topicTypeName);

    /**
     * List all regional event subscriptions under an Azure subscription and resource group for a topic type.
     * List all event subscriptions from the given location under a specific Azure subscription and resource group and topic type.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param location Name of the location
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> listRegionalByResourceGroupForTopicTypeAsync(final String resourceGroupName, final String location, final String topicTypeName);

    /**
     * List all event subscriptions for a specific topic.
     * List all event subscriptions that have been created for a specific topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param providerNamespace Namespace of the provider of the topic
     * @param resourceTypeName Name of the resource type
     * @param resourceName Name of the resource
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> listByResourceAsync(final String resourceGroupName, final String providerNamespace, final String resourceTypeName, final String resourceName);

    /**
     * List all event subscriptions for a specific domain topic.
     * List all event subscriptions that have been created for a specific domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain
     * @param topicName Name of the domain topic
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventSubscription> listByDomainTopicAsync(final String resourceGroupName, final String domainName, final String topicName);

}
