package za.ac.cput.srp;

public class Text {
    private String text;
    private String author;
    private int length;

    public Text(String text, String author, int length) {
        this.text = text;
        this.author = author;
        this.length = length;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }

        /*methods that change the text*/
    public void allLettersToUpperCase() {

    }
    public void findSubTextAndDelete(String s) {

    }

    /*method for formatting output*/
    public void printText() {
        System.out.println("This print text....");
    }
}
