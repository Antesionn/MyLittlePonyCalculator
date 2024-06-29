import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.print("What's Your Gender (F/M): ");
        char gender = scanner.next().charAt(0);
        if(gender != 'F' && gender != 'f' && gender != 'M' && gender != 'm')
        {
            throw new IllegalArgumentException("Invalid gender! There must be only 2 genders :)");
        }
        System.out.print("How Old Are You: ");
        int realAge = scanner.nextInt();
        if(realAge <=0 || realAge > 200)
        {
            throw new IllegalArgumentException("Invalid age. Age must be between real numbers!");
        }

        String characters[] = {"Twilight Sparkle", "Applejack", "Rainbow Dash", "Pinkie Pie", "Rarity", "Fluttershy", "Princess Celestia", "Princess Luna", "Spike", "Apple Bloom", "Sweetie Belle", "Scootaloo", "Princess Cadance", "Shining Armor", "Discord", "Starlight Glimmer", "Trixie Lulamoon", "Sunset Shimmer", "Princess Ember", "Thorax"};

        System.out.print("\n" + "My Little Pony Character List: " + "\n");
        for (int i = 1; i <= characters.length; i++) {
            System.out.print((i) + ")" + characters[i - 1] + "  ");
            if (i % 5 == 0) {
                System.out.println("\n");
            }
        }

        System.out.print("\n" + "Choose Your Little Pony (int): ");
        int characterChoice = scanner.nextInt();
        if(characterChoice <= 0 || characterChoice >20)
        {
            throw new IllegalArgumentException("Character number must be in the My Little Pony Character List!");
        }

        Random random = new Random();
        int randomNumber = random.nextInt(2000) + 1;

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run() {
                JFrame frame = new JFrame("My Little Pony Age");
                JLabel label = new JLabel("<html>Welcome " +  "<font color=\"black\">" + characters[characterChoice - 1] + "<br>" + "<font color=\"white\">" +"Here's your My Little Pony Age: " + "<font color=\"black\">" + randomNumber + "</font></html>");
                label.setForeground(Color.WHITE);
                label.setBackground(new Color(204,169,221));
                label.setFont(new Font("Old English Text MT", Font.BOLD, 40));
                label.setOpaque(true);
                label.setIcon(new ImageIcon("ic.ico"));
                frame.setIconImage(new ImageIcon("mlp.jpg").getImage());
                frame.getContentPane().add(label);
                frame.setTitle("My Little Pony Age Calculator");
                frame.setSize(710, 500);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }
}