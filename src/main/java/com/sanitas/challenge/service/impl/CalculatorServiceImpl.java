package com.sanitas.challenge.service.impl;

import com.sanitas.challenge.domain.OperationValues;
import com.sanitas.challenge.service.ICalculatorService;
import io.corp.calculator.TracerImpl;
import org.springframework.stereotype.Service;

/**
 * Service implementation of CalculatorService.
 */
@Service
public class CalculatorServiceImpl implements ICalculatorService {

    private final TracerImpl tracer;

    public CalculatorServiceImpl() {
        this.tracer = new TracerImpl();
    }

    /**
     * Process that adds two numbers.
     *
     * @param operation with the values.
     * @return result value.
     */
    @Override
    public Double add(OperationValues operation) {
        Double result = operation.getValueA() + operation.getValueB();
        tracer.trace(result);
        return result;
    }

    /**
     * Endpoint that subtracts two numbers.
     *
     * @param operation with the values.
     * @return result value.
     */
    @Override
    public Double subtract(OperationValues operation) {
        Double result = operation.getValueA() - operation.getValueB();
        tracer.trace(result);
        return result;
    }

}
