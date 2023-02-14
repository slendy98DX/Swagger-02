package co.develhope.Swagger02.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArithmeticOperation {

    private String name;
    private Integer minNumberOfOperands;
    private String description;
    private String[] properties;
}
