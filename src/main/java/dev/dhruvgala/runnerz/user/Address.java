package dev.dhruvgala.runnerz.user;

public record Address(
    String street,
    String suites,
    String city,
    String zipcode,
    Geo geo
) { }
