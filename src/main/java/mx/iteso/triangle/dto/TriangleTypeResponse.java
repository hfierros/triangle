package mx.iteso.triangle.dto;

import lombok.Builder;
import lombok.Data;
import mx.iteso.triangle.enums.TriangleType;

@Data
@Builder
public class TriangleTypeResponse {

    TriangleType type;

}
