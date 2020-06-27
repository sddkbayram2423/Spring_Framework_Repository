package com.proje.factorypostprosesor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactory implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Context dosyasi okunurken yapilan islemler");
		System.out.println(beanFactory.getBeanDefinitionCount());
		System.out.println(beanFactory.getBeanPostProcessorCount());
		System.out.println(beanFactory.getSingletonMutex());
		
	}

}
