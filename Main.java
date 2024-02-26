class Main extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int intX = 5;
    int intY = 6;

    System.out.println("start");
    
    if (intX > 0){
      System.out.println("x is positive");
    }

    
    if (intX % 2 == 0){
      System.out.println("x is even");
    }
    else{
      System.out.println("x is odd");
    }

    if (intX > intY){
      System.out.println("x is greater than y");       
    }
    else if(intX < intY){
      System.out.println("x is less than y");
    }
    else{
      System.out.println("x and y are equal");
}

    
    
    System.out.println("end");
    
  }
}