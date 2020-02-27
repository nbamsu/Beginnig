package ARRAY;

public class FindLargestAndLowestNumber {
    public static void main(String[] args) {
       /* int []number={4,56,23,987,29,12,89};
        int max=number[0];
        for (int largest:number){
            if (largest>max){
                max=largest;
            }
        }
        System.out.println("Largest number :"+max);*/


        int [] numbers={4,56,23,987,29,12,89};
        int largest=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if (numbers[i]>largest){
                largest=numbers[i];
            }

        }
        System.out.println("This is largest number :"+largest);
        int []numbers2={4,56,23,987,29,12,89};
        int lowest=numbers2[0];
        for (int i=1;i<numbers2.length;i++){
            if (numbers2[i]<lowest){
                lowest=numbers2[i];
            }
        }
        System.out.println("This is Lowest number :"+lowest);
    }
}
