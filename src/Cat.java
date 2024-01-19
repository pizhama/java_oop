public class Cat {
    private String name;
    private Integer weight;
    private String color;

    public Cat(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    static void meow(String name) {
        System.out.println(name + " says meow");
    }

    static void meow(String name1, String name2) {
        System.out.println(name1 + " and " + name2 + " says meow");
    }
}
