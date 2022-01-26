package com.geekbrains.hibernate.homework;

/*
FIXME   /etc/postgresql/10/main/pg_hba.conf
        host all all      ::1/128      md5
        host all postgres 127.0.0.1/32 md5
        а затем перезапустите сервис postgresql
        /etc/init.d/postgresql restart

 * 1. В базе данных необходимо иметь возможность хранить информацию о покупателях (id, имя)
и товарах (id, название, стоимость);
 * 2. У каждого покупателя свой набор купленных товаров, одна покупка одного товара это
отдельная запись в таблице (группировать не надо);
 * 3. Написать тестовое консольное приложение (просто Scanner и System.out.println()), которое
позволит выполнять команды:
    * /showProductsByPerson имя_покупателя - посмотреть какие товары покупал клиент;
    * /findPersonsByProductTitle название_товара - какие клиенты купили определенный товар;
    * /removePerson(removeProduct) имя_элемента - предоставить возможность удалять из базы товары/покупателей;
    * /buy имя_покупателя название_товара - организовать возможность “покупки товара”.
 * 4. * Добавить детализацию по паре покупатель-товар: сколько стоил товар, в момент покупки
клиентом;
  *
  * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  */

import com.geekbrains.hibernate.homework.controllers.Controller;

public class MainApp {
    public static void main(String[] args) {

        new Controller().run();
    }
}