 import java.util.Scanner;
 import java.lang.Math;
 import java.lang.String;
 import java.util.Random;
 import java.io.FileReader;
 import java.io.*;
/**Name:Joseph Manu
Furpose: This is a Java Frogram that asks the user to select a character to play as, then select the character they want to fight as, 
then use an RNG to compute a winner*/
    public class SuperHero { 
    public static void main(String[] args) throws IOException { 
        String repeat;
        char SuperHero;
        char Select;
        
        do{      
// Ask the user to select a character 
// Acquire user input
     
        Scanner keyboard = new Scanner(System.in);
        
         //BufferedReader infile = new BufferedReader (new FileReader ("anything.txt"));
//         String text = "";
//         int firstLine = 0;
//         int lastLine = 7;
//         for (int i = 0 ; i < firstLine + 1 ; i++) {
//             text = infile.readLine();
//         }
//         for (int i = firstLine ; i < lastLine + 1 ; i++) { 
//             text = infile.readLine();
//             System.out.println(text);
//         }
//         infile.close();

        Scanner s = new Scanner(System.in);
        //SuperHero = s.next().charAt(0);

//Asking the user to select a character that they want to fight against
// Get an input from the user
        characterPick1();
        char SuperHero1 = s.next().charAt(0);
        
        characterPick2();
        char SuperHero2 = s.next().charAt(0);
        
        //infile = new BufferedReader (new FileReader ("anything.txt"));
        //String text = "";
        //int firstLine = 0;
        //int lastLine = 7;
//         for (int i = 0 ; i < firstLine + 1 ; i++) {
//             text = infile.readLine();
//         }
//         for (int i = firstLine ; i < lastLine + 1 ; i++) { 
//             text = infile.readLine();
//             System.out.println(text);
//         }
//         infile.close();

       //SuperHero2 = s.next().charAt(0);
   
       Random rand = new Random();
       int rand_intA = rand.nextInt(500); 
       
       PrintWriter outFile = new PrintWriter("something.txt");       
	
   switch (SuperHero1) {

//Case one for the first character
//Compere which number was higher from the RNG 
//The highest number Wins and a message is displayed stating that character Wins!!! FATALITY!! 
      case 'B':
		case 'b':
      if (SuperHero2 == 'B' || SuperHero2 == 'b'){
      	System.out.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");
			}
      if (SuperHero2 == 'T' || SuperHero2 == 't'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Black Widow's martial art beat Thor's lightning bolts!\n Black Widow Wins!!! FATALITY!!!");
         outFile.println("Black Widow's martial art beat Thor's lightning bolts!\n Black Widow Wins!!! FATALITY!!!");

         }
         else
         {
         System.out.println("Thor's lightning bolts beat Black Widow's martial art!\n Thor Wins!!! FATALITY!!");
         outFile.println("Thor's lightning bolts beat Black Widow's martial art!\n Thor Wins!!! FATALITY!!");

         }
         }
      if (SuperHero2 == 'D' || SuperHero2 == 'd'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Black Widow's martial art beat Doctor Strange's energy blasts and teleportation!\n Black Widow Wins!!! FATALITY!!");
         outFile.println("Black Widow's martial art beat Doctor Strange's energy blasts and teleportation!\n Black Widow Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Doctor Strange's energy blasts and teleportation beat Black Widow's martial art!\n Doctor Strange Wins!!! FATALITY!!!");
          outFile.println("Doctor Strange's energy blasts and teleportation beat Black Widow's martial art!\n Doctor Strange Wins!!! FATALITY!!!");
         }
         }
      if (SuperHero2 == 'F' || SuperHero2 == 'f'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Black Widow's martial art beat Flash's lighting speed!\n Black Widow Wins!!! FATALITY!!");
          outFile.println("Black Widow's martial art beat Flash's lighting speed!\n Black Widow Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Flash's lighting speed beat Black Widow's martial art!\n Flash Wins!!! FATALITY!!!");
          outFile.println("Flash's lighting speed beat Black Widow's martial art!\n Flash Wins!!! FATALITY!!!");    
         }
         }
      if (SuperHero2 == 'A' || SuperHero2 == 'a'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Black Widow's martial art beat Aquaman's telepathic and water ability!\n Black Widow Wins!!! FATALITY!!");
          outFile.println("Black Widow's martial art beat Aquaman's telepathic and water ability!\n Black Widow Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Aquaman's telepathic and water ability beat Black Widow's martial art!\n Aquaman Wins!!! FATALITY!!!"); 
          outFile.println("Aquaman's telepathic and water ability beat Black Widow's martial art!\n Aquaman Wins!!! FATALITY!!!");   
         } 
         }          
      if (SuperHero2 == 'W' || SuperHero2 == 'w'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Black Widow's martial art beat Wolverine's regenerative ability and retractable claws!\n Black Widow Wins!!! FATALITY!!");
          outFile.println("Black Widow's martial art beat Wolverine's regenerative ability and retractable claws!\n Black Widow Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Wolverine's regenerative ability and retractable claws beat Black Widow's martial art!\n Wolverine Wins!!! FATALITY!!!");
          outFile.println("Wolverine's regenerative ability and retractable claws beat Black Widow's martial art!\n Wolverine Wins!!! FATALITY!!!");   
         }
         }   
			
         break;

     //Case two for the first character
