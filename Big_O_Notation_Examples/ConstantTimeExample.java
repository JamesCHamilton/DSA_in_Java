package Big_O_Notation_Examples;

public class ConstantTimeExample {
    /*
     * O(1) *Technically this is O(3) but since we do not care about smaller operations like O(1+2) 
     * (because it doesnt make much of a difference) we shorten it to O(1)
     * 
     * regardless of input size the amount of steps to complete the program will always be the same (3 steps; add,multiply,divide)
     * 
     * It doesnt matter how big the amount of data is because it doesnt interfere with the amount of steps like it would in a for()
     */
    //returns the value of all the numbers passed in Ex: addup(5) = 15 because 5+4+3+2+1 = 15
    public static int addup(int n){
        int sum = n * (n+1) / 2;
        return sum;
    }
    public static void main(String[] args) {
        addup(500);
    }
}
