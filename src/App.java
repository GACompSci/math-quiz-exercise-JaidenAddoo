public class App {
public static void main(String[] args) throws Exception{
    Reader bob = new Reader();
    int num1 = Methods.randInt(1, 10);
    int num2 = Methods.randInt(1, 10);
    int ans1 = num1+num2;
    int ans2 = num1-num2;
    int ans3 = num1*num2;
    int ans4 = num1/num2;
    int ans5 = num1%num2;
    double a = Methods.randInt(1,10);
    double b = Methods.randInt(1,10)
    System.out.println("What is " + num1 + " + " + num2 + " ?"); 
    int guess =  bob.getInt("your guess: ");


int correct = 0;
int attempt = 0;
    if (guess == ans1){
        correct += 1;
        attempt +=1;
        System.out.println("correct!!");
        System.out.println("score: " + correct + "/"+ attempt);
        

    System.out.println("What is " + num1 + " - " + num2 + " ?"); 
    int guess =  bob.getInt("your guess: ");

        if (guess == ans2){
            correct += 1;
            attempt +=1;
            System.out.println("correct!!");
            System.out.println("score: " + correct + "/"+ attempt);
        System.out.println("What is " + num1 + " * " + num2 + " ?"); 
        int guess =  bob.getInt("your guess: ");

            if (guess == ans3){
                correct += 1;
                attempt +=1;
                System.out.println("correct!!");
                System.out.println("score: " + correct + "/"+ attempt);
                System.out.println("What is " + num1 + " * " + num2 + " ?"); 
                int guess =  bob.getInt("your guess: ");

                if (guess == ans3){
                    correct += 1;
                    attempt +=1;
                    System.out.println("correct!!");
                    System.out.println("score: " + correct + "/"+ attempt);
                    System.out.println("What is " + num1 + " / " + num2 + " ?"); 
                    System.out.println(guess);
                        System.out.println("What is " + num1 + " * " + num2 + " ?"); 
                        int guess =  bob.getInt("your guess: ");
                        if (guess == ans4){
                            correct += 1;
                         attempt +=1;
                            System.out.println("correct!!");
                            System.out.println("score: " + correct + "/"+ attempt);
                            if (guess == ans5){
                            correct += 1;
                         attempt +=1;
                            System.out.println("correct!!");
                            System.out.println("score: " + correct + "/"+ attempt);
                    
                
                
                }       else{
                            System.out.println("incorrect");
                            System.out.println(correct + "/" + attempt);

                }
                    
                
                
                }       else{
                            System.out.println("incorrect");
                            System.out.println(correct + "/" + attempt);

                }
                    
                
                
                }    else{
                    System.out.println("incorrect");
                    System.out.println(correct + "/" + attempt);

                }
                
            
            
            }    else{
                System.out.println("incorrect");
                System.out.println(correct + "/" + attempt);

            }
            
        
        
        }    else{
            System.out.println("incorrect");
            System.out.println(correct + "/" + attempt);

        }
    
    
    }    else{
        System.out.println("incorrect");
        System.out.println(correct + "/1");

    }
        

}
}
