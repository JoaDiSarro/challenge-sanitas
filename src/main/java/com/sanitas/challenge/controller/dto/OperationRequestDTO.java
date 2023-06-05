package com.sanitas.challenge.controller.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

/**
 * Class that models a request of Operation.
 */
@Data
@Jacksonized
@Builder
public class OperationRequestDTO {

    private Double valueA;
    private Double valueB;

}
