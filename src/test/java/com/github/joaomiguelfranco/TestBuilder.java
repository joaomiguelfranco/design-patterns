package com.github.joaomiguelfranco;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestBuilder {

    private Builder builder = new Builder();

    @Test
    public void testCheckSum() {
        val expected = 3;
        val actual = builder.sum(1, 2 );
        assertThat(actual, equalTo(expected));
    }

}
