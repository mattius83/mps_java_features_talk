package mattius;

public interface IAnimal {
    public void sleep(int hours);

    public void walk();

    public void run();

    default void migrate(int miles) {
        System.out.println("I am not going anywhere... I like it right here");
    }
}
