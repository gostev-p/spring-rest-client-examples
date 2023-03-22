package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@Data
public class Geo implements Serializable {
    private static final long serialVersionUID = -5906559771996278003L;
    private String lat;
    private String lng;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
