package proxy;

import java.util.List;

public class PatientProxy implements IPatient {

    private Patient patient;

    private final String idCard;

    public PatientProxy(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public List<String> getData() {
        if (this.patient == null) {
            this.patient = new Patient(this.idCard);
        }
        return this.patient.getData();
    }

    @Override
    public String getExam(Employee employee) {
        if (!employee.isDoctor()) {
            throw new IllegalArgumentException("Access danied");
        }
        if (this.patient == null) {
            this.patient = new Patient(this.idCard);
        }
        return this.patient.getExam(employee);
    }
}
