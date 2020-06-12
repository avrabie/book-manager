package ro.carti.orfane.bookmanager.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
@Log4j2
public class TestController {

    @GetMapping
    public Mono<String> testing() {
//        https://gist.github.com/mshafrir/2646763#file-states_hash-json
//        String url ="https://gist.github.com/mshafrir/2646763#file-states_hash-json";
        String url ="https://gist.githubusercontent.com/mshafrir/2646763/raw/8b0dbb93521f5d6889502305335104218454c2bf/states_hash.json";
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(url, String.class);
        return Mono.just(forObject);

    }
}
