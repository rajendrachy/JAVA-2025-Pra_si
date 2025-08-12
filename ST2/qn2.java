package ST2;


interface FuelStation {
    double petrol_price = 105.0;
    double diesel_price = 92.3;
    double cng_price = 78.9;

    void fillFuel(String vehicleNumber, double liters);
    double calcBill(double liters);

}


class PetrolVehicle implements FuelStation{
      public void fillFuel(String vehicleNumber, double liters) {
       System.out.println("Filling " + liters + " liters of petrol for the vehicle " + vehicleNumber);
      }

      public double calcBill(double liters) {
        return liters * petrol_price;
      }
}


class DieselVehicle implements FuelStation{
      public void fillFuel(String vehicleNumber, double liters) {
            System.out.println("Filling " + liters + " liters of DIesel for vehicle " + vehicleNumber);
      }


    public double calcBill(double liters) {
      return liters * diesel_price;
    }

}


class CngVehicle implements FuelStation{
 public void fillFuel(String vehicleNumber, double liters) {
     System.out.println("Filling " + liters + " liters of CNG for vehicle " + vehicleNumber);
 }

 

    public double calcBill(double liters) {
     return liters * cng_price;
    }
}



class BillingCounter {
  public void generateBill(FuelStation f, String vehicleNumber, double liters) {
   f.fillFuel(vehicleNumber, liters);
    double bill = f.calcBill(liters);
    System.out.println("Total Bill: " + bill);
  }
}




public class qn2 {
     public static void main(String[] args) {
      BillingCounter cnt = new BillingCounter();
      cnt.generateBill(new PetrolVehicle(), "HP12AB1234", 20.0);
System.out.println();

      cnt.generateBill(new DieselVehicle(), "e PB10CD5678", 15.0);
System.out.println();

      cnt.generateBill(new CngVehicle(), " CH01EF4321.", 10.0);
        
     }
}





