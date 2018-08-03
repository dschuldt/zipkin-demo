package de.dschuldt.worldservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldService {

    private static final Logger LOG = LoggerFactory.getLogger(WorldService.class);

    @GetMapping("/world")
    public String world() {

        LOG.info("/world endpoint called");
        return "world";
    }
}
