
public class Interface {
	private static final String String = null;

	public static void main(String [] args) {
Spider sp=new Spider();
Cat ct=new Cat();
Fish fh=new Fish();
fh.setName("Mimi");
fh.getName();
fh.eat();
fh.walk();
fh.setName("Momo");
fh.getName();
ct.setName("Fluffy");
ct.getName();
ct.walk();
ct.eat();
ct.setName("Moose");
ct.getName();
sp.eat();
sp.walk();
}
}
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk(){
		System.out.println("This animal walks on "+legs+" legs");
	}
}
class Spider extends Animal{
	Spider(){
		super(8);
	}
	public void eat() {
		System.out.println("Spider eats insects");
	}
}
interface Pet{
	String getName();
	void setName(String name);
	void play();
}
class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name){
		super(4);
		this.name=name;
	}
	Cat(){
		this("");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		System.out.println("Cat's name is "+this.name);
		return this.name;
	}
	public void eat() {
		System.out.println("Cat eat fishes");
	}
	public void play() {
		System.out.println("Cat is playing");
	}
}
class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		System.out.println("Fish's name is "+this.name);
		return this.name;
		
	}
	public void eat() {
		System.out.println("Fish eats plants");
	}
	public void play() {
		System.out.println("Fish is playing");
	}
	public void walk(){
		System.out.println("Fish can't walk ");
	}
	}