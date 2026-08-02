int distanceBetweenBusStops(int* distance, int distanceSize, int start, int destination){
    int s=start;
    int d=destination;
    int clock=0,anticlock=0;
    int totaldistance=0;
  if(d<s)
  {
    int tmp=d;
    d=s;
    s=tmp;
  }
  for(int i=0;i<distanceSize;i++)
  {
    if(i>=s && i<d) clock+=distance[i];
    totaldistance+=distance[i];
  }
  anticlock=totaldistance-clock;
  if(anticlock<clock) return anticlock;
  else return clock;
}