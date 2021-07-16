package com.bitso.transactionfactory.factory;

import com.bitso.transactionfactory.factory.util.TransactionFactory;
import com.bitso.transactionfactory.transactions.EthereumLondonForkTransaction;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@NoArgsConstructor
public class EthereumLondonForkFactory implements TransactionFactory<EthereumLondonForkTransaction> {

    private BigDecimal baseFeePerGas = BigDecimal.valueOf(1);
    private BigDecimal maxPriorityFeePerGas = BigDecimal.valueOf(2);
    private BigDecimal maxFeePerGas = BigDecimal.valueOf(3);


    @Override
    public EthereumLondonForkTransaction build(String blockHash, String input, BigInteger blockNumber, BigInteger gas,
                                               String transactionIndex, String from, String to, BigInteger nonce, BigInteger value,
                                               String hash) {

        return EthereumLondonForkTransaction.builder()
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
                .baseFeePerGas(baseFeePerGas)
                .maxPriorityFeePerGas(maxPriorityFeePerGas)
                .maxFeePerGas(maxFeePerGas)
                .build();
    }
}
