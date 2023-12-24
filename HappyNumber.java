public class HappyNumber {
    public void happyNumber(int number){
        int slow = number;
        int fast = number;
        do{
            slow = sumOfSquareOfDigits(number);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(number));
            if(slow == fast && slow!=1){
                System.out.println("Not a happy number");
                return;
            }
        }while(fast!=1 && slow!=1);
        System.out.println("Happy Number");
    }
    public int sumOfSquareOfDigits(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem * rem;
            n/=10;
        }
        return sum;
    }
}
