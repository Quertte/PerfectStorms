package module_2.homeWork3.task1;

public class Builder extends Employee implements Strongman{

    public Builder(String name, int age) {
        super(name, age);
    }

    public void build(){
        System.out.println("Builds");
    }

    @Override
    public void workInfo() {
        System.out.println("Что-то строит");
    }
}
