package com.matchwatch.backend.matches.dto;

import java.time.ZonedDateTime;
import java.util.List;

public record MatchDto(int matchId,
    String opponent,
    ZonedDateTime dateTime,
    List<String> streamingOptions,
    String competition,
    boolean isHome,
    MatchStatus status,
    Integer teamScore,
    Integer opponentScore) {

  public enum MatchStatus {
    UPCOMING,
    LIVE,
    FINISHED,
    POSTPONED,
    CANCELED
  }
}
