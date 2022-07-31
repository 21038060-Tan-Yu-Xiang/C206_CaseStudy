import java.time.LocalDate;

public class Appointment {
private String id;
private LocalDate apptDate;

	public Appointment(String id, LocalDate apptDate) {
		this.id = id;
		this.apptDate = apptDate;
	}
	
	
	public String getId() {
		return id;
	}

	public LocalDate getApptDate() {
		return apptDate;
	}

	public void setApptDate(LocalDate apptDate) {
		this.apptDate = apptDate;
	}
}
