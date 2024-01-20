import kz.aitu.dz.Book;

public class Main {
    public static void main(String[] args) {
        Book deadSouls = new Book("Dead Souls", "Nikolai Gogol", 352);
        deadSouls.displayInfo();
        deadSouls.getAuthor();
        deadSouls.setAuthor("New");
        deadSouls.setPages(55);
        deadSouls.displayInfo();

        Cat Barsik = new Cat("Barsik", 11, "Black");
        Cat Snow = new Cat("Snow", 9, "White");

        Barsik.meow("Jack");
        Snow.meow("Jack", "John");

        MobilePhone Nokia = new MobilePhone("Nokia", "3310", 2017);
        MobilePhone Motorola = new MobilePhone("Motorola", "MOTOACTV W450", 2008);

        System.out.println(Math.min(Nokia.getYearReleased(), Motorola.getYearReleased()));
    }
}