import java.util.Vector;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Setting the length of the vectors

        int vec_len = 5;

        // Creating two vectors

        Vector<Double> v1 = new Vector <>();
        Vector<Double> v2 = new Vector <>();

        // Filling up the vectors with 100 random numbers
        // Creating two variables for storing the random values

        double rand_numb1;
        double rand_numb2;

        // Creating instance of Random class
        Random rand = new Random();

        for(int i = 0; i < vec_len; i++){

            // Generating random numbers
            rand_numb1 = rand.nextDouble();
            rand_numb2 = rand.nextDouble();

            // Filling up the vectors

            v1.add(rand_numb1);
            v2.add(rand_numb2);
        }

        // Creating new vector space

        Calculator calculator = new Calculator();

        // Setting the vectors

        calculator.setV1(v1);
        calculator.setV2(v2);

        // Printing the results

        System.out.printf("The first vector is " + calculator.getV1() + "\n");
        System.out.printf("The second vector is " + calculator.getV2() + "\n");
        System.out.printf("The addition is  " + calculator.getAddition_vector() + "\n");
    }
}
