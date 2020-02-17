package x23_OOP.animalLifecycle;

import x23_OOP.animaLinterface.Animal;


public class Sleep implements Command {

    private Animal animal;
    public Sleep(Animal animal){
        this.animal = animal;
    }
    @Override
    public void execute() {
        animal.sleep();
    }
}
