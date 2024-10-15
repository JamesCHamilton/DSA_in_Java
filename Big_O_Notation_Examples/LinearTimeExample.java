package Big_O_Notation_Examples;
public class LinearTimeExample {

    /*
     *      O(n)
     *  
     * As the amount of "n"(the data we pass in) increases, the amount of steps also increases
     * this is because the for() runs for each individual data point we pass in 
     * 
     * This creates a Linear Time. meaning the amount of steps is proportional to the amount of data passed in 
     */
    
    //returns the value of all the numbers passed in Ex: addup(5) = 15 because 5+4+3+2+1 = 15
    public static int addup(int n ){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        addup(500);
    }
    
}
