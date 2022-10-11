package mattius;

public class Cat implements IAnimal {

    @Override
    public void sleep(int hours) {
        System.out.println(String.format("I LOVE to sleep; I am going to sleep for %d hours", hours));
    }

    @Override
    public void walk() {
        System.out.println("I strut around like I own the place");
    }

    @Override
    public void run() {
        System.out.println("I can run real fast - especially when being chased by the family dog");
    }

}
