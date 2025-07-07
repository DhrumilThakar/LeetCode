/*There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.*/
public class problem134 {

    public static int canCompleteCircuit(int[] gas, int[] cost){
        int totalTank =0;
        int currentStation =0;
        int startStation =0;

        for(int i=0;i<gas.length;i++){
            int difference = gas[i] - cost[i];

            currentStation +=difference;
            totalTank +=difference;

            if(currentStation<0){
                startStation = i+1;
                currentStation = 0;
            }
        }
        return totalTank >=0?startStation :-1;
    }
    public static void main(String[] args) {
        
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost)); // Output: 3
    }
}