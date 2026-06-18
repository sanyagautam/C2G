import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String t=sc.next();
        if(t=="Red"){
            System.out.println("Stop");
        }
        else if(t=="Yellow"){
            System.out.println("Wait");
        }        
        else if(t=="Green"){
            System.out.println("Go");
        }
    }
}