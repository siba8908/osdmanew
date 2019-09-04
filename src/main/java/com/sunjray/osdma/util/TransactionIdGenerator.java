package com.sunjray.osdma.util;

import java.util.function.Supplier;

import javax.ejb.Singleton;

import org.apache.commons.text.RandomStringGenerator;
import org.springframework.stereotype.Component;

@Singleton
@Component
public class TransactionIdGenerator implements Supplier<String> {

	private RandomStringGenerator transactionIdGenerator;

	public TransactionIdGenerator() {
		transactionIdGenerator = new RandomStringGenerator.Builder()
	                .withinRange('0', 'z')
	                .filteredBy(t -> t >= '0' && t <= '9', t -> t >= 'A' && t <= 'Z', t -> t >= 'a' && t <= 'z')
	                .build();
	}

	@Override
	public String get() {
		
		return transactionIdGenerator.generate(10);
	}	
}
