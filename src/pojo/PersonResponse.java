package pojo;

public class PersonResponse {
  private  String type;
  private StatusResponse statusResponse;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StatusResponse getStatusResponse() {
    return statusResponse;
  }

  public void setStatusResponse(StatusResponse statusResponse) {
    this.statusResponse = statusResponse;
  }

  @Override
  public String toString() {
    return "PersonResponse{" +
        "type='" + type + '\'' +
        ", statusResponse=" + statusResponse +
        '}';
  }
}
