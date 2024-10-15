package Data_Structures;
import java.util.Stack;
public class Stacks {

    public static void main(String[] args) {
        /*
         * Stack = LIFO data strucure (Last-in First-out)
         * stores objects into a sort of "vertical tower"
         * push() to add to the top 
         * pop() to remove from the top
         * peek() views the top of the stack
         * You can assign a variable to stack.pop()
         * search() searchs for the position of an item in the stack
         * 
         * It is possible to run out of memory in a stack
         */
        Stack<String> stack = new Stack<String>();

        stack.push("Pokemon");
        stack.push("Minecraft");
        stack.push("FFVII");

        System.out.println(stack);
        System.out.println(stack.search("Pokemon"));
        
        String FavGame = stack.pop();

        System.out.println(FavGame);
        
        stack.pop();
        stack.pop();

        System.out.println(stack);


    }
    
}