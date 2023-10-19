class Currency extends ConsoleProgram {

/**
  * Description
  * A program that converts kilometers to miles from 10 to 100km, every 10km in a formatted table
  * @author: Preston Wong
  */

  
  public void run() {

    double dlbSubtotal = 9.99;
    double dblTax = 0.13;
    double dblTotal;

    // calculate the total with subtotal and the tax
    dblTotal = dlbSubtotal * dblTax;

    // displays the final amount 
    System.out.printf("The total is $%.2f %n",dblTotal);



  }
}