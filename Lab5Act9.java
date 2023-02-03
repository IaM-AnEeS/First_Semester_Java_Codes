public class Lab5Act9 {
    public static void main(String[] args) {
        int num=0,sum=0;
        while(num<20){
            num++;
            if (num==10 || num==11)
                continue;
            sum+=num;
        }
        System.out.println("The sum is "+sum);
    }
}
