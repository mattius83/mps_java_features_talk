package mattius;

public class Goose implements IAnimal {


    @Override
    public void sleep(int hours) {
        System.out.println(String.format("I am going to sleep for %d hours", hours));
    }

    @Override
    public void walk() {
        System.out.println("I waddle a bit");
    }

    @Override
    public void run() {
        System.out.println("I can run but I will likely squawk while doing it");
    }

    @Override
    public void migrate(int miles) {
        System.out.println(String.format("I migrate by flying and I can go for %d miles", miles));
    }
}
