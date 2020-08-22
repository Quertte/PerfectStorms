package module_2.homeWork3.task1;

public class Main {
    public static void main(String[] args) {
       Programmer programmer = new Programmer("Andrew",29);
       programmer.think();
       programmer.programming();
       programmer.workInfo();
       programmer.speak();

       Builder builder = new Builder("Vasya", 29);
       builder.build();
       builder.workInfo();
       builder.drag();
       builder.speak();

       Doctor doctor = new Doctor("Petr", 35);
       doctor.heal();
       doctor.workInfo();
       doctor.speak();
       doctor.think();


    }
}
