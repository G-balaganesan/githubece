import java.util.Scanner;
public class Fibo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits:");
        int n = sc.nextInt();

        int count = 0;

        while(n > 0){
            int remainder = n % 10;
            if(remainder == 3){
                count++;
            }
            n =n /10;

        }
        System.out.println(count);

    }
}
