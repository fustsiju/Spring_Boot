package com.curso.ecommerce.domain.game;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Games {
    private String name;
    private Integer metacritic;
    private Integer recommendation;
    private float price;
}
