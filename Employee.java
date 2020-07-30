import java.util.LinkedList;

public class Employee {
    LinkedList <String> Tasks;    
    String startTime;
    String endTime;
    String employeeName;

    public Employee(String start, String end,  String name) {
        Tasks = new LinkedList<>();
        startTime = start;
        endTime = end;
        employeeName = name;
    }

    public void addTask(String task) {
        Tasks.push(task);
    }

}