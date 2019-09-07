import java.util.Scanner;

public class ArraySolution {

    public static void reverseArray(int array[]){
        System.out.print("Your array is\t");
        for(int i=(array.length-1);i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args){
            System.out.println("Enter an arraysize");
            Scanner input = new Scanner(System.in);
            int arraySize = input.nextInt();
            int myArray[] = new int[arraySize];
            System.out.println("Enter your "+arraySize+" array elements");
            for (int i=0;i<arraySize;i++){
                myArray[i]=input.nextInt();
            }
            reverseArray(myArray);
    }
}
