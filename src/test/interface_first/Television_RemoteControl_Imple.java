package test.interface_first;

public class Television_RemoteControl_Imple implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
       System.out.println("TV turn ON~!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV turn OFF~!");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
        if(volume>RemoteControl.MAX_VOLUME)
        {
        	this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume < RemoteControl.MIN_VOLUME) 
        {
        	this.volume = RemoteControl.MIN_VOLUME;
        }
        else
        {
        	this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 ="+this.volume);
	}

}
