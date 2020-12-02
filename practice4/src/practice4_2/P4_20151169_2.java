// 20151169 천재운
package practice4_2;

interface Instrument{
	void print(); 
	void volumeUp(); 
	void volumeDown();
}

class Instrument2 {
	private int volume; // volume은 여기에만 있어야 함
	Instrument2(){}
	Instrument2(int volume){
		this.volume = volume;
	}
	int getVolume() {return volume;}
	void setVolume(int newVolume) {
		this.volume = newVolume;
	}
}

class Piano extends Instrument2 implements Instrument { // 생성자와 메소드 추가
	Piano(){}
	Piano(int volume){
		super(volume);
	}
	public void print() {
		System.out.println("Piano volume : "+ getVolume());
	}
	public void volumeUp() {
		setVolume(getVolume()+1);
	}
	public void volumeDown() {
		setVolume(getVolume()-1);				
	}
}

class Flute extends Instrument2 implements Instrument { // 생성자와 메소드 추가
	Flute(){}
	Flute(int volume){
		super(volume);
	}
	public void print() {
		System.out.println("Flute volume : "+ getVolume());
	}
	public void volumeUp() {
		setVolume(getVolume()+2);
	}
	public void volumeDown() {
		setVolume(getVolume()-2);
	}
}
public class P4_20151169_2 { 
	public static void main(String[] args) { 
		Piano p1 = new Piano(10); 
		Piano p2 = new Piano(20); 
		Flute f = new Flute(100); 
		p1.volumeUp(); 
		p2.volumeUp(); 
		f.volumeUp(); 
		p1.volumeUp(); 
		f.volumeUp(); 
		f.volumeUp(); 
		p2.volumeDown(); 
		p1.print(); 
		p2.print(); 
		f.print(); 
	}
}
