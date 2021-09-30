package ch.codesmith.vault_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${messageProperty}")
    String message;

    @Value("${excited:n/a}")
    String excited;

    @GetMapping("/")
    public String index() {
        return message + " " + excited;
    }

}
