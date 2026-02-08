package Review_Exercise1;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        book.addBook();
        bookList.add(book);
        System.out.println("da them");
    }

    public void updateBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                book.updateBook(id);
                return;
            }
        }
        System.out.println("Không tìm thấy sách có ID: " + id);
    }

    public void deleteBookById(String id) {
        //boolean removed=bookList.removeIf(book -> book.getBookId().equals(id));
        for (Book object : bookList) {
            if (id.equals(object.getBookId())) {
                bookList.remove(object);
                System.out.println("da xoa ID: " + id);
            } else {
                System.out.println("khong tim thay ID: " + id);
            }
        }
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        System.out.println("khong tim thay ID: " + id);

        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Empty");
        } else {

            for (Book book : bookList) {
                book.displayBook();
            }
        }
    }
}
