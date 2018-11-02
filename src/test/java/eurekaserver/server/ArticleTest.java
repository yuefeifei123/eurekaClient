package eurekaserver.server;

import coderServer.EurekaClientApplication;
import coderServer.sildenafilTest.entity.Article;
import coderServer.sildenafilTest.service.ArticleService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaClientApplication.class)
public class ArticleTest {
    @Autowired
    private ArticleService articleService;

    @Test
    public void testSave() {
        Article article=new Article();
        article.setAuthor("testAuthor");
        article.setBody("testBody");
        article.setCover("testCover");
        article.setDigest("testDigest");
        article.setTitle("testTitle");
        article.setType(0);
        Article article1=articleService.saveArticle(article);

    }

    @Test
    public void testPage() {
        Article article=new Article();
        article.setId(77L);
        article.setStatus(0);
        article.setTitle("voe");
        IPage<Article> list=articleService.getPageList(1,10,article);
//        System.out.println(list.getTotal());
//        System.out.println(list.getCurrent());
//        System.out.println(list.getPages());
//        System.out.println(list.getSize());
//        for (Article article : list.getRecords()) {
//            System.out.println(article);
//        }
        for (Article article1 : list.getRecords()) {
            System.out.println(article1);
        }
    }

    @Test
    public void change() {
        Article article=new Article();
        article.setId(23L);
        article.setStatus(0);
        articleService.changeArticle(article);
    }


}
