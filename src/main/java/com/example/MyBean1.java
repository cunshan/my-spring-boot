package com.example;

import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by GL on 2017/7/3.
 */
@Component
public class MyBean1 implements CommandLineRunner,Ordered {

  private Logger looger = LoggerFactory.getLogger(getClass());

  @Override
  public void run(String... strings) throws Exception {
    looger.info("==================");
    looger.info("i am order one!!");
    looger.info("==================");
  }

  @Override
  public int getOrder() {
    return 1;
  }

  @PreDestroy
  public void onDestroy(){
    looger.info("==================");
    looger.info("before mybean on destroy!!");
    looger.info("==================");
  }
}
