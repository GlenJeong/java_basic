package java_basic;

import java.util.stream.Collectors;
import java.util.*;

public class StreamAssist {

    public static void main(String[] args) {
        List<Coustomer> coustomers = new ArrayList<>();

        coustomers.add(new Coustomer("정인범", 35));
        coustomers.add(new Coustomer("정인용", 35));
        coustomers.add(new Coustomer("전현정", 31));
        coustomers.add(new Coustomer("이승훈", 36));
        coustomers.add(new Coustomer("김창규", 28));
        coustomers.add(new Coustomer("정성우", 29));
        coustomers.add(new Coustomer("김아영", 27));

        List<String> coustomersNames = coustomers.stream()
                .filter(coustomer -> coustomer.getAge() < 30)
                .sorted()
                .map(Coustomer::getName)
                .collect(Collectors.toList());

        System.out.println();

        for (String name : coustomersNames) {
            System.out.println(name);
        }

        System.out.println();

        for (Coustomer name : coustomers) {
            System.out.println(name.getName());
        }

        System.out.println();

        List<Coustomer> list = new ArrayList<>();
        for (Coustomer coustomer : coustomers) {
            if (coustomer.getAge() < 30) {
                list.add(coustomer);

            }
        }

        System.out.println();

        Collections.sort(list);
        List<String> results = new ArrayList<>();
        for (Coustomer coustomer : list) {
            results.add(coustomer.getName());
        }

        System.out.println();

        for (String name : results) {
            System.out.println(name);
        }
    }
}
