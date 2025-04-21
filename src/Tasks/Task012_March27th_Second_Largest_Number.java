package Tasks;

public class Task012_March27th_Second_Largest_Number {
    public static void main(String[] args) {
        int[] arr = {10,25,30,5,20};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if ( arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest : " + secondLargest);
    }
}
