package com.baiqiqi.server;

import com.baiqiqi.server.dao.AccountMapper;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

    @Autowired
    AccountMapper accountMapper;

    @Before
    public void setUp(){

    }

    @Test
    public void contextLoads() {
        List<String> mockList = mock(ArrayList.class);
        mockList.add("one");
        mockList.add("two");
        mockList.add("two");
        mockList.clear();
        verify(mockList).add("one");
        verify(mockList,times(2)).add("two");
        verify(mockList).clear();
        when(mockList.get(0)).thenReturn("first");
        System.out.println(mockList.get(0));

        accountMapper.add("baiqiqi",100);

    }

}
