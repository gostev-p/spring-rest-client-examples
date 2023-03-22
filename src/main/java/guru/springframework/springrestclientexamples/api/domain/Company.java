package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@Data
public class Company implements Serializable {

    private static final long serialVersionUID = 9130890874029005239L;
    private String name;
    private String catchPhrase;
    private String bs;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
