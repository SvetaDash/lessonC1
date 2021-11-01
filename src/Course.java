public class Course {
    int[] obstacles;

    public Course(int obstacle1, int obstacle2, int obstacle3){
        obstacles = new int[]{obstacle1, obstacle2, obstacle3};

    }

   public void finish(Team team){
        for (Partaker partaker : team.partakers){
            for (int obstacle: obstacles){
                if (partaker.runDistance >= obstacle){
                    System.out.println(partaker.name + " пройдена дистанция " + obstacle);
                    partaker.isFinished = true;
                }
                else{
                    partaker.isFinished = false;
                }
            }
        }
   }
}
