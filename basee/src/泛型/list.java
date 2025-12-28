package 泛型;

public class list <L>{
    int a = 10;
    int size = 0;
    public Object[] arr = new Object[a];
public boolean add(L l){
//{   a++;
//    if(a >=size){
//        int newsize = 0;
//        newsize = size == 0 ? 1 :size+1;
//        size = newsize;
//    }
    arr[size++] = l;
    return  true;
}
public L get(int index)
{
    return (L)arr[index];
}
public void kai()
{
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}
