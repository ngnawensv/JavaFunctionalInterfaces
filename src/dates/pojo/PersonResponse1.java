package dates.pojo;

import java.util.Map;

public class PersonResponse1 {
  private  String type;
  private Map<String,Long> statusResponse;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Map<String, Long> getStatusResponse() {
    return statusResponse;
  }

  public void setStatusResponse(Map<String, Long> statusResponse) {
    this.statusResponse = statusResponse;
  }

  @Override
  public String toString() {
    return "PersonResponse1{" +
        "type='" + type + '\'' +
        ", statusResponse=" + statusResponse +
        '}';
  }
}
