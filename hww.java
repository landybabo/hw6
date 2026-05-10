import java.util.Scanner;

public class hww {
    public static final int QUIT = 0;

    public static void printMenu()
    {
        System.out.println();
        System.out.println("*********************");
        System.out.println(" 1. Rectangle ");
        System.out.println(" 2. Triangle ");
        System.out.println(" 3. Circle(아마도..?) ");
        System.out.println(" 4. ellipse ");
        System.out.println(" 5. ---- ");
        System.out.println(" 6. 새 ");
        System.out.println(" 7. 지정된 모양중 저장된거 다 그려서 보여주기 ");
        System.out.println(" 8. 모든 그림 다 그려서 보여주기 ");
        System.out.println(" 9. 전부 삭제 ");
        System.out.println(" 0. QUIT ");
        System.out.println("**********************");
        System.out.print(" Enter Your Choice : ");
    }

    public static Rectangle createRect()
    {
        Rectangle rect;
        int id, length, height;
        char pattern;

        Bird brd;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID : ");
        id = input.nextInt();
        System.out.print("Enter Length : ");
        length = input.nextInt();
        System.out.print("Enter height : ");
        height = input.nextInt();
        System.out.print("Enter pattern ");
        pattern = input.next().charAt(0);

        rect = new Rectangle(id, length, height, pattern);
        return rect;
    }

    public static Bird creatBird()
    {
        Bird brd;
        int id, cnt;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Id : ");
        id = input.nextInt();
        System.out.print("새 몇 마리? : ");
        cnt = input.nextInt();

        brd = new Bird(id,cnt);
        brd.birdChoice();
        return brd;
    }

    public static Triangle creatTriangle()
    {
        Triangle tri;
        int id, width;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID : ");
        id = input.nextInt();
        System.out.print("width : ");
        width = input.nextInt();

        tri = new Triangle(id,width);
        return tri;
    }

    public static Circle creatCircle()
    {
        Circle cir;
        int id, r;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID : ");
        id = input.nextInt();
        System.out.print("Radius : ");
        r = input.nextInt();

        cir = new Circle(id,r);
        return cir;
    }

    public static ellipse creatEllipse()
    {
        ellipse ell;
        int id,s,l;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID : ");
        id = input.nextInt();
        System.out.print("Long Axis : ");
        l = input.nextInt();
        System.out.print("Short Axis : ");
        s = input.nextInt();

        ell = new ellipse(id,l,s);
        return ell;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select;

        Shape pointer = null;
        Shape[] diagrams = new Shape[1000];
        int diagCnt = 0;

        printMenu();
        select = input.nextInt();
        while (select != QUIT) {

            if (select < 7) {
                switch (select) {
                    case 1:
                        pointer = createRect();
                        break;
                    case 2:
                        pointer = creatTriangle();
                        break;
                    case 3:
                        pointer = creatCircle();
                        break;
                    case 4:
                        pointer = creatEllipse();
                        break;
                    case 5:
                        System.out.println("...");
                        break;
                    case 6:
                        pointer = creatBird();
                        break;
                }

                if (select != 5 && pointer != null) {
                    pointer.draw();
                    diagrams[diagCnt] = pointer;
                    diagCnt++;
                }
            }

            switch (select) {
                case 7:
                    System.out.println("모양");
                    System.out.println(" 0 : Rectangle ");
                    System.out.println(" 1 : 새 ");
                    System.out.println(" 2 : Triangle ");
                    System.out.println(" 3 : Circle ");
                    System.out.println(" 4 : Ellipse ");
                    System.out.print(" 입력 : ");
                    select = input.nextInt();

                    for (int i = 0; i < diagCnt; i++) {
                        if (diagrams[i].getType() == select) diagrams[i].draw();
                    }
                    break;

                case 8:
                    for (int i = 0; i < diagCnt; i++) diagrams[i].draw();
                    break;
                case 9:
                    diagCnt = 0;
                    System.out.println("삭제완료.");
                    break;
            }

        printMenu();
        select = input.nextInt();
        }

        System.out.println("Bye Bye ~~~");
    }
}