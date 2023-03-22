package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Billing implements Serializable {

    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private static final long serialVersionUID = -5854027693899153873L;


}
