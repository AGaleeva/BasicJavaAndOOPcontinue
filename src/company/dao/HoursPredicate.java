package company.dao;

import company.model.Employee;

import java.util.function.Predicate;

// это грамоздкий метод реализации класса предиката через создание нового класса, а затем его объекта
// в то время, как нам этот класс по большому счету не нужен

public class HoursPredicate implements Predicate<Employee> {
    private int hours;

    public HoursPredicate(int hours) {
        this.hours = hours;
    }

    @Override
    public boolean test(Employee employee) {
        return employee.getHours() >= hours;
    }
}
