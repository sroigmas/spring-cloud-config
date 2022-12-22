package com.github.sroigmas.limitsservice.controller;

import com.github.sroigmas.limitsservice.config.LimitsConfig;
import com.github.sroigmas.limitsservice.dto.LimitsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
@RequiredArgsConstructor
public class LimitsController {

  private final LimitsConfig limitsConfig;

  @GetMapping
  public LimitsDto getLimits() {
    return new LimitsDto(limitsConfig.getMinimum(), limitsConfig.getMaximum());
  }
}
