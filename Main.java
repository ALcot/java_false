class Main {
  public static void main(String[] args) {
    // trueと出力されるようする
    System.out.println(true || false);
    
    // falseと出力されるようにする
    System.out.println(false && true);
    
    // 「8 < 5」かつ「3 >= 2」の結果を出力する
    System.out.println(8<5 && 3>=2);
    
    // 「8 < 5」または「3 >= 2」の結果を出力する
    System.out.println(8<5 || 3>=2);
    
    // 「8 < 5」でない、の結果を出力する
    System.out.println(!(8<5));
    
  }
}
