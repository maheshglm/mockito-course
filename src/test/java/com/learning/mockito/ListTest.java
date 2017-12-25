package com.learning.mockito;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Mahesh on 12/25/2017.
 */
public class ListTest {

    @Test
    public void letsMockListSize(){
        List<String> mockList = mock(List.class);
        when(mockList.size()).thenReturn(5);
        System.out.println(mockList.size());
    }

    @Test
    public void letsMockListSizeTest(){
        List<String> mockList = mock(List.class);
        when(mockList.size()).thenReturn(5);
        assertEquals(5,mockList.size());
    }

    @Test
    public void letsMockListSizeWithMultipleReturnValues(){
        List<String> mockList = mock(List.class);
        when(mockList.size()).thenReturn(5).thenReturn(10);
        assertEquals(5,mockList.size());
        assertEquals(10,mockList.size());
    }

    @Test
    public void letsMockListGet(){
        List<String> mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("Mahesh");
        assertEquals("Mahesh",mockList.get(0));
    }

    @Test
    public void letsMockListGetNullTest(){
        List<String> mockList = mock(List.class);
        assertEquals(null,mockList.get(0));
    }

    @Test
    public void letsMockListGetWithAny(){
        List<String> mockList = mock(List.class);
        when(mockList.get(anyInt())).thenReturn("Mockito Learning");
        assertEquals("Mockito Learning",mockList.get(0));
        assertEquals("Mockito Learning",mockList.get(1000));
    }

    @Test
    public void letsMockListGetWithAny_BDDStyle(){
        List<String> mockList = mock(List.class);

        given(mockList.get(anyInt())).willReturn("Mockito Learning");

        assertEquals("Mockito Learning",mockList.get(0));
        assertEquals("Mockito Learning",mockList.get(1000));
    }


}
