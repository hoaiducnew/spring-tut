package com.example.restfulwebservices.user;

import java.util.Date;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about the user. ")
public class User {
  private Integer id;
  
  @Size(min = 2, message = "Name should have at least 2 characters")
  @ApiModelProperty(notes = "Name should have at least 2 characters")
  private String name;
  
  @Past
  @ApiModelProperty(notes = "Birth date should be in the past")
  private Date birthDate;
  
  protected User() {
    
  }

  public User(Integer id, String name, Date birthDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("User{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", birthDate=").append(birthDate);
    sb.append('}');
    return sb.toString();
  }
}