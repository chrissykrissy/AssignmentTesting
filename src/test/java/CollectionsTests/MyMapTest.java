package CollectionsTests;

import Collections.MapPractice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

// Please rewrite the test part as the format I gave here.

public class MyMapTest {
    private MapPractice mapPractice;
    private Map map1;

    @Before
    public void setup(){
        mapPractice = new MapPractice();
        map1 = new TreeMap<String, String>();
        map1.put("Chrissy", "Jeon");
        map1.put("Isabella", "Kim");
        map1.put("Yaejin", "Han");
        map1.put("Ron", "Chai");
        map1.put("Elia", "Moon");
        map1.put("Kevin", "Chen");
        map1.put("Mark", "Chen");
        map1.put("Sean", "Griffith");
        map1.put("Crystal", "Kim");
        map1.put("Ashley", "Lee");
        map1.put("Grace", "Jo");
        map1.put("Hajung", "Jang");
    }

    @Test
    public void findValueOfTest1(){
        // Given
        String key = "Chrissy";
        // When
        String expected = "Jeon";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest2(){
        // Given
        String key = "Mark";
        // When
        String expected = "Chen";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest3(){
        // Given
        String key = "David";
        // When
        String expected = null;
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest1(){
        // Given
        String value = "Chai";
        // When
        Object[] expected = {"Ron"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest2(){
        // Given
        String value = "Ngyen";
        // When
        Object[] expected = {};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest3(){
        // Given
        String value = "Kim";
        // When
        Object[] expected = {"Crystal", "Isabella"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest1(){
        // Given
        Integer upTo = 8;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        expected.put(8, 21);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest2(){
        // Given
        Integer upTo = 11;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        expected.put(8, 21);
        expected.put(9, 34);
        expected.put(10, 55);
        expected.put(11, 89);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest3(){
        // Given
        Integer upTo = 3;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest4(){
        // Given
        Integer upTo = 5;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest5(){
        // Given
        Integer upTo = 0;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest1(){
        // Given
        Integer upTo = 5;
        Integer first = 2;
        Integer second = 3;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 2);
        expected.put(2, 3);
        expected.put(3, 5);
        expected.put(4, 8);
        expected.put(5, 13);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest2(){
        // Given
        Integer upTo = 7;
        Integer first = 8;
        Integer second = 3;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 8);
        expected.put(2, 3);
        expected.put(3, 11);
        expected.put(4, 14);
        expected.put(5, 25);
        expected.put(6, 39);
        expected.put(7, 64);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest3(){
        // Given
        Integer upTo = 3;
        Integer first = 1;
        Integer second = -3;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, -3);
        expected.put(3, -2);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest4(){
        // Given
        Integer upTo = 1;
        Integer first = 0;
        Integer second = -1;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 0);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest5(){
        // Given
        Integer upTo = 0;
        Integer first = 1234567;
        Integer second = 567890;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }



}
