import java.util.*;


class GST {
    public static void main(String args[]){
        //GST amount = (Original cost x GST%)/100. Net price = original cost + GST amount.

        float[] price={1100,900,200,100};
        float tgst;
        float large=0;
        float amount;
        float tamount=0;
        int j=0;
        int []quan={1,4,3,2};
        int []gst={18,12,28,0};
        float[] result=new float[4];
        
       for(int i=0;i<4;i++){
         tgst= (price[i] * gst[i])/100;
    
        
         amount=price[i];
         int q=quan[i];
         while(q>0){
            amount=amount+tgst;
            q--;
         }
         result[i]=amount;
         if(amount>large){
            large=amount;
            j=i;

         }

       }
      
       for(int i=0; i<4;i++){
        tamount+=result[i];
       }
       System.out.println("The total amount is "+tamount);
       while(true){
       switch(j){
        case 0:System.out.println("The item with largest price is "+" Leather wallet"+" with amount of " +large);
        break; 
        case 1:System.out.println("The item with largest price is "+" Umberal"+" with amount of " +large);
        break;
        case 2:System.out.println("The item with largest price is "+" Cigarette"+" with amount of " +large);
        break;
        case 3:System.out.println("The item with largest price is "+" Honey"+" with amount of " +large);
        break;
       }
       break;
    }
       
    }
}
