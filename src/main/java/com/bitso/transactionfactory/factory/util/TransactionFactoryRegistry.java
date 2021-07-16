package com.bitso.transactionfactory.factory.util;

import com.bitso.transactionfactory.factory.EthereumLegacyFactory;
import com.bitso.transactionfactory.factory.EthereumLondonForkFactory;
import com.bitso.transactionfactory.transactions.EthereumLegacyTransaction;
import com.bitso.transactionfactory.transactions.EthereumLondonForkTransaction;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
public abstract class TransactionFactoryRegistry {

    private static final Map<Class<?>, TransactionFactory<?>> factoryMap = new HashMap<>();

    static {
        factoryMap.put(EthereumLegacyTransaction.class, new EthereumLegacyFactory());
        factoryMap.put(EthereumLondonForkTransaction.class, new EthereumLondonForkFactory());
    }

    public static <T> T build(Type typeTarget, String blockHash, String input, BigInteger blockNumber, BigInteger gas,
                              String transactionIndex, String from, String to, BigInteger nonce, BigInteger value,
                              String hash) {

        if (Objects.isNull(typeTarget) || !factoryMap.containsKey(typeTarget)) {
            log.debug("No factory found for the type: " + typeTarget.getTypeName());
        }

        return (T) factoryMap.get(typeTarget).build(blockHash, input, blockNumber, gas, transactionIndex, from, to, nonce,
                                value, hash);
    }
}
