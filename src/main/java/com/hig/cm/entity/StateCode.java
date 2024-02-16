package com.hig.cm.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateCode {

    @NotNull
    @Size(max=2)
    private String stcd;

    @NotNull
    @Size(max=30)
    private String name;

    @Size(max=1)
    private String wdind;

    @Size(max=1)
    private String prmmtxlctncdind;

    @Size(max=1)
    private String lglstcdind;

    public StateCode() {}
}
