package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class NhapSoTest {
    private InputStream originalSystemIn;

    @BeforeEach
    public void setUpSo() {
        originalSystemIn = System.in;
        String input = "3.14\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @AfterEach
    public void restoreSo() {
        // Đặt lại System.in sau khi test case kết thúc
        System.setIn(originalSystemIn);
    }
    @Test
    void TestnhapSo() {
        NhapDuLieulmpl nhapDuLieu = new NhapDuLieulmpl();
//        String input = "3.14\n";
//        System.setIn(new ByteArrayInputStream(input.getBytes()));

        float result = nhapDuLieu.nhapSo();
        assertEquals(3.14, result, 0.01);
    }





//    @BeforeEach
//    public void setPt() {
//        originalSystemIn = System.in;
//        String input = "+\n";
//        System.setIn(new ByteArrayInputStream(input.getBytes()));
//    }
//
//    @AfterEach
//    public void restorePt() {
//        System.setIn(originalSystemIn);
//    }
//
//    @Test
//    void TestnhapPhepTinh() {
//        NhapDuLieulmpl nhapDuLieu = new NhapDuLieulmpl();
//        char result = nhapDuLieu.nhapPhepTinh();
//
//        assertEquals('+', result);
//    }








    
}