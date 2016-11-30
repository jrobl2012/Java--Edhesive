import java.util.Scanner;



public class Horoscopes{
		public static void main(String[] args){
		
		Scanner userInputScanner = new Scanner(System.in);
		
	int  x = 0;
	int  x0 = 0;
	System.out.println ("Enter your Birth Month");
			x = userInputScanner.nextInt();
		System.out.println("Enter the Day you were Born");
		x0 = userInputScanner.nextInt();
		
		
		
		
			String x1;
			String x2;
		String x3 = "";
			
			
		 if (x ==  1) {
           x1 = "January";
	if ( x0 <= 20) {
			x3 = "Aquarius";
			} else { 
			x3 = "Capricorn";
			}
			
	}else if( x == 2 ) {
          x1 = "Febuary";
			if ( x0 >= 19) {
			x3 = "Pisces";
			} else { 
			x3 = "Aquarius";
			}
			
			
			
			
			
        } else if( x == 3 && x0 <= 20) {
          x1 = "March";
		  if ( x0 >= 21) {
			x3 = "Aries";
			} else { 
			x3 = "Pisces";
			}
		  
		
        }else if( x == 4) {
          x1 = "April";
		  if ( x0 >= 20) {
			x3 = "Taurus";
			} else { 
			x3 = "Aries";
			}
        
        }else if( x == 5) {
          x1 = "May";
		  if ( x0 >= 21) {
			x3 = "Gemini";
			} else { 
			x3 = "Taurus";
			}
		  
        
        }else if( x == 6) {
          x1 = "June";
		  if ( x0 >= 21) {
			x3 = "Cancer";
			} else { 
			x3 = "Gemini";
			}
        
        }else if( x == 7) {
          x1 = "July";
		  if ( x0 >= 23) {
			x3 = "Leo";
			} else { 
			x3 = "Cancer";
			}
		  
        
        }else if( x == 8) {
          x1 = "August";
		  if ( x0 >= 23) {
			x3 = "Virgo";
			} else { 
			x3 = "Leo";
			}
        
        }else if( x == 9) {
          x1 = "September";
		  if ( x0 >= 23) {
			x3 = "Libra";
			} else { 
			x3 = "Virgo";
			}
		  
        
        }else if( x == 10) {
          x1 = "October";
		  if ( x0 >= 23) {
			x3 = "Scorpio";
			} else { 
			x3 = "Libra";
			}
		  
        
        }else if( x == 11) {
          x1 = "November";
		  if ( x0 >= 22) {
			x3 = "Sagittarius";
			} else { 
			x3 = "Scorpio";
			}
		  
        
        }else {
          x1 = "December";
		  if ( x0 <= 22) {
			x3 = "Capricorn";
			} else { 
			x3 = "Sagittarius";
			}
		  
        }
		
		
		 if (x0 == 1) {
         
			x2 = "First";
			
	}else if( x0 == 2) {
          x2 = "Second";
			
        } else {
          x2 = "Thirty- First";
		  
        }
		
	
		
		
        System.out.print("You were born "+ x1 + " " );
		System.out.print( x2 + ".  Your Horoscope sign is " ); 
		System.out.print( " " + x3 + ".");
		
	/**Not really enthusiastic about writing actual Horoscopes. */
		
	

	
    
			

        } 

	}

