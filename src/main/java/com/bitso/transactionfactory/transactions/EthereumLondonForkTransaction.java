package com.bitso.transactionfactory.transactions;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Builder
public class EthereumLondonForkTransaction implements EthereumTransaction {

    private String blockHash;
    private String input;
    private BigInteger blockNumber;
    private BigInteger gas;
    private String transactionIndex;
    private String from;
    private String to;
    private BigInteger nonce;
    private BigInteger value;
    private String hash;
    private BigDecimal baseFeePerGas;
    private BigDecimal maxPriorityFeePerGas;
    private BigDecimal maxFeePerGas;

}
