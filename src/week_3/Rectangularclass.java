package week_3;

public class Rectangularclass {
    public static void main(String[] args){
        Rectangle s1 = new Rectangle(2,9);
        s1.areaPerimeter();

    }
}
class Rectangle{
    int length;
    int breath;
    Rectangle(int length,int breath){
        this.length = length;
        this.breath = breath;
    }
    void areaPerimeter(){
        int Area = (length * breath);
        int Perimeter = 2*(length+breath);
        System.out.println("Araea of the rectangle is:"+Area );
        System.out.println("Perimeter of the rectangle is:"+Perimeter);
        System.out.println("new code");
    }

}
