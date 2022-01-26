package com.geekbrains.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "employees_info")
public class EmployeeInfo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;
/**/ //    теперь это двунаправленная связь
    @OneToOne(mappedBy = "info")
    Employee employee;
    //*/
}
