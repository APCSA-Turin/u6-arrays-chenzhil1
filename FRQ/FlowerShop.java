import java.util.Arrays;
import java.util.Collections;


public class FlowerShop {


   private Flower[] flowerInventory;


   // ADDED TO ENABLE TESTING
   public FlowerShop(Flower[] flowerInventory) {
       this.flowerInventory = flowerInventory;
   }


   // ADDED TO ENABLE TESTING
   public Flower[] getFlowerInventory() {
       return flowerInventory;
   }


   // IMPLEMENTATION ADDED TO ENABLE TESTING
   public Flower[] sortByQuantity(Flower[] arr) {
       Flower[] sortedCopy = new Flower[arr.length];
       for (int i = 0; i < sortedCopy.length; i++) {
           sortedCopy[i]= arr[i];
       }
       Arrays.sort(sortedCopy); // sorts low to high (increasing) based on quantity
       Collections.reverse(Arrays.asList(sortedCopy)); // reverses to sort in decreasing order
       return sortedCopy;
   }


   // part a
   public void updateInventory(Flower[] newInventory) {
    for(int i = 0; i < flowerInventory.length; i ++ ) {
        int newFlower = newInventory[i].getQuantity();
        int original = flowerInventory[i].getQuantity();
        flowerInventory[i].setQuantity(newFlower + original);
      }
    
   }


   // part b
   public boolean topNSame(int n, Flower[] otherInventory) {
    int same = 0;
    Flower[] originalSorted = sortByQuantity(flowerInventory);
    Flower[] otherSorted = sortByQuantity(otherInventory);
    for(int i = 0; i < n; i ++) {
      if(originalSorted[i].getName().equals(otherSorted[i].getName())){
      same ++;
      }
    }
    if(same == n) {
      return true;
    }
    else {
      return false;
    }
  
}
}

