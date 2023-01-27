package Project1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    Scanner scnr = new Scanner(System.in);
    public void play() {
        System.out.println("Do you want to play blackjack? Type 'y' or 'n': ");
        String playGame = scnr.nextLine();
        System.out.println();
        System.out.println();
  if(playGame.equals("y"))  {
      int [] cards = new int [] {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
      ArrayList<Integer> yourHand = new ArrayList<>();
      ArrayList<Integer> cpuHand = new ArrayList<>();
      //int yourValue = 0;
      int cpuValue = 0;
      boolean isGameOver = false;

      yourHand.add(getRandomCard(cards));
      yourHand.add(getRandomCard(cards));
      cpuHand.add(getRandomCard(cards));
      cpuHand.add(getRandomCard(cards));

      int yourValue = getValue(yourHand);
      System.out.println("Your cards: " + yourHand + ". Your score: " + yourValue);
      int shown_card = cpuHand.get(0);

      System.out.println("Computer's first card: " + shown_card);






//      System.out.println(yourHand);
//      System.out.println(yourValue);


  }



//        end = check_game_over(your_value, cpu_value, your_hand)
//
//        while not end:
//        get_new_card = input("Do you want another card? Type 'y' or 'n': ")
//        if get_new_card == 'y':
//        your_hand.append(get_card(cards))
//        your_value = get_value_of_hand(your_hand)
//        end = check_game_over(your_value, cpu_value, your_hand)
//        print(f"Your cards: {your_hand} Your score: {your_value}")
//
//      else:
//        cpu_value = cpu_turn(cpu_hand, cpu_value, cards)
//        end = check_game_over(your_value,cpu_value,your_hand)
//        if end:
//        print(f"Your final hand: {your_hand} Your final score: {your_value}")
//        print(f"CPU's final hand: {cpu_hand} CPU's final score: {cpu_value}")
//        continue
//
//                elif your_value > cpu_value:
//        print("You win!")
//
//        elif your_value < cpu_value:
//        print("You lose.")
//
//          else:
//        print("You tied.")
//        print(f"Your final hand: {your_hand}")
//        print(f"CPU's final hand: {cpu_hand}")
//        end = True


    }

    private int getValue(ArrayList<Integer> yourHand) {
        int sum = 0;
        for (int card : yourHand){
            sum += card;
        }
        return sum;
    }

    private Integer getRandomCard(int[] cards) {
        int rnd = new Random().nextInt(cards.length);
        return cards[rnd];
    }
}
