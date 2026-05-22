public class _12TrappingRainwater {
    public static int trapped(int height[]) {

    int n = height.length;     //lenght of heigth arr

    //Calculate left max boundary - array
    int leftmax[] = new int[n];  //this is new leftmax name arr with size n
    leftmax[0] = height[0];       //pahili value tich rahil karan tichyavar water thambnar nahi 
    for(int i=1; i<n; i++) {   // index 0 already set aahe mhnun 1 pasun
        leftmax[i] = Math.max(height[i], leftmax[i-1]);     //comare karun one by one values arr made takat jail
    }

    //Calculate Right max boundary
    int Rightmax[] = new int[n];      //this is right max arr with size n
    Rightmax[n-1] = leftmax[n-1];      //start from end of arr, index is start from 0 thats why lenght -1 

    for(int i=n-2; i>=0; i--) {   //lenght - 1 value is already set so its start from length -2;
        Rightmax[i] = Math.max(height[i], Rightmax[i+1]);   //compare ends last end and second last end
    }

    int trappwater = 0;   //caluculate trap water
    //Loop
    for(int i=0; i<n; i++) {
        //WaterLevel = min(leftmax  Rightmax)
        int WaterLevel = Math.min(leftmax[i], Rightmax[i]);    // compare level jo minimum hogi so water level hogi
        //trapped water = waterlevel - height[i]
        trappwater += WaterLevel - height[i];  // - height into the waterlevel and add to trapwater
    }
    return trappwater;  // return trapwater
    }
  
    public static void main(String args[]) {
        int height[] = {3,0,1,5};
        System.out.println( trapped(height));
    }
}