package com.shiv.examples;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In after Intialization method Bean name: "+ beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In before Intialization method Bean name: "+ beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
}
