package U6T2_lab2;

import U6T2_Lab1.Person;

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

  /** Changes the first and last element of nums to be num
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: nums.length > 0
   */
  public static void bookEnd(int[] nums, int num) {
      // IMPLEMENT ME
      nums[0] = num;
      nums[nums.length - 1] = num;
  }

/** Multiplies each number in numList by multiplier.
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void multiplyBy(int[] numList, int multiplier) {
    // IMPLEMENT ME
    for(int i = 0; i < numList.length; i ++) {
      numList[i] = numList[i] * multiplier;

    }
  }

  /** Returns an array of ints where each element is the product
   *  of the corresponding element in numList and multiplier.
   *
   *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static int[] multiplyByNoModify(int[] numList, int multiplier) {
    // IMPLEMENT ME
    int[] outList = new int[numList.length];
    for(int i = 0; i < outList.length; i ++) {
      outList[i] = numList[i];

    }
    multiplyBy(outList, multiplier);
    return outList;
  }

  /** Adds a "!" to the end of each String in wordList.  However, if a
   *  a string already ends in an exclamation point, do NOT add another.
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: wordList.length > 0
   */
  public static void addExclamation(String[] wordList) {
    // IMPLEMENT ME
    for(int i = 0; i < wordList.length; i ++) {
      if(!wordList[i].substring(wordList[i].length() - 1).equals("!")) {
        wordList[i] = wordList[i] + "!";

      }
    }
  }

  /** Returns an array of booleans where each element reflects whether
   *  the corresponding element in tempList is at or below the freezing
   *  temperature of 32 (true) or not (false).
   *
   *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
   *  PRECONDITION: tempList.length > 0
   */
  public static boolean[] isFreezing(int[] tempList) {
    // IMPLEMENT ME
    boolean[] boolList = new boolean[tempList.length];
    for(int i = 0; i < tempList.length; i ++) {
      if(tempList[i] <= 32) {
        boolList[i] = true;

      }
      else {
        boolList[i] = false;

      }
    }
    return boolList;
  }

  /** Shifts all elements in numList to the LEFT one index
   *
   *  The first element in the array should wrap around
   *  to the back of the array.  For example, given the array
   *  {5, 1, 3, 4, 7, 6}, this method modifies the array
   *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
   *  with the last element wrapping around to the back)
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void shiftLeft(int[] numList) {
    // IMPLEMENT ME
    int temp = numList[0];
    for(int i = 0; i < numList.length - 1; i ++) {
      numList[i] = numList[i + 1];

    }
    numList[numList.length - 1] = temp;
 }

  /** Shifts all elements in numList to the RIGHT one index.
   *
   *  The last element in the array should wrap around
   *  to the front of the array.  For example, given the array
   *  {5, 1, 3, 4, 7, 6}, this method modifies the array
   *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
   *  with the last element wrapping around to the front)
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void shiftRight(int[] numList) {
    // IMPLEMENT ME
    int temp = numList[numList.length - 1];
    for(int i = numList.length - 1; i > 0; i --) {
      numList[i] = numList[i - 1];

    }
    numList[0] = temp;   
  }

  /** Reverses all elements in an array.
   *
   *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
   *  modifies the array to {6, 7, 4, 3, 1, 5}.
   *  Should work with all array lengths (both odd and even).
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void reverse(int[] numList) {
    // IMPLEMENT ME: You should solve this two different ways; see below
    //Strategy 1

    // int[] reversed = new int[numList.length];
    // for(int i = numList.length - 1; i >= 0; i --) {
    //   reversed[numList.length - i - 1] = numList[i];

    // }
    // for(int i = 0; i < numList.length; i ++) {
    //   numList[i] = reversed[i];
    // }

    //Strategy 2
    int temp = 0;
    for(int i = 0; i < numList.length / 2; i ++) {
      temp = numList[i];
      numList[i] = numList[numList.length - i - 1];
      numList[numList.length - i - 1] = temp;
    }

  }



}
