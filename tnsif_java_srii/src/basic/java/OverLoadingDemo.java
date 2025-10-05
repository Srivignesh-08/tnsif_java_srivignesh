package basic.java;

public class OverLoadingDemo {
	void sound() {
		System.out.println("animal can make a sound");
	}

}

class cat extends AnimalDemo{
	void sound() {
		System.out.println("cat makes a sound");
	}
}