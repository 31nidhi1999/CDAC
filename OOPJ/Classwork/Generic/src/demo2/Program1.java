/*Commonly used type parameter names in Java
T : Type
N : Number
K : Key
V : Value
E : Element
S, U, R : Second type parameter names*/



package demo2;



class Hashtable<K, V>{
	private K key;
	private V value;
	
	public Hashtable(K key,V value) {
		this.key = key;
		this.value=value;
	}
	
	public V getValue() {
		return value;
	}
	
	public K getKey() {
		return key;
	}
}

public class Program1 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<>(1,"Nidhi");
		
		Integer i = ht.getKey();
		String str = ht.getValue();
		
		System.out.println(i + " "+str);
	}
	
}
