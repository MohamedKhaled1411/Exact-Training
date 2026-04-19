package Lab4;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] arrEven = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrOdd = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverseArray(arrEven);
        reverseArray(arrOdd);
    }

    public static void reverseArray(int[] arr)
    {
        for (int i = 0; i < arr.length/2; i++)
        {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }

        for (int item : arr)
        {
            System.out.print(item + ", ");
        }
        System.out.println("\n");
    }
}
