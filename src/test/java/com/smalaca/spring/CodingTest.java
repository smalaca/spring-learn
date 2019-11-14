package com.smalaca.spring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CodingTest {
    @Test
    void shouldRecognizeIsCodingFun() {
        Coding coding = new Coding();

        assertThat(coding.isFun()).isTrue();
    }
}
