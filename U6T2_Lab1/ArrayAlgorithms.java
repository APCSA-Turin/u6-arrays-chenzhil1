package U6T2_Lab1;

public class ArrayAlgorithms  {
    private ArrayAlgorithms() {}

  /** Returns the average of all values in numList as a double.
   *
   *  PRECONDITION: numList.length > 0
   */
  public static double average(int[] numList) {
    // IMPLEMENT ME
    double average = 0;
    for (int i = 0; i < numList.length;i ++) {
        average += numList[i];
    }
    average = average / numList.length;
    return average;
  }

 /** Returns the value in numList that represents the minimum
   * value in numList.
   *
   *  PRECONDITION: numList.length > 0
   */
  public static int minimum(int[] numList) {
    // IMPLEMENT ME
    int minimum = numList[0];
    for(int i = 1; i < numList.length; i ++) {
        if(numList[i] < minimum) {
            minimum = numList[i]; 

        }
        
    }
    return minimum;
  }

 /** Returns the number of Strings in strList that contain the target.
   *
   *  PRECONDITION: strList.length > 0
   */
  public static int howManyContain(String[] strList, String target) {
    // IMPLEMENT ME
    int contain = 0;
    for (int i = 0; i < strList.length; i ++) {
        if(strList[i].indexOf(target) >= 0 ) {
            contain ++;
        }

    }
    return contain;
  }

  /** Returns an array containing all characters in myStr, in order.
   *
   *  PRECONDITION: myStr.length() > 0
   */
  public static String[] stringToArray(String myStr) {
    // IMPLEMENT ME
    String[] strList = new String[myStr.length()];
    for(int i = 0; i < myStr.length(); i ++) {
        strList[i] = myStr.substring(i, i + 1);
    }
    return strList;
  }

  /**  This method checks each Person in the people array, and if they
    *  are an adult (at least 18 years old), they introduce themselves
    *  (i.e. by calling the introduce() method)
    *
    *  PRECONDITION: people.length > 0
    */
    public static void introduceAdults(Person[] people) {
        // IMPLEMENT ME!
        for(int i = 0; i < people.length; i ++) {
            if(people[i].getAge() >= 18) {
                people[i].introduce();
            }
        }
      }

  /** Prints each String in wordList, on its own line, in reverse order;
   *  the characters of each string are also reversed.
   *
   *  PRECONDITION: wordList.length > 0
   */
  public static void reversePrint(String[] wordList) {
    // IMPLEMENT ME
    for(int i = wordList.length - 1; i >= 0; i --) {
        String reversed = "";
        for(int j = wordList[i].length() - 1; j >= 0; j --) {
            reversed += wordList[i].substring(j, j + 1); 
        }
        System.out.println(reversed);
    }
  }

  /** Returns a new array containing all elements from arr1 combined with 
   *  all elements from arr2; arr1's elements should be followed by
   *  arr2's elements
   *
   *  PRECONDITION: arr1.length > 0, arr2.length > 0
   */
  public static int[] combine(int[] arr1, int[] arr2) {
    // IMPLEMENT ME  
    int[] newArray = new int[arr1.length + arr2.length];
    for(int i = 0; i < arr1.length; i ++) {
        newArray[i] = arr1[i];
    }
    for(int i = arr1.length; i < arr1.length + arr2.length; i ++) {
        newArray[i] = arr2[i - arr1.length];
    }
    return newArray;

  }


    




}
