package com.sanitas.challenge.controller.converter;

import com.sanitas.challenge.controller.dto.OperationRequestDTO;
import com.sanitas.challenge.domain.OperationValues;
import org.mapstruct.Mapper;

/**
 * Interface in charge of mapping the objects referred to Operations.
 */
@Mapper
public interface OperationDTOConverter {

    OperationValues dtoToDomain(OperationRequestDTO dto);

}
