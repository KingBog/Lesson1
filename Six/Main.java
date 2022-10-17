package Six;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(2,4);
        rectangle.printInfo();
        Rectangle rectangle1 = new Rectangle(2,4,"black");
        rectangle1.printInfo();
        Rectangle rectangle2 = new Rectangle(2,4,"black","полированная");
        rectangle2.printInfo();


    }
}
