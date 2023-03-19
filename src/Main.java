import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double tong=0;
        int sm=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                sm=sm+1;
                double j=Math.pow(i,sm);
                tong= tong+j;
            }
        }
        System.out.println("tong la: "+tong);
    }
}