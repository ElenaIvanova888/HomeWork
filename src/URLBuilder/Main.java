package URLBuilder;

public class Main {
	public static void main(String[] args){
		URLBuilder url_creation1 = new URLBuilder("https://","local","8000","create","id");
		URLBuilder createWithAll = new URLBuilder.Builder().withProtocol("http://")	.withHost("local")
				.withPort("3412")
				.withPath("calculate-rate")
				.withParam("number_order").build();;
		System.out.println(url_creation1);
		System.out.println(createWithAll);
	}
}
