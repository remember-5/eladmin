package me.zhengjie;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import me.zhengjie.modules.test.domain.BlogArticle;
import me.zhengjie.modules.test.mapper.BlogArticleMapper;
import me.zhengjie.modules.test.service.impl.BlogArticleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EladminSystemApplicationTests {

    @Autowired
    BlogArticleServiceImpl blogArticleService;
    @Autowired
    BlogArticleMapper blogArticleMapper;

    @Test
    public void contextLoads() {

       blogArticleMapper.selectList(new QueryWrapper<>()).forEach(System.err::println);
        List<BlogArticle> list = blogArticleService.list();
        for (BlogArticle blogArticle : list) {
            System.err.println(blogArticle);
        }
    }

    public static void main(String[] args) {
    }
}

