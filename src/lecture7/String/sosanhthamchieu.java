package lecture7.String;

public class sosanhthamchieu {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");//s1 voi s3 khac vi tri tham chieu 
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

    }

}
