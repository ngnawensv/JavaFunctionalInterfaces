package dates.pojo;

public class StatusResponse {
private String status;
private Long statusNumber;

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
    return "StatusResponse{" +
        "status='" + status + '\'' +
        ", statusNumber=" + statusNumber +
        '}';
  }
}
