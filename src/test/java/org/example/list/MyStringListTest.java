package org.example.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyStringListTest {

    MyStringList myStringList = new MyStringList();

    @Test
    @DisplayName("Empty MyStringList is empty")
    void emptyMyStringListIsEmpty() {
        assertThat(myStringList.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("Empty list has size zero")
    void emptyListHasSizeZero() {
        assertThat(myStringList.size()).isZero();
    }

    @Test
    @DisplayName("list with one String is not empty ")
    void listWithOneStringIsNotEmpty() {
        myStringList.add("Test");
        assertThat(myStringList.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("list with one String has size one")
    void listWithOneStringHasSizeOne() {
        myStringList.add("Test");
        assertThat(myStringList.size()).isOne();
    }

    @Test
    @DisplayName("adding 11 String gives size 11")
    void adding11StringGivesSize11() {
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.add("Test");

        assertThat(myStringList.size()).isEqualTo(11);
    }

    @Test
    @DisplayName("add two Strings and clear makes size zero ")
    void addTwoStringsAndClearMakesSizeZero() {
        myStringList.add("Test");
        myStringList.add("Test");
        myStringList.clear();
        assertThat(myStringList.size()).isZero();
    }

    @Test
    @DisplayName("add Strings then get index")
    void addStringsThenGetIndex() {
        myStringList.add("Test1");
        myStringList.add("Test2");
        myStringList.add("Test3");

        assertThat(myStringList.get(0)).isEqualTo("Test1");
        assertThat(myStringList.get(1)).isEqualTo("Test2");
        assertThat(myStringList.get(2)).isEqualTo("Test3");
    }

    @Test
    @DisplayName("throws IndexOutOfBoundsException for index less than zero")
    void throwsIndexOutOfBoundsExceptionForIndexLessThanZero() {
        assertThrows(IndexOutOfBoundsException.class, ()-> myStringList.get(-1) );
    }

    @Test
    @DisplayName("throws IndexOutOfBoundsException for index greator or equal to size")
    void throwsIndexOutOfBoundsExceptionForIndexGreatorOrEqualToSize() {
        myStringList.add("Test");
        assertThrows(IndexOutOfBoundsException.class, ()-> myStringList.get(1) );
    }
}
