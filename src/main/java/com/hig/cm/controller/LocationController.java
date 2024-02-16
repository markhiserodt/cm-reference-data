package com.hig.cm.controller;

import com.hig.cm.entity.Province;
import com.hig.cm.entity.StateCode;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SecurityScheme(
    name = "Authorization",
    type = SecuritySchemeType.HTTP,
    bearerFormat = "JWT",
    scheme = "bearer"
)
@RestController
@RequestMapping("/location")
public class LocationController {

    @SecurityRequirement(name = "Authorization")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Retrieved state codes"),
    })
    @GetMapping(value = "getStateCodes")
    public List<StateCode> getStateCodes() {
        return new ArrayList<StateCode>();
    }

    @SecurityRequirement(name = "Authorization")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retrieved province details"),
    })
    @GetMapping(value = "getProvinceDetails")
    public List<Province> getProvinceDetails() {
        return new ArrayList<Province>();
    }
}
