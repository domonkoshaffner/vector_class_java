import java.util.Random;

public class Matrix_gen_print {

    // Generating random matrix

    public static double[][] matrix_generator(int rows, int columns) {

        // Creating two vectors

        double matrix[][] = new double[rows][columns];

        // Filling up the matrix with random numbers
        // Creating a variable for storing the random values

        double rand_numb1;

        // Creating instance of Random class
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){

                // Generating random numbers
                rand_numb1 = rand.nextDouble();

                // Filling up the vectors

                matrix[i][j] = rand_numb1;
            }
        }
        return matrix;
    }

    // Printing the matrix

    public static void matrix_print(String message, double[][] matrix, int rows, int columns) {

        System.out.printf(message + " \n[");

        for(int i = 0; i < rows; i++){

            System.out.printf("[" + matrix[i][0]);
            for(int j = 1; j < columns; j++){
                System.out.printf(", " + matrix[i][j]);
            }
            if(i == rows-1){System.out.printf("]]\n");}
            else{System.out.printf("]\n");}
        }
    }


    // Rounding the matrix to arbitrary decimals

    public static double[][] round_matrix(double[][] matrix, int places, int rows, int columns) {

        double scale = Math.pow(10, places);
        double[][] results_matrix = new double[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j ++) {
                results_matrix[i][j] = Math.round(matrix[i][j] * scale) / scale;
            }
        }
        return results_matrix;
    }

}
