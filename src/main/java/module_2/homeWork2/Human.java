package module_2.homeWork2;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 10 * 32 + 1000000 + name.hashCode();
    }
}
