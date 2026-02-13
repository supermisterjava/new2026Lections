package lection.lections;

import java.util.Arrays;

public class Lec5 {
    public static void main(String[] args) {
        int[] array1 ={5, 4};
        int[] array2 ={5, 4};
        int[] array3 = array1;

//        int[] array2 = array1;
        System.out.println(array1 == array2);
        System.out.println(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] +1);
            System.out.println("_________---");
            System.out.println(array2[i]);

//            System.out.println(array1[i]);
//            System.out.println("++++++");
//            System.out.println(array1[i] ++);
        }




        //        char c = 'A';
//        int b = 65;
//
//        System.out.println((char) b);
//        System.out.println((int) c + 1);
//        System.out.println((int) c);


    }

}
