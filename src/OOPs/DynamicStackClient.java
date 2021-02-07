package OOPs;

public class DynamicStackClient {
    public static void main(String[] args) throws Exception{
        StackUsingArrays ds = new DynamicStack(5);

        for (int i=1; i<=5; i++){
            ds.push((i+1)*10);
            ds.display();
        }
        System.out.println("\n"+ds.size());
        ds.push(70);
        ds.push(80);
        System.out.println(ds.size()+"\n");
        System.out.println(ds.top());

        while(!ds.isEmpty()){
            ds.display();
            ds.pop();
        }


    }
}
