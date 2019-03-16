package za.ac.cput.lsp;

public class Square extends Rectangle {

    public Square(int m_width, int m_height) {
        super(m_width, m_height);
    }


    @Override
    public String toString() {
        return "Square{" +
                "m_width=" + m_width +
                ", m_height=" + m_height +
                '}';
    }
}
