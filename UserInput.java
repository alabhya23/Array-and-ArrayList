// Name: Alabhya Sharma
// PRN: 23070126010
// Branch:AIML-A1
// Batch:2023-27

import java.util.*;

class UserInput {
    // Accept an array of numbers from the user
    int[] arrayInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }
}
