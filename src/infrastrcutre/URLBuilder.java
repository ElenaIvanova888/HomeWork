package infrastrcutre;

public class URLBuilder {
	String protocol;
	String host;
	String port;
	String path;
	String param;

	public URLBuilder(){

	}
	public URLBuilder(String protocol, String host, String port, String path, String param) {
		this.protocol = protocol;
		this.host = host;
		this.port = port;
		this.path = path;
		this.param = param;
	}

	@Override
	public String toString() {
		return "protocol='" + protocol + '\'' +
				", host='" + host + '\'' +
				", port='" + port + '\'' +
				", path='" + path + '\'' +
				", param='" + param + '\'' +
				'}';
	}
	static class Builder{
		public URLBuilder urlBuilder;
		public Builder(){
			this.urlBuilder = new URLBuilder();
		}
		public Builder withProtocol(String protocol){
			this.urlBuilder.protocol=protocol;
			return this;
		}
		public Builder withHost(String host){
			this.urlBuilder.host=host;
			return this;
		}
		public Builder withPort(String port){
			this.urlBuilder.port=port;
			return this;
		}
		public Builder withPath(String path){
			this.urlBuilder.path=path;
			return this;
		}
		public Builder withParam(String param){
			this.urlBuilder.param=param;
			return this;
		}
		public URLBuilder build(){
			return this.urlBuilder;
		}

		@Override
		public String toString() {
			return "Builder{" +
					"urlBuilder=" + urlBuilder +
					'}';
		}
	}
}
