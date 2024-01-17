package hello.servlet.web.frontcontroller;

import lombok.Data;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;

@Data
public class ModelView {
    @NonNull
    private String viewName;

    private Map<String, Object> model = new HashMap<>();
}
