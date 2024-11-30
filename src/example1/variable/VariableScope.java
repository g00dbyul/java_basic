package example1.variable;

public class VariableScope {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
        }
        //  여기서는 v2를 사용할 수 없음
        int v3 = 20;
    }
}
