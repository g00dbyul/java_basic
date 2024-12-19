package example1.input_and_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ImproveScanner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정수 한개 받기
        // BufferedReader는 문자열을 리턴하므로 원하는 타입으로 리턴해줘야 함
        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(
                Integer.valueOf(st.nextToken())
            );
        }

        System.out.println(list);

        /*
         *  nextToke() : 토큰(value) 가져오기 -> 하나씩 가져오기
         *  hasMoreTokens() : 토큰 존재 여부 확인 -> 리스트 생성할 때 사용하기 좋을듯
         */
        // System.out.println(b +", "+ c + ", " + d);
    }
}
