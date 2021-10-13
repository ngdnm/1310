package Ham;
import java.util.Scanner;
public class b3{    
    public static void main (String[] args){
    nhapn();
    string();
    repeat();        
    }
    public static void string(){
        String x;
        x="Title";
        System.out.println(x); 
}
    public static void nhapn(){
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n<=0){
            System.out.println("Nhap lai n: ");
            n = input.nextInt();            
        }
    }
    public static void repeat(){
        for (int i=0;i<n;i++){
            string();
        }
    }
}

