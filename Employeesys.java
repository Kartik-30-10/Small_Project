import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;
import java.util.*;

// Employee class
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

// AttendanceRecord class
class AttendanceRecord {
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    public void checkIn() {
        this.checkInTime = LocalDateTime.now();
    }

    public void checkOut() {
        this.checkOutTime = LocalDateTime.now();
    }

    public long calculateWorkHours() {
        if (checkInTime != null && checkOutTime != null) {
            return Duration.between(checkInTime, checkOutTime).toHours();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "AttendanceRecord{" +
                "checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                '}';
    }
}

// WorkSchedule class
class WorkSchedule {
    private LocalTime startTime;
    private LocalTime endTime;

    public WorkSchedule(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "WorkSchedule{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}

// AttendanceSystem class
class AttendanceSystem {
    private Map<Integer, Employee> employees = new HashMap<>();
    private Map<Integer, List<AttendanceRecord>> attendanceRecords = new HashMap<>();
    private Map<Integer, WorkSchedule> workSchedules = new HashMap<>();

    // Add a new employee
    public void addEmployee(int id, String name) {
        employees.put(id, new Employee(id, name));
    }

    // Assign a work schedule to an employee
    public void assignWorkSchedule(int employeeId, LocalTime startTime, LocalTime endTime) {
        workSchedules.put(employeeId, new WorkSchedule(startTime, endTime));
    }

    // Record attendance (check-in)
    public void checkIn(int employeeId) {
        AttendanceRecord record = new AttendanceRecord();
        record.checkIn();
        attendanceRecords.computeIfAbsent(employeeId, k -> new ArrayList<>()).add(record);
    }

    // Record attendance (check-out)
    public void checkOut(int employeeId) {
        List<AttendanceRecord> records = attendanceRecords.get(employeeId);
        if (records != null && !records.isEmpty()) {
            AttendanceRecord lastRecord = records.get(records.size() - 1);
            lastRecord.checkOut();
        }
    }

    // Generate attendance report
    public void generateReport(int employeeId) {
        Employee employee = employees.get(employeeId);
        List<AttendanceRecord> records = attendanceRecords.get(employeeId);

        System.out.println("Attendance Report for: " + employee.getName());
        if (records != null) {
            for (AttendanceRecord record : records) {
                System.out.println(record);
            }
        } else {
            System.out.println("No attendance records found.");
        }
    }
}

// Main class
public class Employeesys{
    public static void main(String[] args) {
        AttendanceSystem system = new AttendanceSystem();

        // Add employees
        system.addEmployee(1, "Alice");
        system.addEmployee(2, "Bob");

        // Assign work schedules
        system.assignWorkSchedule(1, LocalTime.of(9, 0), LocalTime.of(17, 0));
        system.assignWorkSchedule(2, LocalTime.of(10, 0), LocalTime.of(18, 0));

        // Record attendance
        system.checkIn(1);
        system.checkOut(1);

        system.checkIn(2);
        system.checkOut(2);

        // Generate attendance reports
        system.generateReport(1);
        system.generateReport(2);
    }
}
