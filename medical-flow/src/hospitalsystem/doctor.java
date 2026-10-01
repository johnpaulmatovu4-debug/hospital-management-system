package hospitalsystem;

public class doctor {
    public void viewmedicalinformation(patient Patient){
        System.out.println("patient: "+Patient.name);
        System.out.println("Medical information: "+Patient.getmedicalinformation());
    }
    public void updatemedicalinformation(patient Patient, String information){
        Patient.updatemedicalinformation(information);

        System.out.println("Medical information updated");
    }

}
