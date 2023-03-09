package mx.iteso.triangle.controller;

import mx.iteso.triangle.dto.TriangleDto;
import mx.iteso.triangle.dto.TriangleTypeResponse;
import mx.iteso.triangle.enums.TriangleType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleTypeController {

    @PostMapping(path="/type")
    ResponseEntity<TriangleTypeResponse> getTriangleType(
            @RequestBody TriangleDto triangle) {

        return new ResponseEntity<>(TriangleTypeResponse.builder()
                .type(TriangleType.ISOCELES).build(), HttpStatus.OK);
    }
}
