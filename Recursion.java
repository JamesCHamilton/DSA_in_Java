public class Recursion {
    /*
     * Recursion = When a thing is defined in terms of itself - Wikipedia
     * Apply the result of a procedure, to a procedure.
     * A recursuve methods calls itself. Can be a substitute for iteration.
     * Divide a problem into sub-problems of the same type as the original.
     * Commonly used with advanced sorting algorithms and navigating trees
     * 
     * Advantages:
     *      easier to read/write
     *      easier to debug
     * 
     * Disadvantages:
     *      sometimes slower
     *      uses more memory
     */

     public static void main(String[] args) {
        walk(5);
        recursiveWalk(5);
     }

     private static void walk(int steps){
        //iterative walk method
        for(int i = 0; i< steps; i++){
            System.out.println("You have taken a step");
        }
     }

     private static void recursiveWalk(int steps){
        //recurive method
        if(steps < 1) return;
        System.out.println("You take a step");
        walk(steps-1);
     }
}
