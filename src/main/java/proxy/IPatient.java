package proxy;

import java.util.List;

public interface IPatient {
    List<String> getData();
    String getExam(Employee employee);
}
