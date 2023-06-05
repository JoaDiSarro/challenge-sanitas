package com.sanitas.challenge.controller;

import com.sanitas.challenge.controller.converter.OperationDTOConverter;
import com.sanitas.challenge.controller.dto.OperationRequestDTO;
import com.sanitas.challenge.controller.dto.OperationResultResponseDTO;
import com.sanitas.challenge.domain.OperationValues;
import com.sanitas.challenge.service.ICalculatorService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class CalculatorControllerTest {

    private final ICalculatorService service = mock(ICalculatorService.class);
    private final OperationDTOConverter converter= mock(OperationDTOConverter.class);;

    private final CalculatorController sut = new CalculatorController(service, converter);

    private final OperationRequestDTO request = mock(OperationRequestDTO.class);
    private final OperationValues domain = mock(OperationValues.class);
    private final Double DOUBLE_VALUE = 10.0;

    @Test
    void givenOperationRequestDTO_whenAdd_thenCallConverterAndServiceAndReturnResult(){
        final OperationResultResponseDTO expectedResult = OperationResultResponseDTO.builder().result(DOUBLE_VALUE).build();
        when(converter.dtoToDomain(request)).thenReturn(domain);
        when(service.add(domain)).thenReturn(DOUBLE_VALUE);

        final OperationResultResponseDTO result = sut.add(request);

        assertThat(result).isEqualTo(expectedResult);
        verify(converter, times(1)).dtoToDomain(request);
        verify(service, times(1)).add(domain);
    }

    @Test
    void givenOperationRequestDTO_whenSubstract_thenCallConverterAndServiceAndReturnResult(){
        final OperationResultResponseDTO expectedResult = OperationResultResponseDTO.builder().result(DOUBLE_VALUE).build();
        when(converter.dtoToDomain(request)).thenReturn(domain);
        when(service.subtract(domain)).thenReturn(DOUBLE_VALUE);

        final OperationResultResponseDTO result = sut.subtract(request);

        assertThat(result).isEqualTo(expectedResult);
        verify(converter, times(1)).dtoToDomain(request);
        verify(service, times(1)).subtract(domain);
    }

}