//Compere which number was higher from the RNG 
//The highest number Wins and a message is displayed stating that character Wins!!! FATALITY!! 
	 case 'T':
		case 't':
       if (SuperHero2 == 'T' || SuperHero2 == 't'){
      	System.out.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");
         outFile.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");
			}
      if (SuperHero2 == 'B' || SuperHero2 == 'b'){
            int rand_IntB = rand.nextInt(500);
            if(fightLoop(SuperHero1, SuperHero2) == true)
            {
          System.out.println("Thor's lightning bolts beat Black Widow's martial art!\n Thor Wins!!! FATALITY!!");
          outFile.println("Thor's lightning bolts beat Black Widow's martial art!\n Thor Wins!!! FATALITY!!");
            }
            else
            {
          System.out.println("Black Widow's martial art beat Thor's lightning bolts!\n Black Widow Wins!!! FATALITY!!!");
          outFile.println("Black Widow's martial art beat Thor's lightning bolts!\n Black Widow Wins!!! FATALITY!!!");
            }
           }
      if (SuperHero2 == 'D' || SuperHero2 == 'd'){
             int rand_IntB = rand.nextInt(500);
             if(fightLoop(SuperHero1, SuperHero2) == true)
            {
             System.out.println("Thor's lightning bolts beat Doctor Strange's energy blasts and teleportation!\n Thor Wins!!! FATALITY!!");
             outFile.println("Thor's lightning bolts beat Doctor Strange's energy blasts and teleportation!\n Thor Wins!!! FATALITY!!");
            }
            else
            {
             System.out.println("Doctor Strange's energy blasts and teleportation beat Thor's lightning bolts!\n Doctor Strange Wins!!! FATALITY!!!");
             outFile.println("Doctor Strange's energy blasts and teleportation beat Thor's lightning bolts!\n Doctor Strange Wins!!! FATALITY!!!");

            }
           }
      if (SuperHero2 == 'F' || SuperHero2 == 'f'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Thor's lightning bolts beat Flash's lighting speed!\n Thor Wins!!! FATALITY!!");
          outFile.println("Thor's lightning bolts beat Flash's lighting speed!\n Thor Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Flash's lighting speed beat Thor's lightning bolts!\n Flash Wins!!! FATALITY!!!"); 
          outFile.println("Flash's lighting speed beat Thor's lightning bolts!\n Flash Wins!!! FATALITY!!!");  
         }
         }
      if (SuperHero2 == 'A' || SuperHero2 == 'a'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Thor's lightning bolts beat Aquaman's energy blasts and teleportation!\n Thor Wins!!! FATALITY!!");
          outFile.println("Thor's lightning bolts beat Aquaman's energy blasts and teleportation!\n Thor Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Aquaman's telepathic and water ability beat Thor's lightning bolts!\n Aquaman Wins!!! FATALITY!!!"); 
          outFile.println("Aquaman's telepathic and water ability beat Thor's lightning bolts!\n Aquaman Wins!!! FATALITY!!!");  
         } 
         }          
      if (SuperHero2 == 'W' || SuperHero2 == 'w'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Thor's lightning bolts beat Wolverine's energy blasts and teleportation!\n Thor Wins!!! FATALITY!!");
          outFile.println("Thor's lightning bolts beat Wolverine's energy blasts and teleportation!\n Thor Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Wolverine's regenerative ability and retractable claws beat Thor's lightning bolts!\n Wolverine Wins!!! FATALITY!!!");
          outFile.println("Wolverine's regenerative ability and retractable claws beat Thor's lightning bolts!\n Wolverine Wins!!! FATALITY!!!");   
         }
        }   
			
         break;

   
   	//Case three for the first character
