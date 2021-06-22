package com.itsreddy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.itsreddy.NewsClient.TopHeadlinesEndpoint;
import com.itsreddy.model.ArticleWrapper;
import com.itsreddy.repositories.ArticleRepository;

import io.github.ccincharge.newsapi.datamodels.Article;


import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ArticleControllerIT {

    @Autowired
    private ArticleRepository articleRepository;
    
    @Autowired
    TopHeadlinesEndpoint topHeadlinesEndpoint;

    @Test
    public void addToRepo() throws Exception {
    	List<Article> articles = topHeadlinesEndpoint.getTopNewsByCountry("in");
		Article article = articles.get(0);
		ArticleWrapper newsArticle = new ArticleWrapper(article);

        assertEquals(newsArticle, articleRepository.save(newsArticle));
    }

    @Test
    public void deleteRepo() {
    	if(!articleRepository.findAll().isEmpty()) {
            articleRepository.deleteAll();
            assertTrue(articleRepository.findAll().isEmpty());
    	}
    	else {
    		assertTrue(true);
    	}
    }
}
