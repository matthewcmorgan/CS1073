public class RosterTest
{
  public static void main(String[] args)
  {
    String[] chessNames = {"Spassky", "Fischer"};
    String[] basketballNames = {"Charles", "Larry", "Michael", "Earvin", "Patrick"};
    TeamRoster chessClub = new TeamRoster(chessNames);
    TeamRoster dreamTeam = new TeamRoster(basketballNames);
     
    System.out.println(chessClub.toString());
    System.out.println(dreamTeam.toString());
    System.out.println();
     
    if (dreamTeam.isOnTeam("Isiah"))
      System.out.println("Error - Who let Zeke on the Dream Team?");
    else
      System.out.println("Correct - Michael didn't want Zeke on the team.");
     
    if (dreamTeam.isOnTeam("Larry"))
      System.out.println("Correct - They had to have Larry Legend.");
    else
      System.out.println("Error - No Larry? Are you kidding me?");
       
    basketballNames[4] = "David";
    if (basketballNames[4].equals(dreamTeam.getPlayer(4)))
      System.out.println("Error - You didn't make a new array copy in the constructor.");
    else
      System.out.println("Correct - These two names are different.");
      
    if (dreamTeam.getPlayer(5) == null)
      System.out.println("Correct - null returned for invalid index.");
    else
      System.out.println("Error - null should be returned for invalid index");

    if(dreamTeam.replacePlayer("David", 4))
      System.out.println("Correct - Player was replaced.");
    else
      System.out.println("Error - Player should have been replaced");
      
    if (basketballNames[4].equals(dreamTeam.getPlayer(4)))
      System.out.println("Correct - The Admiral is now playing Center.");
    else
      System.out.println("Error - These two names should now be the same.");

    if(dreamTeam.replacePlayer("John", -1))
      System.out.println("Error - Player should not be replaced with invalid index");
    else
      System.out.println("Correct - Player was not replaced.");
     
  } // end main method
} // end class