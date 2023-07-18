public class Video {
	String Name;
	boolean status;
	double rating;
	public Video(String n, boolean s, double r) {
		super();
		this.Name = n;
		this.status = s;
		this.rating = r;
	}
	public String getmName() {
		return Name;
	}
	public void setmName(String mName) {
		this.Name = mName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getRating() {
		return rating;
	}
	public double setRating(double rating) {
		return this.rating = rating;
	}
}
