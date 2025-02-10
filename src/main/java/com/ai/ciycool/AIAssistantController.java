package com.ai.ciycool;

import com.ai.ciycool.agents.TransactionAssistantAgent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public  class AIAssistantController {

    private TransactionAssistantAgent transactionAssistantAgent;

    public AIAssistantController(TransactionAssistantAgent transactionAssistantAgent) {
        this.transactionAssistantAgent = transactionAssistantAgent;
    }
    @GetMapping("/askAgent")
    public String chat(@RequestParam(defaultValue = "Hello  from Agent" )String question) {
        return  transactionAssistantAgent.chat(question);
    }




}
