package Five;

public class Cat {
    String name;
    int age;
    String dish;
    public Cat(String name){
        this.name=name;
    }

    public Cat(String name, int age) {
        this(name);
        this.age = age;
    }

    public Cat(String name, int age, String dish) {
        this(name,age);
        this.dish = dish;
    }
    void info(){
        System.out.println(name+" "+age+" "+dish);
    }

}
