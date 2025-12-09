package challenge;

import challenge.first.ChallengeOne;
import challenge.second.ChallengeTwo;
import challenge.third.ChallengeThree;
import utilities.BehindTheScenes;
import utilities.ChallengeChecker;
import utilities.Crewmate;
import utilities.Person;

import java.util.ArrayList;
import java.util.Objects;

public class CodeRunner {

    static boolean challengeOneSuccess;
    static boolean challengeTwoSuccess;
    static boolean challengeThreeSuccess;

     /**
      * If you only want to try one of these challenges and not the others,
      * comment out the other challenge code blocks, and set the value of
      * any prior challenges' Success to true.
      */
    public static void main(String[] args) {

        // Challenge One

        ArrayList<Person> people = BehindTheScenes.initializePeople();

        ArrayList<Person> filteredPeople = ChallengeOne.evenAge(people);

        if (Objects.equals(filteredPeople, ChallengeChecker.challengeOneAnswer())) {
            System.out.println("\nChecking challenge one...\n");
            challengeOneSuccess = ChallengeChecker.challengeVerificationSuccess();
        } else {
            System.out.println("\nChecking challenge one...\n");
            challengeOneSuccess = ChallengeChecker.challengeVerificationFailure();
        }

        if (challengeOneSuccess) {


            // Challenge Two

            ArrayList<String> fullNames = ChallengeTwo.getFullNames(people);

            if (Objects.equals(fullNames, ChallengeChecker.challengeTwoAnswer())) {
                System.out.println("\nChecking challenge two...\n");
                challengeTwoSuccess = ChallengeChecker.challengeVerificationSuccess();
            } else {
                System.out.println("\nChecking challenge two...\n");
                challengeTwoSuccess = ChallengeChecker.challengeVerificationFailure();
            }

            if (challengeTwoSuccess) {


                // Challenge Three

                ArrayList<Crewmate> crewmates = BehindTheScenes.initializeCrewmates();

                ArrayList<Crewmate> filteredCrewmates = ChallengeThree.removeTraitors(crewmates);

                if (Objects.equals(filteredCrewmates, ChallengeChecker.challengeThreeAnswer())) {
                    System.out.println("\nChecking challenge three...\n");
                    challengeThreeSuccess = ChallengeChecker.challengeVerificationSuccess();

                } else {
                    System.out.println("\nChecking challenge three...\n");
                    challengeThreeSuccess = ChallengeChecker.challengeVerificationFailure();
                }
                if (challengeThreeSuccess) {

                    System.out.println("\nAll challenges were successfully completed! Excellent job.\n");

                }

            }
        }
    }
}
