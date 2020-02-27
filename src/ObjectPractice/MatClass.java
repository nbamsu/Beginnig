package ObjectPractice;

public class MatClass {
    public int sum(int ...nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
     public int sum1(int []nums) {
         int sum = 0;
         for (int i = 0; i < nums.length; i++) {
             sum += nums[i];
         }
         return sum;
     }

    public static void main(String[] args) {
        MatClass mat= new MatClass();
        int sum=mat.sum(12,12,20,97,245,465);
        int numbers[]={12,12,20,97,245,465};
        System.out.println(mat.sum1(numbers));
        System.out.println(sum);
    }

}
