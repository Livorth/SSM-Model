package cn.livroth.Dao;

import cn.livroth.Pojo.Books;

import java.util.List;

public interface BooksMapper {

    //增加一个Book
    public int addBook(Books book);

    //根据id删除一个Book
    public int deleteBookById(int id);

    //更新Book
    public int updateBook(Books books);

    //根据id查询,返回一个Book
    public Books queryBookById(int id);

    //查询全部Book,返回list集合
    public List<Books> queryAllBook();
}
