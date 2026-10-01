import staff.receptionist;
import hospitalsystem.doctor;
import hospitalsystem.patient;

public class Main {
    public static void main(String[]args){
        patient Patient = new patient("John", "15 October 2026", "Patient has malaria.");
        doctor Doctor = new doctor();
        receptionist Receptionist = new receptionist();

        System.out.println("---Receptionist---");
        Receptionist.viewbasicdetails(Patient);

        System.out.println("\n---Doctor---");
        Doctor.viewmedicalinformation(Patient);

        Doctor.updatemedicalinformation(Patient, "Patient has recovered and needs follow-up.");

        System.out.println("\n---Updated medical information---");
        Doctor.viewmedicalinformation(Patient);
    }

}
