// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.indexes.models.CommonGramTokenFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.CommonGramTokenFilter} and
 * {@link CommonGramTokenFilter}.
 */
public final class CommonGramTokenFilterConverter {
    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.CommonGramTokenFilter} to
     * {@link CommonGramTokenFilter}.
     */
    public static CommonGramTokenFilter map(com.azure.search.documents.indexes.implementation.models.CommonGramTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        CommonGramTokenFilter commonGramTokenFilter = new CommonGramTokenFilter();

        String name = obj.getName();
        commonGramTokenFilter.setName(name);

        Boolean ignoreCase = obj.isIgnoreCase();
        commonGramTokenFilter.setCaseIgnored(ignoreCase);

        Boolean useQueryMode = obj.isUseQueryMode();
        commonGramTokenFilter.setQueryModeUsed(useQueryMode);

        if (obj.getCommonWords() != null) {
            List<String> commonWords = new ArrayList<>(obj.getCommonWords());
            commonGramTokenFilter.setCommonWords(commonWords);
        }
        return commonGramTokenFilter;
    }

    /**
     * Maps from {@link CommonGramTokenFilter} to
     * {@link com.azure.search.documents.indexes.implementation.models.CommonGramTokenFilter}.
     */
    public static com.azure.search.documents.indexes.implementation.models.CommonGramTokenFilter map(CommonGramTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.indexes.implementation.models.CommonGramTokenFilter commonGramTokenFilter =
            new com.azure.search.documents.indexes.implementation.models.CommonGramTokenFilter();

        String name = obj.getName();
        commonGramTokenFilter.setName(name);

        Boolean ignoreCase = obj.isCaseIgnored();
        commonGramTokenFilter.setIgnoreCase(ignoreCase);

        Boolean useQueryMode = obj.isQueryModeUsed();
        commonGramTokenFilter.setUseQueryMode(useQueryMode);

        if (obj.getCommonWords() != null) {
            List<String> commonWords = new ArrayList<>(obj.getCommonWords());
            commonGramTokenFilter.setCommonWords(commonWords);
        }
        return commonGramTokenFilter;
    }

    private CommonGramTokenFilterConverter() {
    }
}
