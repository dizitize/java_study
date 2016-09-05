package test.interface_first;

public class SmartTV_Searchable_imple_Remote_imple implements RemoteControl, Searchable {

	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

		System.out.println("SMART TV  Turn ON!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SMART TV  Turn OFF!");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

		if(volume > RemoteControl.MAX_VOLUME)
		{
            this.volume=RemoteControl.MAX_VOLUME;			
		}
		else if(volume < RemoteControl.MIN_VOLUME)
		{
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else
		{
			this.volume = volume;
		}
      System.out.println("현재 SMART TV 볼륨 ="+this.volume);
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
        System.out.println("SMART TV "+url+"을 검색 합니다.");
	}
}
