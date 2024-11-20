package keywords;

public class InterfaceKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable document = new Document();
        document.print();

        Printable image = new Image(); 
        image.print();
	}

}
interface Printable {
    void print();
}
class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Document...");
    }
}
class Image implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Image...");
    }
}
