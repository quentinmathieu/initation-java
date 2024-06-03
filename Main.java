import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static String sep = "========================================="; 
    
    public static void main(String[] args) {
        
        // init reader for user prompt
        Scanner reader = new Scanner(System.in);

        // if else
        String nameHello = "azerty";
        ifElseFun(nameHello);

        // modulo 
        int fizzBuzzNum = 15;
        fizzBuzz(fizzBuzzNum);
        
        // /// arrays ///////////////////
        // int[] arr = {1,9,2,3,4};
        

        // // ask user to enter 2 number
        // System.out.println("Enter a number: ");
        // int k =  reader.nextInt();
        // System.out.println("Enter a number: ");
        // int j =  reader.nextInt();

        // sum2index(arr, k, j);
        // //////////////////////////////
        
        
        String[] arrNames = {"Ada", "Charles", "Aaron", "Margaret", "Linus", "Grace"};
        shuffleArray(arrNames);
        displayArrayToMultipleTuples(arrNames);



        // close de prompt's reader
        reader.close();
    }

    // est-ce que le type retourné est-il bon ?
    public static String[][] displayArrayToMultipleTuples (String[] arrNames){
        // only works for group of 2 ATM
        int groupSize = 2;
        
        // init the returned array with the right people number
        int lengthNewArray = (arrNames.length + groupSize - 1) / groupSize;
        String[][] newArray = new String [lengthNewArray][];
        System.out.println(Main.sep);
        for (int i = 0; i < arrNames.length; i+=groupSize){

            /////////////////////////////////////////////////////////////////////////////////
            /////// pour le nouveau tableau utiliser une liste plutôt qu'un tableau ?////////
            /////////////////////////////////////////////////////////////////////////////////

            if ((i+1) == arrNames.length){
                String[] cellArray = {arrNames[i]};
                newArray[(i + groupSize - 1) / groupSize] = cellArray;
                System.out.println(Arrays.toString(cellArray));
            }
            
            else{
                String[] cellArray = {arrNames[i], arrNames[i+1]};
                newArray[(i + groupSize - 1) / groupSize] = cellArray;
                System.out.println(Arrays.toString(cellArray));
            }

            

            ////////////////////////////////////////////////////
            /////// Comment faire fonction ce ternaire ?////////
            ////////////////////////////////////////////////////

            // String[] cellArray = ((i+1) == arrNames.length)
            // ?  {arrNames[i]}
            // :  {arrNames[i], arrNames[i+1]};
        }
        return newArray;
    }

    public static void ifElseFun(String nameHello){
        System.out.println(Main.sep);
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

    public static void fizzBuzz(int fizzBuzzNum){
        System.out.println(Main.sep);
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
    public static void sum2index(int[] arr, int i, int j){
        System.out.println(Main.sep);

        // init a new array for the steps with the right cells amount
        int[] stepArray = new int[j-i+1]; 

        int sum = 0;
        int index = 0;
        for (;i <= j; i++){
            sum += arr[i];
            stepArray[index] = sum;
            index++;
        }
        
        System.out.println("Sum of values form the array "+sum);
        System.out.println("Step array :"+Arrays.toString(stepArray));
    }

    static void shuffleArray(String[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
        int index = rnd.nextInt(i + 1);
        // Simple swap
        String a = ar[index];
        ar[index] = ar[i];
        ar[i] = a;
        }
    }

      
}