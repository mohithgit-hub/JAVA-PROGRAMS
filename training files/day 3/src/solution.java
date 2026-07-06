class solution {
    public int fib(int n) {
        int i = 0;
        int j = 1;
        int a = 0;
        while(n!=0){
            a+=i+j;
            i=j;
            j=a;

        }
        return a;
    }
}