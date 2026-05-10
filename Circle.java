public class Circle extends Shape{
    private int id;
    private int r;
    private int type = 3;

    public Circle(int _id, int _r)
    {
        this.id = _id;
        this.r = _r;
    }

    public void draw()
    {
            for(int x = -r; x <= r; x++)
            {
                for(int y = -r ; y <= r ; y++)
                {
                    if(x*x + y*y <= r*r)
                    {
                        System.out.print("* ");
                    }else System.out.print("  ");
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
