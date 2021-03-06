package seminar.collections;

import org.junit.Test;
import java.util.Iterator;
import static org.junit.Assert.*;

public class LinkedStackTest {

    @Test
    public void constructor(){
        LinkedStack<Integer> stack = new LinkedStack<>();
        assertEquals(0,stack.size());
    }

    @Test
    public void pushPop(){
        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        assertEquals(1,stack.size());
        assertEquals(1,(int)stack.pop());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,(int)stack.pop());
        assertEquals(2,(int)stack.pop());
        assertEquals(1,(int)stack.pop());
    }

    @Test
    public void iterator() throws Exception{
        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);

        Iterator<Integer> iterator = stack.iterator();

        for(int i = 2; i>0;i--){
            assertEquals(true,iterator.hasNext());
            assertEquals(i,(int)iterator.next());
        }
    }
}