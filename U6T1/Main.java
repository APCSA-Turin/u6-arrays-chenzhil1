public class Main {
    public static void main(String[] args) {
        // int[] heights = new int[3];
        // heights[0] = 78;
        // heights[1] = 72;
        // heights[2] = 69;
        // System.out.println(heights[2]);

        // boolean[] bools = {true, false, true, false, true, false};
        // bools[0] = bools[3];
        // System.out.println(bools.length);
        // System.out.println(bools[1]);
        // System.out.println(bools[3]);

        // String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        // String temp = alphabeticalNames[1];
        // alphabeticalNames[1] = alphabeticalNames[2];
        // alphabeticalNames[2] = temp;
        // System.out.println(alphabeticalNames[0]);
        // System.out.println(alphabeticalNames[1]);
        // System.out.println(alphabeticalNames[2]);
        // System.out.println(alphabeticalNames[3]);

        // double[] array1 = {7.5, 10.0};
        // double[] array2 = {8.2, 14.8};
        // double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        // System.out.println(array3[0]);
        // System.out.println(array3[1]);

        // String[] animals = new String[4];
        // animals[0] = "dog";
        // animals[1] = "camel";
        // animals[2] = "aardvark";
        // animals[3] = "bunny";
        // animals[2] = "aardvarks";
        // System.out.println(animals[2]);
        // System.out.println(animals.length);

        // Dog sparky = new Dog("Sparky", 4);
        // Dog toby = new Dog("Toby", 7);
        // Dog fiona = new Dog("Fiona", 12);
        // Dog[] dogs = {sparky, toby, fiona};
        // System.out.println(dogs[0].getName());
        // System.out.println(dogs[1].getName());
        // System.out.println(dogs[2].getName());

        // int[] ints1 = {2, 4, 6, 8, 10};
        // int[] ints2 = ints1;
        // ints2[3] = 15;
        // System.out.println(ints1[3]);
        // System.out.println(ints2[3]);

        // String[] myStrs = {"hi", "bye", "what", "purple"};
        // int arrLen = myStrs.length;
        // int strLen = myStrs[3].length();
        // System.out.println(arrLen + strLen);
        // String str = myStrs[2].substring(1, 3);
        // System.out.println(str);

        int[] nums1 = {5, 8, 9, 10, 4};
        int numStr1 = 5;
        ArrayManipulator manipulator = new ArrayManipulator(nums1, numStr1);
        System.out.println("------------");
        System.out.println(manipulator.getNumsMiddleIndex());
        System.out.println(manipulator.getNumsAverage());
        System.out.println(manipulator.sameLengths());
        System.out.println(manipulator.getNumAt(3));
        System.out.println(manipulator.getWordAt(3));
        System.out.println(manipulator.updateWordsListAt(3, "hello"));
        System.out.println(manipulator.getWordAt(3));
        System.out.println(manipulator.howLongLastWord());
        System.out.println(manipulator.updateWordsListAt(4, "updated"));
        System.out.println(manipulator.howLongLastWord());
        
        
        
        
        int[] nums2 = {2, 5, 7, 9};
        int numStr2 = 6;
        System.out.println("------------");
        manipulator = new ArrayManipulator(nums2, numStr2);
        System.out.println(manipulator.getNumsMiddleIndex());
        System.out.println(manipulator.getNumsAverage());
        System.out.println(manipulator.sameLengths());
        System.out.println(manipulator.getNumAt(3));
        System.out.println(manipulator.updateWordsListAt(6, "not valid"));
        System.out.println(manipulator.howLongLastWord());
        System.out.println(manipulator.updateWordsListAt(5, "valid"));
        System.out.println(manipulator.howLongLastWord());         



    }
}
