package entity;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.*;


/**
 * The persistent class for the friend database table.
 * 
 */
@Entity
@Named
@RequestScoped
public class Friend implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String name;

	private Integer age;

    public Friend() {
    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}