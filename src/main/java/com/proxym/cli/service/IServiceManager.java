package com.proxym.cli.service;

import java.util.List;

public interface IServiceManager {
    public ServiceObject findByName(String name);
    public ServiceObject save(ServiceObject serviceObject);
}