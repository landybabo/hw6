public class Triangle extends Shape
{
    private int id;
    private int width;
    private int type = 2;

    public Triangle(int _id,int _width)
    {
        this.id = _id;
        this.width = _width;
    }

    public void draw()
    {
        for(int i = 0; i < width; i++)
        {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getType(){
        return this.type;
    }

}
