/*
* 1. create a for loop
* 2. add each elements
* 3, print the sum */
public class creatArray {
    public static void main(String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
        int sum = 0;

// Declare sum variable, assign it initial value of zero
        for (int i = 0; i <10; i++){
            sum += numbers[i];
        }
        System.out.println("The sum is: " + sum);
    }}
