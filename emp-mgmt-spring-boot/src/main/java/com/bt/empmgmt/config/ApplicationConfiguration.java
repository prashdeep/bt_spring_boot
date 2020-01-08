package com.bt.empmgmt.config;

import org.hibernate.validator.constraints.Range;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotBlank;
import java.util.List;

@ConfigurationProperties(prefix = "app")
@Configuration
public class ApplicationConfiguration {

    @NotBlank
    private String username;

    @Range(min = 10, max = 15, message = "Range should be between 10 and 15")
    private int noOfUsers;

    public List<String> getLocations() {
        return locations;
    }

    private List<String> locations;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNoOfUsers() {
        return noOfUsers;
    }

    public void setNoOfUsers(int noOfUsers) {
        this.noOfUsers = noOfUsers;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }
}