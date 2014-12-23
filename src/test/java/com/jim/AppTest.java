package com.jim;

import org.junit.Test;

import java.util.HashSet;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testName() throws Exception {
        HelloServiceImpl helloService = new HelloServiceImpl();
        ObscenityFilter filter = new ObscenityFilter();
        HashSet<String> set = new HashSet<String>();
        set.add("IBM");
        filter.setObscenities(set);
        helloService.setObscenityFilter(filter);
        String ibm = helloService.getHelloMessage("IBM");
        System.out.println(ibm);

    }
}
