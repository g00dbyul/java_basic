package example1.input_and_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ImproveOutput {
    public static void main(String[] args) throws IOException {
        /*
         * 
         */
        
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = 
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        /*
         * write() : 출력(쓰기) -> 숫자를 출력하기 위해 valueOf()로 감싸야 함
         * newLine() : 줄 바꿈 -> 안쓰면 뒤에 이상한 기호 붙음
         * flush() : 데이터를 비운 후 출력 -> write() 즉시 출력되는 건 아님, 
         * write()로 쓰기 작업을 스트림에다 밀어넣고 flush()를 호출할 때, 스트림에 있는 데이터를 출력
         */
        bw.write(String.valueOf(a+b));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
