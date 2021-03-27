import java.util.Random;

public class Vector_gen_print {

    // Generating random vector

    public static double[] vector_generator(int vec_len) {

        // Creating a vector

        double vector[] = new double[vec_len];

        // Filling up the vector with random numbers
        // Creating a variable for storing the random values

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

    public static void vector_print(String message, double[] vector) {

        System.out.printf(message + " [" + vector[0]);
        for(int i = 1; i < vector.length; i++){
            System.out.printf(", " + vector[i]);
        }
        System.out.printf("]\n");

    }


    // Rounding the vector to arbitrary decimals

    public static double[] round_vector(double[] vector, int places) {

        double scale = Math.pow(10, places);
        double[] results_vec = new double[vector.length];

        for(int i = 0; i < vector.length; i++) {

            results_vec[i] = Math.round(vector[i] * scale) / scale;

        }

        return results_vec;
    }


    // Rounding the scalar to arbitrary decimals

    public static double round_scalar(double num, int places) {

        double scale = Math.pow(10, places);

        return Math.round(num * scale) / scale;

    }

}
