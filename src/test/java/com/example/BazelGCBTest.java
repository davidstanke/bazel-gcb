package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.BazelGCB;

public class BazelGCBTest {
   
   @Test
   public void testHelloWorld() {
   		BazelGCB hello = new BazelGCB("Hello World");
   		assertEquals(hello.getMessage(), "Hello World");
   }

   @Test
   public void testConcat() {
   		BazelGCB twice = new BazelGCB("foo");
   		assertEquals(twice.getMessageTwice(), "foofoo");
   }

}