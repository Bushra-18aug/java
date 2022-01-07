public class ArraySort  {

    public static void Sort(Employee[] a){
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j].compareTo(a[j+1])<0)
                {
                    Sortable temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }}}}

    public static  int find(Sortable[] ob, Sortable value)
    {for (int i=0; i<ob.length; i++)
        if(ob[i].equals(value))
            return i;
        return -1; // not
    }
}