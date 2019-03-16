package nmj;

public class Horse extends Animal implements AniInterface {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound(){
        System.out.println("Neigh");
    }
}
