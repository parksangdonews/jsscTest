package com.simple.jssc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

@Component
public class JsscComponent {

	private static final Logger log = LoggerFactory.getLogger(JsscComponent.class);
	
	static SerialPort sp;
 
	public JsscComponent() {
		
	 	String[] portNames = SerialPortList.getPortNames();
		
		for (int i = 0; i < portNames.length; i++){
		    log.info(portNames[i]);
		}
		
		if (portNames.length < 1) log.error("JSSC port Error !!!");

		sp = new SerialPort(portNames[0]);
		
		openPort();
	}
	
	public static void openPort() {
		try {
			
			log.info("call:openPort ::"+ sp.isOpened());
			sp.openPort();
			log.info("open:openPort ::"+ sp.isOpened());
			
			
			sp.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			
		} catch (SerialPortException e) {
			log.debug("SerialPort Open Error");
			e.printStackTrace();
		}
	}
	

	public void writeInt(int input) {
		if(!sp.isOpened()) openPort();
		try {
			sp.writeInt(input);
		} catch (SerialPortException e) {
			log.debug("SerialPort Write Error");
			e.printStackTrace();
		}
	}
	
	public void writeStr(String str) {
		if(!sp.isOpened()) openPort();
		try {
			sp.writeString(str);
		} catch (SerialPortException e) {
			log.debug("SerialPort Write Error");
			e.printStackTrace();
		}
	}

	public String readStr() {
		if(!sp.isOpened()) openPort();
		try {
			return sp.readString();
		} catch (SerialPortException e) {
			log.debug("SerialPort String Read Error");
			e.printStackTrace();
		}
		return "SerialPort String Read Error";
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
