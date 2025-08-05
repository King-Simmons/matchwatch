package com.matchwatch.backend.matches;

import com.matchwatch.backend.matches.dto.MatchDto;
import com.matchwatch.backend.matches.dto.MatchDto.MatchStatus;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MatchesService {
  public MatchDto getNextMatch() {
    return new MatchDto(
        1,
        "Arsenal",
        ZonedDateTime.parse("2025-08-10T14:00:00+01:00[Europe/London]"),
        List.of("NBC", "Peacock", "Fubo"),
        "Premier League",
        true,
        MatchStatus.UPCOMING,
        null,
        null);
  }
}
