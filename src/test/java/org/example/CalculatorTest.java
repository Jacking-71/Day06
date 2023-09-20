package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    @Test
    public void TestAddition() {
        TinhToan tinhToan = new TinhToanImpl();
        float result = tinhToan.tinhToan(3,'+',2);
        assertEquals(5, result);
    }
    @Test
    public void TestDivision() {
        TinhToan tinhToan = new TinhToanImpl();
        float result = tinhToan.tinhToan(12,'/',3);
        assertEquals(4, result);
    }
    @Test
    public void TestSubtraction() {
        TinhToan tinhToan = new TinhToanImpl();
        float result = tinhToan.tinhToan(20,'-',4);
        assertEquals(16, result);
    }
    @Test
    public void TestMultiplication() {
        TinhToan tinhToan = new TinhToanImpl();
        float result = tinhToan.tinhToan(20,'*',4);
        assertEquals(80, result);
    }
}