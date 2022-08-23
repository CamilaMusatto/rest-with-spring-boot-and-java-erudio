package br.com.cmusatto.data.vo.v2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class PersonVOV2 implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String gender;

    private Date birthday;

    public PersonVOV2() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonVOV2 that = (PersonVOV2) o;
        return id.equals(that.id) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && address.equals(that.address) && gender.equals(that.gender) && birthday.equals(that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, gender, birthday);
    }
}
