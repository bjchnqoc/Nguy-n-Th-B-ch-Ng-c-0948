
package Lec10.Abstraction.Abstract.AbstractMethod;


 
public class Square  extends Shape{
    private double side;
    public Square (double side){
        this.side=side;
    }
    @Override
    public double calculateArea(){
        return side*side;
    }
}
