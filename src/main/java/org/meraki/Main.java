package org.meraki;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     nums();
        System.out.println(endsWith("Hello", 'o'));
        System.out.println(endsWith("Hello", 'O'));
        System.out.println(endsWith("World", 'h'));
        System.out.println(endsWith("World", 'a'));
        digitSum("123");
        reverse("I love you");
        guessTheSquareRoot(2,4);
        guessTheSquareRoot(2,3);
        evenAndOdd(new int[] {5, 7, 2, 4, 9});
        multiply(new int [] { 1, 3, -5, 4},new int []{1, 4, -5, -2});
        containsDuplicates(new String[]{"Ali" , "MOMO", "Salma", "Ali"});
        removeDuplicates( new ArrayList<String>(Arrays.asList("Ali" , "MOMO", "Salma", "Ali")));
        removeElement(new int []{1,5,11,3,7},11);
        removeElement(new int []{1,5,11,3,4,7,9,13},13);
        removeElement(new int []{1,5,11,3,4,7,9,13},15);
        insertShiftArray(new int []{2,4,6,-8}, 5);
        insertShiftArray(new int[]{42, 8, 15, 23, 42}, 16);
        range(5,8);
        range(8, 5);
        sort(new int []{0, 1, 2, 3, 4, 5, 6});
    }

    public static void   nums(){
      int eq1 = -5 + 8 * 6;
      int eq2 = (55+9) % 9;
      int eq3 =20 + -3*5 / 8;
      int eq4 =5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(eq1);
        System.out.println(eq2);
        System.out.println(eq3);
        System.out.println(eq4);

    }

    public static boolean  endsWith (String str , char  charachter){
    int x = str.length()-1;
    char y= str.charAt(x);
    String b= String.valueOf(y).toLowerCase();
    String q=String.valueOf(charachter).toLowerCase();
        return b.equals(q);
    }

public static int digitSum (String num){
    String number = String.valueOf(num);

    int sum=0;
    char[] digits1 = number.toCharArray();

    for(int i = 0; i < digits1.length; i++) {
        System.out.println(digits1[i]);
        sum += digits1[i];
    }
    System.out.println(sum);
return 1 ;
}

public static void reverse (String rev){
    char[] try1 = rev.toCharArray();

    for (int i = try1.length - 1; i >= 0; i--){
        System.out.print(try1[i]);
}
}

public static void guessTheSquareRoot(int num , double square){
        if (num*num==square) System.out.println('\n'+"Correct");
        else {
            System.out.println("incorrect");
        }
}

public static void evenAndOdd (int [] arr ){
        int even=0 ;
        int odd =0;
        for (int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0) even++ ;
            else odd++;
        }
    System.out.println("Number of even elements in the array = "+ even +'\n'+"number of odd elements in the array= "+odd );
}


public static void multiply(int [] arr1 , int [] arr2){
    String result="";

        for (int i=0 ; i<arr1.length ; i++){
            int num1 =arr1[i];
            int num2 = arr2[i];
            result+= num1 * num2 +" " ;
        }
    System.out.println(result); }


public static void containsDuplicates(String [] duplicates){
    for (int i = 0; i < duplicates.length-1; i++)
    {
        for (int j = i+1; j < duplicates.length; j++)
        {
            if ((duplicates[i] == duplicates[j]) && (i != j))
            {
                System.out.println("Duplicate Element : "+duplicates[j]);
            }
        }
    }


}

public static void  removeDuplicates(ArrayList<String> arr){


        ArrayList <String> result = new ArrayList<String>(arr) ;
        for (int i=0 ; i< arr.size()-1 ; i++){

            for (int j = i+1 ; j < arr.size() ;j++ )
            {
                if ( arr.get(i) == arr.get(j) && (i != j))
                {
                    result.remove(arr.get(j));
                    System.out.println(result);
                }

            }
        }
}



    public static void removeElement(int [] arr , int num){
        ArrayList<Integer> result=new ArrayList<Integer>() ;

        for (int i=0 ; i<arr.length ;i++){
           result.add(arr[i]);
        }
        for (int i=0 ; i<result.size() ;i++){
            if (num==result.get(i)){
                result.remove(result.get(i));
            }
        }
        System.out.println(result);

    }

    public static void  insertShiftArray (int [] arr, int num){
        ArrayList<Integer> result=new ArrayList<Integer>() ;
        int leng =arr.length/2;

        for (int i=0 ; i<arr.length/2 ;i++){
               result.add(arr[i]);
        }
        result.add(num);
        for(int i=leng ; i<arr.length ;i++){
            result.add(arr[i]);
        }
        System.out.println(result);




    }

public static void range(int num1 , int num2){
    ArrayList<Integer> result=new ArrayList<Integer>() ;
    int start=0;
    int end=0;
    if (num1< num2 )
    {
        start=num1; end=num2;
    }else end=num2; start=num1;

     result.add(start);

     for (int i=start ; i<end ; i++){
         result.add(i++);
     }
    result.add(end);
    System.out.println(result);

}

public static void  sort (int [] arr){
        int  result =0;
       for (int i=0 ; i<arr.length;i++){
           for (int j=0 ; j<arr.length-1 ;j++){
               if(arr[i]<arr[j]) result=arr[j];
           }
           System.out.print(result+" ");
       }
}


}