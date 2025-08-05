package com.matchwatch.backend.matches;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matchwatch.backend.matches.dto.MatchDto;

@RestController
@RequestMapping("/api/matches")
public class MatchesController {
  private final MatchesService matchesService;

  public MatchesController(MatchesService matchesService) {
    this.matchesService = matchesService;
  }

  /**
   * @return the next upcoming match
   */
  @GetMapping
  public MatchDto getNextMatch() {
    return matchesService.getNextMatch();
  }
}
