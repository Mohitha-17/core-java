package core.java.relationships;


public class AssociationUnidirectionalOnetoOneExample {
	public static class Passport {
        String passportNumber;

        public Passport(String passportNumber) {
            this.passportNumber = passportNumber;
        }

        @Override
        public String toString() {
            return "Passport(" + "passportNumber='" + passportNumber + '\'' + ')';
        }
	}
    public static class Person {
        String name;
        Passport passport;

        public Person(String name, Passport passport) {
            this.name = name;
            this.passport = passport;
        }

        public void displayPersonDetails() {
            System.out.println("Person Name: " + name);
            System.out.println("Passport: " + passport);
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passport passport = new Passport("A12345678");
        Person person = new Person("ABC", passport);

        person.displayPersonDetails();
	}

}
