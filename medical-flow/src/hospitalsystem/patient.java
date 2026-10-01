package hospitalsystem;

public class patient {
    private String medicalinformation;
    public String name;
    public String appointmentdate;

    public patient(String name, String appointmentdate, String medicalinformation){
        this.name = name;
        this.appointmentdate = appointmentdate;
        this.medicalinformation = medicalinformation;
    }

}
