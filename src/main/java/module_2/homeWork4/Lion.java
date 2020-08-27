package module_2.homeWork4;

public class Lion {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public String lionName(Lion lion, String name){
        lion.name = name;
        return name;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Lion lion = new Lion("Mad");
        System.out.println(lion);
        lion.lionName(lion, "Mad1");
        System.out.println(lion);
    }
}
