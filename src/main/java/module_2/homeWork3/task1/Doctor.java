package module_2.homeWork3.task1;

public class Doctor extends Employee implements Intellectual{

    public Doctor(String name, int age) {
        super(name, age);
    }

    public void heal(){
        System.out.println("Heals");
    }

    @Override
    public void workInfo() {
        System.out.println("Кого-то лечит");
    }
}
