public class LeetCode2105WateringThePlants {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i = 0;
        int alice = capacityA;
        int j = plants.length - 1;
        int bob = capacityB;
        int refill = 0;
        while(i<=j){
            if(i==j){
                if(alice<plants[i] && bob<plants[i]) refill++;
                break;
            }

            if(alice < plants[i]){
                alice = capacityA;
                refill++;
            } alice-=plants[i++];

            if(bob < plants[j]){
                bob = capacityB;
                refill++;

            } bob -= plants[j--];
        }
        return refill;
    }
}
