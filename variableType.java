public class variableType {

  public void localVariable() {
    String name = "jack";
    int marks = 90;
    System.out.println(name + "Scored = " + marks + "%.");
  }

  public static void main(String[] args) {
    variableType vt = new variableType();

    vt.localVariable();
  }
}
