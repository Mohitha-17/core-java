/*STRONG HAS-A RELATION:
 * Composition represents: 
 * A relationship where one class has an object of another class as part of its state, 
 * and the contained object cannot exist without the container object.
 * 
 */
package core.java.relationships;
class Program {
    private String name;

    public Program(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Running the " + name + " program.");
    }

    public void stop() {
        System.out.println("Stopping the " + name + " program.");
    }

    @Override
    public String toString() {
        return name;
    }
}
class Laptop {
    private String model;
    private Program[] programs;
    private int programCount;

    public Laptop(String model, int maxPrograms) {
        this.model = model;
        this.programs = new Program[maxPrograms];
        this.programCount = 0;
    }

    // Method to install a program on the laptop
    public void installProgram(Program program) {
        if (programCount < programs.length) {
            programs[programCount++] = program;
        } else {
            System.out.println("The laptop cannot install more programs.");
        }
    }

    public void displayPrograms() {
        System.out.println("Programs installed on " + model + " laptop:");
        for (int i = 0; i < programCount; i++) {
            System.out.println(programs[i]);
        }
    }
    public void destroyLaptop() {
        System.out.println("Destroying the " + model + " laptop...");
        for (int i = 0; i < programCount; i++) {
            programs[i].stop(); 
        }
        programs = null; 
    }
}
public class CompositionRelationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop("Dell", 3);
        laptop.installProgram(new Program("Microsoft Word"));
        laptop.installProgram(new Program("Visual Studio Code"));
        laptop.displayPrograms();
        laptop.destroyLaptop();

	}

}
