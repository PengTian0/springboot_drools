package com.dell.mars.PACS.rest.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dell.mars.PACS.rest.model.Rule;

@RestController
@RequestMapping("rules/")
public class RulesController {

    private static final String template = "The sample rule: %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
    public Rule showRule(@PathVariable Integer id) {
        return new Rule(counter.incrementAndGet(),
                            String.format(template, id));
    }
}
