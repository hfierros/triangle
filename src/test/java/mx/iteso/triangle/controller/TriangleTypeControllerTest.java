package mx.iteso.triangle.controller;

import mx.iteso.triangle.dto.TriangleDto;
import mx.iteso.triangle.dto.TriangleTypeResponse;
import mx.iteso.triangle.enums.TriangleTypes;
import mx.iteso.triangle.service.TriangleType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/* This test class tests the controller, doing a direct call to it */
@SpringBootTest
class TriangleTypeControllerTest {

    @Autowired
    private TriangleTypeController triangleTypeController;

    @MockitoBean
    private TriangleType triangleType;


    @Test
    public void testTriangleTypeServiceGetTriangleType() {
        TriangleDto triangle = new TriangleDto(1L, 1L, 1L);
        when(triangleType.getTriangleType(any())).thenReturn(TriangleTypes.SCALENE);

        ResponseEntity<TriangleTypeResponse> response = triangleTypeController.getTriangleType(triangle);
        assertEquals(HttpStatusCode.valueOf(200),response.getStatusCode());
        assertEquals(TriangleTypes.SCALENE,response.getBody().getType());

    }


}