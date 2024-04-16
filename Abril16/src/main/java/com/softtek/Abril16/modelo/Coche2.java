package com.softtek.Abril16.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class Coche2 {
    private String matricula;
    private String modelo;
}
