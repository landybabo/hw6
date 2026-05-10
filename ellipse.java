public class ellipse extends Shape{
    private int id;
    private int laxis;
    private int saxis;
    private int type = 4;

    public ellipse(int id, int laxis, int saxis)
    {
        this.id = id;
        this.laxis = laxis;
        this.saxis = saxis;
    }

    public void draw()
    {
        for(int x = -saxis ; x <= saxis ; x++)
        {
            for(int y = -laxis; y <= laxis ; y++)
            {
                if((x*x)/(saxis*saxis) + (y*y)/(laxis*laxis) <= 1)
                {
                    System.out.print("*");
                }else System.out.print(" ");
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
