package Five;

public class Main {
    public static void main(String[] args) {
        Cat cat= new Cat("Tom");
        cat.info();
        Cat cat1=new Cat("Tom",3);
        cat1.info();
        Cat cat2=new Cat("Bob",2,"Корм");
        cat2.info();
    }
}
