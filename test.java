package java_basic;

class MyPoints {
    int x; // 인스턴스 변수
    int y; // 인스턴스 변수

    MyPoints() {
        this(0, 0);
    }

    MyPoints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)); // x, y는 인스턴스 변수
    }
}

public class test {
    public static void main(String[] args) {
        MyPoints ps = new MyPoints(1, 1);
        // p (2,2) . 와 의 거리를 구한다
        System.out.println(ps.getDistance(2, 2));

        String str = "[";
        for (int i = 0; i < 10; i++) {
            str += i + "";
        }
        str += "]";

        System.out.println(str + 1);
    }
}

// public static String change(String str) {
// return str += "456";
// }
//
// public static void main(String[] args) {
// String str = "ABC123";
// System.out.println(str);
// String a= change(str);
// System.out.println(a);
// }

// int x=8;
// int y=1;
// int z=3;

//
// int x=2;
// int y=9;
// int z=5;//**

// int x=7;
// int y=4;
// int z=9;//**

//
// int x=1;
// int y=5;
// int z=8;//**
//

// int x=3;
// int y=4;
// int z=1;//**
//

// int x=6;
// int y=8;
// int z=2;//**

// int x=2;
// int y=5;
// int z=7;//**

// int x=9;
// int y=1;
// int z=4;//**

// int a=0;
// int max=0;
// int min=0;
// int mid=0;
//
// int sum=0;
// int result=0;
//
// //max= (x > y && x > z) ? x : (y > z) ? y : z;
//
// max = x > y && x > z ? x : (y > z) ? y : z ;
// min = x < y && x < z ? x : (y < z) ? y : z ;
// sum=x+y+z;
// mid = sum - max - min;
//
// System.out.println("큰수 = "+max);
// System.out.println("작수 = "+min);
// System.out.println("중간 = "+mid);
