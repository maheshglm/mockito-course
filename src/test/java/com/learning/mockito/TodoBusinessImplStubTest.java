package com.learning.mockito;

import com.learning.business.TodoBusinessImpl;
import com.learning.data.api.TodoService;
import com.learning.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by Mahesh on 12/25/2017.
 */
public class TodoBusinessImplStubTest {

    @Test
    public void usingAStub(){
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos  = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(3,todos.size());
    }
}
