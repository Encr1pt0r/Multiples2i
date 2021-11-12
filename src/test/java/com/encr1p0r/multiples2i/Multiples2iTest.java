/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encr1p0r.multiples2i;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author presi
 */
@RunWith(Parameterized.class)
public class Multiples2iTest {
    
    Multiples2i instance;
    private final int base;
    private final int level;
    
    public Multiples2iTest(int base, int level) {
        this.instance = new Multiples2i();
        this.base = base;
        this.level = level;
    }
    
    @Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(
            new Integer[][] {
                {7, 1},
                {8, 2},
                {9, 3}
            }
        );
    }

    /**
     * Test of count method, of class Multiples2i.
     * 
     * Intention is to compare numbers outputted but realised at the end it was 
     * better to return the values than to just print them out
     * 
     */
    @Test
    public void testCount() {
        System.out.println("count");
        int b = base;
        int l = level;
        Multiples2i.count(b, l);
        // TODO review the generated test code and remove the default call to fail.
        //assertEquals();
        fail();
        
    }
    
}
