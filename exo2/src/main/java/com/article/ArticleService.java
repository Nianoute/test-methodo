package com.article;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ArticleService {
    private Map<String, Article> articles;

    public ArticleService() {
        this.articles = new HashMap<>();
    }

    public Article addArticle(Article article) {
        // Générer un ID unique
        String id = UUID.randomUUID().toString();
        article.setId(id);

        // Stocker l'article
        articles.put(id, article);

        return article;
    }
}