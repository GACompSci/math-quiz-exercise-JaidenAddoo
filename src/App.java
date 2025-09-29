public class App {
    public static void main(String[] args) throws Exception {
        Reader bob = new Reader();

        int num1 = Methods.randInt(1, 10);
        int num2 = Methods.randInt(1, 10);

        int ans1 = num1 + num2;
        int ans2 = num1 - num2;
        int ans3 = num1 * num2;
        double ans4 = (double) num1 / num2; // cast to double
        int ans5 = num1 % num2;

        int correct = 0;
        int attempt = 0;

        
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int guess = bob.getInt("your guess: ");
        attempt++;
        if (guess == ans1) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect.");
        }
        System.out.println("score: " + correct + "/" + attempt);

       
        System.out.println("What is " + num1 + " - " + num2 + " ?");
        guess = bob.getInt("your guess: ");
        attempt++;
        if (guess == ans2) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect.");
        }
        System.out.println("score: " + correct + "/" + attempt);

        
        System.out.println("What is " + num1 + " * " + num2 + " ?");
        guess = bob.getInt("your guess: ");
        attempt++;
        if (guess == ans3) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect.");
        }
        System.out.println("score: " + correct + "/" + attempt);

        
        System.out.println("What is " + num1 + " / " + num2 + " ?");
        double guessDouble = bob.getDouble("your guess: "); 
        attempt++;
        if (guessDouble == ans4) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect.");
        }
        System.out.println("score: " + correct + "/" + attempt);

    
        System.out.println("What is " + num1 + " % " + num2 + " ?");
        guess = bob.getInt("your guess: ");
        attempt++;
        if (guess == ans5) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect.");
        }
        System.out.println("Final score: " + correct + "/" + attempt);
    }
}

