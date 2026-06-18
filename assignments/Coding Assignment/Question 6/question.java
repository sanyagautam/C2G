import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ndata=0;
        if(a<2){
            ndata=ndata+a;
        }
        else if(a>2){
            ndata = ndata+2;
        }
        System.out.println(ndata+b);

        
    }
}