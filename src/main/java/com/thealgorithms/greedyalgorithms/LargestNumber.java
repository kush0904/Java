
import java.util.Arrays;

public class LargestNumber {

    public static String findLargestNumber(int[] numbers){

        String[] sArray = new String[numbers.length];

        for(int i = 0;i < numbers.length; i++){
            sArray[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(sArray, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));

        if(sArray[0].equals("0")){
            return "0";
        }


        // Concatenate the sorted string to form the largest number
        StringBuilder largestNumber = new StringBuilder();

        for(String num : sArray){
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {43,12,6,2,9,0};
        String largestNumber = findLargestNumber(numbers);
        System.out.println("Largest Number: " + largestNumber);
    }
}
