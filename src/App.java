public class App {
    public static void main(String[] args) throws Exception {
        Reader bob = new Reader();

        int num1 = Methods.randInt(1, 10);
        int num2 = Methods.randInt(1, 10);

        int ans1 = num1 + num2;
        
        
        

        int correct = 0;
        int attempt = 0;

        
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int guess = bob.getInt("your guess: ");
        attempt++;
        if (guess == ans1) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect:"+ (num1 + num2));
        }
        System.out.println("score: " + correct + "/" + attempt);

       num1 = Methods.randInt(1, 10);
       num2 = Methods.randInt(1, 10);
        int ans2 = num1 - num2;

        System.out.println("What is " + num1 + " - " + num2 + " ?");
        guess = bob.getInt("your guess: ");
        attempt++;
        if (guess == ans2) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect:"+ (num1 - num2));
        }
        System.out.println("score: " + correct + "/" + attempt);
        num1 = Methods.randInt(1, 10);
       num2 = Methods.randInt(1, 10);
        int ans3 = num1 * num2;
        System.out.println("What is " + num1 + " * " + num2 + " ?");
        guess = bob.getInt("your guess: ");
        attempt++;
        if (guess == ans3) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect:"+ (num1 * num2));
        }
        System.out.println("score: " + correct + "/" + attempt);

num1 = Methods.randInt(1, 10);
num2 = Methods.randInt(1, 10);

double ans4 = (double) num1 / num2; 
ans4 = Math.round(ans4 * 100.0) / 100.0;  //2deci

System.out.println("What is " + num1 + " / " + num2 + " ?");
double guessDouble = bob.getDouble("Your guess: ");


guessDouble = Math.round(guessDouble * 100.0) / 100.0;

attempt++;

if (guessDouble == ans4) {
    correct++;
    System.out.println("Correct!!");
} else {
    System.out.println("Incorrect! The correct answer is " + ans4);
}

System.out.println("Score: " + correct + "/" + attempt);

        num1 = Methods.randInt(1, 10);
       num2 = Methods.randInt(1, 10);
       int ans5 = num1 % num2;
    
        System.out.println("What is " + num1 + " % " + num2 + " ?");
        guess = bob.getInt("your guess: ");
        attempt++;
        if (guess == ans5) {
            correct++;
            System.out.println("correct!!");
        } else {
            System.out.println("incorrect:"+ (num1 % num2));
        }
        System.out.println("Final score: " + correct + "/" + attempt);
    }
}

