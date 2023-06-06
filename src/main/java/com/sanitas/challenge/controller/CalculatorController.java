package com.sanitas.challenge.controller;

import com.sanitas.challenge.controller.converter.OperationDTOConverter;
import com.sanitas.challenge.controller.dto.OperationRequestDTO;
import com.sanitas.challenge.controller.dto.OperationResultResponseDTO;
import com.sanitas.challenge.service.ICalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * REST Controller of Calculator.
 */
@RestController()
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {

    private final ICalculatorService service;
    private final OperationDTOConverter converter;

    /**
     * Endpoint that adds two numbers.
     * @param request with the values.
     * @return result value.
     */
    @PostMapping("/addition")
    public OperationResultResponseDTO add(@Valid @RequestBody final OperationRequestDTO request){
        return OperationResultResponseDTO.builder().result(service.add(converter.dtoToDomain(request))).build();
    }

    /**
     * Endpoint that subtracts two numbers.
     * @param request with the values.
     * @return result value.
     */
    @PostMapping("/subtraction")
    public OperationResultResponseDTO subtract(@Valid @RequestBody final OperationRequestDTO request){
        return OperationResultResponseDTO.builder().result(service.subtract(converter.dtoToDomain(request))).build();
    }

}
