public class IT24102346Lab7Q2B {
    public static void main(String[] args) {
       
        for (int i = 1; i <= 5; i++) {
            // Print the number
            System.out.print(i + " - ");
            
            
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
    }
}
