public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    /* Creates a Payroll object
     
       PRECONDITIONS: items != null, items.length >= 3
     * /
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
   
    /*  Returns the bonus threshold as described in part (a).
     */
  
/* Returns the bonus threshold as described in part (a).
 */
public Payroll(int[] items) {
  itemsSold = items;
  wages = new double[items.length];
}


public double computeBonusThreshold() {
	int minimum = Integer.MAX_VALUE;
	int maximum = Integer.MIN_VALUE;
	int totalSold = 0;
	double amountCalculate = itemsSold.length - 2;
	for(int item : itemsSold) {
		if(item < minimum) {
			minimum = item;
		}
		if(item > maximum) {
			maximum = item;
		}
		totalSold += item;
	}
	double adjusted = (double) (totalSold - minimum - maximum);
	double calculate = adjusted / amountCalculate;
	return calculate;
}

public void computeWages(double fixedWage, double perItemWage) {
	double threshold = computeBonusThreshold();
	for(int i = 0; i < wages.length; i ++) {
		double wage = 0;
		if((double)itemsSold[i] <= threshold) {
			wage = fixedWage + (perItemWage * itemsSold[i]);
		}
		else {
			wage = (fixedWage + (perItemWage * itemsSold[i])) * 1.1;
		}
		wages[i] = wage;

}	
}
public double[] getWages() {
  return wages;
}

}
