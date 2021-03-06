package com.example.hrh.module.common.annotation;

import java.lang.annotation.*;


/**
 * 	关联实体类
 * @author King
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Entity {

    /**
     *  前缀
     * @return
     */
    String pre() default "";

    String name() default "";
}
