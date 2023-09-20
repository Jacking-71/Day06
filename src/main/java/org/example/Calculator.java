package org.example;
//import Day02.TinhToan;
public class Calculator {
    public void main(String[] args) {
        float ketQua = 0;
        TinhToan tinhToan = new TinhToanImpl();
        NhapDuLieu nhapDuLieu = new NhapDuLieulmpl();
//        while (true) {
            System.out.println("Nhap so thu nhat");
            float a = nhapDuLieu.nhapSo();
            System.out.println("Nhap phep tinh");
            char phepTinh = (char) nhapDuLieu.nhapPhepTinh();
            System.out.println("Nhap so thu hai");
            float b = nhapDuLieu.nhapSo();
            ketQua = tinhToan.tinhToan(a, phepTinh, b);
            if (ketQua != 0) System.out.println("Ket qua la: " + ketQua);
            System.out.println("--------------------");
        //}
    }
}
