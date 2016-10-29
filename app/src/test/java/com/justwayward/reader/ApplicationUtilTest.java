package com.justwayward.reader;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationUtilTest {

    @Test
    public void testAdd() {
        // List<List<String>> list = ;

        List<String> l1 = new ArrayList<>(1);
        l1.add("11");
        l1.add("22");

        List<String> l2 = new ArrayList<>(1);
        l2.add("11");
        l2.add("22");

        List<List<String>> l = new ArrayList<>();

        l.add(l1);
        l.add(l2);

        System.out.println("## l:" + l);




    }


}