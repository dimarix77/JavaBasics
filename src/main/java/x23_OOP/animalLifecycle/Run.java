package x23_OOP.animalLifecycle;

import x23_OOP.animaLinterface.Animal;

public class Run implements Command {

    private Animal animal;
    public Run(Animal animal){
        this.animal = animal;
    }
    @Override
    public void execute() {
        animal.run();
    }
}
