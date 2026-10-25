package com.acme.catchup.platform2.news.infrastructure.persistence.jpa.converters;

import com.acme.catchup.platform2.news.domain.model.valueobjects.SourceId;
import jakarta.persistence.AttributeConverter;

public class SourceIdAttributeConverter implements AttributeConverter<SourceId, String> {

    @Override
    public String convertToDatabaseColumn(SourceId attribute) {
        return attribute == null ? null : attribute.value();
    }

    @Override
    public SourceId convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new SourceId(dbData);
    }

}
