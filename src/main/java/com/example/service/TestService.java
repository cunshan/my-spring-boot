package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

/**
 * Created by GL on 2017/2/24.
 */
@Service
public class TestService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  public void insert(String name) throws Exception {
    logger.info("开始插入。。。");
    logger.info("结束插入。。。");
  }
}
