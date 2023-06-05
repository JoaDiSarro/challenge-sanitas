package com.sanitas.challenge.controller.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

/**
 * Class that models a response of Operation Result.
 */
@Data
@Jacksonized
@Builder
public class OperationResultResponseDTO {

    private Double result;

}
