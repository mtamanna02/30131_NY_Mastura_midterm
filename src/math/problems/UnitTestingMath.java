package math.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    }

    @Test
    public void testPositiveFindFactorial() {
        int expectedResult = 120;
        int actualResult = Factorial.findFactorialUsingIteration(5);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testNegativeFindFactorial() {
        int expectedResult = 123;
        int actualResult = Factorial.findFactorialUsingIteration(5);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveFindLowestDifference() {
        int expectResult = 1;
        int actualResult = FindLowestDifference.lowestDiff(new int[]{1, 0, 4, 5, 8}, new int[]{18,25,41,47,17,36,14,19});
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testNegativeFindLowestDifference() {
        int expectResult = 5;
        int actualResult = FindLowestDifference.lowestDiff(new int[]{1, 0, 4, 5, 8}, new int[]{18,25,41,47,17,36});
        Assert.assertEquals(expectResult, actualResult);


    }
}
