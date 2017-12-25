package com.learning.data.api;

import java.util.List;

/**
 * Created by Mahesh on 12/25/2017.
 */
// External Service - Lets say this comes from WunderList
public interface TodoService {
    public List<String> retrieveTodos(String user);
}
