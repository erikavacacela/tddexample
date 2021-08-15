package ec.mi.tddexample;

public class Element {
    
    private String value;
    
    private Element previousElement;

    public Element(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public Element getPreviousElement() {
        return this.previousElement;
    }

    public void setPreviousElement(Element element) {
        this.previousElement = element;
    }

    public String toString() {
        return this.value;
    }
}
