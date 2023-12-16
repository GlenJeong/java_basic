package java_basic;

import java.util.*;

public class QueuePractice {
    static Queue<String> queue = new LinkedList<>();
    static final int MAX_SIZE = 10;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">>");

            try {
                // 화면으로부터 라인 단위로 입력 받는다.
                Scanner scanner = new Scanner(System.in);
                // trim은 입력 받는 라인에서 맨 앞, 맨 뒤의 공백을 제거한다.
                String input = scanner.nextLine().trim();

                if ("".equals(input))
                    continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);
                    LinkedList<String> list = (LinkedList<String>) queue;

                    final int SIZE = list.size();
                    for (int i = 0; i < SIZE; i++) {
                        System.out.println((i + 1) + " " + list.poll());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력 오류입니다.");
            }
        }
    }

    private static void save(String input) {
        // queue 저장한다.
        if (!"".equals(input))
            queue.offer(input);

        // queue의 크키가 MAX_SIZE 넣어가면 처음 입력한 것을 삭제한다.
        if (queue.size() > MAX_SIZE)
            queue.remove();
    }
}
