package Review_Exercise1;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    private String status;

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice,
            double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addBook() {

        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.print("Nhap tinh trang cua sach: ");
        setStatus(scanner.nextLine());
        System.out.println("TextBook added successfully.");
    }

    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.print("tinh trang moi cua sach: ");
            setStatus(scanner.nextLine());
            System.out.println("sach giao khoa cap nhat thanh cong.");
        } else {
            System.out.println("ID cua sach giao khoa" + id + " khong tim thay.");
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("Tinh trang sach: " + getStatus());

    }
}
