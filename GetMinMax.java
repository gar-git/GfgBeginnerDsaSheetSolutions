class getMinMax 
{
    static Pair getMinMax(long a[], long n)  
    {
        ArrayList<Long> ar= new ArrayList<Long>();
        for(long i: a){
            ar.add(i);
        }
        
        long min= Collections.min(ar);
        long max= Collections.max(ar);
        return( new Pair(min, max));
        
    }
}