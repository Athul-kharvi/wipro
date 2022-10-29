import java.util.Arrays;

public class smallest {
    public static void main(String[] args) {
        int[] input={4,2};
     //expected output   [b,c,a];

        int counter=0,n=input.length;
        int[] copy=new int[n];
        int[] number=new int[n];
        char[] alpha=new char[n];

        for(int i=0;i<n;i++){
            copy[i]=input[i];
        }
        Arrays.sort(copy);

        for(int i=0;i<n;i++) {//finding the original smallest index value of the array
            for(int j=0;j<n;j++) {
                if(copy[i]==input[j]){
                    number[counter++]=j; // assigning the smallest index values
                }
            }
        }
        int bet=97;
        int cou=0;
       for(int i=0;i<n;i++) {
           for(int j=0;j<n;j++) {
               if(i==number[j]) {
                   alpha[j]=(char)(bet+cou++);
               }
           }
       }
        System.out.println("input element is ");
        System.out.println(Arrays.toString(input));
        System.out.println("result");
       System.out.println(Arrays.toString(alpha));


       // System.out.println(Arrays.toString(number));
    }
}
