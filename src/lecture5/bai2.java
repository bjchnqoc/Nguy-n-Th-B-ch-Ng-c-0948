package lecture5;
import java.util.*;

public class bai2 {

    public static void main(String[] args) {
        Random rand = new Random();
        double randomnumber = rand.nextDouble() * (8.0 - 1.8) + 1.8;
        System.out.print("random " + randomnumber);
    }
}
//random so ngau nhien tu 1.8-8.0
