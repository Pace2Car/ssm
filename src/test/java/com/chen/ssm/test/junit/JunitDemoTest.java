package com.chen.ssm.test.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitDemoTest {

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(2,JunitDemo.add(1,1));
    }
}