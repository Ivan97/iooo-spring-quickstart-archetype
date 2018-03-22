package tech.iooo.maven.archetypes.service.impl;

import tech.iooo.maven.archetypes.service.HelloService;

/**
 * @author Ivan97
 */
public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHello() {
    return "Hello world";
  }
}
