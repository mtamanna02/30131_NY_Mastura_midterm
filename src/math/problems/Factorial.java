package math.problems;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println(findFactorialUsingIteration(5));
        System.out.println(findFactorialUsingIteration(7));
    }
    public static int findFactorialUsingIteration(int number){
        int result = number;
        for (int i = 1; i<number;i++){
            result=result*(number-i);
            System.out.println("This is loop number: " + i + " And the Result is: " + result);
        }
        return result;
    }
}
