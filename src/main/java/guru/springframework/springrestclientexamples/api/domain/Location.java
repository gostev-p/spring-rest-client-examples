package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Location implements Serializable {
    private String street;
    private String city;
    private String state;
    private String postcode;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private static final long serialVersionUID = 6913061163134349685L;
}
