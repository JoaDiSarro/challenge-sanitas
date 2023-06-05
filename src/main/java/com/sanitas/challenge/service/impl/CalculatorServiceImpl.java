package com.sanitas.challenge.service.impl;

import com.sanitas.challenge.domain.OperationValues;
import com.sanitas.challenge.service.ICalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Service implementation of CalculatorService.
 */
@Service
@RequiredArgsConstructor
public class CalculatorServiceImpl implements ICalculatorService {

    /**
     * Process that adds two numbers.
     * @param operation with the values.
     * @return result value.
     */
    @Override
    public Double add(OperationValues operation) {
        return operation.getValueA() + operation.getValueB();
    }

    /**
     * Endpoint that subtracts two numbers.
     * @param operation with the values.
     * @return result value.
     */
    @Override
    public Double subtract(OperationValues operation) {
        return operation.getValueA() - operation.getValueB();
    }

}
