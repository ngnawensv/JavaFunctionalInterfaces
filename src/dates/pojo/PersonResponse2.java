package dates.pojo;

import java.util.Map;

public class PersonResponse2 {
  private  String type;
  private String status;
  private Long statusNumber;

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

  public Long getStatusNumber() {
    return statusNumber;
  }

  public void setStatusNumber(Long statusNumber) {
    this.statusNumber = statusNumber;
  }

  @Override
  public String toString() {
    return "PersonResponse2{" +
        "type='" + type + '\'' +
        ", status='" + status + '\'' +
        ", statusNumber=" + statusNumber +
        '}';
  }
}
