class KmTOMiles2 extends ConsoleProgram {

/**
  * Description
  * A program that converts kilometers to miles from 10 to 100km, every 10km in a formatted table
  * @author: Preston Wong
  */

  
  public void run() {

    double dblMiles;

    // header of the table 
    System.out.printf("%8S %11S %n","Km", "Mi");
    System.out.println("-------------------------");
    
    // prints out the table
    for (int intKm = 10; intKm <= 100; intKm += 10){
      dblMiles = intKm * 0.621371;
      System.out.printf("%7dkm %10.2fmi %n",intKm, dblMiles);
    }
  }
}