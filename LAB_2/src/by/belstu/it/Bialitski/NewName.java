package by.belstu.it.Bialitski;


public class NewName {
    public NewName() {
    }
    public void OnCreate(){
        for (int count = 0; count < 10; count++) {
            System.out.println("Counter "+count);
        }
    }

    public String getValue(){
        ExtarctedMethod();

        return "Hello from First project";
    }

    private void ExtarctedMethod() {
        int i = 0;
    }
}
