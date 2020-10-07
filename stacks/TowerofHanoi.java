// Recursive solution to Tower of Hanoi Problem
class TowerofHanoi{

  // recursive function for tower of hanoi
  // n --> no. of disks
  // S --> Source Tower
  // D --> Destination Tower
  // A --> Auxiliary Tower
  static void TOH(int n, char S, char D, char A){
        // terminating condition
        if(n == 1){
            System.out.println("Move disk "+n+" from: "+S+" to: "+D);
            return;
        }
        // first recursive call
        // Move "n-1" disks from Source tower to Auxiliary tower using Destination tower
        TOH(n-1, S, A, D);
        // Move nth disk from Source tower to Destination tower
        System.out.println("Move disk "+n+" from: "+S+" to: "+D);
        // Move "n-1" disks from Auxiliary tower to Destination tower using Source tower
        TOH(n-1, A, D, S);

  }

  public static void main(String[] args){
      // initialize the number of disks --> n
      int n = 3;
      TOH(n, 'A', 'C', 'B');
  }
}
