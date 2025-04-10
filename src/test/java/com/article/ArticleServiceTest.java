package com.article;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArticleServiceTest {
    private ArticleService articleService;

    @BeforeEach
    public void setUp() {
        articleService = new ArticleService();
    }

    @Test
    public void testAddArticle() {
        // Créer un nouvel article
        Article article = new Article("Test Article", 19.99);

        // Ajouter l'article
        Article addedArticle = articleService.addArticle(article);

        // Vérifier que l'article a été ajouté avec un ID
        assertEquals(article.getName(), addedArticle.getName());
        assertEquals(article.getPrice(), addedArticle.getPrice());
    }
}