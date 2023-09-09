package com.github.andylke.demo.echo;

import java.util.Map;

import lombok.Data;

@Data
public class EchoResponse {

  private Map<String, Object> requestParameters;

  private Map<String, Object> requestBody;
}
