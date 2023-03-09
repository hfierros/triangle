package mx.iteso.triangle.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TriangleDto {

    @Positive
    Long sideA;

    @Positive
    Long sideB;

    @Positive
    Long sideC;

}
