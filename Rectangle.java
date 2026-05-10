public class Rectangle extends Shape{

    private int id;
    private int length;
    private int height;
    private char pattern;
    private int type = 0;

    public Rectangle(int _id, int _len, int _h, char _p)
    {
        this.id = _id;
        this.length = _len;
        this.height = _h;
        this.pattern = _p;
    }

    public String toString()
    {
        String str;
        str = "Rectangle" + id + "(" + length + "," + height + "," + pattern + ")";

        return str;
    }

    public void draw()
    {
        for(int i = 0; i < height ; i++)
        {
            for(int j=0; j < length ; j++)
                System.out.print(pattern);

            System.out.println();

        }
    }

    public char getPattern()
    {
        return pattern;
    }

    public void setPattern(char _pattern)
    {
        this.pattern = _pattern;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int _id)
    {
        this.id = _id;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int _length)
    {
        this.length = _length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int _height)
    {
        this.height = _height;
    }

    public int getType(){
        return this.type;
    }

}


