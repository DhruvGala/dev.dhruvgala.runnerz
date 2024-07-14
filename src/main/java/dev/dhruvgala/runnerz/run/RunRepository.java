package dev.dhruvgala.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class RunRepository {

  private final List<Run> runs = new ArrayList<>();

  List<Run> findAll() {
    return runs;
  }

  Optional<Run> findById(Integer id) {
    return runs.stream()
        .filter(run -> Objects.equals(run.id(), id))
        .findFirst();
  }

  @PostConstruct
  private void init() {
    runs.add(new Run(1,
        "Monday Morning Run",
        LocalDateTime.now(),
        LocalDateTime.now().plusMinutes(30),
        3,
        Location.INDOOR));

    runs.add(new Run(2,
        "Wednesday Evening Run",
        LocalDateTime.now(),
        LocalDateTime.now().plusMinutes(60),
        6,
        Location.INDOOR));
  }
}
