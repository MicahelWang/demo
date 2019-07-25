package com.example.demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configurable
@EnableRedisHttpSession
public class HttpSessionConfig {
}
