package koi.classes.gui;

import koi.classes.Employee.Employee;
import koi.classes.Employee.EmployeeRepository.EmployeeRepository;
import koi.classes.Employee.EmployeeRepository.IEmployeeRepository;
import koi.classes.KoiService.KoiService;
import koi.classes.KoiService.KoiServiceRepository.IKoiServiceRepository;
import koi.classes.KoiService.KoiServiceRepository.KoiServiceRepository;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;

public class projectMain {
    public static void main(String[] args) {

        String filename = "hibernate.cfg.xml";
        IEmployeeRepository employeeRepository = new EmployeeRepository(filename);
        Employee employee = new Employee("truc","NguyenMinhTruc","29/02/2004","123123","hinhanh","Quan12",
                "0387368199","2251120192@ut.edu.vn");
        employeeRepository.save(employee);
        System.out.println("Employee saved successfully!");

    }
}
