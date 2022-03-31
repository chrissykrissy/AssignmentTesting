package CollectionsTests;

import Collections.ArrayLists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

// Please rewrite the test part as the format I gave here.

public class MyArrayListsTest {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }

    @Test
    public void addShitTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(4);
        original1.add(4);
        original1.add(4);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(9);
        original2.add(9);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(9);
        original1.add(9);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest2(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(3);
        original1.add(3);
        original1.add(3);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest3(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTogetherTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(3);
        original1.add(3);
        original1.add(3);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(7);
        original2.add(7);
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 23;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogetherTest2(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(4);
        original2.add(9);
        // when
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 13;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest1(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(2);
        original.add(2);
        original.add(2);
        original.add(8);
        original.add(8);
        // When
        Integer toRemove = 2;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(0);
        original.remove(0);
        original.remove(0);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest2(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(2);
        original.add(4);
        original.add(2);
        original.add(4);
        original.add(4);
        // When
        Integer toRemove = 2;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(0);
        original.remove(1);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void happyListTest1(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("hello");
        original.add("hi");
        original.add("hibernate");
        original.add("hey");
        original.add("house");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest2(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("i");
        original.add("hope");
        original.add("you");
        original.add("have");
        original.add("good");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void happyListTest3(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest4(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Yay!");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest5(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Belittle");
        original.add("and");
        original.add("succeed");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }

}
