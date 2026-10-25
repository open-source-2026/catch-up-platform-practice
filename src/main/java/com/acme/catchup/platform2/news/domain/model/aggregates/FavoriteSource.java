package com.acme.catchup.platform2.news.domain.model.aggregates;

import com.acme.catchup.platform2.news.domain.model.valueobjects.NewsApiKey;
import com.acme.catchup.platform2.news.infrastructure.persistence.jpa.converters.NewsApiKeyAttributeConverter;
import com.acme.catchup.platform2.news.infrastructure.persistence.jpa.converters.SourceIdAttributeConverter;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

public class FavoriteSource {

    public static final String NEWS_API_KEY_SOURCE_ID_UNIQUE_CONSTRAINT = "uk_news_api_key_source_id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Convert(converter = NewsApiKeyAttributeConverter.class)
    private NewsApiKey newsApiKey;

    @Column(nullable = false)
    @Convert(converter = SourceIdAttributeConverter.class)
    private String sourceId;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private Instant createId;

    @Column(nullable = false)
    @LastModifiedDate
    private Instant updateId;


}
