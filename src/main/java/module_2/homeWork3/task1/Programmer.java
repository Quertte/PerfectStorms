package module_2.homeWork3.task1;

public class Programmer extends Employee implements Intellectual{

    public Programmer(String name, int age) {
        super(name, age);
    }

    public void programming(){
        System.out.println("Programming");
    }

    @Override
    public void workInfo() {
        System.out.println("Что-то кодит");
    }
}
