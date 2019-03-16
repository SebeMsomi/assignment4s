package za.ac.cput.lsp;

public class Rectangle {

    protected int m_width;
    protected int m_height;

    public Rectangle(int m_width, int m_height) {
        this.m_width = m_width;
        this.m_height = m_height;


    }

    public int getM_width() {
        return m_width;
    }

    public int getM_height() {
        return m_height;
    }

    public int getArea(){
        return m_width * m_height;
    }

}
