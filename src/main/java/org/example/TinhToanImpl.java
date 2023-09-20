package org.example;
import java.util.Scanner;

import static java.util.Scanner.*;

public class TinhToanImpl implements TinhToan {
    public float tinhToan(float a, char phepTinh, float b) {
        switch (phepTinh) {
            case '+':
                return (a + b);
            case '-':
                return (a - b);
            case '*':
                return (a * b);
            case '/':
                if (b == 0) {
                    System.out.println("khong the chia cho 0");
                    return 0;
                } else return (float) (a / b);
            default:
                System.out.println("nhap phep tinh sai");
                return 0;
        }
    }
}
