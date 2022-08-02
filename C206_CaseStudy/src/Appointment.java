import java.time.LocalDate;

public class Appointment {
private String id;
private LocalDate apptDate;
private String attendeeName;

	public Appointment(String id, LocalDate apptDate, String attendeeName) {
		this.id = id;
		this.apptDate = apptDate;
		this.attendeeName = attendeeName;
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

	public String getAttendeeName() {
		return attendeeName;
	}

	public void setAttendeeName(String attendeeName) {
		this.attendeeName = attendeeName;
	}
}
