package org.example;

import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st = sc.nextLine();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (st.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }
            int count = 0;
            for (int k = 0; k < st.length(); k++) {
                if (st.charAt(k) == ch) {
                    count++;
                }
            }
            System.out.println(ch + " = " + count);
        }
        sc.close();
    }
}
