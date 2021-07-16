package com.bitso.transactionfactory.factory.util;

import java.math.BigInteger;

public interface TransactionFactory<T> {

    T build(String blockHash, String input, BigInteger blockNumber,
            BigInteger gas, String transactionIndex,
            String from, String to, BigInteger nonce, BigInteger value,
            String hash);
}
