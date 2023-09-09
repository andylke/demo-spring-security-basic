package com.github.andylke.demo.echo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoRestController {

  @GetMapping
  public EchoResponse get(@RequestParam Map<String, Object> parameters) {
    final EchoResponse response = new EchoResponse();
    response.setRequestParameters(parameters);
    return response;
  }

  @PostMapping
  public EchoResponse post(@RequestBody Map<String, Object> body) {
    final EchoResponse response = new EchoResponse();
    response.setRequestBody(body);
    return response;
  }
}
