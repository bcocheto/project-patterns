package proxy;

import java.util.Arrays;
import java.util.List;

public class Patient implements IPatient {

    private final String idCard;
    private final String name;
    private final Integer age;
    private final String adress;
    private final String exam;

    public Patient(String idCard) {
        this.idCard = idCard;
        Patient patient = DataBase.getPatient(idCard);
        this.name = patient.name;
        this.age = patient.age;
        this.adress = patient.adress;
        this.exam = patient.exam;
    }

    public Patient(String idCard, String name, Integer age, String adress, String exam) {
        this.idCard = idCard;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.exam = exam;
    }

    public String getIdCard() {
        return this.idCard;
    }

    @Override
    public List<String> getData() {
        return Arrays.asList(this.name, this.adress);
    }

    @Override
    public String getExam(Employee employee) {
        return this.exam;
    }
}
