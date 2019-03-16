package za.ac.cput.srp;


//better code for Single Responsibility principle
public class Printer {
    Text text;

    public Printer(Text t) {
        this.text = t;
    }

    void printText() {
        System.out.println("This print text....");
    }
}
