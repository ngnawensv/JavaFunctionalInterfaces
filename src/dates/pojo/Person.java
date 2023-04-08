package dates.pojo;

public class Person {
  private String code;
  private String name;
  private String pays;
  private String type;
  private String status;

  public Person() {
  }

  public Person(String code, String name, String pays, String type, String status) {
    this.code = code;
    this.name = name;
    this.pays = pays;
    this.type = type;
    this.status = status;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPays() {
    return pays;
  }

  public void setPays(String pays) {
    this.pays = pays;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Person{" +
        "code='" + code + '\'' +
        ", name='" + name + '\'' +
        ", pays='" + pays + '\'' +
        ", type='" + type + '\'' +
        ", status='" + status + '\'' +
        '}';
  }
}
