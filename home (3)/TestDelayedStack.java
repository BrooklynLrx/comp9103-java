import static org.junit.Assert.*;
import org.junit.Test;

public class TestDelayedStack{
    //constructor test
     @Test 
     public void test_consturctor1(){
         DelayedStack<String> s = new MyStack<String>(4);
         assertEquals(4,s.getDelay());
         assertEquals(4,s.getMaximumDelay());
     }
     @Test 
     public void test_consturctor2(){
         DelayedStack<String> s = new MyStack<String>(0);
         assertEquals(0,s.getDelay());
         assertEquals(0,s.getMaximumDelay());
     }
     @Test 
     public void test_consturctor3(){
         DelayedStack<String> s = new MyStack<String>(-3);
         assertEquals(0,s.getDelay());
         assertEquals(-3,s.getMaximumDelay());
     }

    //size() test
     @Test
     public void test_size(){
         DelayedStack<String> s = new MyStack<String>(0); 
         assertEquals(0, s.size());
     }
     @Test
     public void test_size_push1(){
         DelayedStack<String> s = new MyStack<String>(0); 
         assertEquals(0, s.size());
         s.push("1");
         assertEquals(1, s.size());
     }
     @Test
     public void test_size_push2(){
         DelayedStack<String> s = new MyStack<String>(0); 
         assertEquals(0, s.size());
         s.push("1");
         assertEquals(1, s.size());
         s.push("2");
         assertEquals(2, s.size());
     }
     @Test
     public void test_size_push_pop(){
         DelayedStack<String> s = new MyStack<String>(0); 
         assertEquals(0, s.size());
         s.push("1");
         assertEquals(1, s.size());
         s.push("2");
         assertEquals(2, s.size());
         s.push("3");
         assertEquals(3, s.size());
         s.pop();
         assertEquals(2, s.size());
         s.pop();
         assertEquals(1, s.size());
         s.pop();
         assertEquals(0, s.size());
     }
     @Test
     public void test_size_push_clear(){
         DelayedStack<String> s = new MyStack<String>(0); 
         assertEquals(0, s.size());
         s.push("1");
         assertEquals(1, s.size());
         s.push("2");
         assertEquals(2, s.size());
         s.push("3");
         assertEquals(3, s.size());
         s.clear();
         assertEquals(0, s.size());

     }
     //pushtest
     @Test
     public void test_push_size(){
        DelayedStack<String> s = new MyStack<String>(0); 
         assertEquals(0, s.size());
         s.push("1");
         assertEquals(1, s.size());
         s.push("2");
         assertEquals(2, s.size());
         s.push("3");
         assertEquals(3, s.size());
     }
     @Test
     public void test_push_null(){
         DelayedStack<String> s = new MyStack<String>(0); 
         assertEquals(0, s.size());
         s.push(null);
         assertEquals(1, s.size());
         s.push(null);
         assertEquals(2, s.size());
         s.push(null);
         assertEquals(3, s.size());
     }
     @Test
     public void test_push_delay1(){
         DelayedStack<String> s = new MyStack<String>(4); 
         assertEquals(0, s.size());
         assertEquals(4,s.getDelay());
         s.push("1");
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());
         s.push("2");
         assertEquals(2, s.size());
         assertEquals(2,s.getDelay());
         s.push("3");
         assertEquals(3, s.size());
         assertEquals(1,s.getDelay());
         s.push("4");
         assertEquals(4, s.size());
         assertEquals(0,s.getDelay());
         s.push("5");
         assertEquals(5, s.size());
         assertEquals(0,s.getDelay());
         s.pop();
         assertEquals(4, s.size());
         s.push("5"); //reset delay
         assertEquals(5, s.size());
         assertEquals(3,s.getDelay());    
     }
     @Test
     public void test_push_delay2(){
         DelayedStack<String> s = new MyStack<String>(4); 
         assertEquals(0, s.size());
         assertEquals(4,s.getDelay());
         s.push("1");
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());
         s.push("2");
         assertEquals(2, s.size());
         assertEquals(2,s.getDelay());
         s.push("3");
         assertEquals(3, s.size());
         assertEquals(1,s.getDelay());
         s.push("4");
         assertEquals(4, s.size());
         assertEquals(0,s.getDelay());
         s.push("5");
         assertEquals(5, s.size());
         assertEquals(0,s.getDelay());
         s.setMaximumDelay(5);
         assertEquals(5,s.getMaximumDelay());
         s.pop();
         assertEquals(4, s.size());
         s.push("5"); //reset to newdelay
         assertEquals(5, s.size());
         assertEquals(4,s.getDelay());    
     }
     @Test
     public void test_push_delay3(){
         DelayedStack<String> s = new MyStack<String>(4); 
         assertEquals(0, s.size());
         assertEquals(4,s.getDelay());
         s.push("1");
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());
         s.push("2");
         assertEquals(2, s.size());
         assertEquals(2,s.getDelay());
         s.push("3");
         assertEquals(3, s.size());
         assertEquals(1,s.getDelay());
         s.push("4");
         assertEquals(4, s.size());
         assertEquals(0,s.getDelay());
         s.push("5");
         assertEquals(5, s.size());
         assertEquals(0,s.getDelay());
         s.clear();
         assertEquals(0, s.size());
         s.push("5"); //reset delay
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());    
     }
     @Test
     public void test_push_delay4(){
         DelayedStack<String> s = new MyStack<String>(4); 
         assertEquals(0, s.size());
         assertEquals(4,s.getDelay());
         s.push("1");
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());
         s.push("2");
         assertEquals(2, s.size());
         assertEquals(2,s.getDelay());
         s.push("3");
         assertEquals(3, s.size());
         assertEquals(1,s.getDelay());
         s.push("4");
         assertEquals(4, s.size());
         assertEquals(0,s.getDelay());
         s.push("5");
         assertEquals(5, s.size());
         assertEquals(0,s.getDelay());
         s.setMaximumDelay(5);
         assertEquals(5,s.getMaximumDelay());
         s.clear();
         assertEquals(0, s.size());
         s.push("5"); //reset to newdelay
         assertEquals(1, s.size());
         assertEquals(4,s.getDelay());    
     }

     //testpop
     @Test
     public void test_pop_exception(){
         try{
            DelayedStack<String> s = new MyStack<String>(4);
            s.pop();
         } catch(IllegalStateException e) {
            assertEquals("empty list",e.getMessage());
         }

     }
     @Test
     public void test_pop_delay_error(){
         DelayedStack<String> s = new MyStack<String>(4);
         s.push("1");
         assertEquals(null,s.pop());
         assertEquals(1,s.size());
     }
     @Test 
     public void test_pop_success(){
         DelayedStack<String> s = new MyStack<String>(4);
         s.push("1");
         s.push("2");
         s.push("3");
         s.push(null);
         assertEquals(4,s.size());
         assertEquals(null,s.pop());
         assertEquals(3,s.size());
         assertEquals("3",s.pop());
         assertEquals(2,s.size());
         assertEquals("2",s.pop());
         assertEquals(1,s.size());
         assertEquals("1",s.pop());
         assertEquals(0,s.size());
     }

     //test peek
     @Test
     public void test_peek_unsuccess(){
         DelayedStack<String> s = new MyStack<String>(4);
         try{
             s.peek();
         } catch (IllegalStateException e){
             assertEquals("empty list",e.getMessage());
         }
     }
     @Test
     public void test_peek_success(){
         DelayedStack<String> s = new MyStack<String>(4);
         s.push("1");
         assertEquals("1",s.peek());
         s.push(null);
         assertEquals(null,s.peek());
     }

     //testgetdelay
     @Test
     public void test_delay(){
         DelayedStack<String> s = new MyStack<String>(4);
         s.push("1");
         assertEquals(3,s.getDelay());
         s.push("2");
         assertEquals(2,s.getDelay());
         s.push("3");
         assertEquals(1,s.getDelay());
         s.push("4");
         assertEquals(0,s.getDelay());
         s.push("5");
         assertEquals(0,s.getDelay());
         s.pop();
         s.push("6");
         assertEquals(3,s.getDelay());//test delayresetpop
         s.push("7");
         s.push("8");
         s.push("9");
         assertEquals(0,s.getDelay());
         s.clear();
         assertEquals(0,s.getDelay());
         s.push("10");
         assertEquals(3,s.getDelay()); //test delayresetpop
         s.push("11");
         s.push("12");
         s.push("13");
         s.setMaximumDelay(10);
         s.pop();
         s.push("14");
         assertEquals(9,s.getDelay()); //test changeresetdelay
     }

     //test setMaximumDelay & getMaximumDelay
     @Test
     public void test_MaximumDelay(){
         DelayedStack<String> s = new MyStack<String>(4);
         assertEquals(4,s.getMaximumDelay());
         s.setMaximumDelay(5);
         assertEquals(5,s.getMaximumDelay());
         s.setMaximumDelay(6);
         assertEquals(6,s.getMaximumDelay());
         s.setMaximumDelay(-1);
         assertEquals(-1,s.getMaximumDelay());
     }

     //test clear
     @Test
     public void test_clear_empty(){
         DelayedStack<String> s = new MyStack<String>(4);
         assertTrue(s.clear());
     }
     @Test
     public void test_clear_delay_error(){
         DelayedStack<String> s = new MyStack<String>(4);
         s.push("1");
         assertFalse(s.clear());
     }
     @Test
     public void test_clear_success(){
         DelayedStack<String> s = new MyStack<String>(3);
         s.push("1");
         s.push("2");
         s.push("3");
         assertTrue(s.clear());
         assertEquals(0,s.size());
         assertEquals(0,s.getDelay());
     }

     //test contains
     @Test 
     public void test_contain_empty(){
         DelayedStack<String> s = new MyStack<String>(3);
         assertFalse(s.contains("1"));
         assertFalse(s.contains(null));
     }
     @Test
     public void test_contain_null(){
         DelayedStack<String> s = new MyStack<String>(0);
         s.push(null);
         assertTrue(s.contains(null));
         s.pop();
         assertFalse(s.contains(null));
     }
     @Test
     public void test_contain(){
         DelayedStack<String> s = new MyStack<String>(0);
         s.push("1");
         assertTrue(s.contains("1"));
         assertFalse(s.contains("2"));
     }
}
