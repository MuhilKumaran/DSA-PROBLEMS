int fib(int n){
    int a[n+1];
    if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;
    }
    a[0]=0;
    a[1]=1;
    int i;
    for(i=2;i<=n;i++)
    {
        a[i]=a[i-2]+a[i-1];
    }
    return a[n];
}