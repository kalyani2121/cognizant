
public class MutableDemo {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder("Hello");
		System.out.println("sb => "+sb);
		System.out.println("sb hashcode => "+sb.hashCode());
		sb.append(" Friends");
		System.out.println("sb => "+sb);
		System.out.println("sb hashcode => "+sb.hashCode());

	}

}
