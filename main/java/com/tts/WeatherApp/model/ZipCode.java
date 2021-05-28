package com.tts.WeatherApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//fields that I will need in order for this to resolve
@Data
@NoArgsConstructor
@Entity //every entity has a primary key (id field)
public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;

    public ZipCode(Long id, String code) {
        this.code = code;
    }

}
