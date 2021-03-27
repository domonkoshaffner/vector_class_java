import java.lang.*;

public class Main {

    public static void main(String[] args) {

        //######## Measuring the time

        // Starting the clock
        double time_start = System.nanoTime();

        //######## Creating the vectors

        // Setting the length of the vectors
        int vec_len = 5;

        // Creating two vectors
        double v1[] = Vector_gen_print.vector_generator(vec_len);
        double v2[] = Vector_gen_print.vector_generator(vec_len);


        //######## Calling the methods

        // Creating new vector space
        Calculator calculator = new Calculator();

        // Setting the vector size
        //calculator.setSize_of_vectors(vec_len);

        // Setting the vectors
        calculator.setV1(v1);
        calculator.setV2(v2);


        //######## Printing the results

        int decimal_to_round = 2;

        // Printing the result vectors
        // Rounding up the resulted vector to 2 decimals after the calculations

        Vector_gen_print.vector_print("The first vector:", Vector_gen_print.round_vector(calculator.getV1(), decimal_to_round));
        Vector_gen_print.vector_print("The second vector:", Vector_gen_print.round_vector(calculator.getV2(), decimal_to_round));

        Vector_gen_print.vector_print("The addition vector:", Vector_gen_print.round_vector(calculator.getAddition_vector(), decimal_to_round));
        Vector_gen_print.vector_print("The subtraction vector:", Vector_gen_print.round_vector(calculator.getSubtraction_vector(), decimal_to_round));
        Vector_gen_print.vector_print("The component-wise multiplication vector:", Vector_gen_print.round_vector(calculator.getComp_multiplication(), decimal_to_round));
        Vector_gen_print.vector_print("The component-wise division vector:", Vector_gen_print.round_vector(calculator.getComp_division(), decimal_to_round));

        System.out.printf("The dot product: " + Vector_gen_print.round_scalar(calculator.getDot_product(), decimal_to_round) + "\n");

        // Stopping the clock
        double time_end = System.nanoTime();
        // Calculating the time difference
        double time_diff = Vector_gen_print.round_scalar((time_end - time_start) / 1e9, 3);
        // Printing the elapsed time
        System.out.print("\nThe elapsed time: " + time_diff + " s.");

    }
}
