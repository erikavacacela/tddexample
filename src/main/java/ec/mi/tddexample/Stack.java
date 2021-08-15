package ec.mi.tddexample;

public class Stack {

    private Element lastElement = null;
    
    public void push(Element element) {
        element.setPreviousElement(lastElement);
        this.lastElement = element;
    }

    public Element pop() {
        Element currentLasElement = this.lastElement;
        this.lastElement = currentLasElement.getPreviousElement();

        return currentLasElement;
    }

    public int count() {
        Element element = lastElement;
        int count = 0;
        while(element != null) {
            element = element.getPreviousElement();
            count++;
        }
        return count;
    }

}
