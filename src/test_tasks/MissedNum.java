package test_tasks;

public class MissedNum {

    public static void main(String[] args) {
        //We can use for
        for (int i = 1; i <= 100; i++) {
            String numbers;
            if (i % 2 == 0 && i % 7 == 0) {
                numbers = "TwoSeven";
            } else if  (i % 2 == 0) {
                numbers = "Two";}
            else if (i % 7 == 0) {
                numbers = "Seven";
            } else {
                numbers = String.valueOf(i);
            }
            System.out.println(numbers + " ");
        }
//        for (int i = 1; i <= 100; i++) {
//            String numbers;
//            numbers = (i % 2 == 0 && i % 7 == 0) ? numbers = "TwoSeven" :i % 2 == 0 ? numbers = "Two" : i % 7 == 0 ? numbers = "Seven" : String.valueOf(i);
//            System.out.print(numbers + " ");
//        }
    }

}