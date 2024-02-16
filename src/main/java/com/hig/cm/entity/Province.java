package com.hig.cm.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Province {

    @NotNull
    @Size(max=3)
    private String prvnccd;

    @NotNull
    @Size(max=30)
    private String dscrptn;

    public Province() {}
}
