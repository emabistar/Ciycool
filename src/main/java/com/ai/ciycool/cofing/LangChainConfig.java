package com.ai.ciycool.cofing;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class LangChainConfig {

        @Bean
        public ChatLanguageModel chatLanguageModel() {
            return OpenAiChatModel.builder()
            
                    .build();
        }}



