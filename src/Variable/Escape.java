package Variable;

public class Escape {
    public static void main(String[] args) {
        // 이스케이프문자
        // 문자열 내부에 열슬래스가 붙은 문자
        // 문자열 내부에 특정 문자 포함 가능

        // String str = "나는 "자바"를 좋아합니다";
        String str = "나는 \"자바\"를 좋아합니다";
        // 탭문자 \t
        System.out.println("번호\t이름\t직업");
        // 줄 바꿈 \n
        System.out.println("문자열내부에서\n줄을 바굽니다.");
        // 역슬래시 \\
        System.out.println("역슬래시\\");
    }
}
