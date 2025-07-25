//-----------This is static varaible---------------

class Mobile {
    String brand; // this are instance variable 
     String name; // make this variable common to all the Object
    static int price;

    //------- Variable creating inside a method are a local Variable----

    // Method to display mobile details
    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}



public class Demo {
    public static void main(String[] args) {
        Mobile m = new Mobile();   // Create object
        m.brand = "Samsung";       // Set brand
        m.name = "Galaxy S21";     // Set name
        m.price = 30000;           // Set price



        Mobile obj2 = new Mobile();
        obj2.brand = "Oppo";
        obj2.name = "Readmi12";
        obj2.price = 20000;


        m.name = "Rajendra"; // change in both // the static variable should called by the class name Best practice

        Mobile.price = 5000000;

        m.show(); // Show details
        obj2.show();
                         
    }
}






