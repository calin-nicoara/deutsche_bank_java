package ro.cni.course.dbcourse.prepared.reflection;

public class ReflectionDummy extends ReflectionDummyParent{

    public String address = "NOWHERE";
    private String privateSecret = "privateSecret";

    public ReflectionDummy() {
    }

    public String getName(String test) {
        return super.getName();
    }

    public ReflectionDummy(String address){
        this.address = address;
    }

    public void eatCake() {
        System.out.println("Cake is really good!");
    }
}
