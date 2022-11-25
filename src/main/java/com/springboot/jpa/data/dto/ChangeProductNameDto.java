package com.springboot.jpa.data.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChangeProductNameDto {

    private Long number;

    private String name;

}