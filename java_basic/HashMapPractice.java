package java_basic;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, String> JoinMember = new HashMap<>();

        JoinMember.put("jyb1234", "qwer1234");
        JoinMember.put("jyb1235", "qwer1235");
        JoinMember.put("jyb1236", "qwer1236");
        JoinMember.put("jyb1237", "qwer1237");
        JoinMember.put("jyb1238", "qwer1238");
        JoinMember.put("jyb1239", "qwer1239");

        System.out.println("회원 가입을 시도해주세요.");
        System.out.print("ID을 입력해주세요.: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        System.err.println(id + "는(은) 유효한 ID입니다.");
        System.out.print("password를 입력해주세요.: ");
        String password = sc.nextLine();
        System.out.println("입력하신 pssword는 " + password + "입니다.");
        JoinMember.put(id, password);
        System.out.println("입력하신 ID" + id + "비밀번호는 " + password + "입니다.");

        while (true) {
            System.out.println("로그인을 시도해주세요.");
            String loginId = sc.nextLine();
            if (JoinMember.containsKey(loginId)) {
                System.out.println("회원입니다. password를 입력해주세요.");
                String memberPassword = sc.nextLine();
                if (JoinMember.get(loginId).equals(memberPassword)) {
                    System.out.println("로그인 되었습니다. 감사합니다.");
                } else {
                    System.out.println("비밀번호가 일치하지 않았습니다. 다시 시도해주세요");
                    continue;
                }
                break;
            } else {
                System.out.println("일치하는 ID가 없습니다. 다시 시도하거나 회원 가입을 해주세요");
                continue;
            }
        }
        System.out.println("환영합니다. 고객님");
        sc.close();
    }
}
