package com.geekshubs.calculator.rest;

import com.geekshubs.calculator.model.Calculator;
import com.geekshubs.calculator.service.CalculatorService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.Date;

@Path("/calculator")
public class CalculatorAPI {

    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Welcome to Java Maven Calculator Web App!!!\n" + new Date();
    }

    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public Calculator Add(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorService().Add(x, y);
    }

    @GET
    @Path("sub")
    @Produces(MediaType.APPLICATION_JSON)
    public Calculator Sub(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorService().Sub(x, y);
    }

    @GET
    @Path("mul")
    @Produces(MediaType.APPLICATION_JSON)
    public Calculator Mul(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorService().Mul(x, y);
    }

    @GET
    @Path("div")
    @Produces(MediaType.APPLICATION_JSON)
    public Calculator Div(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorService().Div(x, y);
    }
}
