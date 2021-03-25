import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //######## Creating the vectors

        // Setting the length of the vectors

        int vec_len = 5;

        // Creating two vectors

        double v1[] = new double[vec_len];
        double v2[] = new double[vec_len];

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

            v1[i] = rand_numb1;
            v2[i] = rand_numb2;
        }


        //######## Calling the methods

        // Creating new vector space

        Calculator calculator = new Calculator();

        // Setting the vector size

        //calculator.setSize_of_vectors(vec_len);

        // Setting the vectors

        calculator.setV1(v1);
        calculator.setV2(v2);


        //######## Printing the results


        // Printing the first vector

        System.out.printf("The first vector: [" + calculator.getV1()[0]);
        for(int i = 1; i < vec_len; i++){
            System.out.printf(", " + calculator.getV1()[i]);
        }
        System.out.printf("]\n");


        // Printing the second vector

        System.out.printf("The second vector: [" + calculator.getV2()[0]);
        for(int i = 1; i < vec_len; i++){
            System.out.printf(", " + calculator.getV2()[i]);
        }
        System.out.printf("]\n");


        // Printing the addition vector

        System.out.printf("The addition vector: [" + calculator.getAddition_vector()[0]);
        for(int i = 1; i < vec_len; i++){
            System.out.printf(", " + calculator.getAddition_vector()[i]);
        }
        System.out.printf("]\n");


        // Printing the subtraction vector

        System.out.printf("The subtraction vector: [" + calculator.getSubtraction_vector()[0]);
        for(int i = 1; i < vec_len; i++){
            System.out.printf(", " + calculator.getSubtraction_vector()[i]);
        }
        System.out.printf("]\n");
    }
}
