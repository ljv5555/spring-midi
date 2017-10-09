package org.verderbergroup.midi;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

// import org.springframework.boot.SpringBootApplication;
//import org.springframework.boot.SpringApplication;


@org.springframework.boot.autoconfigure.SpringBootApplication
public class MidiApplication {

	@org.springframework.context.annotation.Bean
	public static String[] getParameters(){return new String[]{"--list-devices"};}

	public static void main(String[] args) {
	  System.out.println("args.length="+args.length);
	  for(String arg : args){System.out.println("arg: "+arg);}
	  org.springframework.boot.
          SpringApplication.run(MidiApplication.class, args);
		//new MidiApplication(args);
	}
	
	

	public MidiApplication(String[] args) {
		if(args.length>0 && "--list-devices".equals(args[0]))
		{
			javax.sound.midi.MidiDevice.Info[] deviceInfo = MidiSystem.getMidiDeviceInfo();
			for(int i=0;i<deviceInfo.length;i++) {
				MidiDevice md;
				try {
					md = MidiSystem.getMidiDevice(deviceInfo[i]);
					
					System.out.println("device: inputs="+md.getMaxReceivers()+" outputs="+md.getMaxTransmitters()+" ---- "+deviceInfo[i].getName()+"----"+deviceInfo[i].getDescription());
					
				} catch (MidiUnavailableException e) {
					e.printStackTrace();
				}
				
			}
		}
		else
		{
			System.out.println("Usage: java -jar jmidi.jar --list-devices");
		}
	}
}
