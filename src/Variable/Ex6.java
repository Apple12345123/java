package Variable;

public class Ex6 {
    public static void main(String[] args) {
        // Q. 빈 칸을 채우고 타입이 어떻게 왜 변하는지 스스로에게 설명해주세요.
        //프로모션 문제
        int num1 = 10;
        long num2 = 20L;
        long result = num1+num2;        // 두 개중에 더 큰 건 long 임. long, float, double 다 들어갈 수 있음

        // 캐스팅 문제
        double num3 = 10.5;     //double 은 실수, int 는 정수
        int result2 = (int) num3;

        // 프로모션과 캐스팅
        int num4 = 10;
        double num5 = 5.5;
        int result3 = num4 + (int) num5;
    }
}
