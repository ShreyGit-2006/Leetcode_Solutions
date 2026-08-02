int findCost(int startAt,int moveCost,int pushCost,int m,int sec)  
 {
    int d[4]={m/10,m%10,sec/10,sec%10};
    int i=0;
    while(i<3 && d[i]==0)i++;
    int cost=0;
    int cur=startAt;
    while(i<4)
    {
        if(cur!=d[i]) cost+=moveCost;
        cost+=pushCost;
        cur=d[i];
        i++;
    }
    return cost;
 }
int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
    int count=INT_MAX;
    int m=targetSeconds/60;
    int sec=targetSeconds%60;
    if(m<=99)
    {
        int cost=findCost( startAt, moveCost, pushCost,m,sec);
        if(cost<count) count=cost;
    }
    if(m>0 && sec+60<=99)
    {
        int cost=findCost( startAt, moveCost, pushCost,m-1,sec+60);
        if(cost<count) count=cost;
    }
    return count;
    }
    
