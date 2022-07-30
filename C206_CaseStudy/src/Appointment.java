import java.time.LocalDate;

public class Appointment {
private String id;
private LocalDate apptDate;

	public Appointment(String id, LocalDate apptDate) {
		this.id = id;
		this.apptDate = apptDate;
	}
}
