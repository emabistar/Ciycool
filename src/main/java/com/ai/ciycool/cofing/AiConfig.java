package com.ai.ciycool.cofing;

import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.Tokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
    @Bean
    ChatMemoryProvider chatMemoryProvider() {
        return chatId ->  MessageWindowChatMemory.withMaxMessages(10);
    }
}