//Compere which number was higher from the RNG 
//The highest number Wins and a message is displayed stating that character Wins!!! FATALITY!! 
		case 'D':
		case 'd':
      if (SuperHero2 == 'D' || SuperHero2 == 'd'){
      	System.out.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");
         outFile.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");

			}
      if (SuperHero2 == 'T' || SuperHero2 == 't'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Doctor Strange's energy blasts and teleportation beat Thor's lightning bolts!\n Doctor Strange Wins!!! FATALITY!!!");
         outFile.println("Doctor Strange's energy blasts and teleportation beat Thor's lightning bolts!\n Doctor Strange Wins!!! FATALITY!!!");
         }
         else
         {
         System.out.println("Thor's lightning bolts beat Doctor Strange's energy blasts and teleportation!\n Thor Wins!!! FATALITY!!");
         outFile.println("Thor's lightning bolts beat Doctor Strange's energy blasts and teleportation!\n Thor Wins!!! FATALITY!!");
         }
         }
      if (SuperHero2 == 'B' || SuperHero2 == 'b'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Doctor Strange's energy blasts and teleportation beat Black Widow's martial art!\n Doctor Strange Wins!!! FATALITY!!");
         outFile.println("Doctor Strange's energy blasts and teleportation beat Black Widow's martial art!\n Doctor Strange Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Black Widow's martial art beat Doctor Strange's energy blasts and teleportation!\n Black Widow Wins!!! FATALITY!!!");
          outFile.println("Black Widow's martial art beat Doctor Strange's energy blasts and teleportation!\n Black Widow Wins!!! FATALITY!!!");

         }
         }
      if (SuperHero2 == 'F' || SuperHero2 == 'f'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Doctor Strange's energy blasts and teleportation beat Flash's lighting speed!\n Doctor Strange Wins!!! FATALITY!!");
          outFile.println("Doctor Strange's energy blasts and teleportation beat Flash's lighting speed!\n Doctor Strange Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Flash's lighting speed beat Doctor Strange's energy blasts and teleportation!\n Flash Wins!!! FATALITY!!!");  
          outFile.println("Flash's lighting speed beat Doctor Strange's energy blasts and teleportation!\n Flash Wins!!! FATALITY!!!");   
         } 
         }
         
      if (SuperHero2 == 'A' || SuperHero2 == 'a'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Doctor Strange's energy blasts and teleportation beat Aquaman's telepathic and water ability!\n Doctor Strange Wins!!! FATALITY!!");
          outFile.println("Doctor Strange's energy blasts and teleportation beat Aquaman's telepathic and water ability!\n Doctor Strange Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Aquaman's telepathic and water ability beat Doctor Strange's energy blasts and teleportation!\n Aquaman Wins!!! FATALITY!!!");
          outFile.println("Aquaman's telepathic and water ability beat Doctor Strange's energy blasts and teleportation!\n Aquaman Wins!!! FATALITY!!!");   
         } 
         }          
      if (SuperHero2 == 'W' || SuperHero2 == 'w'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Doctor Strange's energy blasts and teleportation beat Wolverine's regenerative ability and retractable claws!\n Doctor Strange Wins!!! FATALITY!!");
          outFile.println("Doctor Strange's energy blasts and teleportation beat Wolverine's regenerative ability and retractable claws!\n Doctor Strange Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Wolverine's regenerative ability and retractable claws beat Doctor Strange's energy blasts and teleportation!\n Wolverine Wins!!! FATALITY!!!");
          outFile.println("Wolverine's regenerative ability and retractable claws beat Doctor Strange's energy blasts and teleportation!\n Wolverine Wins!!! FATALITY!!!");   
         }
         }   
			
         break;
