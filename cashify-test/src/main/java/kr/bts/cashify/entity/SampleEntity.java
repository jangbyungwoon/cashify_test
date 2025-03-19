package kr.bts.cashify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SampleEntity {

    @Id
    private Long id;
    private String name;

}