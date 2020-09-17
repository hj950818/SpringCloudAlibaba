package com.hujian.common.swagger.zhujie;

import com.hujian.common.swagger.config.SwaggerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
//@Import({SwaggerConfig.class})
public @interface EnableHJSwagger {
}
