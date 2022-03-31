package StringsTests;

import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Please rewrite the test part as the format I gave here.

public class MyStringsTest {
    private BasicStrings basicStrings;

    @Before
    public void setup(){
        basicStrings = new BasicStrings();
    }

    @Test
    public void flipConcatTest1(){
        // Given
        String string1 = " World!";
        String string2 = "Hello";
        String expected = "Hello World!";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcatTest2(){
        // Given
        String string1 = " Morning";
        String string2 = "Good";
        String expected = "Good Morning";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void flipConcatTest3(){
        // Given
        String string1 = "sunny day";
        String string2 = "It's a ";
        String expected = "It's a sunny day";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest1(){
        // Given
        String string1 = "You cant believe this!";
        char expected = 'c';
        // When
        char actual = basicStrings.getChar(string1, 4);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest2(){
        // Given
        String string1 = "You are the best!";
        char expected = '!';
        // When
        char actual = basicStrings.getChar(string1, 16);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest1(){
        // Given
        String string1 = "Love";
        String expected = "    ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest2(){
        // Given
        String string1 = "Pink Notes";
        String expected = "          ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest3(){
        // Given
        String string1 = " ";
        String expected = " ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest1(){
        // Given
        String string = "hi";
        String expected = "HI";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest2(){
        // Given
        String string = "lEt Me Go";
        String expected = "LET ME GO";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest1(){
        // Given
        String string = "oMg";
        String expected = "OmG";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest2(){
        // Given
        String string = "LoVe NeW YoRk";
        String expected = "lOvE nEw yOrK";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest3(){
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest(){
        // Given
        String string1 = "hi";
        String string2 = "hello";
        String expected = "hhiello";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest2(){
        // Given
        String string1 = "qwer";
        String string2 = "uiop";
        String expected = "quwieorp";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest3(){
        // Given
        String string1 = "jv rjc";
        String string2 = "aapoet";
        String expected = "java project";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }



}
