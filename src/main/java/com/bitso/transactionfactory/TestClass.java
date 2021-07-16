package com.bitso.transactionfactory;

import com.bitso.transactionfactory.factory.util.TransactionFactoryRegistry;
import com.bitso.transactionfactory.transactions.EthereumLegacyTransaction;
import com.bitso.transactionfactory.transactions.EthereumLondonForkTransaction;

import java.math.BigInteger;

public class TestClass {

    public static void main(String[] args) {
        EthereumLegacyTransaction ethTx = TransactionFactoryRegistry.build(EthereumLegacyTransaction.class, "blockHash", "input",
                BigInteger.ONE, BigInteger.ZERO, "transactionIndex", "from", "to", BigInteger.ONE,
                BigInteger.valueOf(10), "hash");

        EthereumLondonForkTransaction ethLf = TransactionFactoryRegistry.build(EthereumLondonForkTransaction.class, "blockHash", "input",
                BigInteger.ONE, BigInteger.ZERO, "transactionIndex", "from", "to", BigInteger.ONE,
                BigInteger.valueOf(10), "hash");

        System.out.println(ethTx.toString());
        System.out.println(ethLf.toString());
    }
}
