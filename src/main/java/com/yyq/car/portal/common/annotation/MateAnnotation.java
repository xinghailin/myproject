/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.annotation.MateAnnotation
 * Created By: mjy 
 * Created on: 2014年11月26日 下午2:56:13
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * <P>会员择偶字段标识</P>
 * @author mjy
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MateAnnotation {

}
