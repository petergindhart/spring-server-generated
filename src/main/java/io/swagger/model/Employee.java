package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Employee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-12-13T16:47:53.252Z[GMT]")
public class Employee   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("managerId")
  private Integer managerId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("hireDate")
  private LocalDate hireDate = null;

  @JsonProperty("ageAtHire")
  private Integer ageAtHire = null;

  @JsonProperty("approximateAge")
  private Integer approximateAge = null;

  @JsonProperty("isEskimo")
  private Boolean isEskimo = null;

  public Employee id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Employee managerId(Integer managerId) {
    this.managerId = managerId;
    return this;
  }

  /**
   * Get managerId
   * @return managerId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getManagerId() {
    return managerId;
  }

  public void setManagerId(Integer managerId) {
    this.managerId = managerId;
  }

  public Employee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee hireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
    return this;
  }

  /**
   * Get hireDate
   * @return hireDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  public Employee ageAtHire(Integer ageAtHire) {
    this.ageAtHire = ageAtHire;
    return this;
  }

  /**
   * used to know approximate age, but not tracking birthdays to avoid the burden of gifts
   * @return ageAtHire
  **/
  @ApiModelProperty(value = "used to know approximate age, but not tracking birthdays to avoid the burden of gifts")
  
    public Integer getAgeAtHire() {
    return ageAtHire;
  }

  public void setAgeAtHire(Integer ageAtHire) {
    this.ageAtHire = ageAtHire;
  }

  public Employee approximateAge(Integer approximateAge) {
    this.approximateAge = approximateAge;
    return this;
  }

  /**
   * Get approximateAge
   * @return approximateAge
  **/
  @ApiModelProperty(readOnly = true, value = "")
  
    public Integer getApproximateAge() {
    return approximateAge;
  }

  public void setApproximateAge(Integer approximateAge) {
    this.approximateAge = approximateAge;
  }

  public Employee isEskimo(Boolean isEskimo) {
    this.isEskimo = isEskimo;
    return this;
  }

  /**
   * Get isEskimo
   * @return isEskimo
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsEskimo() {
    return isEskimo;
  }

  public void setIsEskimo(Boolean isEskimo) {
    this.isEskimo = isEskimo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.managerId, employee.managerId) &&
        Objects.equals(this.name, employee.name) &&
        Objects.equals(this.hireDate, employee.hireDate) &&
        Objects.equals(this.ageAtHire, employee.ageAtHire) &&
        Objects.equals(this.approximateAge, employee.approximateAge) &&
        Objects.equals(this.isEskimo, employee.isEskimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managerId, name, hireDate, ageAtHire, approximateAge, isEskimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
    sb.append("    ageAtHire: ").append(toIndentedString(ageAtHire)).append("\n");
    sb.append("    approximateAge: ").append(toIndentedString(approximateAge)).append("\n");
    sb.append("    isEskimo: ").append(toIndentedString(isEskimo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
