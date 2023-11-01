import java.util.Scanner;
public class Sqrt {
    public int mySqrt(int x) {
        if(x == 0)return 0;

        int left = 1, right = 46340;
        int mid = -1;
        int ans = -1;

        while(left <= right){
            mid = (left + right)/2;

            int mul = mid * mid;
            
            if(mul == x){
                ans = mid;
                break;
            }
            else if(mul < x){
                ans = Math.max(ans, mid);
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sqrt MySqrt = new Sqrt();

        int x = input.nextInt();
        System.out.println(MySqrt.mySqrt(x));
    }
}