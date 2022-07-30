
public class Feedback {
private String id;
private String description;
private String status;
private String response;

	public Feedback(String id, String description, String status) {
		this.id = id;
		this.description = description;
		this.status = status;
		this.response = "";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
}
