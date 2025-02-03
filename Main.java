// Name: Alabhya Sharma
// PRN: 23070126010
// Branch: AIML-A1
// Batch: 2023-27

class Main {
    public static void main(String args[]) {
        UserInput ui = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        int[] userArray = ui.arrayInput();

        functions.evenOdd(userArray);
        functions.findMinAndIndex(userArray);
        int index = functions.findSmallestDistanceIndex(userArray);
        System.out.println("Index of first number with smallest distance: " + index);
        functions.convertArrayToArrayList(userArray);
    }
}
