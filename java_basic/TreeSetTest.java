package java_basic;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        Set<String> set1 = new HashSet<>();

        String from = "b";
        String to = "f";

        set.add("to");
        set.add("xcv");
        set.add("tvbvo");
        set.add("bnbv");
        set.add("xsdf");
        set.add("hjkj");
        set.add("cvb");
        set.add("yui");
        set.add("hjk");
        set.add("mnmn");
        set.add("sdfe");
        set.add("tfgho");
        set.add("dfg");
        set.add("edfg");
        set.add("fgdf");
        set.add("ncvbc");
        set.add("qeq");
        set.add("asdf");
        set.add("zcvxcv");

        set1.add("to");
        set1.add("xcv");
        set1.add("tvbvo");
        set1.add("bnbv");
        set1.add("xsdf");
        set1.add("hjkj");
        set1.add("cvb");
        set1.add("yui");
        set.add("edfg");
        set1.add("hjk");
        set1.add("mnmn");
        set1.add("sdfe");
        set1.add("tfgho");
        set1.add("dfg");
        set1.add("fgdf");
        set1.add("ncvbc");
        set1.add("qeq");
        set1.add("asdf");
        set1.add("zcvxcv");

        System.out.println(set);
        System.out.println(set1);

        System.out.println("range search: from " + from + " to : " + to);
        System.out.println("result1: " + set.subSet("b", "f"));
        System.out.println("result2: " + set.subSet(from, "zcvxcv"));
    }
}