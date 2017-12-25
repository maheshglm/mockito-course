package com.learning.mockito;

import com.learning.business.TodoBusinessImpl;
import com.learning.data.api.TodoService;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

/**
 * Created by Mahesh on 12/25/2017.
 */
public class TodoBusinessImplMockitoTest {

    @Test
    public void usingMockito(){
        TodoService todoService = mock(TodoService.class);

        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        //Normal Style
        when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2,todos.size());
    }

    @Test
    public void usingMockito_BDD(){
        TodoService todoService = mock(TodoService.class);

        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);

        //BDD Style
        given(todoService.retrieveTodos("Dummy")).willReturn(allTodos);

        //when
        List<String> todos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");

        //then
        assertEquals(2,todos.size());
    }

    @Test
    public void letsTestDeleteNow(){
        TodoService todoService = mock(TodoService.class);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);

        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");

        when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);

        todoBusiness.deleteTodosNotRelatedToSpring("Dummy");


    }

}
