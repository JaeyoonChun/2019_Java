// 20151169 천재윤
package practice4_1;

abstract class Instrument {
	private int volume; // volume은 여기에만 있어야 함
	
	Instrument(){}
	Instrument(int volume){
		this.volume = volume;
	}
	// 생성자와 메소드 추가
	int getVolume() {return volume;}
	void setVolume(int newVolume) {
		this.volume = newVolume;
	}
	
	abstract void print(); 
	abstract void volumeUp(); 
	abstract void volumeDown();
}
class Piano extends Instrument { // 생성자와 메소드 추가
	Piano(){}
	Piano(int volume){
		super(volume);
	}
	void print() {
		System.out.println("Piano volume : "+ getVolume());
	}
	void volumeUp() {
		setVolume(getVolume()+1);
	}
	void volumeDown() {
		setVolume(getVolume()-1);
	}
}
class Flute extends Instrument { // 생성자와 메소드 추가
	Flute(){}
	Flute(int volume){
		super(volume);
	}
	void print() {
		System.out.println("Flute volume : "+ getVolume());
	}
	void volumeUp() {
		setVolume(getVolume()+2);
	}
	void volumeDown() {
		setVolume(getVolume()-2);
	}
}
public class P4_20151169_1 { 
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
