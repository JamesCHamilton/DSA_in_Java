public class CalculatingExecutionTime {
    public static void main(String[] args) throws InterruptedException{
        long startTime = System.nanoTime();

        // -------- program --------

        Thread.sleep(3000);

        //--------------------------
         long elapsedNanos = (System.nanoTime() - startTime)/1_000_000;
        System.out.println(elapsedNanos + "ms");
    }
}
