import java.util.Random;

public class Main {

    public static void main(String[] args) {

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

        // Printing the result vectors
        Vector_gen_print.vector_print("The first vector:", calculator.getV1());
        Vector_gen_print.vector_print("The second vector:", calculator.getV2());
        Vector_gen_print.vector_print("The addition vector:", calculator.getAddition_vector());
        Vector_gen_print.vector_print("The subtraction vector:", calculator.getSubtraction_vector());

    }
}
