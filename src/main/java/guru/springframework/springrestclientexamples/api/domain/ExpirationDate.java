package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class ExpirationDate implements Serializable {
    private String date;
    private Integer timezoneType;
    private String timezone;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private static final long serialVersionUID = -5574762513756150217L;
}
