package com.qfox.radio.sample;

import com.qfox.radio.annotation.Channel;
import com.qfox.radio.annotation.Message;
import com.qfox.radio.annotation.Station;
import com.qfox.radio.core.Broadcaster;

@Station
public class RadioStation2 {

	@Channel(frequency = "sing", broadcaster = Broadcaster.SYNCHRONOUS)
	public Integer sing(@Message("song") String song) {
		System.out.println("radio station singing song : " + song);
		return 2;
	}

}
