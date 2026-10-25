package com.acme.catchup.platform2.news.infrastructure.persistence.jpa.converters;

import com.acme.catchup.platform2.news.domain.model.valueobjects.NewsApiKey;
import jakarta.persistence.AttributeConverter;

public class NewsApiKeyAttributeConverter implements AttributeConverter<NewsApiKey, String> {

    @Override
    public String convertToDatabaseColumn(NewsApiKey attribute) {
        return attribute == null ? null : attribute.value();
    }

    @Override
    public NewsApiKey convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new NewsApiKey(dbData);
    }
}
