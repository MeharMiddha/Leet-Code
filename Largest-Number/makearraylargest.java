import java.util.*;

public class makearraylargest {
    public static void main(String[] args) {
        int arr[] = { 54, 546, 548, 60 };

        String str1 = "";
        String str2 = "";
        for (int i = 0; i < arr.length; i++) {
            str1 = "";
            str2 = "";
            for (int j = i + 1; j < arr.length; j++) {
                str1 = "";
                str2 = "";
                str1 += arr[i];
                str1 += arr[j];
                str2 += arr[j];
                str2 += arr[i];
                int n1 = Integer.parseInt(str1);
                int n2 = Integer.parseInt(str2);
                if (n2 > n1) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
