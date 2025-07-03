public class Rectangle{

    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    int calculateArea(){
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 14);
        int area = rect.calculateArea();
        System.out.println("Rectangle area = " + area);
    }
}