//Case four for the first character
//Compere which number was higher from the RNG 
//The highest number Wins and a message is displayed stating that character Wins!!! FATALITY!! 
     
     
      case 'F':
		case 'f':
      if (SuperHero2 == 'F' || SuperHero2 == 'f'){
      	System.out.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");
         outFile.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");

			}
      if (SuperHero2 == 'T' || SuperHero2 == 't'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Flash's lighting speed beat Thor's lightning bolts!\n Flash Wins!!! FATALITY!!!");
         outFile.println("Flash's lighting speed beat Thor's lightning bolts!\n Flash Wins!!! FATALITY!!!");

         }
         else
         {
         System.out.println("Thor's lightning bolts beat Flash's lighting speed!\n Thor Wins!!! FATALITY!!");
         outFile.println("Thor's lightning bolts beat Flash's lighting speed!\n Thor Wins!!! FATALITY!!");
         }
         }
      if (SuperHero2 == 'B' || SuperHero2 == 'b'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Flash's lighting speed beat Black Widow's martial art!\n Flash Wins!!! FATALITY!!");
         outFile.println("Flash's lighting speed beat Black Widow's martial art!\n Flash Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Black Widow's martial art beat Flash's lighting speed!\n Black Widow Wins!!! FATALITY!!!");
          outFile.println("Black Widow's martial art beat Flash's lighting speed!\n Black Widow Wins!!! FATALITY!!!");
         }
         }
      if (SuperHero2 == 'D' || SuperHero2 == 'd'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Doctor Strange's energy blasts and teleportation beat Flash's lighting speed!\n Doctor Strange Wins!!! FATALITY!!");
          outFile.println("Doctor Strange's energy blasts and teleportation beat Flash's lighting speed!\n Doctor Strange Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Flash's lighting speed beat Doctor Strange's energy blasts and teleportation!\n Flash Wins!!! FATALITY!!!");
          outFile.println("Flash's lighting speed beat Doctor Strange's energy blasts and teleportation!\n Flash Wins!!! FATALITY!!!");   
         }
         }
      if (SuperHero2 == 'A' || SuperHero2 == 'a'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Flash's lighting speed beat Aquaman's telepathic and water ability!\n Flash Wins!!! FATALITY!!");
          outFile.println("Flash's lighting speed beat Aquaman's telepathic and water ability!\n Flash Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Aquaman's telepathic and water ability beat Flash's lighting speed!\n Aquaman Wins!!! FATALITY!!!"); 
          outFile.println("Aquaman's telepathic and water ability beat Flash's lighting speed!\n Aquaman Wins!!! FATALITY!!!");   
         } 
         }          
      if (SuperHero2 == 'W' || SuperHero2 == 'w'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Flash's lighting speed beat Wolverine's regenerative ability and retractable claws!\n Flash Wins!!! FATALITY!!");
          outFile.println("Flash's lighting speed beat Wolverine's regenerative ability and retractable claws!\n Flash Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Wolverine's regenerative ability and retractable claws beat Flash's lighting speed!\n Wolverine Wins!!! FATALITY!!!");
          outFile.println("Wolverine's regenerative ability and retractable claws beat Flash's lighting speed!\n Wolverine Wins!!! FATALITY!!!");   
         }
         }   
			
         break;
