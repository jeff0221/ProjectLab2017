import Controllers.PedestrianRepoImplementation;
import Models.Location;
import Models.Pedestrian;

import java.util.Random;

/**
 * Created by Jeffrey on 28-03-2017.
 */
public class pedestrianSpawner
{
    private static final int spawnAmount = 50;
    public static void main(String[] args){
        PedestrianRepoImplementation repo = new PedestrianRepoImplementation();
        int randomGender;
        int randomLocation;
        Random randNum = new Random();
        int minNum = 1;
        int maxNum = 3;

        for(int i = 0; i < spawnAmount; i++)
        {
            randomGender = randNum.nextInt(maxNum - minNum + 1) + minNum;
            randomLocation = 1;
            Pedestrian spawn = new Pedestrian(Pedestrian.genderByIntValue(randomGender),new Location(randomLocation));
            repo.createNewPedestrian(spawn);
        }
    }
}
