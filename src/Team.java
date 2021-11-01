public class Team{
  String name;
  Partaker[] partakers;

  public Team(String name, Partaker partaker1, Partaker partaker2, Partaker partaker3, Partaker partaker4) {
    partakers = new Partaker[]{partaker1, partaker2, partaker3, partaker4};
    this.name = name;
  }

  public void printInfoOfPartakers() {
    for (Partaker partaker: partakers){
      partaker.info();
    }
  }

  public void printPartakerFinished () {
    for (Partaker partaker: partakers){
      if (partaker.isFinished){
        partaker.info();
      }
    }
  }
}
