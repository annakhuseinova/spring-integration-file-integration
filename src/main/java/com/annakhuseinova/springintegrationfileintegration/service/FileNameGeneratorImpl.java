package com.annakhuseinova.springintegrationfileintegration.service;

import org.springframework.integration.file.FileNameGenerator;
import org.springframework.messaging.Message;

import java.io.File;

public class FileNameGeneratorImpl implements FileNameGenerator {

    @Override
    public String generateFileName(Message<?> message) {
        File file = (File) message.getPayload();
        return file.getName();
    }
}
