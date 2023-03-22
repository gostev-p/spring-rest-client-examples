package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Job implements Serializable {
    private String title;
    private String company;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private static final long serialVersionUID = -6924032055284653392L;
}
