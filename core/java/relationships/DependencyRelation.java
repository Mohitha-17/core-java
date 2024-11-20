/* Dependecy Relation:
 * This is a dependency relationship where one class depends on another to function
 *  but does not own or manage it directly.
 *
 */
package core.java.relationships;

class Engine {
    public void start() {
        System.out.println("Engine is starting...");
    }
}
class Car {
    // Car depends on Engine to start
    public void startCar(Engine engine) {
        System.out.println("Car is ready to start.");
        engine.start();  // Car uses Engine to start
    }
}
public class DependencyRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine();  // Engine exists independently
        Car car = new Car();  // Car depends on Engine
        
        car.startCar(engine);
	}

}
