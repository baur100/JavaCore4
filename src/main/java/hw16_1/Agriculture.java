package hw16_1;

import java.util.ArrayList;
import java.util.List;

public class Agriculture {
  private List<String> crops = new ArrayList<String>();
  private int fieldsNumber;


  public Agriculture(List<String> agricultureList, int fieldsNumber) {
    this.crops = crops;
    this.fieldsNumber = fieldsNumber;
  }

  public List<String> getCrops() {
    return crops;
  }

  public void setCrops(List<String> crops) {
    this.crops = crops;
  }

  public int getFieldsNumber() {
    return fieldsNumber;
  }

  public void setFieldsNumber(int fieldsNumber) {
    this.fieldsNumber = fieldsNumber;
  }
}
