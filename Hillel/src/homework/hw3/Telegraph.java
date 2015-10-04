package homework.hw3;

public class Telegraph {
    public static void main(String[] args) {
        double cost = 7.5;
        String message = "Hello world!";
        String[] words = message.split("");
        System.out.println("In the message: "+words.length+" symbols.");
        System.out.println("The cost of paying for a telegram: " +
                +words.length*cost+" tugricov");
    }
}
