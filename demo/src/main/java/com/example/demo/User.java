package com.example.demo;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

@Id
int age;
String name;
String occupation;
@Embedded
Address address;


public User() {
}
public User(int age, String name, String ocuupation, Address address) {
    this.age = age;
    this.name = name;
    this.occupation = ocuupation;
    this.address = address;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getOcuupation() {
    return occupation;
}
public void setOcuupation(String ocuupation) {
    this.occupation = ocuupation;
}
public Address getAddress() {
    return address;
}
public void setAddress(Address address) {
    this.address = address;
}
@Override
public String toString() {
    return "User [age=" + age + ", name=" + name + ", ocuupation=" + occupation + ", address=" + address + "]";
}



    
}
