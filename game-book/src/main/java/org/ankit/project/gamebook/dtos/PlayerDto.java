package org.ankit.project.gamebook.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PlayerDto implements Serializable {

    private String name;
}
