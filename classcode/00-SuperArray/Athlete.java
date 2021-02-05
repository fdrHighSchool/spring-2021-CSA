public class Athlete {
  private String name;
  private SuperArray yards;

  public Athlete(String n) {
    this.name = n;
    this.yards = new SuperArray();
  }//end constructor


  public void addYards(int y) {
    this.yards.add(y);
  }//end addYards method

  public int totalYards() {
    int sum = 0;
    for (int i = 0; i < this.yards.getSize(); i++) {
      sum += this.yards.get(i);
    }
    return sum;
  }//end totalYards method

  public double averageYards() {
    return (double)(totalYards()) / this.yards.getSize();
  }//end averageYards method

  public String displayYards(){
    return this.yards.toString();
  }//end displayYards method

  public String toString() {
    return this.name;
  }//end toString method

}//end class
