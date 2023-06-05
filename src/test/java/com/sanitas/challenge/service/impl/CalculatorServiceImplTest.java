package com.sanitas.challenge.service.impl;

import com.sanitas.challenge.domain.OperationValues;
import com.sanitas.challenge.service.ICalculatorService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculatorServiceImplTest {

    private final ICalculatorService sut = new CalculatorServiceImpl();
    private final OperationValues domain = mock(OperationValues.class);
    private final Double VALUE_A = 10.0;
    private final Double VALUE_B = 2.0;

    @Test
    void givenOperationValues_whenAdd_thenAddValuesAndReturnResult(){
        final Double expectedResult = VALUE_A + VALUE_B;
        setWhenForDomain();

        final Double result = sut.add(domain);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void givenOperationValues_whenSubtract_thenSubtractValuesAndReturnResult(){
        final Double expectedResult = VALUE_A - VALUE_B;
        setWhenForDomain();

        final Double result = sut.subtract(domain);

        assertThat(result).isEqualTo(expectedResult);
    }

    private void setWhenForDomain(){
        when(domain.getValueA()).thenReturn(VALUE_A);
        when(domain.getValueB()).thenReturn(VALUE_B);
    }

}