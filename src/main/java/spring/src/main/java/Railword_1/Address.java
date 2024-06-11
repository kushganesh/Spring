package Railword_1;

public class Address {

	private String dist;
	private String post;
	private String village;

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public Address(String dist, String post, String village) {
		super();
		this.dist = dist;
		this.post = post;
		this.village = village;
	}

	public Address() {

	}

	@Override
	public String toString() {
		return "Address [dist=" + dist + ", post=" + post + ", village=" + village + "]";
	}

}
