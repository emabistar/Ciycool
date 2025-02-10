package com.ai.ciycool.agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@AiService
@Component
public interface TransactionAssistantAgent {
    @SystemMessage("""
         You are a database expert  Answer the user's  question using the provide  context, you need to act professional and ask for addition information if  not clearr,
         in order to give consise response. 
        """)
    String chat(String question);
}
