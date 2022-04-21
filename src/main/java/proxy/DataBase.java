package proxy;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private static final Map<String, Patient> patients = new HashMap<>();

    public static Patient getPatient(String idCard) {
        return patients.get(idCard);
    }

    public static void addPatient(Patient patient) {
        patients.put(patient.getIdCard(), patient);
    }
}
