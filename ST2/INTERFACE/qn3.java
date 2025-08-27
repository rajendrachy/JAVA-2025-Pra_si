
import java.lang.module.ModuleReader;

 abstract class Payments {
  
  public abstract void processPayments(double amt);

}



class UPIPayments extends Payments {
    public void processPayments(double amt) {
      System.out.println(amt);
  }
}

class CreditCardPayments extends Payments {
     public void processPayments(double amt) {
      System.out.println(amt);
  }
}



class PayPalPayments extends Payments {
     public void processPayments(double amt) {
      System.out.println(amt);
  }
} 


 class PaymentPortal {
 public void OpenPortal(Payments p, double amt){
 System.out.println("Portal Open");
 p.processPayments(amt);
 }
}






public class qn3 {
  public static void main(String[] args) {
   PaymentPortal Mypay = new PaymentPortal();
 
 Mypay.OpenPortal(new UPIPayments(), 12.0);
 
  Mypay.OpenPortal(new CreditCardPayments(), 1239.009);
 Mypay.OpenPortal(new PayPalPayments(), 120.9908);

  }
}









