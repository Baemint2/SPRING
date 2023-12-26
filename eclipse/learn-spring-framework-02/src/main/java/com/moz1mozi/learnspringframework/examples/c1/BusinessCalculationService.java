package com.moz1mozi.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {

		private DataSerivce dataSerivce;
		
		public BusinessCalculationService(DataSerivce dataSerivce) {
			super();
			this.dataSerivce = dataSerivce;
		}
	
	public int findMax() {
		return Arrays.stream(dataSerivce.retrieveData())
				.max().orElse(0);

}
}