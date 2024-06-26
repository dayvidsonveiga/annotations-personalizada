package br.com.annotations.controller;

import br.com.annotations.log.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    @Log
    public ResponseEntity<Void> hello() {
        return ResponseEntity.ok().build();
    }
}