//Case five for the first character
//Compere which number was higher from the RNG 
//The highest number Wins and a message is displayed stating that character Wins!!! FATALITY!! 
      
		case 'A':
		case 'a':
      if (SuperHero2 == 'A' || SuperHero2 == 'a'){
      	System.out.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");
         outFile.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");

			}
      if (SuperHero2 == 'T' || SuperHero2 == 't'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Aquaman's telepathic and water ability beat Thor's lightning bolts!\n Aquaman Wins!!! FATALITY!!!");
         outFile.println("Aquaman's telepathic and water ability beat Thor's lightning bolts!\n Aquaman Wins!!! FATALITY!!!");
         }
         else
         {
         System.out.println("Thor's lightning bolts beat Aquaman's telepathic and water ability!\n Thor Wins!!! FATALITY!!");
         outFile.println("Thor's lightning bolts beat Aquaman's telepathic and water ability!\n Thor Wins!!! FATALITY!!");

         }
         }
      if (SuperHero2 == 'D' || SuperHero2 == 'd'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Aquaman's telepathic and water ability beat Doctor Strange's energy blasts and teleportation!\n Aquaman Wins!!! FATALITY!!");
         outFile.println("Aquaman's telepathic and water ability beat Doctor Strange's energy blasts and teleportation!\n Aquaman Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Doctor Strange's energy blasts and teleportation beat Aquaman's telepathic and water ability!\n Doctor Strange Wins!!! FATALITY!!!");
          outFile.println("Doctor Strange's energy blasts and teleportation beat Aquaman's telepathic and water ability!\n Doctor Strange Wins!!! FATALITY!!!");
         }
         }
      if (SuperHero2 == 'F' || SuperHero2 == 'f'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Aquaman's telepathic and water ability beat Flash's lighting speed!\n Aquaman Wins!!! FATALITY!!");
          outFile.println("Aquaman's telepathic and water ability beat Flash's lighting speed!\n Aquaman Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Flash's lighting speed beat Aquaman's telepathic and water ability!\n Flash Wins!!! FATALITY!!!");
          outFile.println("Flash's lighting speed beat Aquaman's telepathic and water ability!\n Flash Wins!!! FATALITY!!!");   
         }
         }
      if (SuperHero2 == 'B' || SuperHero2 == 'b'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Black Widow's martial art beat Aquaman's telepathic and water ability!\n Black Widow Wins!!! FATALITY!!");
          outFile.println("Black Widow's martial art beat Aquaman's telepathic and water ability!\n Black Widow Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Aquaman's telepathic and water ability beat Black Widow's martial art!\n Aquaman Wins!!! FATALITY!!!"); 
          outFile.println("Aquaman's telepathic and water ability beat Black Widow's martial art!\n Aquaman Wins!!! FATALITY!!!");   
         } 
         }          
      if (SuperHero2 == 'W' || SuperHero2 == 'w'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Aquaman's telepathic and water ability beat Wolverine's regenerative ability and retractable claws!\n Aquaman Wins!!! FATALITY!!");
          outFile.println("Aquaman's telepathic and water ability beat Wolverine's regenerative ability and retractable claws!\n Aquaman Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Wolverine's regenerative ability and retractable claws beat Aquaman's telepathic and water ability!\n Wolverine Wins!!! FATALITY!!!");
          outFile.println("Wolverine's regenerative ability and retractable claws beat Aquaman's telepathic and water ability!\n Wolverine Wins!!! FATALITY!!!");   
         }
         }   
			
         break;
//Case six for the first character
//Compere which number was higher from the RNG 
//The highest number Wins and a message is displayed stating that character Wins!!! FATALITY!! 
    
		case 'W':
		case 'w':
       if (SuperHero2 == 'W' || SuperHero2 == 'w'){
      	System.out.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");
         outFile.println("Choose a different character to fight this SuperHero You cannot fight against the same charcater!");
			}
      if (SuperHero2 == 'T' || SuperHero2 == 't'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Wolverine's regenerative ability and retractable claws beat Thor's lightning bolts!\n Wolverine Wins!!! FATALITY!!!");
         outFile.println("Wolverine's regenerative ability and retractable claws beat Thor's lightning bolts!\n Wolverine Wins!!! FATALITY!!!");

         }
         else
         {
         System.out.println("Thor's lightning bolts beat Wolverine's regenerative ability and retractable claws!\n Thor Wins!!! FATALITY!!");
          outFile.println("Thor's lightning bolts beat Wolverine's regenerative ability and retractable claws!\n Thor Wins!!! FATALITY!!");

         }
         }
      if (SuperHero2 == 'D' || SuperHero2 == 'd'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
         System.out.println("Wolverine's regenerative ability and retractable claws beat Doctor Strange's energy blasts and teleportation!\n Wolverine Wins!!! FATALITY!!");
         outFile.println("Wolverine's regenerative ability and retractable claws beat Doctor Strange's energy blasts and teleportation!\n Wolverine Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Doctor Strange's energy blasts and teleportation beat Wolverine's regenerative ability and retractable claws!\n Doctor Strange Wins!!! FATALITY!!!");
          outFile.println("Doctor Strange's energy blasts and teleportation beat Wolverine's regenerative ability and retractable claws!\n Doctor Strange Wins!!! FATALITY!!!");
         }
         }
      if (SuperHero2 == 'F' || SuperHero2 == 'f'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Wolverine's regenerative ability and retractable claws beat Flash's lighting speed!\n Wolverine Wins!!! FATALITY!!");
          outFile.println("Wolverine's regenerative ability and retractable claws beat Flash's lighting speed!\n Wolverine Wins!!! FATALITY!!");
         }

         }
         else
         {
          System.out.println("Flash's lighting speed beat Wolverine's regenerative ability and retractable claws!\n Flash Wins!!! FATALITY!!!");
          outFile.println("Flash's lighting speed beat Wolverine's regenerative ability and retractable claws!\n Flash Wins!!! FATALITY!!!");   
         }
         
      if (SuperHero2 == 'B' || SuperHero2 == 'b'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Wolverine's regenerative ability and retractable claws beat Aquaman's telepathic and water ability!\n Wolverine Wins!!! FATALITY!!");
          outFile.println("Wolverine's regenerative ability and retractable claws beat Aquaman's telepathic and water ability!\n Wolverine Wins!!! FATALITY!!");
         }
         else
         {
          System.out.println("Black Widow's martial art beat Wolverine's regenerative ability and retractable claws!\n Black Widow Wins!!! FATALITY!!!");
          outFile.println("Black Widow's martial art beat Wolverine's regenerative ability and retractable claws!\n Black Widow Wins!!! FATALITY!!!");   
         } 
         }          
      if (SuperHero2 == 'A' || SuperHero2 == 'a'){
         int rand_IntB = rand.nextInt(500);
         if(fightLoop(SuperHero1, SuperHero2) == true)
         {
          System.out.println("Aquaman's telepathic and water ability beat Wolverine's regenerative ability and retractable claws!\n Aquaman Wins!!! FATALITY!!");
          outFile.println("Aquaman's telepathic and water ability beat Wolverine's regenerative ability and retractable claws!\n Aquaman Wins!!! FATALITY!!");

         }
         else
         {
          System.out.println("Wolverine's regenerative ability and retractable claws beat Aquaman's telepathic and water ability!\n Wolverine Wins!!! FATALITY!!!");
          outFile.println("Wolverine's regenerative ability and retractable claws beat Aquaman's telepathic and water ability!\n Wolverine Wins!!! FATALITY!!!");   
         }
         }       
			break;                         
}
         System.out.println("Would you like to repeat the program? (Yes or No)");
         repeat = keyboard.next();

}  
    
      while (repeat.equalsIgnoreCase("Yes"));
  
      if (repeat != ("Yes")) {
      System.out.println("Thank you for playing this game see you next time!");
      }

}
public static void characterPick1 () {
   System.out.println ("CHOOSE YOUR DESTINY (P1)\n" +
                     "W: Wolverine(W)\n" +
                     "D: Doctor Strange (D)\n" +
                     "F: Flash(F)\n" +
                     "B: Black Widow(B)\n" +
                     "A: Aquaman(A)\n" +
                     "T: Thor(T)\n" +
                     "Enter either W, D, F, B, A, or T\n");
}

