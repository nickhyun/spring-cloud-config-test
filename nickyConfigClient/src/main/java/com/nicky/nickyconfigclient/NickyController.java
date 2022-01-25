package com.nicky.nickyconfigclient;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class NickyController {

    private final NickyConfig nickyConfig;

    @GetMapping("/")
    public void index(){
        log.info("{}", nickyConfig);
    }
}
