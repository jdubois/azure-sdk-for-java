/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceSectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing InvoiceSections.
 */
public interface InvoiceSections extends HasInner<InvoiceSectionsInner> {
    /**
     * Lists all invoice sections for which a user has access.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSectionListResult> listByBillingAccountNameAsync(String billingAccountName);

    /**
     * Lists all invoice sections under a billing profile for which a user has access.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSection> listByBillingProfileNameAsync(final String billingAccountName, final String billingProfileName);

    /**
     * Elevates the caller's access to match their billing profile access.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable elevateToBillingProfileAsync(String billingAccountName, String invoiceSectionName);

    /**
     * Get the InvoiceSection by id.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSection> getAsync(String billingAccountName, String invoiceSectionName);

    /**
     * The operation to create a InvoiceSection.
     *
     * @param billingAccountName Billing Account Id.
     * @param parameters Parameters supplied to the Create InvoiceSection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingProfile> createAsync(final String billingAccountName, final InvoiceSectionCreationRequest parameters);

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSection> listByCreateSubscriptionPermissionAsync(final String billingAccountName);

}
