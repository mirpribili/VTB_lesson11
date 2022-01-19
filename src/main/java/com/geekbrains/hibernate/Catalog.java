package com.geekbrains.hibernate;

import javax.persistence.*;

@Entity // аннотация - Сущность - объекты данного класса смогут мапиться с БД
@Table(name = "catalogs") // название таблицы
public class Catalog {
    /*
    Требования:
        поля которые нужно сохранить в БД помечаются Column
            для каждого поля необходим геттер и сеттер
            и наличие деф конструктора
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Catalog() {
    }

    public Catalog(String title) {
        this.title = title;
    }

    @Override // ну и просто для печати в консоль
    public String toString() {
        return "Catalog: " + id + " " + title;
    }
}
