package br.com.andrergomes.springcloudstream.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class Consumer {

	@StreamListener(Sink.INPUT)
	public void readMessage(String message) {
		System.out.println("New message: " + message);
	}
}
