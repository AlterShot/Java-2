package Java2;

public class Count extends Main{
    public Count(){
        for(int i = 0; i < size; i++){
            arr[i] = 1;
        }
        for(int i = 0; i < size; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(a);
    }
}
