package com.sanitas.challenge.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Class that models an Operation.
 */
@Data
@Builder
public class OperationValues {

    private Double valueA;
    private Double valueB;

}
