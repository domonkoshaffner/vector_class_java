import java.util.Random;

public class Vector_gen_print {

    // Generating the vector

    public static double[] vector_generator(int vec_len) {

        // Creating two vectors

        double vector[] = new double[vec_len];

        // Filling up the vectors with 100 random numbers
        // Creating two variables for storing the random values

        double rand_numb1;

        // Creating instance of Random class
        Random rand = new Random();

        for (int i = 0; i < vec_len; i++) {

            // Generating random numbers
            rand_numb1 = rand.nextDouble();

            // Filling up the vectors

            vector[i] = rand_numb1;
        }

        return vector;
    }


    // Printing the vector

    public static void vector_print(String message, double[] vector){

        System.out.printf(message + " [" + vector[0]);
        for(int i = 1; i < vector.length; i++){
            System.out.printf(", " + vector[i]);
        }
        System.out.printf("]\n");

    }

}
