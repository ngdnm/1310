package Ham;
import java.util.Scanner;
public class b7 {
    public static void main(String[] args) {
    ChucNang();
    End();  
    }
    public static void ChucNang(){
        System.out.println("--------------1.Giai pt bac 1-----------------");
        System.out.println("--------------2.Giai pt bac 2-----------------");
        Scanner input = new Scanner(System.in);
        int Choose= input.nextInt();
        if(Choose==1){
            System.out.println("Nhap he so a : ");
            int a = input.nextInt();
            System.out.println("Nhap he so b : ");
            int b = input.nextInt();
        if(a==0){
        if(b==0){
            System.out.println("Phuong trinh vo so nghiem");
        }else{
            System.out.println("Phuong trinh vo nghiem");
             } 
        }
        else System.out.println("Phuong trinh co nghiem x=  "+(-b/a));
        }
        if(Choose==2){
            double x1, x2,delta;
            System.out.println("Nhap he so a : ");
            double a = input.nextDouble();
            System.out.println("Nhap he so b : ");
            double b = input.nextDouble();
            System.out.println("Nhap he so c : ");
            double c = input.nextDouble();
            delta = Math.pow(b,2)-4*a*c;
        if(delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if (delta ==0){
            x1 = -b/(2*a);
            System.out.println("Phuong trinh co 1 nghiem la x1 = x2 = "+x1);
        }else{
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem la x1 = "+ x1 + " va"+ " x2 = "+x2);
        }
        }
    }
    public static void End(){
        System.out.println("--------------------1.Tiep tuc-------------------");
        System.out.println("--------------------2.Ket thuc-------------------");
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        if(n==1){
            
        }
        if(n==2){
            System.out.println("-------Ket thuc--------");
            
        }     
    }
}