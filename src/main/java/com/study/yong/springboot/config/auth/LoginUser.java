package com.study.yong.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 이 어노테이션이 생성될 수 있는 위치를 지정함, PARAMTER로 지정했으니 메소드의 파라미터로 사용할 수 있음
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)

// @interface : 이 클래스를 어노테이션 클래스로 정의
public @interface LoginUser {
}