import java.util.Scanner;

public class PeakElement {

    public int findPeakElement(int [] nums){
        int n = nums.length;

        int left = 0, right = n-1;

        while (left < right ){
            int mid = (left + right) / 2;

            if(nums[mid] >= nums[mid+1]){
                right = mid;
            }else{
                left = mid+1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeakElement x = new PeakElement();

        int n = scanner.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(x.findPeakElement(nums));

        scanner.close();
    }
}
