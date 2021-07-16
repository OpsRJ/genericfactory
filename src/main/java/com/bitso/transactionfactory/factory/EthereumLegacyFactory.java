package com.bitso.transactionfactory.factory;

import com.bitso.transactionfactory.factory.util.TransactionFactory;
import com.bitso.transactionfactory.transactions.EthereumLegacyTransaction;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@NoArgsConstructor
public class EthereumLegacyFactory implements TransactionFactory<EthereumLegacyTransaction> {

    private final BigInteger gasPrice = BigInteger.valueOf(1);

    @Override
    public EthereumLegacyTransaction build(String blockHash, String input, BigInteger blockNumber, BigInteger gas,
                                           String transactionIndex, String from, String to, BigInteger nonce, BigInteger value,
                                           String hash) {

        return EthereumLegacyTransaction.builder()
                .blockHash(blockHash)
                .input(input)
                .blockNumber(blockNumber)
                .gas(gas)
                .transactionIndex(transactionIndex)
                .from(from)
                .to(to)
                .nonce(nonce)
                .value(value)
                .hash(hash)
                .gasPrice(gasPrice)
                .build();
    }
}
