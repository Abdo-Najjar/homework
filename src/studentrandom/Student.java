/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrandom;

/**
 *
 * @author abdo
 */
public class Student {
    
    private long id;
    private String name;
    private double gpa;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public Student setId(long id) {
        this.id = id;
        return this;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public Student setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public Student setGpa(double gpa) {
        this.gpa = gpa;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gpa=" + gpa + '}';
    }

   
    
    
    
}
