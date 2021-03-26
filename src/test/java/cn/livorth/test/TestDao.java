package cn.livorth.test;


import cn.livorth.Dao.BooksMapper;
import cn.livorth.Pojo.Books;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class TestDao {
    @Test
    public void testQueryAllBook() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BooksMapper mapper = context.getBean("booksMapper", BooksMapper.class);

        List<Books> books = mapper.queryAllBook();

        for (Books book : books) {
            System.out.println(book);
        }

    }
}