import java.util.Arrays;
import java.util.List;

public class LambdaExpressionTest {

    public void sumOfOddNumber_Usual(){
        List<Integer> no = Arrays.asList(1,3,4,6,2,7);
        int sum = 0;

        for (int number: no) if(number%2!=0) sum+=number;
        System.out.println("Normal iterative sum: " + sum);
    }

    public void sumOfOddNumber_FunctionalProgramming(){
        List<Integer> no = Arrays.asList(1,3,4,6,2,7);

        int sum = no.stream().filter(number -> (number%2)!=0).reduce(0,Integer::sum);
        System.out.println("Functional Programming Sum: " + sum);
    }
}
