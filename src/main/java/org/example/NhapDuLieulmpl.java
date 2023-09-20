package org.example;
import java.util.Scanner;

public class NhapDuLieulmpl implements NhapDuLieu{
    private final Scanner Scanner = new Scanner(System.in);

    public float nhapSo() {
        return Scanner.nextFloat();
    }

    public char nhapPhepTinh() {
        return Scanner.next().charAt(0);
    }
}
