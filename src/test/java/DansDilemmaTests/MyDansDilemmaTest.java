package DansDilemmaTests;

import DansDilemma.DansDilemma;
import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Please rewrite the test part as the format I gave here.
public class MyDansDilemmaTest {

    private DansDilemma dansDilemma;

    @Before
    public void setup(){
        dansDilemma = new DansDilemma();
    }

    @Test
    public void dilemmaOfTwoDoubleTest1(){
        // Given
        Double input1 = 2d;
        Double input2 = 1d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 5;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void dilemmaOfTwoDoubleTest2(){
        // Given
        Double input1 = 3d;
        Double input2 = 3d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void dilemmaOfThreeDoubleTest1(){
        // Given
        Double input1 = 3d;
        Double input2 = 0d;
        Double input3 = 3d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest2(){
        // Given
        Double input1 = 0d;
        Double input2 = 42d;
        Double input3 = 57d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 11;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest3(){
        // Given
        Double input1 = -1d;
        Double input2 = 0.5d;
        Double input3 = 3d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 14;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest4(){
        // Given
        Double input1 = 0d;
        Double input2 = 0d;
        Double input3 = 0d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest1(){
        // Given
        Double[] inputs = {0d, 8d, -2d, 4d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 18;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest2(){
        // Given
        Double[] inputs = {4d, 10d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest3(){
        // Given
        Double[] inputs = {2.0, 3.0, 0.0, 2.0, 3.0};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 13;
        Assert.assertEquals(expected, actual);
    }

}
