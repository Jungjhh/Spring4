package spring;

public class Client3 {
	
	
	private String host;
	
	public void setHost(String host) {
		this.host = host;
		System.out.println("Client3.setHost() 실행");
	}
	
	public void connect() throws Exception{
		System.out.println("Client3.connect() 실행");
	}
	
	public void send() {
		System.out.println("Client3.send() to " +host);
	}

	public void close() throws Exception{
		System.out.println("Client3.close() 실행");
	}
	

}
