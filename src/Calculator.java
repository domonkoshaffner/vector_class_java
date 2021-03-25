import java.util.Vector;

public class Calculator {


    // Initialising the vectors

    private Vector<Double> v1 = new Vector <>();
    private Vector<Double> v2 = new Vector <>();

    // Method for setting the vectors

    public void setV1(Vector<Double> v1){
        this.v1 = v1;
    }

    public void setV2(Vector<Double> v2){
        this.v2 = v2;
    }

    // Initialising new vectors for different vector operations
    // New variable for the size of the vectors

    private int size_of_vectors = v1.size();
    private Vector<Double> addition_vector = new Vector <>(size_of_vectors);
    private Vector<Double> temp = new Vector <>(size_of_vectors);


    // Method for Addition

    public void setAddition_vector(int size_of_vectors, Vector<Double> temp, Vector<Double> v1, Vector<Double> v2) {

        for(int i = 0; i < size_of_vectors; i++){
            temp.set(i, v1.get(i) + v2.get(i));
        }

        this.addition_vector = temp;
    }



    // Getting the results

    public Vector<Double> getV1(){
        return this.v1;
    }

    public Vector<Double> getV2(){
        return this.v2;
    }

    public Vector<Double> getAddition_vector(){

        setAddition_vector(size_of_vectors, temp, v1, v2);

        return this.addition_vector;
    }

}