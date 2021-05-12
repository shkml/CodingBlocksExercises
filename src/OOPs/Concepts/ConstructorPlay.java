package OOPs.Concepts;

public class ConstructorPlay {
    public int val;
    public String name;

    public ConstructorPlay(){
        this.name = "Komal";
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public String getName() {
        return name;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        ConstructorPlay CP = new ConstructorPlay();
        System.out.println(CP.getVal());
    }
}