public static void characterPick2 () {
   System.out.print ("CHOOSE YOUR DESTINY (P1)\n" +
                     "W: Wolverine(W)\n" +
                     "D: Doctor Strange (D)\n" +
                     "F: Flash(F)\n" +
                     "B: Black Widow(B)\n" +
                     "A: Aquaman(A)\n" +
                     "T: Thor(T)\n" +
                     "Enter either W, D, F, B, A, or T\n");
}

   public static boolean charRNG() {                  // Character randoms initilization
      Random randomN = new Random();
         
      int speedP1 = randomN.nextInt(5) + 1;           // Super 1
      int speedP2 = randomN.nextInt(5) + 1;
         
      int defP1 = randomN.nextInt(5) + 1;             // Super 2
      int defP2 = randomN.nextInt(5) + 1;
           
      int attackP1 = randomN.nextInt(5) + 1;          // Super 3
      int attackP2 = randomN.nextInt(5) + 1;
         
      int P1stats = ((speedP1 + defP1) + attackP1);
      int P2stats = ((speedP2 + defP2) + attackP2);
         
      return (P1stats > P2stats);
   }



  public static boolean fightLoop(char SuperHero1, char SuperHero2) throws IOException{     // Loops the fighting rounds 7 times.
      int P1Win = 0;
      int P2Win = 0;
      PrintWriter outFile = new PrintWriter("results.txt");

      for (int roundC = 0; roundC <= 6; roundC++) {
         if (charRNG() == true) {
            System.out.println("* " + SuperHero1 + " (P1) wins round " + (roundC + 1) + "! *");
            outFile.println("* " + SuperHero1 + " (P1) wins round " + (roundC + 1) + "! *");
            P1Win++;
         }
         else {
            System.out.println("* " + SuperHero2 +  " (P2) wins round " + (roundC + 1) + "! *");
            outFile.println("* " + SuperHero2 +  " (P2) wins round " + (roundC + 1) + "! *");
            P2Win++;
         }
      }
      return (P1Win > P2Win);
   }

}