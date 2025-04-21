package Tasks;

public class Task013_March27th_Odd_And_Even_Array {
    public static void main(String[] args) {
        int[] arr = {10,23,45,66,77,80};

        System.out.println("For Loop : ");
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0){
                System.out.println("Even Number :" + arr[i]);
            }else {
                System.out.println("Odd Number :" + arr[i]);
            }
        }

        System.out.println("-----------------------");
        int [] arr1 = {5, 41, 65, 37, 23, 83, 9, 8};
        System.out.println("For Each Loop :");
        for ( int num : arr1){
            if (num % 2 == 0) {
                System.out.println("Even Number : " + num);
            } else {
                System.out.println("Odd Number : " + num);
            }
        }
    }
}
