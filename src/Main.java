import kz.aitu.dz.Book;

public class Main {
    public static void main(String[] args) {
        Book deadSouls = new Book("Dead Souls", "Nikolai Gogol", 352);
        deadSouls.displayInfo();
        deadSouls.getAuthor();
        deadSouls.setAuthor("New");
        deadSouls.setPages(55);
        deadSouls.displayInfo();

        MobilePhone Nokia = new MobilePhone("Nokia", "3310", 2017);
        MobilePhone Motorola = new MobilePhone("Motorola", "MOTOACTV W450", 2008);

        System.out.println(Math.min(Nokia.getYearReleased(), Motorola.getYearReleased()));
    }
}