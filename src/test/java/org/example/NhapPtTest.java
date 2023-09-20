package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class NhapPtTest {
    private InputStream originalSystemIn;

    @BeforeEach
    public void setPt() {
        originalSystemIn = System.in;
        String input = "+\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @AfterEach
    public void restorePt() {
        System.setIn(originalSystemIn);
    }

    @Test
    void TestnhapPhepTinh() {
        NhapDuLieulmpl nhapDuLieu = new NhapDuLieulmpl();
        char result = nhapDuLieu.nhapPhepTinh();

        assertEquals('+', result);
    }









}