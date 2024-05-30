import java.util.Arrays;

class Main {
    
    public static void main(String[] args) {
        // if else
        String nameHello = "azerty";
        ifElseFun(nameHello);

        // modulo 
        int fizzBuzzNum = 15;
        FizzBuzz(fizzBuzzNum);
        
        // arrays
        int[] arr = {1,9,2,3,4};
        sum2index(arr, 1, 3);

    }

    public static void ifElseFun(String nameHello){
        if (nameHello.length() >5) {
            System.out.println("Hello "+ nameHello + " long");
            
        }
        else if (nameHello.length() > 0){
            System.out.println("Hello "+ nameHello + " medium");

        }
        else {
            
            System.out.println("Hello "+ nameHello + " short");
        }


        for (int i =0; i < nameHello.length(); i++){
            System.out.println(nameHello.toCharArray()[i]);
        }
    }

    public static void FizzBuzz(int fizzBuzzNum){
        if (fizzBuzzNum%3 == 0 || fizzBuzzNum%5 == 0) {
            if (fizzBuzzNum%3 == 0){
                System.out.println("Fizz ");
            }


            if (fizzBuzzNum%5 == 0) {
                System.out.println("Buzz ");
            }
        }
        else{
            System.out.println(fizzBuzzNum);
        }
    }


    // index déjà existant ? // push array
    public static void sum2index(int[] arr, int k, int j){
        int[] stepArray = new int[j-k+1]; 
        int sum = 0;
        int index = 0;
        for (int i = k;i <= j; i++){
            sum += arr[i];
            stepArray[index] = sum;
            index++;
        }
        
        System.out.println("Sum of values form the array "+sum);
        System.out.println("Step array :"+Arrays.toString(stepArray));
    }
}