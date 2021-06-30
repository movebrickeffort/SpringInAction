package com.example.springinaction.repositories;

import com.example.springinaction.entities.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> findByZip(String zip);
    List<Order> readOrderByZipAndPlaceAtBetween(String zip, Date startDate, Date endDate);  //between
    List<Order> findByCityAndNameAllIgnoresCase(String city,String name);  //或略大小写
    List<Order> findByCityOrderByPlaceAt(String city); //排序
    @Query("from Taco_Order o where o.city='Seattle'")
    List<Order> readOrdersCityInSeattle();
}
