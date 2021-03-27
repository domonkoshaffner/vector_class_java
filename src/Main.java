import java.lang.*;

public class Main {

    public static void main(String[] args) {

        //######## Measuring the time

        // Starting the clock
        double time_start = System.nanoTime();

        //######## Generating the arrays

        // Setting the sizes of arrays
        int vec_len = 5;
        int matrix_rows = 5;
        int matrix_columns = 5;

        // Setting the value to round the arrays
        int decimal_to_round = 2;

        // Creating two vectors
        double v1[] = Vector_gen_print.vector_generator(vec_len);
        double v2[] = Vector_gen_print.vector_generator(vec_len);

        // Generating random matrix
        double m1[][] = Matrix_gen_print.matrix_generator(matrix_rows, matrix_columns);
        // Rounding the matrix
        double m1_rounded[][] = Matrix_gen_print.round_matrix(m1, decimal_to_round, matrix_rows, matrix_columns);


        //######## Calling the methods

        // Creating new vector space
        Calculator calculator = new Calculator();

        // Setting the vector size
        //calculator.setSize_of_vectors(vec_len);

        // Setting the vectors
        calculator.setV1(v1);
        calculator.setV2(v2);


        //######## Printing the results


        // Printing the result vectors
        // Rounding up the resulted vector to 2 decimals after the calculations

        Vector_gen_print.vector_print("The first vector:", Vector_gen_print.round_vector(calculator.getV1(), decimal_to_round));
        Vector_gen_print.vector_print("The second vector:", Vector_gen_print.round_vector(calculator.getV2(), decimal_to_round));

        Vector_gen_print.vector_print("The addition vector:", Vector_gen_print.round_vector(calculator.getAddition_vector(), decimal_to_round));
        Vector_gen_print.vector_print("The subtraction vector:", Vector_gen_print.round_vector(calculator.getSubtraction_vector(), decimal_to_round));
        Vector_gen_print.vector_print("The component-wise multiplication vector:", Vector_gen_print.round_vector(calculator.getComp_multiplication(), decimal_to_round));
        Vector_gen_print.vector_print("The component-wise division vector:", Vector_gen_print.round_vector(calculator.getComp_division(), decimal_to_round));

        System.out.printf("The dot product: " + Vector_gen_print.round_scalar(calculator.getDot_product(), decimal_to_round) + "\n\n");

        // Printing the result matrices

        Matrix_gen_print.matrix_print("The rounded m1 matrix: ", m1_rounded, matrix_rows, matrix_columns);



        // Stopping the clock
        double time_end = System.nanoTime();
        // Calculating the time difference
        double time_diff = Vector_gen_print.round_scalar((time_end - time_start) / 1e9, 3);
        // Printing the elapsed time
        System.out.print("\nThe elapsed time: " + time_diff + " s.");

    }
}
