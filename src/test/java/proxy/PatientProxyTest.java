package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PatientProxyTest {

    @BeforeEach
    void setUp() {
        DataBase.addPatient(new Patient("62609d7c768c26.59987735", "Bradley W. Phillips", 27, "National City, CA 91950, USA", "Prostate exam"));
        DataBase.addPatient(new Patient("62609df098d1f7.55284040", "Raymond R. Santos", 18, "Chicago, IL 60625, USA", "Urine exam"));
    }

    @Test
    void shouldReturnPatientData() {
        PatientProxy patient = new PatientProxy("62609d7c768c26.59987735");

        assertEquals(Arrays.asList("Bradley W. Phillips", "National City, CA 91950, USA"), patient.getData());
    }

    @Test
    void shouldReturnPatientExam() {
        Employee employee = new Employee("Holly K. Simpson", true);
        PatientProxy patient = new PatientProxy("62609df098d1f7.55284040");

        assertEquals("Urine exam", patient.getExam(employee));
    }

    @Test
    void shouldReturnAccessDaniedForEmployee() {
        try {
            Employee employee = new Employee("Jorge N. Strickland", false);
            PatientProxy patient = new PatientProxy("62609ed290c2d2.97063364");

            patient.getExam(employee);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Access danied", e.getMessage());
        }
    }
}