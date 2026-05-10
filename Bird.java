import java.security.SecureRandom;

public class Bird extends Shape{
    SecureRandom rn = new SecureRandom();

    private int id;
    private int birdcnt;
    private int[] buf = new int[100];
    private int type = 1;

    public Bird(int _id, int num)
    {
        this.id = _id;
        this.birdcnt = num;
    }

    public void birdChoice()
    {
        for(int i = 0 ; i < birdcnt ; i++)
        {
            buf[i] = rn.nextInt(3) + 1;
        }
    }

    public void draw()
    {
        String Birds = "";

        for(int i = 0; i <birdcnt; i++)
        {
            switch(buf[i])
            {
                case 1:
                    Birds = Birds + "\n\n" + makebird1();
                    break;
                case 2:
                    Birds = Birds + "\n\n" + makebird2();
                    break;
                case 3:
                    Birds = Birds + "\n\n" + makepenguin3();
                    break;
            }
        }
        System.out.println(Birds);
    }

    private String makebird1()
    {
        String bird1 = """
                 ( ` >
         *      /   )       참새
                ^ ^
        """;
        return bird1;
    }

    private String makebird2()
    {
        String bird2 = """
                   ,___,
        *          (O,O)
        *          /)__)      올빼미
                    " "
        """;
        return bird2;
    }

    private String makepenguin3()
    {
        String bird3 = """
                    _,,..
                    /  ^  ^  >               (물고기) <゜)))彡
                   /   ::    \\
                  /.......... \\
                                              <--- 펭귄
                 |  ....      }\\
                 | ::::       } J
                 し'          }J
                   ゝ        く
                    _,,  ^  ,,_
                     (  `  '  )
                """;
        return bird3;
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

