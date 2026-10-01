package staff;
import hospital.patient;

public class receptionist {
    public void viewbasicdetails(patient Patient){
        System.out.println("patient name: "+Patient.name);
        System.out.println("appointment date: "+Patient.appointmentdate);
    }

}
