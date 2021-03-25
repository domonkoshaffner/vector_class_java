import java.util.Vector;

public class Calculator {

    // Initialising the vector size

    public int size_of_vectors = 5;

    // Calling the first method to set the vector size

    //public void setSize_of_vectors(int size_of_vectors){
    //    this.size_of_vectors = size_of_vectors;
    //}

    //public int getSize_of_vectors(){
    //    return this.size_of_vectors;
    //}

    // Initialising the vectors

    private double v1[] = new double[size_of_vectors];
    private double v2[] = new double[size_of_vectors];

    private double addition_vector[] = new double[size_of_vectors];
    private double subtraction_vector[] = new double[size_of_vectors];

    private double temp[] = new double[size_of_vectors];


    //########################### METHODS

    // Method for setting the vectors

    public void setV1(double[] v1){
        this.v1 = v1;
    }

    public void setV2(double[] v2){
        this.v2 = v2;
    }


    // Method for Addition

    public void setAddition_vector(int size_of_vectors, double[] temp, double[] v1, double[] v2) {

        for(int i = 0; i < size_of_vectors; i++){
            temp[i] =  v1[i] + v2[i];
        }

        this.addition_vector = temp;
    }


    // Method for Subtraction

    public void setSubtraction_vector(int size_of_vectors, double[] temp, double[] v1, double[] v2) {

        for(int i = 0; i < size_of_vectors; i++){
            temp[i] =  v1[i] - v2[i];
        }

        this.subtraction_vector = temp;
    }


    //########################### GETTING THE RESULTS

    // Getting v1

    public double[] getV1() {
        return this.v1;
    }


    // Getting v2

    public double[] getV2(){
        return this.v2;
    }


    // Getting the addition vector

    public double[] getAddition_vector(){

        setAddition_vector(size_of_vectors, temp, v1, v2);

        return this.addition_vector;
    }


    // Getting the subtraction vector

    public double[] getSubtraction_vector(){

        setSubtraction_vector(size_of_vectors, temp, v1, v2);

        return this.subtraction_vector;
    }

}