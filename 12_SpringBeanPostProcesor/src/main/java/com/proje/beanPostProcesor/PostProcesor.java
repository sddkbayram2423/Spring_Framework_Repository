package com.proje.beanPostProcesor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.proje.DBConnection.DBConnection;


public class  PostProcesor implements BeanPostProcessor{
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("bean olstuktan sonra :"+beanName+": "+bean);
		
		return bean;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
	if(bean instanceof DBConnection) {
		System.out.println("olusan bean DBconnection turunde");
	}
	
	System.out.println("bean olusmadan önce :"+beanName+": "+bean);
		
		return bean;
	}

}
