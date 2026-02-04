
package Lec11.Encapsulation.ExamplePage567;


public class PersonP7 {
   
   public String name;
                        
    private double weight;//  'private' để bảo vệ dữ liệu (Encapsulation)

    public void setWeight(double weight) {
        // lỗi logic dùng 'if(this.weight < 0)'
        // Nó đang kiểm tra giá trị hiện tại của đối tượng thay vì giá trị mới truyền vào.
        // Đúng if(weight < 0)
        if (this.weight < 0) { 
            System.out.println("Weight can not negative");
        } else {
            this.weight = weight;
        }
    }
}
    

