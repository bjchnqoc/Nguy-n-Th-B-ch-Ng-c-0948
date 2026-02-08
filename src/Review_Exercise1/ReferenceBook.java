package Review_Exercise1;

import java.util.Scanner;
import java.util.Date;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public ReferenceBook() {
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.print("nhap thue: ");
        setTax(scanner.nextDouble());
        System.out.println("ReferenceBook added successfully");

    }

    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.print("nhap thue moi: ");
            setTax(scanner.nextDouble());
            System.out.println("sach tham khao cap nhat thanh cong.");
        } else {
            System.out.println("khong tim thay ID" + id);
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("tien thue : " + getTax());

    }
}
