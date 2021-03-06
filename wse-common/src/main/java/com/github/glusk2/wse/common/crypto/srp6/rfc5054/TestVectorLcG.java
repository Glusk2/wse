package com.github.glusk2.wse.common.crypto.srp6.rfc5054;

import java.math.BigInteger;
import java.nio.ByteOrder;

import com.github.glusk2.wse.common.crypto.srp6.SRP6PrecomputedValue;
import com.github.glusk2.wse.common.crypto.srp6.SRP6Integer;

public final class TestVectorLcG implements SRP6Integer {

    private static final SRP6Integer VALUE =
        new SRP6PrecomputedValue(new BigInteger("2"), ByteOrder.BIG_ENDIAN);

    @Override
    public byte[] bytes() {
        return VALUE.bytes();
    }

    @Override
    public BigInteger bigInteger() {
        return VALUE.bigInteger();
    }
}
