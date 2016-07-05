/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.light4j.sso.server.uic.common.repository;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * ��ʶMyBatis��DAO,����{@link org.mybatis.spring.mapper.MapperScannerConfigurer}��ɨ�衣
 * 
 * @author calvin
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisRepository {
	String value() default "";
}