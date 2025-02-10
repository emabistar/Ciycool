package com.ai.ciycool;


import com.ai.ciycool.agents.TransactionAssistantAgent;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.chat.ChatLanguageModelExtensionsKt;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@SuppressWarnings("ALL")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GreetingController {

    ChatLanguageModel chatLanguageModel;

        public GreetingController(ChatLanguageModel chatLanguageModel, TransactionAssistantAgent transactionAssistantAgent) {
            this.chatLanguageModel = chatLanguageModel;

        }

        @GetMapping("/chat")
        public String index(@RequestParam( defaultValue="Hello from CTL") String question) {
            return  chatLanguageModel.chat(question);
        }



}
