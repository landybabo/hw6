abstract public class Shape {

    //공통적으로 type 변수도 있어야할듯.

    abstract void draw();

    abstract int getId();

    abstract void setId(int id);

    //게터 세터 왜 쓰는지 효율적으로 보여주는 부분, 다운캐스팅 안쓰고 자식 객체 변수 가져오기

    abstract int getType();
}
