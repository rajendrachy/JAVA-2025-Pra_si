//-----------This is static Method ---------------

class Mobile {
    //String brand; // this are instance variable 
    static String brand;
    static String name; // make this variable common to all the Object
    static int price;






    //------- Variable creating inside a method are a local Variable----

   public  void show() { // it is instance method
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }



    

    public static void show1() { // we should use static variable only under static method

        System.out.println("In static method");
        System.out.println(brand + " " + name + " " + price);
    }
}



public class StaticMethod {
    public static void main(String[] args) {
      
            Mobile.show1();
    }
}






// Syntax of Static Block:

// static {
//     // initialization code
// }



