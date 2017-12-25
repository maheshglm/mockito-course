package com.learning.data.api;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mahesh on 12/25/2017.
 */
public class TodoServiceStub implements TodoService{
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring Core","Learn Spring","Learn Mockito");
    }
}
