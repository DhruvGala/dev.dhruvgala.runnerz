package dev.dhruvgala.runnerz.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class RunRepository {

  private static final Logger log = LoggerFactory.getLogger(RunRepository.class);
  private final JdbcClient jdbcClient;

  public RunRepository(JdbcClient jdbcClient) {
    this.jdbcClient = jdbcClient;
  }

  public List<Run> findAll() {
    return jdbcClient.sql("select * from run")
        .query(Run.class)
        .list();
  }

}
