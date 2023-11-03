package java_basic;

public class StarTest {

    public static void main(String[] args) {

        System.out.println("*");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.printf("*****");
            }
            System.out.println();
            System.out.println();

        }

        System.out.println("1-1번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[" + i + "]" + "[" + j + "]  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("1-2번");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                int x = j;
                int y = i;
                System.out.printf("[" + y + "]" + "[" + x + "]  ");
            }
            System.out.println();
        }

        System.out.println("2번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println();
        System.out.println();

        System.out.println("2-1번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("3번");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println();
        System.out.println();

        System.out.println("3-1번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("4번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i + j == 6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("5번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i < j) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("6번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j >= 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("6-1번");
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 6; k++) {
                if (i + k <= 6 || i >= k) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();

        }
        // System.out.println("6번");
        // for(int i=1; i<=5; i++) {
        // for(int j=5; j>i; j--) {
        // System.out.print(" ");
        // }
        // for(int k=1; k<=i; k++) {
        // System.out.print("*");
        // }
        //
        // System.out.println();
        // }

        System.out.println();
        System.out.println();

        System.out.println("7번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i + 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("8번");
        // for(int i=1; i<=5; i++) {
        // for(int j=5; j>i; j--) {
        // System.out.print(" ");
        // }
        // for(int k=1; k<=(2*i)-1; k++) {
        // System.out.print("*");
        // }
        //
        // System.out.println();
        // }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i + 4; j++) {
                if (i + j < 6) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("9번 == 5번과 6번 합쳐서 교집함 빼기");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j > 6 && i > j) {
                    System.out.print(" ");
                } else if (i + j >= 6 || i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("9-1번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i + j <= 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        // for(int i=1; i<=5; i++) {
        // for(int j=1; j<=i+4; j++) {
        // if(i+j<6) {
        // System.out.print(" ");
        // }else {
        // System.out.print("*");
        // }
        // }
        //
        // System.out.println();
        // }
        //
        // for(int i=5; i>=1; i--) {
        // for(int j=1; j<=i+4; j++) {
        // if(i+j<6) {
        // System.out.print(" ");
        // }else {
        // System.out.print("*");
        // }
        // }
        //
        // System.out.println();
        // }
        //

        System.out.println("9-2번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i < j && i + j <= 5) {
                    System.out.print(" ");
                } else if (i > j && i + j >= 7) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("10번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i > j && i + j <= 5) {
                    System.out.print(" ");
                } else if (i < j && i + j >= 7) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
