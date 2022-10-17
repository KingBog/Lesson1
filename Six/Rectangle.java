package Six;

public class Rectangle {
    int a;
    int b;
    String color;
    String surface;
    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }
    public Rectangle(int a, int b, String color){
        this(a, b);
        this.color=color;
    }
    public Rectangle(int a, int b, String color,String surface){
        this(a, b, color);
        this.surface=surface;
    }
    void printInfo(){
        System.out.println(a+" "+b+" "+" "+color+" "+surface);
    }
}
