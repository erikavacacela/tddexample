package ec.mi.tddexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setup() {
        stack = new Stack();
        System.out.println("This is setup");
    }
    
    @Test
    @Order(1)
    public void testPushElementToStack() {
        Element element = new Element("1");

        stack.push(element);
    }

    @Test
    @Order(2)
    public void testPopElementFromStack() {
        Element expectedElement = new Element("2");
        stack.push(expectedElement);

        Element actualElement = stack.pop();
        
        assertEquals(expectedElement.getValue(), actualElement.getValue());    
    }

    @Test
    @Order(3)
    public void testCountStackElements() {
        stack.push(new Element("1"));
        stack.push(new Element("2"));
        int count  = stack.count();

        assertEquals(2, count);
    }

    @Test
    public void testPopFullStack() {
        stack.push(new Element("1"));
        stack.push(new Element("2"));
        stack.push(new Element("3"));
        stack.push(new Element("4"));
        stack.push(new Element("5"));

        assertEquals("5", stack.pop().getValue());
        assertEquals("4", stack.pop().getValue());
        assertEquals("3", stack.pop().getValue());
        assertEquals("2", stack.pop().getValue());
        assertEquals("1", stack.pop().getValue());
    }

}
