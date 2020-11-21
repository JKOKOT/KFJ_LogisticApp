package Auto;

import java.util.List;

public interface IAutosDao {
    List<Auto> list();
    void add(Auto auto);
    List<Brand> listBrandies();
}


//package org.example.library.books;
//
//        import java.util.List;
//
//public interface IBooksDao {
//    List<Book> list();
//    void add(Book book);
//    void delete(int bookId);
//    List<Category> listCategories();
//}
