package com.codecrafters.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logic
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component
public class ConfigurationService {
 
    private final String hostService;
 
    @Autowired
    public ConfigurationService(@Value("${gwt.server.url}") String hostServer) {
        this.hostService = hostServer;
    }

    public String getHostServer() {
        return hostService;
    }
}
