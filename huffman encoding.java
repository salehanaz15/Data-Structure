class node{
    int freq;
    String symbol;
    node left=null;
    node right=null;
    String huff="";
    
    public node(int freq, String symbol){
        this.freq=freq;
        this.symbol=symbol;
    }
}

  public static void printNodes(node node, String val){
      String newval= val + Integer.toString(node.huff);
      if(node.left!=null){
          printNodes(node.left, newval);
      }if(node.right!=null){
          printNodes(node.right, newval);
      }if(node.left==null && node.right==null){
          System.out.println(""+node.symbol+" --> "+newval);
      }  
  }