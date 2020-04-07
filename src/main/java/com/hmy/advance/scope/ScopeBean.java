package com.hmy.advance.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)   //配置bean是否单例  默认是single
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class ScopeBean {

}
