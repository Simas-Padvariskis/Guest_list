import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[11];
        numbers[0] = 5;
        numbers[1] = 5;
        numbers[2] = 5;
        numbers[3] = 5;
        numbers[4] = 5;
        numbers[5] = 5;
        numbers[6] = 5;
        numbers[7] = 5;
//        String[] students = {"Jonas", "Tadas", "Ieva", "Toma"};
//        for (int i = 0; i < students.length; i++){
//            System.out.println(students[i]);
//        }
//        for (String student : students){
//            System.out.println(student);
//        }
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = new Random().nextInt(100);
        }
//        System.out.println(Arrays.toString(numbers));

//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//
//        boolean[] statusCodes = new boolean [10];
//        System.out.println(Arrays.toString(statusCodes));
//        String[] users = new String[5];
//        System.out.println(Arrays.toString(users));
//        char[] letters = new char[5];
//        System.out.println(Arrays.toString(letters));
//        double[] values = new double [8];
//        System.out.println(Arrays.toString(values));


//        int[] list = new int[4];
//        list = Arrays.copyOf(numbers, 4);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(list));
//
//        int[] moreNumbers = new int [8];
//        Arrays.fill(moreNumbers, 8);
//        System.out.println(Arrays.toString(moreNumbers));

//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        String[] users = {"Tadas", "Tomas", "Migle", "Toma"};
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));
        if (Arrays.binarySearch(users, "Toma") >= 0){
            System.out.println("Found user in the list ");
        }

    }
}