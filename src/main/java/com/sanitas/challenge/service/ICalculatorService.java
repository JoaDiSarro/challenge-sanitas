package com.sanitas.challenge.service;

import com.sanitas.challenge.domain.OperationValues;

/**
 * Service for Calculator.
 */
public interface ICalculatorService {

    /**
     * Process that adds two numbers.
     * @param operation with the values.
     * @return result value.
     */
    Double add(OperationValues operation);

    /**
     * Endpoint that subtracts two numbers.
     * @param operation with the values.
     * @return result value.
     */
    Double subtract(OperationValues operation);

}
