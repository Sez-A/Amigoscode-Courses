package com.fraud.service;

public interface FraudCheckService {
    boolean isFraudulentCustomer(Long customerId);
}
